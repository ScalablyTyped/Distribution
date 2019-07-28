package typings.winrtDashUwp.WindowsNs.UINs.WebUINs

import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.ValueSet
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
  var argument: String = js.native
  /** Gets the kind of activation. */
  var kind: ActivationKind = js.native
  /** Gets the previous execution state of the app. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets a set of values that you can use to obtain the user input from an interactive toast notification. */
  var userInput: ValueSet = js.native
}

