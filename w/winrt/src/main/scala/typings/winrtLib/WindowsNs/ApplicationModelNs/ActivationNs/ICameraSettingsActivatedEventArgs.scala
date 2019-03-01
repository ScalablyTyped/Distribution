package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICameraSettingsActivatedEventArgs extends IActivatedEventArgs {
  var videoDeviceController: js.Any
  var videoDeviceExtension: js.Any
}

object ICameraSettingsActivatedEventArgs {
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    videoDeviceController: js.Any,
    videoDeviceExtension: js.Any
  ): ICameraSettingsActivatedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("previousExecutionState")(previousExecutionState)
    __obj.updateDynamic("splashScreen")(splashScreen)
    __obj.updateDynamic("videoDeviceController")(videoDeviceController)
    __obj.updateDynamic("videoDeviceExtension")(videoDeviceExtension)
    __obj.asInstanceOf[ICameraSettingsActivatedEventArgs]
  }
}

