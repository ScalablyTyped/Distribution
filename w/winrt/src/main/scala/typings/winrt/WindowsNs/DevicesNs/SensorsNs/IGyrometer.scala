package typings.winrt.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGyrometer extends js.Object {
  var minimumReportInterval: Double
  var onreadingchanged: js.Any
  var reportInterval: Double
  def getCurrentReading(): GyrometerReading
}

object IGyrometer {
  @scala.inline
  def apply(
    getCurrentReading: () => GyrometerReading,
    minimumReportInterval: Double,
    onreadingchanged: js.Any,
    reportInterval: Double
  ): IGyrometer = {
    val __obj = js.Dynamic.literal(getCurrentReading = js.Any.fromFunction0(getCurrentReading), minimumReportInterval = minimumReportInterval, onreadingchanged = onreadingchanged, reportInterval = reportInterval)
  
    __obj.asInstanceOf[IGyrometer]
  }
}

