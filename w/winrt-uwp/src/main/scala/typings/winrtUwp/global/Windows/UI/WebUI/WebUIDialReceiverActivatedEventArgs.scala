package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated from another app by using the DIAL protocol. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.WebUIDialReceiverActivatedEventArgs")
@js.native
open class WebUIDialReceiverActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.WebUIDialReceiverActivatedEventArgs {
  
  /** Gets the app activated operation. */
  /* CompleteClass */
  var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  
  /** Gets the name of the app that invoked the dial receiver app. */
  /* CompleteClass */
  var appName: String = js.native
  
  /** Gets the arguments that are passed to the app during its launch activation. */
  /* CompleteClass */
  var arguments: String = js.native
  
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  var currentlyShownApplicationViewId: Double = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: SplashScreen = js.native
  
  /** Gets the identifier of the source tile that launched the app. */
  /* CompleteClass */
  var tileId: String = js.native
}
