package typings.winrtDashUwp.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActivationKind with Double] = js.native
  /* 13 */ @js.native
  object appointmentsProvider extends TopLevel[appointmentsProvider with Double]
  
  /* 7 */ @js.native
  object cachedFileUpdater extends TopLevel[cachedFileUpdater with Double]
  
  /* 11 */ @js.native
  object cameraSettings extends TopLevel[cameraSettings with Double]
  
  /* 25 */ @js.native
  object componentUI extends TopLevel[componentUI with Double]
  
  /* 14 */ @js.native
  object contact extends TopLevel[contact with Double]
  
  /* 8 */ @js.native
  object contactPicker extends TopLevel[contactPicker with Double]
  
  /* 9 */ @js.native
  object device extends TopLevel[device with Double]
  
  /* 30 */ @js.native
  object devicePairing extends TopLevel[devicePairing with Double]
  
  /* 29 */ @js.native
  object dialReceiver extends TopLevel[dialReceiver with Double]
  
  /* 3 */ @js.native
  object file extends TopLevel[file with Double]
  
  /* 5 */ @js.native
  object fileOpenPicker extends TopLevel[fileOpenPicker with Double]
  
  /* 6 */ @js.native
  object fileSavePicker extends TopLevel[fileSavePicker with Double]
  
  /* 0 */ @js.native
  object launch extends TopLevel[launch with Double]
  
  /* 17 */ @js.native
  object lockScreen extends TopLevel[lockScreen with Double]
  
  /* 15 */ @js.native
  object lockScreenCall extends TopLevel[lockScreenCall with Double]
  
  /* 20 */ @js.native
  object pickFileContinuation extends TopLevel[pickFileContinuation with Double]
  
  /* 22 */ @js.native
  object pickFolderContinuation extends TopLevel[pickFolderContinuation with Double]
  
  /* 21 */ @js.native
  object pickSaveFileContinuation extends TopLevel[pickSaveFileContinuation with Double]
  
  /* 18 */ @js.native
  object pickerReturned extends TopLevel[pickerReturned with Double]
  
  /* 28 */ @js.native
  object print3DWorkflow extends TopLevel[print3DWorkflow with Double]
  
  /* 10 */ @js.native
  object printTaskSettings extends TopLevel[printTaskSettings with Double]
  
  /* 4 */ @js.native
  object protocol extends TopLevel[protocol with Double]
  
  /* 26 */ @js.native
  object protocolForResults extends TopLevel[protocolForResults with Double]
  
  /* 12 */ @js.native
  object restrictedLaunch extends TopLevel[restrictedLaunch with Double]
  
  /* 1 */ @js.native
  object search extends TopLevel[search with Double]
  
  /* 2 */ @js.native
  object shareTarget extends TopLevel[shareTarget with Double]
  
  /* 27 */ @js.native
  object toastNotification extends TopLevel[toastNotification with Double]
  
  /* 16 */ @js.native
  object voiceCommand extends TopLevel[voiceCommand with Double]
  
  /* 19 */ @js.native
  object walletAction extends TopLevel[walletAction with Double]
  
  /* 24 */ @js.native
  object webAccountProvider extends TopLevel[webAccountProvider with Double]
  
  /* 23 */ @js.native
  object webAuthenticationBrokerContinuation extends TopLevel[webAuthenticationBrokerContinuation with Double]
  
}

