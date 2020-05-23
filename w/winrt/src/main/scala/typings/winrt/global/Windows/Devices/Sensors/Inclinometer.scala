package typings.winrt.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.Inclinometer")
@js.native
class Inclinometer ()
  extends typings.winrt.Windows.Devices.Sensors.Inclinometer {
  /* CompleteClass */
  override var minimumReportInterval: Double = js.native
  /* CompleteClass */
  override var onreadingchanged: js.Any = js.native
  /* CompleteClass */
  override var reportInterval: Double = js.native
  /* CompleteClass */
  override def getCurrentReading(): typings.winrt.Windows.Devices.Sensors.InclinometerReading = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.Inclinometer")
@js.native
object Inclinometer extends js.Object {
  def getDefault(): typings.winrt.Windows.Devices.Sensors.Inclinometer = js.native
}

