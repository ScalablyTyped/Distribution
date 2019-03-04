package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightSensorStatics extends js.Object {
  def getDefault(): LightSensor
}

object ILightSensorStatics {
  @scala.inline
  def apply(getDefault: js.Function0[LightSensor]): ILightSensorStatics = {
    val __obj = js.Dynamic.literal(getDefault = getDefault)
  
    __obj.asInstanceOf[ILightSensorStatics]
  }
}

