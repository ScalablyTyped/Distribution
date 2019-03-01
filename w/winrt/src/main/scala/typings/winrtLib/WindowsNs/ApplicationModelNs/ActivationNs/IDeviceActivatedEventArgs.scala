package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceActivatedEventArgs extends IActivatedEventArgs {
  var deviceInformationId: java.lang.String
  var verb: java.lang.String
}

object IDeviceActivatedEventArgs {
  @scala.inline
  def apply(
    deviceInformationId: java.lang.String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: java.lang.String
  ): IDeviceActivatedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceInformationId")(deviceInformationId)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("previousExecutionState")(previousExecutionState)
    __obj.updateDynamic("splashScreen")(splashScreen)
    __obj.updateDynamic("verb")(verb)
    __obj.asInstanceOf[IDeviceActivatedEventArgs]
  }
}

