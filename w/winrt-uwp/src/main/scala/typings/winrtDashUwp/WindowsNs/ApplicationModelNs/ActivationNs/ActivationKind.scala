package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActivationKind extends js.Object

/** Specifies the type of activation. */
@JSGlobal("Windows.ApplicationModel.Activation.ActivationKind")
@js.native
object ActivationKind extends js.Object {
  /** The user wants to manage appointments that are provided by the app. */
  @js.native
  sealed trait appointmentsProvider extends ActivationKind
  
  /** The user wants to save a file that the app provides content management for. */
  @js.native
  sealed trait cachedFileUpdater extends ActivationKind
  
  /** The app captures photos or video from an attached camera. */
  @js.native
  sealed trait cameraSettings extends ActivationKind
  
  /** Reserved for system use. Introduced in Windows 10. */
  @js.native
  sealed trait componentUI extends ActivationKind
  
  /** Windows Store only. The user wants to handle calls or messages for the phone number of a contact that is provided by the app. */
  @js.native
  sealed trait contact extends ActivationKind
  
  /** The user wants to pick contacts. */
  @js.native
  sealed trait contactPicker extends ActivationKind
  
  /** The app handles AutoPlay. */
  @js.native
  sealed trait device extends ActivationKind
  
  /** This app was activated as a result of pairing a device. */
  @js.native
  sealed trait devicePairing extends ActivationKind
  
  /** This app was launched by another app on a different device by using the DIAL protocol. Introduced in Windows 10. */
  @js.native
  sealed trait dialReceiver extends ActivationKind
  
  /** An app launched a file whose file type this app is registered to handle. */
  @js.native
  sealed trait file extends ActivationKind
  
  /** The user wants to pick files that are provided by the app. */
  @js.native
  sealed trait fileOpenPicker extends ActivationKind
  
  /** The user wants to save a file and selected the app as the location. */
  @js.native
  sealed trait fileSavePicker extends ActivationKind
  
  /** The user launched the app or tapped a content tile. */
  @js.native
  sealed trait launch extends ActivationKind
  
  /** The app was activated as the lock screen. Introduced in Windows 10. */
  @js.native
  sealed trait lockScreen extends ActivationKind
  
  /** Windows Store only. The app launches a call from the lock screen. If the user wants to accept the call, the app displays its call UI directly on the lock screen without requiring the user to unlock. A lock-screen call is a special type of launch activation. */
  @js.native
  sealed trait lockScreenCall extends ActivationKind
  
  /** Windows Phone only. The app was activated after the app was suspended for a file picker operation. */
  @js.native
  sealed trait pickFileContinuation extends ActivationKind
  
  /** Windows Phone only. The app was activated after the app was suspended for a folder picker operation. */
  @js.native
  sealed trait pickFolderContinuation extends ActivationKind
  
  /** Windows Phone only. The app was activated after the app was suspended for a file save picker operation. */
  @js.native
  sealed trait pickSaveFileContinuation extends ActivationKind
  
  /** Windows Phone only. The app was activated after the completion of a picker. */
  @js.native
  sealed trait pickerReturned extends ActivationKind
  
  /** This app was launched by another app to provide a customized printing experience for a 3D printer. Introduced in Windows 10. */
  @js.native
  sealed trait print3DWorkflow extends ActivationKind
  
  /** The app handles print tasks. */
  @js.native
  sealed trait printTaskSettings extends ActivationKind
  
  /** An app launched a URI whose scheme name this app is registered to handle. */
  @js.native
  sealed trait protocol extends ActivationKind
  
  /** The app was launched by another app with the expectation that it will return a result back to the caller. Introduced in Windows 10. */
  @js.native
  sealed trait protocolForResults extends ActivationKind
  
  /** Windows Store only. The user launched the restricted app. */
  @js.native
  sealed trait restrictedLaunch extends ActivationKind
  
  /** The user wants to search with the app. */
  @js.native
  sealed trait search extends ActivationKind
  
  /** The app is activated as a target for share operations. */
  @js.native
  sealed trait shareTarget extends ActivationKind
  
  /** The app was activated when a user tapped on the body of a toast notification or performed an action inside a toast notification. Introduced in Windows 10. */
  @js.native
  sealed trait toastNotification extends ActivationKind
  
  /** The app was activated as the result of a voice command. */
  @js.native
  sealed trait voiceCommand extends ActivationKind
  
  /** Windows Phone only. The app was activated to perform a Wallet operation. */
  @js.native
  sealed trait walletAction extends ActivationKind
  
  /** The app was activated by a web account provider. Introduced in Windows 10. */
  @js.native
  sealed trait webAccountProvider extends ActivationKind
  
  /** Windows Phone only. The app was activated after the app was suspended for a web authentication broker operation. */
  @js.native
  sealed trait webAuthenticationBrokerContinuation extends ActivationKind
  
  /* 13 */ val appointmentsProvider: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.appointmentsProvider with Double = js.native
  /* 7 */ val cachedFileUpdater: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.cachedFileUpdater with Double = js.native
  /* 11 */ val cameraSettings: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.cameraSettings with Double = js.native
  /* 25 */ val componentUI: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.componentUI with Double = js.native
  /* 14 */ val contact: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.contact with Double = js.native
  /* 8 */ val contactPicker: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.contactPicker with Double = js.native
  /* 9 */ val device: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.device with Double = js.native
  /* 30 */ val devicePairing: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.devicePairing with Double = js.native
  /* 29 */ val dialReceiver: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.dialReceiver with Double = js.native
  /* 3 */ val file: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.file with Double = js.native
  /* 5 */ val fileOpenPicker: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.fileOpenPicker with Double = js.native
  /* 6 */ val fileSavePicker: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.fileSavePicker with Double = js.native
  /* 0 */ val launch: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.launch with Double = js.native
  /* 17 */ val lockScreen: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.lockScreen with Double = js.native
  /* 15 */ val lockScreenCall: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.lockScreenCall with Double = js.native
  /* 20 */ val pickFileContinuation: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.pickFileContinuation with Double = js.native
  /* 22 */ val pickFolderContinuation: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.pickFolderContinuation with Double = js.native
  /* 21 */ val pickSaveFileContinuation: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.pickSaveFileContinuation with Double = js.native
  /* 18 */ val pickerReturned: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.pickerReturned with Double = js.native
  /* 28 */ val print3DWorkflow: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.print3DWorkflow with Double = js.native
  /* 10 */ val printTaskSettings: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.printTaskSettings with Double = js.native
  /* 4 */ val protocol: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.protocol with Double = js.native
  /* 26 */ val protocolForResults: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.protocolForResults with Double = js.native
  /* 12 */ val restrictedLaunch: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.restrictedLaunch with Double = js.native
  /* 1 */ val search: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.search with Double = js.native
  /* 2 */ val shareTarget: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.shareTarget with Double = js.native
  /* 27 */ val toastNotification: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.toastNotification with Double = js.native
  /* 16 */ val voiceCommand: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.voiceCommand with Double = js.native
  /* 19 */ val walletAction: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.walletAction with Double = js.native
  /* 24 */ val webAccountProvider: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.webAccountProvider with Double = js.native
  /* 23 */ val webAuthenticationBrokerContinuation: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind.webAuthenticationBrokerContinuation with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActivationKind with Double] = js.native
}

