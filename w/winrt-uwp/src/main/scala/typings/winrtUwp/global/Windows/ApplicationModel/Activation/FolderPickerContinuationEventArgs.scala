package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an activated event that fires after the app was suspended for a folder picker operation. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.FolderPickerContinuationEventArgs")
@js.native
open class FolderPickerContinuationEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.FolderPickerContinuationEventArgs {
  
  /** Gets a set of values populated by the app before a FolderPicker operation that deactivates the app in order to provide context when the app is activated. */
  /* CompleteClass */
  var continuationData: ValueSet = js.native
  
  /** Gets the folder selected by the user during the folder picker operation. */
  /* CompleteClass */
  var folder: StorageFolder = js.native
  
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
