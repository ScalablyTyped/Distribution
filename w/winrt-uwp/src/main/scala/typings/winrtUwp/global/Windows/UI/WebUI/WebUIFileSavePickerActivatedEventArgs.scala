package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSavePickerUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an activated event that fires when the user saves a file through the file picker and selects the app as the location. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.WebUIFileSavePickerActivatedEventArgs")
@js.native
open class WebUIFileSavePickerActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.WebUIFileSavePickerActivatedEventArgs {
  
  /** Gets the app activated operation. */
  /* CompleteClass */
  var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  
  /** Gets the family name of the caller's package. */
  /* CompleteClass */
  var callerPackageFamilyName: String = js.native
  
  /** Gets the ID of the enterprise that owns the file. */
  /* CompleteClass */
  var enterpriseId: String = js.native
  
  /** Gets the letterbox UI of the file picker that is displayed when the user saves a file and selects the app as the save location. */
  /* CompleteClass */
  var fileSavePickerUI: FileSavePickerUI = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: SplashScreen = js.native
}
