package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.OrientationSensor")
@js.native
class OrientationSensor () extends IOrientationSensor {
  /* CompleteClass */
  override var minimumReportInterval: Double = js.native
  /* CompleteClass */
  override var onreadingchanged: js.Any = js.native
  /* CompleteClass */
  override var reportInterval: Double = js.native
  /* CompleteClass */
  override def getCurrentReading(): OrientationSensorReading = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.OrientationSensor")
@js.native
object OrientationSensor extends js.Object {
  def getDefault(): OrientationSensor = js.native
}

