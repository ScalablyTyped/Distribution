package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISimpleOrientationSensorStatics extends js.Object {
  def getDefault(): SimpleOrientationSensor
}

object ISimpleOrientationSensorStatics {
  @scala.inline
  def apply(getDefault: () => SimpleOrientationSensor): ISimpleOrientationSensorStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
  
    __obj.asInstanceOf[ISimpleOrientationSensorStatics]
  }
}

