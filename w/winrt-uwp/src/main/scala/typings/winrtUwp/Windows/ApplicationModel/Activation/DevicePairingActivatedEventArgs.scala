package typings.winrtUwp.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicePairingActivatedEventArgs extends js.Object {
  var deviceInformation: js.Any
   /* unmapped type */ var kind: js.Any
   /* unmapped type */ var previousExecutionState: js.Any
   /* unmapped type */ var splashScreen: js.Any
}

object DevicePairingActivatedEventArgs {
  @scala.inline
  def apply(deviceInformation: js.Any, kind: js.Any, previousExecutionState: js.Any, splashScreen: js.Any): DevicePairingActivatedEventArgs = {
    val __obj = js.Dynamic.literal(deviceInformation = deviceInformation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePairingActivatedEventArgs]
  }
}

