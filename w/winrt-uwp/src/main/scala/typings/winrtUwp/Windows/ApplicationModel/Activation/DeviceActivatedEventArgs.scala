package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for a device that invokes AutoPlay. */
@js.native
trait DeviceActivatedEventArgs extends js.Object {
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets the device identifier for the device that invoked AutoPlay. */
  var deviceInformationId: String = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action associated with the activated device. */
  var verb: String = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher = js.native
}

object DeviceActivatedEventArgs {
  @scala.inline
  def apply(
    currentlyShownApplicationViewId: Double,
    deviceInformationId: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String,
    viewSwitcher: ActivationViewSwitcher
  ): DeviceActivatedEventArgs = {
    val __obj = js.Dynamic.literal(currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], deviceInformationId = deviceInformationId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any], viewSwitcher = viewSwitcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceActivatedEventArgs]
  }
  @scala.inline
  implicit class DeviceActivatedEventArgsOps[Self <: DeviceActivatedEventArgs] (val x: Self) extends AnyVal {
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
    def setCurrentlyShownApplicationViewId(value: Double): Self = this.set("currentlyShownApplicationViewId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceInformationId(value: String): Self = this.set("deviceInformationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ActivationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = this.set("previousExecutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = this.set("splashScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerb(value: String): Self = this.set("verb", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewSwitcher(value: ActivationViewSwitcher): Self = this.set("viewSwitcher", value.asInstanceOf[js.Any])
  }
  
}

