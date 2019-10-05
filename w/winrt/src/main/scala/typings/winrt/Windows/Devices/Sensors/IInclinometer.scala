package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInclinometer extends js.Object {
  var minimumReportInterval: Double
  var onreadingchanged: js.Any
  var reportInterval: Double
  def getCurrentReading(): InclinometerReading
}

object IInclinometer {
  @scala.inline
  def apply(
    getCurrentReading: () => InclinometerReading,
    minimumReportInterval: Double,
    onreadingchanged: js.Any,
    reportInterval: Double
  ): IInclinometer = {
    val __obj = js.Dynamic.literal(getCurrentReading = js.Any.fromFunction0(getCurrentReading), minimumReportInterval = minimumReportInterval, onreadingchanged = onreadingchanged, reportInterval = reportInterval)
  
    __obj.asInstanceOf[IInclinometer]
  }
}

