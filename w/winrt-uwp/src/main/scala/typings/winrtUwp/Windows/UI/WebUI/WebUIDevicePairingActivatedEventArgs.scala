package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for a device that invokes pairing. */
@js.native
trait WebUIDevicePairingActivatedEventArgs extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets info about the device that triggered the operation. */
  var deviceInformation: DeviceInformation = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

object WebUIDevicePairingActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    deviceInformation: DeviceInformation,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebUIDevicePairingActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], deviceInformation = deviceInformation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIDevicePairingActivatedEventArgs]
  }
  @scala.inline
  implicit class WebUIDevicePairingActivatedEventArgsOps[Self <: WebUIDevicePairingActivatedEventArgs] (val x: Self) extends AnyVal {
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
    def setDeviceInformation(value: DeviceInformation): Self = this.set("deviceInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ActivationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = this.set("previousExecutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = this.set("splashScreen", value.asInstanceOf[js.Any])
  }
  
}

