package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
class LightSensor () extends ILightSensor {
  /* CompleteClass */
  override var minimumReportInterval: Double = js.native
  /* CompleteClass */
  override var onreadingchanged: js.Any = js.native
  /* CompleteClass */
  override var reportInterval: Double = js.native
  /* CompleteClass */
  override def getCurrentReading(): LightSensorReading = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
object LightSensor extends js.Object {
  def getDefault(): LightSensor = js.native
}

