package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accelerometer extends IAccelerometer

object Accelerometer {
  @scala.inline
  def apply(
    getCurrentReading: () => AccelerometerReading,
    minimumReportInterval: Double,
    onreadingchanged: js.Any,
    onshaken: js.Any,
    reportInterval: Double
  ): Accelerometer = {
    val __obj = js.Dynamic.literal(getCurrentReading = js.Any.fromFunction0(getCurrentReading), minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], onshaken = onshaken.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accelerometer]
  }
}

