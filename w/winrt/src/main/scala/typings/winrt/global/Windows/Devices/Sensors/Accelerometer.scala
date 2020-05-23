package typings.winrt.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.Accelerometer")
@js.native
class Accelerometer ()
  extends typings.winrt.Windows.Devices.Sensors.Accelerometer {
  /* CompleteClass */
  override var minimumReportInterval: Double = js.native
  /* CompleteClass */
  override var onreadingchanged: js.Any = js.native
  /* CompleteClass */
  override var onshaken: js.Any = js.native
  /* CompleteClass */
  override var reportInterval: Double = js.native
  /* CompleteClass */
  override def getCurrentReading(): typings.winrt.Windows.Devices.Sensors.AccelerometerReading = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.Accelerometer")
@js.native
object Accelerometer extends js.Object {
  def getDefault(): typings.winrt.Windows.Devices.Sensors.Accelerometer = js.native
}

