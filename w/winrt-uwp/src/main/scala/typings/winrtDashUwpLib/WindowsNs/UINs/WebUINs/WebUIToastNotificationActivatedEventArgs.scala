package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an event that occurs when the app is activated because a user tapped on the body of a toast notification or performed an action inside a toast notification. */
@JSGlobal("Windows.UI.WebUI.WebUIToastNotificationActivatedEventArgs")
@js.native
abstract class WebUIToastNotificationActivatedEventArgs () extends js.Object {
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the arguments that the app can retrieve after it is activated through an interactive toast notification. */
  var argument: java.lang.String = js.native
  /** Gets the kind of activation. */
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the previous execution state of the app. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
  /** Gets a set of values that you can use to obtain the user input from an interactive toast notification. */
  var userInput: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet = js.native
}

