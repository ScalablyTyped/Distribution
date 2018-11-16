package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

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
  sealed trait appointmentsProvider
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The user wants to save a file that the app provides content management for. */
  @js.native
  sealed trait cachedFileUpdater
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The app captures photos or video from an attached camera. */
  @js.native
  sealed trait cameraSettings
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** Reserved for system use. Introduced in Windows 10. */
  @js.native
  sealed trait componentUI
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** Windows Store only. The user wants to handle calls or messages for the phone number of a contact that is provided by the app. */
  @js.native
  sealed trait contact
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The user wants to pick contacts. */
  @js.native
  sealed trait contactPicker
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The app handles AutoPlay. */
  @js.native
  sealed trait device
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** This app was activated as a result of pairing a device. */
  @js.native
  sealed trait devicePairing
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** This app was launched by another app on a different device by using the DIAL protocol. Introduced in Windows 10. */
  @js.native
  sealed trait dialReceiver
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** An app launched a file whose file type this app is registered to handle. */
  @js.native
  sealed trait file
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The user wants to pick files that are provided by the app. */
  @js.native
  sealed trait fileOpenPicker
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The user wants to save a file and selected the app as the location. */
  @js.native
  sealed trait fileSavePicker
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The user launched the app or tapped a content tile. */
  @js.native
  sealed trait launch
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The app was activated as the lock screen. Introduced in Windows 10. */
  @js.native
  sealed trait lockScreen
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** Windows Store only. The app launches a call from the lock screen. If the user wants to accept the call, the app displays its call UI directly on the lock screen without requiring the user to unlock. A lock-screen call is a special type of launch activation. */
  @js.native
  sealed trait lockScreenCall
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** Windows Phone only. The app was activated after the app was suspended for a file picker operation. */
  @js.native
  sealed trait pickFileContinuation
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** Windows Phone only. The app was activated after the app was suspended for a folder picker operation. */
  @js.native
  sealed trait pickFolderContinuation
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** Windows Phone only. The app was activated after the app was suspended for a file save picker operation. */
  @js.native
  sealed trait pickSaveFileContinuation
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** Windows Phone only. The app was activated after the completion of a picker. */
  @js.native
  sealed trait pickerReturned
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** This app was launched by another app to provide a customized printing experience for a 3D printer. Introduced in Windows 10. */
  @js.native
  sealed trait print3DWorkflow
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The app handles print tasks. */
  @js.native
  sealed trait printTaskSettings
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** An app launched a URI whose scheme name this app is registered to handle. */
  @js.native
  sealed trait protocol
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The app was launched by another app with the expectation that it will return a result back to the caller. Introduced in Windows 10. */
  @js.native
  sealed trait protocolForResults
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** Windows Store only. The user launched the restricted app. */
  @js.native
  sealed trait restrictedLaunch
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The user wants to search with the app. */
  @js.native
  sealed trait search
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The app is activated as a target for share operations. */
  @js.native
  sealed trait shareTarget
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The app was activated when a user tapped on the body of a toast notification or performed an action inside a toast notification. Introduced in Windows 10. */
  @js.native
  sealed trait toastNotification
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The app was activated as the result of a voice command. */
  @js.native
  sealed trait voiceCommand
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** Windows Phone only. The app was activated to perform a Wallet operation. */
  @js.native
  sealed trait walletAction
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** The app was activated by a web account provider. Introduced in Windows 10. */
  @js.native
  sealed trait webAccountProvider
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /** Windows Phone only. The app was activated after the app was suspended for a web authentication broker operation. */
  @js.native
  sealed trait webAuthenticationBrokerContinuation
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  val appointmentsProvider: appointmentsProvider with java.lang.String = js.native
  val cachedFileUpdater: cachedFileUpdater with java.lang.String = js.native
  val cameraSettings: cameraSettings with java.lang.String = js.native
  val componentUI: componentUI with java.lang.String = js.native
  val contact: contact with java.lang.String = js.native
  val contactPicker: contactPicker with java.lang.String = js.native
  val device: device with java.lang.String = js.native
  val devicePairing: devicePairing with java.lang.String = js.native
  val dialReceiver: dialReceiver with java.lang.String = js.native
  val file: file with java.lang.String = js.native
  val fileOpenPicker: fileOpenPicker with java.lang.String = js.native
  val fileSavePicker: fileSavePicker with java.lang.String = js.native
  val launch: launch with java.lang.String = js.native
  val lockScreen: lockScreen with java.lang.String = js.native
  val lockScreenCall: lockScreenCall with java.lang.String = js.native
  val pickFileContinuation: pickFileContinuation with java.lang.String = js.native
  val pickFolderContinuation: pickFolderContinuation with java.lang.String = js.native
  val pickSaveFileContinuation: pickSaveFileContinuation with java.lang.String = js.native
  val pickerReturned: pickerReturned with java.lang.String = js.native
  val print3DWorkflow: print3DWorkflow with java.lang.String = js.native
  val printTaskSettings: printTaskSettings with java.lang.String = js.native
  val protocol: protocol with java.lang.String = js.native
  val protocolForResults: protocolForResults with java.lang.String = js.native
  val restrictedLaunch: restrictedLaunch with java.lang.String = js.native
  val search: search with java.lang.String = js.native
  val shareTarget: shareTarget with java.lang.String = js.native
  val toastNotification: toastNotification with java.lang.String = js.native
  val voiceCommand: voiceCommand with java.lang.String = js.native
  val walletAction: walletAction with java.lang.String = js.native
  val webAccountProvider: webAccountProvider with java.lang.String = js.native
  val webAuthenticationBrokerContinuation: webAuthenticationBrokerContinuation with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind with java.lang.String
  ] = js.native
}

