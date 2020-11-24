package typings.winrtUwp.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BluetoothMinorClass extends js.Object
/** Indicates the Minor Class code of the device. These are interpreted in the context of the Major Class codes. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothMinorClass")
@js.native
object BluetoothMinorClass extends js.Object {
  
  /** A camcorder. */
  @js.native
  sealed trait audioVideoCamcorder extends BluetoothMinorClass
  
  /** A car audio device. */
  @js.native
  sealed trait audioVideoCarAudio extends BluetoothMinorClass
  
  /** A gaming console or toy. */
  @js.native
  sealed trait audioVideoGamingOrToy extends BluetoothMinorClass
  
  /** A hands-free device. */
  @js.native
  sealed trait audioVideoHandsFree extends BluetoothMinorClass
  
  /** Headphones. */
  @js.native
  sealed trait audioVideoHeadphones extends BluetoothMinorClass
  
  /** A HiFi audio device. */
  @js.native
  sealed trait audioVideoHifiAudioDevice extends BluetoothMinorClass
  
  /** A loudspeaker. */
  @js.native
  sealed trait audioVideoLoudspeaker extends BluetoothMinorClass
  
  /** A microphone. */
  @js.native
  sealed trait audioVideoMicrophone extends BluetoothMinorClass
  
  /** Portable audio device. */
  @js.native
  sealed trait audioVideoPortableAudio extends BluetoothMinorClass
  
  /** A set-top box. */
  @js.native
  sealed trait audioVideoSetTopBox extends BluetoothMinorClass
  
  /** A VCR. */
  @js.native
  sealed trait audioVideoVcr extends BluetoothMinorClass
  
  /** A video camera. */
  @js.native
  sealed trait audioVideoVideoCamera extends BluetoothMinorClass
  
  /** A video conferencing device. */
  @js.native
  sealed trait audioVideoVideoConferencing extends BluetoothMinorClass
  
  /** A video display and loudspeaker. */
  @js.native
  sealed trait audioVideoVideoDisplayAndLoudspeaker extends BluetoothMinorClass
  
  /** A video monitor. */
  @js.native
  sealed trait audioVideoVideoMonitor extends BluetoothMinorClass
  
  /** A wearable headset device. */
  @js.native
  sealed trait audioVideoWearableHeadset extends BluetoothMinorClass
  
  /** A computer desktop. */
  @js.native
  sealed trait computerDesktop extends BluetoothMinorClass
  
  /** A handheld PC/PDA. */
  @js.native
  sealed trait computerHandheld extends BluetoothMinorClass
  
  /** A laptop computer. */
  @js.native
  sealed trait computerLaptop extends BluetoothMinorClass
  
  /** A palm-sized PC/PDA. */
  @js.native
  sealed trait computerPalmSize extends BluetoothMinorClass
  
  /** A computer server. */
  @js.native
  sealed trait computerServer extends BluetoothMinorClass
  
  /** A tablet computer. */
  @js.native
  sealed trait computerTablet extends BluetoothMinorClass
  
  /** A wearable, watch-sized, computer. */
  @js.native
  sealed trait computerWearable extends BluetoothMinorClass
  
  /** An ankle prosthesis. */
  @js.native
  sealed trait healthAnkleProsthesis extends BluetoothMinorClass
  
  /** A blood pressure monitor. */
  @js.native
  sealed trait healthBloodPressureMonitor extends BluetoothMinorClass
  
  /** A body composition analyzer. */
  @js.native
  sealed trait healthBodyCompositionAnalyzer extends BluetoothMinorClass
  
  /** A generic health manager. */
  @js.native
  sealed trait healthGenericHealthManager extends BluetoothMinorClass
  
  /** A glucose meter. */
  @js.native
  sealed trait healthGlucoseMeter extends BluetoothMinorClass
  
  /** A health data display. */
  @js.native
  sealed trait healthHealthDataDisplay extends BluetoothMinorClass
  
  /** A heart rate or pulse monitor. */
  @js.native
  sealed trait healthHeartRateMonitor extends BluetoothMinorClass
  
  /** A knee prosthesis. */
  @js.native
  sealed trait healthKneeProsthesis extends BluetoothMinorClass
  
  /** A medication monitor. */
  @js.native
  sealed trait healthMedicationMonitor extends BluetoothMinorClass
  
  /** A peak flow monitor. */
  @js.native
  sealed trait healthPeakFlowMonitor extends BluetoothMinorClass
  
  /** A personal mobility device. */
  @js.native
  sealed trait healthPersonalMobilityDevice extends BluetoothMinorClass
  
  /** A pulse oximeter. */
  @js.native
  sealed trait healthPulseOximeter extends BluetoothMinorClass
  
  /** A step counter. */
  @js.native
  sealed trait healthStepCounter extends BluetoothMinorClass
  
  /** A thermometer. */
  @js.native
  sealed trait healthThermometer extends BluetoothMinorClass
  
  /** A weighing scale. */
  @js.native
  sealed trait healthWeighingScale extends BluetoothMinorClass
  
  /** Fully available. */
  @js.native
  sealed trait networkFullyAvailable extends BluetoothMinorClass
  
  /** Network service is not available. */
  @js.native
  sealed trait networkNoServiceAvailable extends BluetoothMinorClass
  
  /** 1% to 17% utilized. */
  @js.native
  sealed trait networkUsed01To17Percent extends BluetoothMinorClass
  
  /** 17% to 33% utilized. */
  @js.native
  sealed trait networkUsed17To33Percent extends BluetoothMinorClass
  
  /** 335 to 50% utilized. */
  @js.native
  sealed trait networkUsed33To50Percent extends BluetoothMinorClass
  
  /** 50% to 67% utilized. */
  @js.native
  sealed trait networkUsed50To67Percent extends BluetoothMinorClass
  
  /** 67% to 83% utilized. */
  @js.native
  sealed trait networkUsed67To83Percent extends BluetoothMinorClass
  
  /** 83% to 99% utilized. */
  @js.native
  sealed trait networkUsed83To99Percent extends BluetoothMinorClass
  
  /** A card reader. */
  @js.native
  sealed trait peripheralCardReader extends BluetoothMinorClass
  
  /** A digital pen. */
  @js.native
  sealed trait peripheralDigitalPen extends BluetoothMinorClass
  
  /** A digitizer tablet. */
  @js.native
  sealed trait peripheralDigitizerTablet extends BluetoothMinorClass
  
  /** A gamepad. */
  @js.native
  sealed trait peripheralGamepad extends BluetoothMinorClass
  
  /** A handheld gesture input device, such as a "wand" form factor device. */
  @js.native
  sealed trait peripheralHandheldGesture extends BluetoothMinorClass
  
  /** A handheld scanner for bar codes, RFID, etc */
  @js.native
  sealed trait peripheralHandheldScanner extends BluetoothMinorClass
  
  /** A joystick. */
  @js.native
  sealed trait peripheralJoystick extends BluetoothMinorClass
  
  /** A remote control. */
  @js.native
  sealed trait peripheralRemoteControl extends BluetoothMinorClass
  
  /** A sensing device. */
  @js.native
  sealed trait peripheralSensing extends BluetoothMinorClass
  
  /** A cell phone. */
  @js.native
  sealed trait phoneCellular extends BluetoothMinorClass
  
  /** A cordless phone. */
  @js.native
  sealed trait phoneCordless extends BluetoothMinorClass
  
  /** Common ISDN access. */
  @js.native
  sealed trait phoneIsdn extends BluetoothMinorClass
  
  /** A smartphone. */
  @js.native
  sealed trait phoneSmartPhone extends BluetoothMinorClass
  
  /** A wired modem or voice gateway. */
  @js.native
  sealed trait phoneWired extends BluetoothMinorClass
  
  /** A controller. */
  @js.native
  sealed trait toyController extends BluetoothMinorClass
  
  /** A doll or action figure. */
  @js.native
  sealed trait toyDoll extends BluetoothMinorClass
  
  /** A game. */
  @js.native
  sealed trait toyGame extends BluetoothMinorClass
  
  /** A robot. */
  @js.native
  sealed trait toyRobot extends BluetoothMinorClass
  
  /** A vehicle. */
  @js.native
  sealed trait toyVehicle extends BluetoothMinorClass
  
  /** Use when a Minor Class code has not been assigned. */
  @js.native
  sealed trait uncategorized extends BluetoothMinorClass
  
  /** Glasses. */
  @js.native
  sealed trait wearableGlasses extends BluetoothMinorClass
  
  /** A helmet. */
  @js.native
  sealed trait wearableHelmet extends BluetoothMinorClass
  
  /** A jacket. */
  @js.native
  sealed trait wearableJacket extends BluetoothMinorClass
  
  /** A pager. */
  @js.native
  sealed trait wearablePager extends BluetoothMinorClass
  
  /** A wristwatch. */
  @js.native
  sealed trait wearableWristwatch extends BluetoothMinorClass
}
