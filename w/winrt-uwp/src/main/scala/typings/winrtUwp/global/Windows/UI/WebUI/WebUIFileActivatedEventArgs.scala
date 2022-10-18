package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.IStorageItem
import typings.winrtUwp.Windows.Storage.Search.StorageFileQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated because it is the app associated with a file. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.WebUIFileActivatedEventArgs")
@js.native
open class WebUIFileActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.WebUIFileActivatedEventArgs {
  
  /** Gets the app activation operation. */
  /* CompleteClass */
  var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  var currentlyShownApplicationViewId: Double = js.native
  
  /** Gets the files for which the app was activated. */
  /* CompleteClass */
  var files: IVectorView[IStorageItem] = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: ActivationKind = js.native
  
  /** Gets the neighboring files of the files for which the app was activated. */
  /* CompleteClass */
  var neighboringFilesQuery: StorageFileQueryResult = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: SplashScreen = js.native
  
  /** Gets the action associated with the activated file. */
  /* CompleteClass */
  var verb: String = js.native
}
