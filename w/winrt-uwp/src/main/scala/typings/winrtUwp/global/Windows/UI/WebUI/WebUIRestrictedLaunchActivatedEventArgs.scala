package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides event information when a restricted app is launched. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.WebUIRestrictedLaunchActivatedEventArgs")
@js.native
open class WebUIRestrictedLaunchActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.WebUIRestrictedLaunchActivatedEventArgs {
  
  /** Gets the app activated operation. */
  /* CompleteClass */
  var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets information about a shared context for the restricted launch. */
  /* CompleteClass */
  var sharedContext: Any = js.native
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: SplashScreen = js.native
}
