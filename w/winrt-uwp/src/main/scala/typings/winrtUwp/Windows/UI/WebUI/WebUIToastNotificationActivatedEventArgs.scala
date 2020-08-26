package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an event that occurs when the app is activated because a user tapped on the body of a toast notification or performed an action inside a toast notification. */
@js.native
trait WebUIToastNotificationActivatedEventArgs extends js.Object {
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

object WebUIToastNotificationActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    argument: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    userInput: ValueSet
  ): WebUIToastNotificationActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], argument = argument.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIToastNotificationActivatedEventArgs]
  }
  @scala.inline
  implicit class WebUIToastNotificationActivatedEventArgsOps[Self <: WebUIToastNotificationActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivatedOperation(value: ActivatedOperation): Self = this.set("activatedOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgument(value: String): Self = this.set("argument", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ActivationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = this.set("previousExecutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = this.set("splashScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserInput(value: ValueSet): Self = this.set("userInput", value.asInstanceOf[js.Any])
  }
  
}

