package typings.winrt.Windows.ApplicationModel.Activation

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
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], videoDeviceController = videoDeviceController.asInstanceOf[js.Any], videoDeviceExtension = videoDeviceExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICameraSettingsActivatedEventArgs]
  }
}

