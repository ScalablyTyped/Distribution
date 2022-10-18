package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an activated event that fires after the app was suspended for a file open picker operation. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.WebUIFileOpenPickerContinuationEventArgs")
@js.native
open class WebUIFileOpenPickerContinuationEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.WebUIFileOpenPickerContinuationEventArgs {
  
  /** Gets the app activation operation. */
  /* CompleteClass */
  var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  
  /** Gets a set of values populated by the app before a FileOpenPicker operation that deactivates the app in order to provide context when the app is activated. */
  /* CompleteClass */
  var continuationData: ValueSet = js.native
  
  /** Gets the files for which the app was activated. */
  /* CompleteClass */
  var files: IVectorView[StorageFile] = js.native
  
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
