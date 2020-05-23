package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an event that occurs when the app is activated because a user tapped on the body of a toast notification or performed an action inside a toast notification. */
trait ToastNotificationActivatedEventArgs extends js.Object {
  /** Gets the arguments that the app can retrieve after it is activated through an interactive toast notification. */
  var argument: String
  /** Gets the reason for the activation of the app for this event. */
  var kind: ActivationKind
  /** Gets the execution state of the app before the app was activated because a user tapped on the body of a toast notification or performed an action inside a toast notification. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  /** Gets a set of values that you can use to obtain the user input from an interactive toast notification. */
  var userInput: ValueSet
}

object ToastNotificationActivatedEventArgs {
  @scala.inline
  def apply(
    argument: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    userInput: ValueSet
  ): ToastNotificationActivatedEventArgs = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastNotificationActivatedEventArgs]
  }
}

