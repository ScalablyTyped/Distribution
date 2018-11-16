package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.OrientationSensor")
@js.native
class OrientationSensor () extends IOrientationSensor {
  /* CompleteClass */
  override var minimumReportInterval: scala.Double = js.native
  /* CompleteClass */
  override var onreadingchanged: js.Any = js.native
  /* CompleteClass */
  override var reportInterval: scala.Double = js.native
  /* CompleteClass */
  override def getCurrentReading(): OrientationSensorReading = js.native
}

@JSGlobal("Windows.Devices.Sensors.OrientationSensor")
@js.native
object OrientationSensor extends js.Object {
  def getDefault(): winrtLib.WindowsNs.DevicesNs.SensorsNs.OrientationSensor = js.native
}

