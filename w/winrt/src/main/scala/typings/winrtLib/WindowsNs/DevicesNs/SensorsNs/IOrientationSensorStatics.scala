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
  def apply(getDefault: () => OrientationSensor): IOrientationSensorStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
  
    __obj.asInstanceOf[IOrientationSensorStatics]
  }
}

