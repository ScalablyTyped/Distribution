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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Activation {
  
  @JSGlobal("Windows.ApplicationModel.Activation.ActivationKind")
  @js.native
  object ActivationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.ApplicationModel.Activation.ActivationKind & Double] = js.native
    
    /* 13 */ val appointmentsProvider: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.appointmentsProvider & Double = js.native
    
    /* 7 */ val cachedFileUpdater: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.cachedFileUpdater & Double = js.native
    
    /* 11 */ val cameraSettings: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.cameraSettings & Double = js.native
    
    /* 25 */ val componentUI: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.componentUI & Double = js.native
    
    /* 14 */ val contact: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.contact & Double = js.native
    
    /* 8 */ val contactPicker: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.contactPicker & Double = js.native
    
    /* 9 */ val device: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.device & Double = js.native
    
    /* 29 */ val dialReceiver: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.dialReceiver & Double = js.native
    
    /* 3 */ val file: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.file & Double = js.native
    
    /* 5 */ val fileOpenPicker: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.fileOpenPicker & Double = js.native
    
    /* 6 */ val fileSavePicker: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.fileSavePicker & Double = js.native
    
    /* 0 */ val launch: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.launch & Double = js.native
    
    /* 17 */ val lockScreen: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.lockScreen & Double = js.native
    
    /* 15 */ val lockScreenCall: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.lockScreenCall & Double = js.native
    
    /* 20 */ val pickFileContinuation: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickFileContinuation & Double = js.native
    
    /* 22 */ val pickFolderContinuation: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickFolderContinuation & Double = js.native
    
    /* 21 */ val pickSaveFileContinuation: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickSaveFileContinuation & Double = js.native
    
    /* 18 */ val pickerReturned: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickerReturned & Double = js.native
    
    /* 28 */ val print3DWorkflow: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.print3DWorkflow & Double = js.native
    
    /* 10 */ val printTaskSettings: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.printTaskSettings & Double = js.native
    
    /* 4 */ val protocol: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.protocol & Double = js.native
    
    /* 26 */ val protocolForResults: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.protocolForResults & Double = js.native
    
    /* 12 */ val restrictedLaunch: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.restrictedLaunch & Double = js.native
    
    /* 1 */ val search: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.search & Double = js.native
    
    /* 2 */ val shareTarget: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.shareTarget & Double = js.native
    
    /* 27 */ val toastNotification: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.toastNotification & Double = js.native
    
    /* 16 */ val voiceCommand: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.voiceCommand & Double = js.native
    
    /* 19 */ val walletAction: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.walletAction & Double = js.native
    
    /* 24 */ val webAccountProvider: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.webAccountProvider & Double = js.native
    
    /* 23 */ val webAuthenticationBrokerContinuation: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.webAuthenticationBrokerContinuation & Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.ApplicationExecutionState")
  @js.native
  object ApplicationExecutionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState & Double
      ] = js.native
    
    /* 4 */ val closedByUser: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.closedByUser & Double = js.native
    
    /* 0 */ val notRunning: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.notRunning & Double = js.native
    
    /* 1 */ val running: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.running & Double = js.native
    
    /* 2 */ val suspended: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.suspended & Double = js.native
    
    /* 3 */ val terminated: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.terminated & Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.CachedFileUpdaterActivatedEventArgs")
  @js.native
  open class CachedFileUpdaterActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Activation.CachedFileUpdaterActivatedEventArgs {
    
    /* CompleteClass */
    var cachedFileUpdaterUI: CachedFileUpdaterUI = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.CameraSettingsActivatedEventArgs")
  @js.native
  open class CameraSettingsActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Activation.CameraSettingsActivatedEventArgs {
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    
    /* CompleteClass */
    var videoDeviceController: Any = js.native
    
    /* CompleteClass */
    var videoDeviceExtension: Any = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.ContactPickerActivatedEventArgs")
  @js.native
  open class ContactPickerActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Activation.ContactPickerActivatedEventArgs {
    
    /* CompleteClass */
    var contactPickerUI: ContactPickerUI = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.DeviceActivatedEventArgs")
  @js.native
  open class DeviceActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Activation.DeviceActivatedEventArgs {
    
    /* CompleteClass */
    var deviceInformationId: String = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    
    /* CompleteClass */
    var verb: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.FileActivatedEventArgs")
  @js.native
  open class FileActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Activation.FileActivatedEventArgs {
    
    /* CompleteClass */
    var files: IVectorView[IStorageItem] = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    
    /* CompleteClass */
    var verb: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs")
  @js.native
  open class FileOpenPickerActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs {
    
    /* CompleteClass */
    var fileOpenPickerUI: FileOpenPickerUI = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.FileSavePickerActivatedEventArgs")
  @js.native
  open class FileSavePickerActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Activation.FileSavePickerActivatedEventArgs {
    
    /* CompleteClass */
    var fileSavePickerUI: FileSavePickerUI = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.LaunchActivatedEventArgs")
  @js.native
  open class LaunchActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Activation.LaunchActivatedEventArgs {
    
    /* CompleteClass */
    var arguments: String = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    
    /* CompleteClass */
    var tileId: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.PrintTaskSettingsActivatedEventArgs")
  @js.native
  open class PrintTaskSettingsActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Activation.PrintTaskSettingsActivatedEventArgs {
    
    /* CompleteClass */
    var configuration: PrintTaskConfiguration = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.ProtocolActivatedEventArgs")
  @js.native
  open class ProtocolActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Activation.ProtocolActivatedEventArgs {
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    
    /* CompleteClass */
    var uri: Uri = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.SearchActivatedEventArgs")
  @js.native
  open class SearchActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Activation.SearchActivatedEventArgs {
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var language: String = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var queryText: String = js.native
    
    /* CompleteClass */
    var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.ShareTargetActivatedEventArgs")
  @js.native
  open class ShareTargetActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Activation.ShareTargetActivatedEventArgs {
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var shareOperation: ShareOperation = js.native
    
    /* CompleteClass */
    var splashScreen: typings.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.SplashScreen")
  @js.native
  open class SplashScreen ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Activation.SplashScreen {
    
    /* CompleteClass */
    var imageLocation: Rect = js.native
    
    /* CompleteClass */
    var ondismissed: Any = js.native
  }
}
