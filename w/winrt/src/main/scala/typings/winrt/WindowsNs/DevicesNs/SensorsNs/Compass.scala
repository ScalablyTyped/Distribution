package typings.winrt.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.Compass")
@js.native
class Compass () extends ICompass {
  /* CompleteClass */
  override var minimumReportInterval: Double = js.native
  /* CompleteClass */
  override var onreadingchanged: js.Any = js.native
  /* CompleteClass */
  override var reportInterval: Double = js.native
  /* CompleteClass */
  override def getCurrentReading(): CompassReading = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.Compass")
@js.native
object Compass extends js.Object {
  def getDefault(): Compass = js.native
}

