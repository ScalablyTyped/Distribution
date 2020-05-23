package typings.winrt.global.Windows.ApplicationModel

import typings.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrt.Windows.ApplicationModel.Contacts.Provider.ContactPickerUI
import typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
import typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageItem
import typings.winrt.Windows.Storage.Pickers.Provider.FileOpenPickerUI
import typings.winrt.Windows.Storage.Pickers.Provider.FileSavePickerUI
import typings.winrt.Windows.Storage.Provider.CachedFileUpdaterUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation")
@js.native
object Activation extends js.Object {
  @js.native
  class CachedFileUpdaterActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.CachedFileUpdaterActivatedEventArgs {
    /* CompleteClass */
    override var cachedFileUpdaterUI: CachedFileUpdaterUI = js.native
    /* CompleteClass */
    override var kind: ActivationKind = js.native
    /* CompleteClass */
    override var previousExecutionState: ApplicationExecutionState = js.native
    /* CompleteClass */
    override var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @js.native
  class CameraSettingsActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.CameraSettingsActivatedEventArgs {
    /* CompleteClass */
    override var kind: ActivationKind = js.native
    /* CompleteClass */
    override var previousExecutionState: ApplicationExecutionState = js.native
    /* CompleteClass */
    override var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    /* CompleteClass */
    override var videoDeviceController: js.Any = js.native
    /* CompleteClass */
    override var videoDeviceExtension: js.Any = js.native
  }
  
  @js.native
  class ContactPickerActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.ContactPickerActivatedEventArgs {
    /* CompleteClass */
    override var contactPickerUI: ContactPickerUI = js.native
    /* CompleteClass */
    override var kind: ActivationKind = js.native
    /* CompleteClass */
    override var previousExecutionState: ApplicationExecutionState = js.native
    /* CompleteClass */
    override var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @js.native
  class DeviceActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.DeviceActivatedEventArgs {
    /* CompleteClass */
    override var deviceInformationId: String = js.native
    /* CompleteClass */
    override var kind: ActivationKind = js.native
    /* CompleteClass */
    override var previousExecutionState: ApplicationExecutionState = js.native
    /* CompleteClass */
    override var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    /* CompleteClass */
    override var verb: String = js.native
  }
  
  @js.native
  class FileActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.FileActivatedEventArgs {
    /* CompleteClass */
    override var files: IVectorView[IStorageItem] = js.native
    /* CompleteClass */
    override var kind: ActivationKind = js.native
    /* CompleteClass */
    override var previousExecutionState: ApplicationExecutionState = js.native
    /* CompleteClass */
    override var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    /* CompleteClass */
    override var verb: String = js.native
  }
  
  @js.native
  class FileOpenPickerActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs {
    /* CompleteClass */
    override var fileOpenPickerUI: FileOpenPickerUI = js.native
    /* CompleteClass */
    override var kind: ActivationKind = js.native
    /* CompleteClass */
    override var previousExecutionState: ApplicationExecutionState = js.native
    /* CompleteClass */
    override var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @js.native
  class FileSavePickerActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.FileSavePickerActivatedEventArgs {
    /* CompleteClass */
    override var fileSavePickerUI: FileSavePickerUI = js.native
    /* CompleteClass */
    override var kind: ActivationKind = js.native
    /* CompleteClass */
    override var previousExecutionState: ApplicationExecutionState = js.native
    /* CompleteClass */
    override var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @js.native
  class LaunchActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.LaunchActivatedEventArgs {
    /* CompleteClass */
    override var arguments: String = js.native
    /* CompleteClass */
    override var kind: ActivationKind = js.native
    /* CompleteClass */
    override var previousExecutionState: ApplicationExecutionState = js.native
    /* CompleteClass */
    override var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    /* CompleteClass */
    override var tileId: String = js.native
  }
  
  @js.native
  class PrintTaskSettingsActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.PrintTaskSettingsActivatedEventArgs {
    /* CompleteClass */
    override var configuration: PrintTaskConfiguration = js.native
    /* CompleteClass */
    override var kind: ActivationKind = js.native
    /* CompleteClass */
    override var previousExecutionState: ApplicationExecutionState = js.native
    /* CompleteClass */
    override var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @js.native
  class ProtocolActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.ProtocolActivatedEventArgs {
    /* CompleteClass */
    override var kind: ActivationKind = js.native
    /* CompleteClass */
    override var previousExecutionState: ApplicationExecutionState = js.native
    /* CompleteClass */
    override var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    /* CompleteClass */
    override var uri: Uri = js.native
  }
  
  @js.native
  class SearchActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.SearchActivatedEventArgs {
    /* CompleteClass */
    override var kind: ActivationKind = js.native
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var previousExecutionState: ApplicationExecutionState = js.native
    /* CompleteClass */
    override var queryText: String = js.native
    /* CompleteClass */
    override var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @js.native
  class ShareTargetActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.ShareTargetActivatedEventArgs {
    /* CompleteClass */
    override var kind: ActivationKind = js.native
    /* CompleteClass */
    override var previousExecutionState: ApplicationExecutionState = js.native
    /* CompleteClass */
    override var shareOperation: ShareOperation = js.native
    /* CompleteClass */
    override var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @js.native
  class SplashScreen ()
    extends typings.winrt.Windows.ApplicationModel.Activation.SplashScreen {
    /* CompleteClass */
    override var imageLocation: Rect = js.native
    /* CompleteClass */
    override var ondismissed: js.Any = js.native
  }
  
  @js.native
  object ActivationKind extends js.Object {
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
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.ApplicationModel.Activation.ActivationKind with Double] = js.native
  }
  
  @js.native
  object ApplicationExecutionState extends js.Object {
    /* 4 */ val closedByUser: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.closedByUser with Double = js.native
    /* 0 */ val notRunning: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.notRunning with Double = js.native
    /* 1 */ val running: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.running with Double = js.native
    /* 2 */ val suspended: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.suspended with Double = js.native
    /* 3 */ val terminated: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.terminated with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState with Double
      ] = js.native
  }
  
}

