package typings.winrtUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BluetoothMinorClass extends StObject
/** Indicates the Minor Class code of the device. These are interpreted in the context of the Major Class codes. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothMinorClass")
@js.native
object BluetoothMinorClass extends StObject {
  
  /** A camcorder. */
  @js.native
  sealed trait audioVideoCamcorder
    extends StObject
       with BluetoothMinorClass
  
  /** A car audio device. */
  @js.native
  sealed trait audioVideoCarAudio
    extends StObject
       with BluetoothMinorClass
  
  /** A gaming console or toy. */
  @js.native
  sealed trait audioVideoGamingOrToy
    extends StObject
       with BluetoothMinorClass
  
  /** A hands-free device. */
  @js.native
  sealed trait audioVideoHandsFree
    extends StObject
       with BluetoothMinorClass
  
  /** Headphones. */
  @js.native
  sealed trait audioVideoHeadphones
    extends StObject
       with BluetoothMinorClass
  
  /** A HiFi audio device. */
  @js.native
  sealed trait audioVideoHifiAudioDevice
    extends StObject
       with BluetoothMinorClass
  
  /** A loudspeaker. */
  @js.native
  sealed trait audioVideoLoudspeaker
    extends StObject
       with BluetoothMinorClass
  
  /** A microphone. */
  @js.native
  sealed trait audioVideoMicrophone
    extends StObject
       with BluetoothMinorClass
  
  /** Portable audio device. */
  @js.native
  sealed trait audioVideoPortableAudio
    extends StObject
       with BluetoothMinorClass
  
  /** A set-top box. */
  @js.native
  sealed trait audioVideoSetTopBox
    extends StObject
       with BluetoothMinorClass
  
  /** A VCR. */
  @js.native
  sealed trait audioVideoVcr
    extends StObject
       with BluetoothMinorClass
  
  /** A video camera. */
  @js.native
  sealed trait audioVideoVideoCamera
    extends StObject
       with BluetoothMinorClass
  
  /** A video conferencing device. */
  @js.native
  sealed trait audioVideoVideoConferencing
    extends StObject
       with BluetoothMinorClass
  
  /** A video display and loudspeaker. */
  @js.native
  sealed trait audioVideoVideoDisplayAndLoudspeaker
    extends StObject
       with BluetoothMinorClass
  
  /** A video monitor. */
  @js.native
  sealed trait audioVideoVideoMonitor
    extends StObject
       with BluetoothMinorClass
  
  /** A wearable headset device. */
  @js.native
  sealed trait audioVideoWearableHeadset
    extends StObject
       with BluetoothMinorClass
  
  /** A computer desktop. */
  @js.native
  sealed trait computerDesktop
    extends StObject
       with BluetoothMinorClass
  
  /** A handheld PC/PDA. */
  @js.native
  sealed trait computerHandheld
    extends StObject
       with BluetoothMinorClass
  
  /** A laptop computer. */
  @js.native
  sealed trait computerLaptop
    extends StObject
       with BluetoothMinorClass
  
  /** A palm-sized PC/PDA. */
  @js.native
  sealed trait computerPalmSize
    extends StObject
       with BluetoothMinorClass
  
  /** A computer server. */
  @js.native
  sealed trait computerServer
    extends StObject
       with BluetoothMinorClass
  
  /** A tablet computer. */
  @js.native
  sealed trait computerTablet
    extends StObject
       with BluetoothMinorClass
  
  /** A wearable, watch-sized, computer. */
  @js.native
  sealed trait computerWearable
    extends StObject
       with BluetoothMinorClass
  
  /** An ankle prosthesis. */
  @js.native
  sealed trait healthAnkleProsthesis
    extends StObject
       with BluetoothMinorClass
  
  /** A blood pressure monitor. */
  @js.native
  sealed trait healthBloodPressureMonitor
    extends StObject
       with BluetoothMinorClass
  
  /** A body composition analyzer. */
  @js.native
  sealed trait healthBodyCompositionAnalyzer
    extends StObject
       with BluetoothMinorClass
  
  /** A generic health manager. */
  @js.native
  sealed trait healthGenericHealthManager
    extends StObject
       with BluetoothMinorClass
  
  /** A glucose meter. */
  @js.native
  sealed trait healthGlucoseMeter
    extends StObject
       with BluetoothMinorClass
  
  /** A health data display. */
  @js.native
  sealed trait healthHealthDataDisplay
    extends StObject
       with BluetoothMinorClass
  
  /** A heart rate or pulse monitor. */
  @js.native
  sealed trait healthHeartRateMonitor
    extends StObject
       with BluetoothMinorClass
  
  /** A knee prosthesis. */
  @js.native
  sealed trait healthKneeProsthesis
    extends StObject
       with BluetoothMinorClass
  
  /** A medication monitor. */
  @js.native
  sealed trait healthMedicationMonitor
    extends StObject
       with BluetoothMinorClass
  
  /** A peak flow monitor. */
  @js.native
  sealed trait healthPeakFlowMonitor
    extends StObject
       with BluetoothMinorClass
  
  /** A personal mobility device. */
  @js.native
  sealed trait healthPersonalMobilityDevice
    extends StObject
       with BluetoothMinorClass
  
  /** A pulse oximeter. */
  @js.native
  sealed trait healthPulseOximeter
    extends StObject
       with BluetoothMinorClass
  
  /** A step counter. */
  @js.native
  sealed trait healthStepCounter
    extends StObject
       with BluetoothMinorClass
  
  /** A thermometer. */
  @js.native
  sealed trait healthThermometer
    extends StObject
       with BluetoothMinorClass
  
  /** A weighing scale. */
  @js.native
  sealed trait healthWeighingScale
    extends StObject
       with BluetoothMinorClass
  
  /** Fully available. */
  @js.native
  sealed trait networkFullyAvailable
    extends StObject
       with BluetoothMinorClass
  
  /** Network service is not available. */
  @js.native
  sealed trait networkNoServiceAvailable
    extends StObject
       with BluetoothMinorClass
  
  /** 1% to 17% utilized. */
  @js.native
  sealed trait networkUsed01To17Percent
    extends StObject
       with BluetoothMinorClass
  
  /** 17% to 33% utilized. */
  @js.native
  sealed trait networkUsed17To33Percent
    extends StObject
       with BluetoothMinorClass
  
  /** 335 to 50% utilized. */
  @js.native
  sealed trait networkUsed33To50Percent
    extends StObject
       with BluetoothMinorClass
  
  /** 50% to 67% utilized. */
  @js.native
  sealed trait networkUsed50To67Percent
    extends StObject
       with BluetoothMinorClass
  
  /** 67% to 83% utilized. */
  @js.native
  sealed trait networkUsed67To83Percent
    extends StObject
       with BluetoothMinorClass
  
  /** 83% to 99% utilized. */
  @js.native
  sealed trait networkUsed83To99Percent
    extends StObject
       with BluetoothMinorClass
  
  /** A card reader. */
  @js.native
  sealed trait peripheralCardReader
    extends StObject
       with BluetoothMinorClass
  
  /** A digital pen. */
  @js.native
  sealed trait peripheralDigitalPen
    extends StObject
       with BluetoothMinorClass
  
  /** A digitizer tablet. */
  @js.native
  sealed trait peripheralDigitizerTablet
    extends StObject
       with BluetoothMinorClass
  
  /** A gamepad. */
  @js.native
  sealed trait peripheralGamepad
    extends StObject
       with BluetoothMinorClass
  
  /** A handheld gesture input device, such as a "wand" form factor device. */
  @js.native
  sealed trait peripheralHandheldGesture
    extends StObject
       with BluetoothMinorClass
  
  /** A handheld scanner for bar codes, RFID, etc */
  @js.native
  sealed trait peripheralHandheldScanner
    extends StObject
       with BluetoothMinorClass
  
  /** A joystick. */
  @js.native
  sealed trait peripheralJoystick
    extends StObject
       with BluetoothMinorClass
  
  /** A remote control. */
  @js.native
  sealed trait peripheralRemoteControl
    extends StObject
       with BluetoothMinorClass
  
  /** A sensing device. */
  @js.native
  sealed trait peripheralSensing
    extends StObject
       with BluetoothMinorClass
  
  /** A cell phone. */
  @js.native
  sealed trait phoneCellular
    extends StObject
       with BluetoothMinorClass
  
  /** A cordless phone. */
  @js.native
  sealed trait phoneCordless
    extends StObject
       with BluetoothMinorClass
  
  /** Common ISDN access. */
  @js.native
  sealed trait phoneIsdn
    extends StObject
       with BluetoothMinorClass
  
  /** A smartphone. */
  @js.native
  sealed trait phoneSmartPhone
    extends StObject
       with BluetoothMinorClass
  
  /** A wired modem or voice gateway. */
  @js.native
  sealed trait phoneWired
    extends StObject
       with BluetoothMinorClass
  
  /** A controller. */
  @js.native
  sealed trait toyController
    extends StObject
       with BluetoothMinorClass
  
  /** A doll or action figure. */
  @js.native
  sealed trait toyDoll
    extends StObject
       with BluetoothMinorClass
  
  /** A game. */
  @js.native
  sealed trait toyGame
    extends StObject
       with BluetoothMinorClass
  
  /** A robot. */
  @js.native
  sealed trait toyRobot
    extends StObject
       with BluetoothMinorClass
  
  /** A vehicle. */
  @js.native
  sealed trait toyVehicle
    extends StObject
       with BluetoothMinorClass
  
  /** Use when a Minor Class code has not been assigned. */
  @js.native
  sealed trait uncategorized
    extends StObject
       with BluetoothMinorClass
  
  /** Glasses. */
  @js.native
  sealed trait wearableGlasses
    extends StObject
       with BluetoothMinorClass
  
  /** A helmet. */
  @js.native
  sealed trait wearableHelmet
    extends StObject
       with BluetoothMinorClass
  
  /** A jacket. */
  @js.native
  sealed trait wearableJacket
    extends StObject
       with BluetoothMinorClass
  
  /** A pager. */
  @js.native
  sealed trait wearablePager
    extends StObject
       with BluetoothMinorClass
  
  /** A wristwatch. */
  @js.native
  sealed trait wearableWristwatch
    extends StObject
       with BluetoothMinorClass
}
