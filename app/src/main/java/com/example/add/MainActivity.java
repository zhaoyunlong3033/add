package com.example.add;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends Activity implements View.OnClickListener {
    RadioButton radioButton,radioButton1,radioButton2,radioButton3,radioButton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButton=findViewById(R.id.R1);
        radioButton1=findViewById(R.id.R2);
        radioButton2=findViewById(R.id.R3);
        radioButton3=findViewById(R.id.R4);
        radioButton4=findViewById(R.id.R5);
        radioButton.setOnClickListener( this);
        radioButton1.setOnClickListener( this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener( this);
        radioButton4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager =getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        switch (v.getId()){
            case R.id.R1:
                fragmentTransaction.replace(R.id.linearlayout1,new Fragement01());
                break;
            case R.id.R2:
                fragmentTransaction.replace(R.id.linearlayout1,new Fragement02());
                break;
        }
        fragmentTransaction.commit();
    }
}
