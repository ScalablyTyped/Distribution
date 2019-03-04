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
    val __obj = js.Dynamic.literal(deviceInformationId = deviceInformationId, kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen, verb = verb)
  
    __obj.asInstanceOf[IDeviceActivatedEventArgs]
  }
}

