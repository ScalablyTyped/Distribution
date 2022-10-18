package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an activated event that fires after the app was suspended for a file open picker operation. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.FileOpenPickerContinuationEventArgs")
@js.native
open class FileOpenPickerContinuationEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.FileOpenPickerContinuationEventArgs {
  
  /** Gets a set of values populated by the app before a FileOpenPicker operation that deactivates the app in order to provide context when the app is activated. */
  /* CompleteClass */
  var continuationData: ValueSet = js.native
  
  /** Gets the list of files selected by the user during the file open picker operation. */
  /* CompleteClass */
  var files: IVectorView[StorageFile] = js.native
  
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
