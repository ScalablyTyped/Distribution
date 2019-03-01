package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrientationSensorStatics extends js.Object {
  def getDefault(): OrientationSensor
}

object IOrientationSensorStatics {
  @scala.inline
  def apply(getDefault: js.Function0[OrientationSensor]): IOrientationSensorStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDefault")(getDefault)
    __obj.asInstanceOf[IOrientationSensorStatics]
  }
}

