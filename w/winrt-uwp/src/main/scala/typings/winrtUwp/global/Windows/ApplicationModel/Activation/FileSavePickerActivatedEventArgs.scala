package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSavePickerUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an activated event that fires when the user saves a file through the file picker and selects the app as the location. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.FileSavePickerActivatedEventArgs")
@js.native
open class FileSavePickerActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.FileSavePickerActivatedEventArgs {
  
  /** The package family name of the app that launched this app. */
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
  var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}
