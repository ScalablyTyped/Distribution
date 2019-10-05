package typings.winrtDashUwp.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 32 */ val audioVideoCamcorder: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoCamcorder with Double = js.native
  /* 27 */ val audioVideoCarAudio: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoCarAudio with Double = js.native
  /* 36 */ val audioVideoGamingOrToy: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoGamingOrToy with Double = js.native
  /* 22 */ val audioVideoHandsFree: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoHandsFree with Double = js.native
  /* 25 */ val audioVideoHeadphones: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoHeadphones with Double = js.native
  /* 29 */ val audioVideoHifiAudioDevice: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoHifiAudioDevice with Double = js.native
  /* 24 */ val audioVideoLoudspeaker: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoLoudspeaker with Double = js.native
  /* 23 */ val audioVideoMicrophone: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoMicrophone with Double = js.native
  /* 26 */ val audioVideoPortableAudio: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoPortableAudio with Double = js.native
  /* 28 */ val audioVideoSetTopBox: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoSetTopBox with Double = js.native
  /* 30 */ val audioVideoVcr: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoVcr with Double = js.native
  /* 31 */ val audioVideoVideoCamera: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoVideoCamera with Double = js.native
  /* 35 */ val audioVideoVideoConferencing: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoVideoConferencing with Double = js.native
  /* 34 */ val audioVideoVideoDisplayAndLoudspeaker: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoVideoDisplayAndLoudspeaker with Double = js.native
  /* 33 */ val audioVideoVideoMonitor: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoVideoMonitor with Double = js.native
  /* 21 */ val audioVideoWearableHeadset: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.audioVideoWearableHeadset with Double = js.native
  /* 1 */ val computerDesktop: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.computerDesktop with Double = js.native
  /* 4 */ val computerHandheld: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.computerHandheld with Double = js.native
  /* 3 */ val computerLaptop: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.computerLaptop with Double = js.native
  /* 5 */ val computerPalmSize: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.computerPalmSize with Double = js.native
  /* 2 */ val computerServer: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.computerServer with Double = js.native
  /* 7 */ val computerTablet: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.computerTablet with Double = js.native
  /* 6 */ val computerWearable: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.computerWearable with Double = js.native
  /* 68 */ val healthAnkleProsthesis: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthAnkleProsthesis with Double = js.native
  /* 56 */ val healthBloodPressureMonitor: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthBloodPressureMonitor with Double = js.native
  /* 64 */ val healthBodyCompositionAnalyzer: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthBodyCompositionAnalyzer with Double = js.native
  /* 69 */ val healthGenericHealthManager: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthGenericHealthManager with Double = js.native
  /* 59 */ val healthGlucoseMeter: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthGlucoseMeter with Double = js.native
  /* 62 */ val healthHealthDataDisplay: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthHealthDataDisplay with Double = js.native
  /* 61 */ val healthHeartRateMonitor: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthHeartRateMonitor with Double = js.native
  /* 67 */ val healthKneeProsthesis: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthKneeProsthesis with Double = js.native
  /* 66 */ val healthMedicationMonitor: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthMedicationMonitor with Double = js.native
  /* 65 */ val healthPeakFlowMonitor: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthPeakFlowMonitor with Double = js.native
  /* 70 */ val healthPersonalMobilityDevice: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthPersonalMobilityDevice with Double = js.native
  /* 60 */ val healthPulseOximeter: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthPulseOximeter with Double = js.native
  /* 63 */ val healthStepCounter: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthStepCounter with Double = js.native
  /* 57 */ val healthThermometer: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthThermometer with Double = js.native
  /* 58 */ val healthWeighingScale: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.healthWeighingScale with Double = js.native
  /* 13 */ val networkFullyAvailable: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.networkFullyAvailable with Double = js.native
  /* 20 */ val networkNoServiceAvailable: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.networkNoServiceAvailable with Double = js.native
  /* 14 */ val networkUsed01To17Percent: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.networkUsed01To17Percent with Double = js.native
  /* 15 */ val networkUsed17To33Percent: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.networkUsed17To33Percent with Double = js.native
  /* 16 */ val networkUsed33To50Percent: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.networkUsed33To50Percent with Double = js.native
  /* 17 */ val networkUsed50To67Percent: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.networkUsed50To67Percent with Double = js.native
  /* 18 */ val networkUsed67To83Percent: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.networkUsed67To83Percent with Double = js.native
  /* 19 */ val networkUsed83To99Percent: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.networkUsed83To99Percent with Double = js.native
  /* 42 */ val peripheralCardReader: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.peripheralCardReader with Double = js.native
  /* 43 */ val peripheralDigitalPen: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.peripheralDigitalPen with Double = js.native
  /* 41 */ val peripheralDigitizerTablet: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.peripheralDigitizerTablet with Double = js.native
  /* 38 */ val peripheralGamepad: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.peripheralGamepad with Double = js.native
  /* 45 */ val peripheralHandheldGesture: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.peripheralHandheldGesture with Double = js.native
  /* 44 */ val peripheralHandheldScanner: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.peripheralHandheldScanner with Double = js.native
  /* 37 */ val peripheralJoystick: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.peripheralJoystick with Double = js.native
  /* 39 */ val peripheralRemoteControl: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.peripheralRemoteControl with Double = js.native
  /* 40 */ val peripheralSensing: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.peripheralSensing with Double = js.native
  /* 8 */ val phoneCellular: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.phoneCellular with Double = js.native
  /* 9 */ val phoneCordless: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.phoneCordless with Double = js.native
  /* 12 */ val phoneIsdn: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.phoneIsdn with Double = js.native
  /* 10 */ val phoneSmartPhone: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.phoneSmartPhone with Double = js.native
  /* 11 */ val phoneWired: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.phoneWired with Double = js.native
  /* 54 */ val toyController: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.toyController with Double = js.native
  /* 53 */ val toyDoll: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.toyDoll with Double = js.native
  /* 55 */ val toyGame: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.toyGame with Double = js.native
  /* 51 */ val toyRobot: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.toyRobot with Double = js.native
  /* 52 */ val toyVehicle: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.toyVehicle with Double = js.native
  /* 0 */ val uncategorized: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.uncategorized with Double = js.native
  /* 50 */ val wearableGlasses: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.wearableGlasses with Double = js.native
  /* 49 */ val wearableHelmet: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.wearableHelmet with Double = js.native
  /* 48 */ val wearableJacket: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.wearableJacket with Double = js.native
  /* 47 */ val wearablePager: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.wearablePager with Double = js.native
  /* 46 */ val wearableWristwatch: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMinorClass.wearableWristwatch with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothMinorClass with Double] = js.native
}

