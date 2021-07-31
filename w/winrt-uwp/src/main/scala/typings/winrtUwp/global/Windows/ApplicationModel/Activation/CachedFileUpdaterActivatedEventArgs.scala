package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Storage.Provider.CachedFileUpdaterUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the activated event that fires when the user saves or opens a file that needs updates from the app. */
@JSGlobal("Windows.ApplicationModel.Activation.CachedFileUpdaterActivatedEventArgs")
@js.native
abstract class CachedFileUpdaterActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.CachedFileUpdaterActivatedEventArgs {
  
  /** Gets the letterbox UI of the file picker that is displayed when a file needs updates from the app. */
  /* CompleteClass */
  var cachedFileUpdaterUI: CachedFileUpdaterUI = js.native
  
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
