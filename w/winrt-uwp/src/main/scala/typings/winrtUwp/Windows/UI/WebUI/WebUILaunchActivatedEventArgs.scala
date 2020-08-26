package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when an app is launched. */
@js.native
trait WebUILaunchActivatedEventArgs extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the arguments that are passed to the app during its launch activation. */
  var arguments: String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** (Applies to Windows only) Gets an indication about whether a pre-launch has been activated. */
  var prelaunchActivated: Boolean = js.native
  /** Gets the execution state of the app before this activation. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the ID of the source that was invoked to launch the application. */
  var tileId: String = js.native
}

object WebUILaunchActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    arguments: String,
    currentlyShownApplicationViewId: Double,
    kind: ActivationKind,
    prelaunchActivated: Boolean,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    tileId: String
  ): WebUILaunchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], arguments = arguments.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], prelaunchActivated = prelaunchActivated.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], tileId = tileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUILaunchActivatedEventArgs]
  }
  @scala.inline
  implicit class WebUILaunchActivatedEventArgsOps[Self <: WebUILaunchActivatedEventArgs] (val x: Self) extends AnyVal {
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
    def setArguments(value: String): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentlyShownApplicationViewId(value: Double): Self = this.set("currentlyShownApplicationViewId", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ActivationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrelaunchActivated(value: Boolean): Self = this.set("prelaunchActivated", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = this.set("previousExecutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = this.set("splashScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileId(value: String): Self = this.set("tileId", value.asInstanceOf[js.Any])
  }
  
}

