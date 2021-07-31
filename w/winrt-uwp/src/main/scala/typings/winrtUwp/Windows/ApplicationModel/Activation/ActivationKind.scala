package typings.winrtUwp.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActivationKind extends StObject
/** Specifies the type of activation. */
@JSGlobal("Windows.ApplicationModel.Activation.ActivationKind")
@js.native
object ActivationKind extends StObject {
  
  /** The user wants to manage appointments that are provided by the app. */
  @js.native
  sealed trait appointmentsProvider
    extends StObject
       with ActivationKind
  
  /** The user wants to save a file that the app provides content management for. */
  @js.native
  sealed trait cachedFileUpdater
    extends StObject
       with ActivationKind
  
  /** The app captures photos or video from an attached camera. */
  @js.native
  sealed trait cameraSettings
    extends StObject
       with ActivationKind
  
  /** Reserved for system use. Introduced in Windows 10. */
  @js.native
  sealed trait componentUI
    extends StObject
       with ActivationKind
  
  /** Windows Store only. The user wants to handle calls or messages for the phone number of a contact that is provided by the app. */
  @js.native
  sealed trait contact
    extends StObject
       with ActivationKind
  
  /** The user wants to pick contacts. */
  @js.native
  sealed trait contactPicker
    extends StObject
       with ActivationKind
  
  /** The app handles AutoPlay. */
  @js.native
  sealed trait device
    extends StObject
       with ActivationKind
  
  /** This app was activated as a result of pairing a device. */
  @js.native
  sealed trait devicePairing
    extends StObject
       with ActivationKind
  
  /** This app was launched by another app on a different device by using the DIAL protocol. Introduced in Windows 10. */
  @js.native
  sealed trait dialReceiver
    extends StObject
       with ActivationKind
  
  /** An app launched a file whose file type this app is registered to handle. */
  @js.native
  sealed trait file
    extends StObject
       with ActivationKind
  
  /** The user wants to pick files that are provided by the app. */
  @js.native
  sealed trait fileOpenPicker
    extends StObject
       with ActivationKind
  
  /** The user wants to save a file and selected the app as the location. */
  @js.native
  sealed trait fileSavePicker
    extends StObject
       with ActivationKind
  
  /** The user launched the app or tapped a content tile. */
  @js.native
  sealed trait launch
    extends StObject
       with ActivationKind
  
  /** The app was activated as the lock screen. Introduced in Windows 10. */
  @js.native
  sealed trait lockScreen
    extends StObject
       with ActivationKind
  
  /** Windows Store only. The app launches a call from the lock screen. If the user wants to accept the call, the app displays its call UI directly on the lock screen without requiring the user to unlock. A lock-screen call is a special type of launch activation. */
  @js.native
  sealed trait lockScreenCall
    extends StObject
       with ActivationKind
  
  /** Windows Phone only. The app was activated after the app was suspended for a file picker operation. */
  @js.native
  sealed trait pickFileContinuation
    extends StObject
       with ActivationKind
  
  /** Windows Phone only. The app was activated after the app was suspended for a folder picker operation. */
  @js.native
  sealed trait pickFolderContinuation
    extends StObject
       with ActivationKind
  
  /** Windows Phone only. The app was activated after the app was suspended for a file save picker operation. */
  @js.native
  sealed trait pickSaveFileContinuation
    extends StObject
       with ActivationKind
  
  /** Windows Phone only. The app was activated after the completion of a picker. */
  @js.native
  sealed trait pickerReturned
    extends StObject
       with ActivationKind
  
  /** This app was launched by another app to provide a customized printing experience for a 3D printer. Introduced in Windows 10. */
  @js.native
  sealed trait print3DWorkflow
    extends StObject
       with ActivationKind
  
  /** The app handles print tasks. */
  @js.native
  sealed trait printTaskSettings
    extends StObject
       with ActivationKind
  
  /** An app launched a URI whose scheme name this app is registered to handle. */
  @js.native
  sealed trait protocol
    extends StObject
       with ActivationKind
  
  /** The app was launched by another app with the expectation that it will return a result back to the caller. Introduced in Windows 10. */
  @js.native
  sealed trait protocolForResults
    extends StObject
       with ActivationKind
  
  /** Windows Store only. The user launched the restricted app. */
  @js.native
  sealed trait restrictedLaunch
    extends StObject
       with ActivationKind
  
  /** The user wants to search with the app. */
  @js.native
  sealed trait search
    extends StObject
       with ActivationKind
  
  /** The app is activated as a target for share operations. */
  @js.native
  sealed trait shareTarget
    extends StObject
       with ActivationKind
  
  /** The app was activated when a user tapped on the body of a toast notification or performed an action inside a toast notification. Introduced in Windows 10. */
  @js.native
  sealed trait toastNotification
    extends StObject
       with ActivationKind
  
  /** The app was activated as the result of a voice command. */
  @js.native
  sealed trait voiceCommand
    extends StObject
       with ActivationKind
  
  /** Windows Phone only. The app was activated to perform a Wallet operation. */
  @js.native
  sealed trait walletAction
    extends StObject
       with ActivationKind
  
  /** The app was activated by a web account provider. Introduced in Windows 10. */
  @js.native
  sealed trait webAccountProvider
    extends StObject
       with ActivationKind
  
  /** Windows Phone only. The app was activated after the app was suspended for a web authentication broker operation. */
  @js.native
  sealed trait webAuthenticationBrokerContinuation
    extends StObject
       with ActivationKind
}
