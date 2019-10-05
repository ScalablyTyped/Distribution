package typings.winrt.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActivationKind extends js.Object

@JSGlobal("Windows.ApplicationModel.Activation.ActivationKind")
@js.native
object ActivationKind extends js.Object {
  @js.native
  sealed trait appointmentsProvider extends ActivationKind
  
  @js.native
  sealed trait cachedFileUpdater extends ActivationKind
  
  @js.native
  sealed trait cameraSettings extends ActivationKind
  
  @js.native
  sealed trait componentUI extends ActivationKind
  
  @js.native
  sealed trait contact extends ActivationKind
  
  @js.native
  sealed trait contactPicker extends ActivationKind
  
  @js.native
  sealed trait device extends ActivationKind
  
  @js.native
  sealed trait dialReceiver extends ActivationKind
  
  @js.native
  sealed trait file extends ActivationKind
  
  @js.native
  sealed trait fileOpenPicker extends ActivationKind
  
  @js.native
  sealed trait fileSavePicker extends ActivationKind
  
  @js.native
  sealed trait launch extends ActivationKind
  
  @js.native
  sealed trait lockScreen extends ActivationKind
  
  @js.native
  sealed trait lockScreenCall extends ActivationKind
  
  @js.native
  sealed trait pickFileContinuation extends ActivationKind
  
  @js.native
  sealed trait pickFolderContinuation extends ActivationKind
  
  @js.native
  sealed trait pickSaveFileContinuation extends ActivationKind
  
  @js.native
  sealed trait pickerReturned extends ActivationKind
  
  @js.native
  sealed trait print3DWorkflow extends ActivationKind
  
  @js.native
  sealed trait printTaskSettings extends ActivationKind
  
  @js.native
  sealed trait protocol extends ActivationKind
  
  @js.native
  sealed trait protocolForResults extends ActivationKind
  
  @js.native
  sealed trait restrictedLaunch extends ActivationKind
  
  @js.native
  sealed trait search extends ActivationKind
  
  @js.native
  sealed trait shareTarget extends ActivationKind
  
  @js.native
  sealed trait toastNotification extends ActivationKind
  
  @js.native
  sealed trait voiceCommand extends ActivationKind
  
  @js.native
  sealed trait walletAction extends ActivationKind
  
  @js.native
  sealed trait webAccountProvider extends ActivationKind
  
  @js.native
  sealed trait webAuthenticationBrokerContinuation extends ActivationKind
  
  /* 13 */ val appointmentsProvider: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.appointmentsProvider with Double = js.native
  /* 7 */ val cachedFileUpdater: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.cachedFileUpdater with Double = js.native
  /* 11 */ val cameraSettings: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.cameraSettings with Double = js.native
  /* 25 */ val componentUI: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.componentUI with Double = js.native
  /* 14 */ val contact: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.contact with Double = js.native
  /* 8 */ val contactPicker: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.contactPicker with Double = js.native
  /* 9 */ val device: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.device with Double = js.native
  /* 29 */ val dialReceiver: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.dialReceiver with Double = js.native
  /* 3 */ val file: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.file with Double = js.native
  /* 5 */ val fileOpenPicker: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.fileOpenPicker with Double = js.native
  /* 6 */ val fileSavePicker: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.fileSavePicker with Double = js.native
  /* 0 */ val launch: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.launch with Double = js.native
  /* 17 */ val lockScreen: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.lockScreen with Double = js.native
  /* 15 */ val lockScreenCall: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.lockScreenCall with Double = js.native
  /* 20 */ val pickFileContinuation: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickFileContinuation with Double = js.native
  /* 22 */ val pickFolderContinuation: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickFolderContinuation with Double = js.native
  /* 21 */ val pickSaveFileContinuation: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickSaveFileContinuation with Double = js.native
  /* 18 */ val pickerReturned: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickerReturned with Double = js.native
  /* 28 */ val print3DWorkflow: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.print3DWorkflow with Double = js.native
  /* 10 */ val printTaskSettings: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.printTaskSettings with Double = js.native
  /* 4 */ val protocol: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.protocol with Double = js.native
  /* 26 */ val protocolForResults: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.protocolForResults with Double = js.native
  /* 12 */ val restrictedLaunch: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.restrictedLaunch with Double = js.native
  /* 1 */ val search: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.search with Double = js.native
  /* 2 */ val shareTarget: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.shareTarget with Double = js.native
  /* 27 */ val toastNotification: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.toastNotification with Double = js.native
  /* 16 */ val voiceCommand: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.voiceCommand with Double = js.native
  /* 19 */ val walletAction: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.walletAction with Double = js.native
  /* 24 */ val webAccountProvider: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.webAccountProvider with Double = js.native
  /* 23 */ val webAuthenticationBrokerContinuation: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.webAuthenticationBrokerContinuation with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActivationKind with Double] = js.native
}

