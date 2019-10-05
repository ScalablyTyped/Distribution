package typings.winrt.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceActivatedEventArgs extends IActivatedEventArgs {
  var deviceInformationId: String
  var verb: String
}

object IDeviceActivatedEventArgs {
  @scala.inline
  def apply(
    deviceInformationId: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String
  ): IDeviceActivatedEventArgs = {
    val __obj = js.Dynamic.literal(deviceInformationId = deviceInformationId, kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen, verb = verb)
  
    __obj.asInstanceOf[IDeviceActivatedEventArgs]
  }
}

