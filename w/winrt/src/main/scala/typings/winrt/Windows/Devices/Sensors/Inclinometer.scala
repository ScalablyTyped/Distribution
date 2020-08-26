package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inclinometer extends IInclinometer

object Inclinometer {
  @scala.inline
  def apply(
    getCurrentReading: () => InclinometerReading,
    minimumReportInterval: Double,
    onreadingchanged: js.Any,
    reportInterval: Double
  ): Inclinometer = {
    val __obj = js.Dynamic.literal(getCurrentReading = js.Any.fromFunction0(getCurrentReading), minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inclinometer]
  }
}

