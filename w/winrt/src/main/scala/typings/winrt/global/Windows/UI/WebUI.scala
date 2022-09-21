package typings.winrt.global.Windows.UI

import typings.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskDeferral
import typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskRegistration
import typings.winrt.Windows.ApplicationModel.Contacts.Provider.ContactPickerUI
import typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
import typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageItem
import typings.winrt.Windows.Storage.Pickers.Provider.FileOpenPickerUI
import typings.winrt.Windows.Storage.Pickers.Provider.FileSavePickerUI
import typings.winrt.Windows.Storage.Provider.CachedFileUpdaterUI
import typings.winrt.Windows.UI.WebUI.IWebUIBackgroundTaskInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebUI {
  
  @JSGlobal("Windows.UI.WebUI.ActivatedDeferral")
  @js.native
  open class ActivatedDeferral ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.ActivatedDeferral {
    
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.ActivatedOperation")
  @js.native
  open class ActivatedOperation ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.ActivatedOperation {
    
    /* CompleteClass */
    override def getDeferral(): typings.winrt.Windows.UI.WebUI.ActivatedDeferral = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.SuspendingDeferral")
  @js.native
  open class SuspendingDeferral ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.SuspendingDeferral {
    
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.SuspendingEventArgs")
  @js.native
  open class SuspendingEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.SuspendingEventArgs {
    
    /* CompleteClass */
    var suspendingOperation: typings.winrt.Windows.ApplicationModel.SuspendingOperation = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.SuspendingOperation")
  @js.native
  open class SuspendingOperation ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.SuspendingOperation {
    
    /* CompleteClass */
    var deadline: js.Date = js.native
    
    /* CompleteClass */
    override def getDeferral(): typings.winrt.Windows.ApplicationModel.SuspendingDeferral = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUIApplication")
  @js.native
  open class WebUIApplication ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUIApplication
  /* static members */
  object WebUIApplication {
    
    @JSGlobal("Windows.UI.WebUI.WebUIApplication")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.UI.WebUI.WebUIApplication.onactivated")
    @js.native
    def onactivated: Any = js.native
    inline def onactivated_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onactivated")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.WebUI.WebUIApplication.onnavigated")
    @js.native
    def onnavigated: Any = js.native
    inline def onnavigated_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onnavigated")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.WebUI.WebUIApplication.onresuming")
    @js.native
    def onresuming: Any = js.native
    inline def onresuming_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onresuming")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.WebUI.WebUIApplication.onsuspending")
    @js.native
    def onsuspending: Any = js.native
    inline def onsuspending_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onsuspending")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstance")
  @js.native
  open class WebUIBackgroundTaskInstance ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUIBackgroundTaskInstance
  /* static members */
  object WebUIBackgroundTaskInstance {
    
    @JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstance")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstance.current")
    @js.native
    def current: IWebUIBackgroundTaskInstance = js.native
    inline def current_=(x: IWebUIBackgroundTaskInstance): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstanceRuntimeClass")
  @js.native
  open class WebUIBackgroundTaskInstanceRuntimeClass ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUIBackgroundTaskInstanceRuntimeClass {
    
    /* CompleteClass */
    override def getDeferral(): BackgroundTaskDeferral = js.native
    
    /* CompleteClass */
    var instanceId: String = js.native
    
    /* CompleteClass */
    var oncanceled: Any = js.native
    
    /* CompleteClass */
    var progress: Double = js.native
    
    /* CompleteClass */
    var succeeded: Boolean = js.native
    
    /* CompleteClass */
    var suspendedCount: Double = js.native
    
    /* CompleteClass */
    var task: BackgroundTaskRegistration = js.native
    
    /* CompleteClass */
    var triggerDetails: Any = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUICachedFileUpdaterActivatedEventArgs")
  @js.native
  open class WebUICachedFileUpdaterActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUICachedFileUpdaterActivatedEventArgs {
    
    /* CompleteClass */
    var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
    
    /* CompleteClass */
    var cachedFileUpdaterUI: CachedFileUpdaterUI = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: SplashScreen = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUICameraSettingsActivatedEventArgs")
  @js.native
  open class WebUICameraSettingsActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUICameraSettingsActivatedEventArgs {
    
    /* CompleteClass */
    var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: SplashScreen = js.native
    
    /* CompleteClass */
    var videoDeviceController: Any = js.native
    
    /* CompleteClass */
    var videoDeviceExtension: Any = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUIContactPickerActivatedEventArgs")
  @js.native
  open class WebUIContactPickerActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUIContactPickerActivatedEventArgs {
    
    /* CompleteClass */
    var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
    
    /* CompleteClass */
    var contactPickerUI: ContactPickerUI = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: SplashScreen = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUIDeviceActivatedEventArgs")
  @js.native
  open class WebUIDeviceActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUIDeviceActivatedEventArgs {
    
    /* CompleteClass */
    var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
    
    /* CompleteClass */
    var deviceInformationId: String = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: SplashScreen = js.native
    
    /* CompleteClass */
    var verb: String = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUIFileActivatedEventArgs")
  @js.native
  open class WebUIFileActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUIFileActivatedEventArgs {
    
    /* CompleteClass */
    var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
    
    /* CompleteClass */
    var files: IVectorView[IStorageItem] = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: SplashScreen = js.native
    
    /* CompleteClass */
    var verb: String = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUIFileOpenPickerActivatedEventArgs")
  @js.native
  open class WebUIFileOpenPickerActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUIFileOpenPickerActivatedEventArgs {
    
    /* CompleteClass */
    var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
    
    /* CompleteClass */
    var fileOpenPickerUI: FileOpenPickerUI = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: SplashScreen = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUIFileSavePickerActivatedEventArgs")
  @js.native
  open class WebUIFileSavePickerActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUIFileSavePickerActivatedEventArgs {
    
    /* CompleteClass */
    var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
    
    /* CompleteClass */
    var fileSavePickerUI: FileSavePickerUI = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: SplashScreen = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUILaunchActivatedEventArgs")
  @js.native
  open class WebUILaunchActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUILaunchActivatedEventArgs {
    
    /* CompleteClass */
    var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
    
    /* CompleteClass */
    var arguments: String = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: SplashScreen = js.native
    
    /* CompleteClass */
    var tileId: String = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUINavigatedDeferral")
  @js.native
  open class WebUINavigatedDeferral ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUINavigatedDeferral {
    
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUINavigatedEventArgs")
  @js.native
  open class WebUINavigatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUINavigatedEventArgs {
    
    /* CompleteClass */
    var navigatedOperation: typings.winrt.Windows.UI.WebUI.WebUINavigatedOperation = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUINavigatedOperation")
  @js.native
  open class WebUINavigatedOperation ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUINavigatedOperation {
    
    /* CompleteClass */
    override def getDeferral(): typings.winrt.Windows.UI.WebUI.WebUINavigatedDeferral = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUIPrintTaskSettingsActivatedEventArgs")
  @js.native
  open class WebUIPrintTaskSettingsActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUIPrintTaskSettingsActivatedEventArgs {
    
    /* CompleteClass */
    var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
    
    /* CompleteClass */
    var configuration: PrintTaskConfiguration = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: SplashScreen = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUIProtocolActivatedEventArgs")
  @js.native
  open class WebUIProtocolActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUIProtocolActivatedEventArgs {
    
    /* CompleteClass */
    var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: SplashScreen = js.native
    
    /* CompleteClass */
    var uri: Uri = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUISearchActivatedEventArgs")
  @js.native
  open class WebUISearchActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUISearchActivatedEventArgs {
    
    /* CompleteClass */
    var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var language: String = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var queryText: String = js.native
    
    /* CompleteClass */
    var splashScreen: SplashScreen = js.native
  }
  
  @JSGlobal("Windows.UI.WebUI.WebUIShareTargetActivatedEventArgs")
  @js.native
  open class WebUIShareTargetActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.WebUI.WebUIShareTargetActivatedEventArgs {
    
    /* CompleteClass */
    var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var shareOperation: ShareOperation = js.native
    
    /* CompleteClass */
    var splashScreen: SplashScreen = js.native
  }
}
