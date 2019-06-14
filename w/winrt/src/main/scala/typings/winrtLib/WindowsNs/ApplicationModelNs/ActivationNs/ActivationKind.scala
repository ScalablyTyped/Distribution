package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActivationKind extends js.Object

@JSGlobal("Windows.ApplicationModel.Activation.ActivationKind")
@js.native
object ActivationKind extends js.Object {
  @js.native
  sealed trait appointmentsProvider
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait cachedFileUpdater
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait cameraSettings
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait componentUI
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait contact
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait contactPicker
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait device
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait dialReceiver
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait file
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait fileOpenPicker
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait fileSavePicker
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait launch
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait lockScreen
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait lockScreenCall
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait pickFileContinuation
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait pickFolderContinuation
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait pickSaveFileContinuation
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait pickerReturned
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait print3DWorkflow
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait printTaskSettings
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait protocol
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait protocolForResults
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait restrictedLaunch
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait search
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait shareTarget
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait toastNotification
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait voiceCommand
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait walletAction
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait webAccountProvider
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  @js.native
  sealed trait webAuthenticationBrokerContinuation
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
  
  /* 13 */ val appointmentsProvider: appointmentsProvider with scala.Double = js.native
  /* 7 */ val cachedFileUpdater: cachedFileUpdater with scala.Double = js.native
  /* 11 */ val cameraSettings: cameraSettings with scala.Double = js.native
  /* 25 */ val componentUI: componentUI with scala.Double = js.native
  /* 14 */ val contact: contact with scala.Double = js.native
  /* 8 */ val contactPicker: contactPicker with scala.Double = js.native
  /* 9 */ val device: device with scala.Double = js.native
  /* 29 */ val dialReceiver: dialReceiver with scala.Double = js.native
  /* 3 */ val file: file with scala.Double = js.native
  /* 5 */ val fileOpenPicker: fileOpenPicker with scala.Double = js.native
  /* 6 */ val fileSavePicker: fileSavePicker with scala.Double = js.native
  /* 0 */ val launch: launch with scala.Double = js.native
  /* 17 */ val lockScreen: lockScreen with scala.Double = js.native
  /* 15 */ val lockScreenCall: lockScreenCall with scala.Double = js.native
  /* 20 */ val pickFileContinuation: pickFileContinuation with scala.Double = js.native
  /* 22 */ val pickFolderContinuation: pickFolderContinuation with scala.Double = js.native
  /* 21 */ val pickSaveFileContinuation: pickSaveFileContinuation with scala.Double = js.native
  /* 18 */ val pickerReturned: pickerReturned with scala.Double = js.native
  /* 28 */ val print3DWorkflow: print3DWorkflow with scala.Double = js.native
  /* 10 */ val printTaskSettings: printTaskSettings with scala.Double = js.native
  /* 4 */ val protocol: protocol with scala.Double = js.native
  /* 26 */ val protocolForResults: protocolForResults with scala.Double = js.native
  /* 12 */ val restrictedLaunch: restrictedLaunch with scala.Double = js.native
  /* 1 */ val search: search with scala.Double = js.native
  /* 2 */ val shareTarget: shareTarget with scala.Double = js.native
  /* 27 */ val toastNotification: toastNotification with scala.Double = js.native
  /* 16 */ val voiceCommand: voiceCommand with scala.Double = js.native
  /* 19 */ val walletAction: walletAction with scala.Double = js.native
  /* 24 */ val webAccountProvider: webAccountProvider with scala.Double = js.native
  /* 23 */ val webAuthenticationBrokerContinuation: webAuthenticationBrokerContinuation with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind with scala.Double
  ] = js.native
}

