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
  def apply(getDefault: js.Function0[SimpleOrientationSensor]): ISimpleOrientationSensorStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDefault")(getDefault)
    __obj.asInstanceOf[ISimpleOrientationSensorStatics]
  }
}

