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
    val __obj = js.Dynamic.literal(kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen, videoDeviceController = videoDeviceController, videoDeviceExtension = videoDeviceExtension)
  
    __obj.asInstanceOf[ICameraSettingsActivatedEventArgs]
  }
}

