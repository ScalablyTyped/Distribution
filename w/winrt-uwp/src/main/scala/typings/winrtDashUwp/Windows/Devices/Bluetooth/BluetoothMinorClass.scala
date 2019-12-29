package typings.winrtDashUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothMinorClass with Double] = js.native
  /* 32 */ @js.native
  object audioVideoCamcorder extends TopLevel[audioVideoCamcorder with Double]
  
  /* 27 */ @js.native
  object audioVideoCarAudio extends TopLevel[audioVideoCarAudio with Double]
  
  /* 36 */ @js.native
  object audioVideoGamingOrToy extends TopLevel[audioVideoGamingOrToy with Double]
  
  /* 22 */ @js.native
  object audioVideoHandsFree extends TopLevel[audioVideoHandsFree with Double]
  
  /* 25 */ @js.native
  object audioVideoHeadphones extends TopLevel[audioVideoHeadphones with Double]
  
  /* 29 */ @js.native
  object audioVideoHifiAudioDevice extends TopLevel[audioVideoHifiAudioDevice with Double]
  
  /* 24 */ @js.native
  object audioVideoLoudspeaker extends TopLevel[audioVideoLoudspeaker with Double]
  
  /* 23 */ @js.native
  object audioVideoMicrophone extends TopLevel[audioVideoMicrophone with Double]
  
  /* 26 */ @js.native
  object audioVideoPortableAudio extends TopLevel[audioVideoPortableAudio with Double]
  
  /* 28 */ @js.native
  object audioVideoSetTopBox extends TopLevel[audioVideoSetTopBox with Double]
  
  /* 30 */ @js.native
  object audioVideoVcr extends TopLevel[audioVideoVcr with Double]
  
  /* 31 */ @js.native
  object audioVideoVideoCamera extends TopLevel[audioVideoVideoCamera with Double]
  
  /* 35 */ @js.native
  object audioVideoVideoConferencing extends TopLevel[audioVideoVideoConferencing with Double]
  
  /* 34 */ @js.native
  object audioVideoVideoDisplayAndLoudspeaker extends TopLevel[audioVideoVideoDisplayAndLoudspeaker with Double]
  
  /* 33 */ @js.native
  object audioVideoVideoMonitor extends TopLevel[audioVideoVideoMonitor with Double]
  
  /* 21 */ @js.native
  object audioVideoWearableHeadset extends TopLevel[audioVideoWearableHeadset with Double]
  
  /* 1 */ @js.native
  object computerDesktop extends TopLevel[computerDesktop with Double]
  
  /* 4 */ @js.native
  object computerHandheld extends TopLevel[computerHandheld with Double]
  
  /* 3 */ @js.native
  object computerLaptop extends TopLevel[computerLaptop with Double]
  
  /* 5 */ @js.native
  object computerPalmSize extends TopLevel[computerPalmSize with Double]
  
  /* 2 */ @js.native
  object computerServer extends TopLevel[computerServer with Double]
  
  /* 7 */ @js.native
  object computerTablet extends TopLevel[computerTablet with Double]
  
  /* 6 */ @js.native
  object computerWearable extends TopLevel[computerWearable with Double]
  
  /* 68 */ @js.native
  object healthAnkleProsthesis extends TopLevel[healthAnkleProsthesis with Double]
  
  /* 56 */ @js.native
  object healthBloodPressureMonitor extends TopLevel[healthBloodPressureMonitor with Double]
  
  /* 64 */ @js.native
  object healthBodyCompositionAnalyzer extends TopLevel[healthBodyCompositionAnalyzer with Double]
  
  /* 69 */ @js.native
  object healthGenericHealthManager extends TopLevel[healthGenericHealthManager with Double]
  
  /* 59 */ @js.native
  object healthGlucoseMeter extends TopLevel[healthGlucoseMeter with Double]
  
  /* 62 */ @js.native
  object healthHealthDataDisplay extends TopLevel[healthHealthDataDisplay with Double]
  
  /* 61 */ @js.native
  object healthHeartRateMonitor extends TopLevel[healthHeartRateMonitor with Double]
  
  /* 67 */ @js.native
  object healthKneeProsthesis extends TopLevel[healthKneeProsthesis with Double]
  
  /* 66 */ @js.native
  object healthMedicationMonitor extends TopLevel[healthMedicationMonitor with Double]
  
  /* 65 */ @js.native
  object healthPeakFlowMonitor extends TopLevel[healthPeakFlowMonitor with Double]
  
  /* 70 */ @js.native
  object healthPersonalMobilityDevice extends TopLevel[healthPersonalMobilityDevice with Double]
  
  /* 60 */ @js.native
  object healthPulseOximeter extends TopLevel[healthPulseOximeter with Double]
  
  /* 63 */ @js.native
  object healthStepCounter extends TopLevel[healthStepCounter with Double]
  
  /* 57 */ @js.native
  object healthThermometer extends TopLevel[healthThermometer with Double]
  
  /* 58 */ @js.native
  object healthWeighingScale extends TopLevel[healthWeighingScale with Double]
  
  /* 13 */ @js.native
  object networkFullyAvailable extends TopLevel[networkFullyAvailable with Double]
  
  /* 20 */ @js.native
  object networkNoServiceAvailable extends TopLevel[networkNoServiceAvailable with Double]
  
  /* 14 */ @js.native
  object networkUsed01To17Percent extends TopLevel[networkUsed01To17Percent with Double]
  
  /* 15 */ @js.native
  object networkUsed17To33Percent extends TopLevel[networkUsed17To33Percent with Double]
  
  /* 16 */ @js.native
  object networkUsed33To50Percent extends TopLevel[networkUsed33To50Percent with Double]
  
  /* 17 */ @js.native
  object networkUsed50To67Percent extends TopLevel[networkUsed50To67Percent with Double]
  
  /* 18 */ @js.native
  object networkUsed67To83Percent extends TopLevel[networkUsed67To83Percent with Double]
  
  /* 19 */ @js.native
  object networkUsed83To99Percent extends TopLevel[networkUsed83To99Percent with Double]
  
  /* 42 */ @js.native
  object peripheralCardReader extends TopLevel[peripheralCardReader with Double]
  
  /* 43 */ @js.native
  object peripheralDigitalPen extends TopLevel[peripheralDigitalPen with Double]
  
  /* 41 */ @js.native
  object peripheralDigitizerTablet extends TopLevel[peripheralDigitizerTablet with Double]
  
  /* 38 */ @js.native
  object peripheralGamepad extends TopLevel[peripheralGamepad with Double]
  
  /* 45 */ @js.native
  object peripheralHandheldGesture extends TopLevel[peripheralHandheldGesture with Double]
  
  /* 44 */ @js.native
  object peripheralHandheldScanner extends TopLevel[peripheralHandheldScanner with Double]
  
  /* 37 */ @js.native
  object peripheralJoystick extends TopLevel[peripheralJoystick with Double]
  
  /* 39 */ @js.native
  object peripheralRemoteControl extends TopLevel[peripheralRemoteControl with Double]
  
  /* 40 */ @js.native
  object peripheralSensing extends TopLevel[peripheralSensing with Double]
  
  /* 8 */ @js.native
  object phoneCellular extends TopLevel[phoneCellular with Double]
  
  /* 9 */ @js.native
  object phoneCordless extends TopLevel[phoneCordless with Double]
  
  /* 12 */ @js.native
  object phoneIsdn extends TopLevel[phoneIsdn with Double]
  
  /* 10 */ @js.native
  object phoneSmartPhone extends TopLevel[phoneSmartPhone with Double]
  
  /* 11 */ @js.native
  object phoneWired extends TopLevel[phoneWired with Double]
  
  /* 54 */ @js.native
  object toyController extends TopLevel[toyController with Double]
  
  /* 53 */ @js.native
  object toyDoll extends TopLevel[toyDoll with Double]
  
  /* 55 */ @js.native
  object toyGame extends TopLevel[toyGame with Double]
  
  /* 51 */ @js.native
  object toyRobot extends TopLevel[toyRobot with Double]
  
  /* 52 */ @js.native
  object toyVehicle extends TopLevel[toyVehicle with Double]
  
  /* 0 */ @js.native
  object uncategorized extends TopLevel[uncategorized with Double]
  
  /* 50 */ @js.native
  object wearableGlasses extends TopLevel[wearableGlasses with Double]
  
  /* 49 */ @js.native
  object wearableHelmet extends TopLevel[wearableHelmet with Double]
  
  /* 48 */ @js.native
  object wearableJacket extends TopLevel[wearableJacket with Double]
  
  /* 47 */ @js.native
  object wearablePager extends TopLevel[wearablePager with Double]
  
  /* 46 */ @js.native
  object wearableWristwatch extends TopLevel[wearableWristwatch with Double]
  
}

