package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightSensorStatics extends js.Object {
  def getDefault(): LightSensor
}

object ILightSensorStatics {
  @scala.inline
  def apply(getDefault: () => LightSensor): ILightSensorStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
  
    __obj.asInstanceOf[ILightSensorStatics]
  }
}

