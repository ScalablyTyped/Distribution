package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents arguments used when the lock screen is activated. */
@js.native
trait WebUILockScreenActivatedEventArgs extends js.Object {
  /** Gets the object that manages an app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets information about the app activation operation. */
  var info: js.Any = js.native
  /** Gets and activation kind for the app activation operation. */
  var kind: ActivationKind = js.native
  /** Gets the previous execution state. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

object WebUILockScreenActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    currentlyShownApplicationViewId: Double,
    info: js.Any,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebUILockScreenActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUILockScreenActivatedEventArgs]
  }
  @scala.inline
  implicit class WebUILockScreenActivatedEventArgsOps[Self <: WebUILockScreenActivatedEventArgs] (val x: Self) extends AnyVal {
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
    def setCurrentlyShownApplicationViewId(value: Double): Self = this.set("currentlyShownApplicationViewId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: js.Any): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ActivationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = this.set("previousExecutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = this.set("splashScreen", value.asInstanceOf[js.Any])
  }
  
}

