package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an event that occurs when the app is activated because a user tapped on the body of a toast notification or performed an action inside a toast notification. */
@JSGlobal("Windows.UI.WebUI.WebUIToastNotificationActivatedEventArgs")
@js.native
abstract class WebUIToastNotificationActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.WebUIToastNotificationActivatedEventArgs {
  
  /** Gets the app activation operation. */
  /* CompleteClass */
  var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  
  /** Gets the arguments that the app can retrieve after it is activated through an interactive toast notification. */
  /* CompleteClass */
  var argument: String = js.native
  
  /** Gets the kind of activation. */
  /* CompleteClass */
  var kind: ActivationKind = js.native
  
  /** Gets the previous execution state of the app. */
  /* CompleteClass */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: SplashScreen = js.native
  
  /** Gets a set of values that you can use to obtain the user input from an interactive toast notification. */
  /* CompleteClass */
  var userInput: ValueSet = js.native
}
