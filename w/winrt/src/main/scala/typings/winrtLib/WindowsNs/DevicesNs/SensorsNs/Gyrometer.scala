package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.Gyrometer")
@js.native
class Gyrometer () extends IGyrometer {
  /* CompleteClass */
  override var minimumReportInterval: scala.Double = js.native
  /* CompleteClass */
  override var onreadingchanged: js.Any = js.native
  /* CompleteClass */
  override var reportInterval: scala.Double = js.native
  /* CompleteClass */
  override def getCurrentReading(): GyrometerReading = js.native
}

@JSGlobal("Windows.Devices.Sensors.Gyrometer")
@js.native
object Gyrometer extends js.Object {
  def getDefault(): winrtLib.WindowsNs.DevicesNs.SensorsNs.Gyrometer = js.native
}

