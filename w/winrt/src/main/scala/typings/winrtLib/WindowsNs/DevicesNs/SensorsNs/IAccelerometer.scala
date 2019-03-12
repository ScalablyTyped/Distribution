package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccelerometer extends js.Object {
  var minimumReportInterval: scala.Double
  var onreadingchanged: js.Any
  var onshaken: js.Any
  var reportInterval: scala.Double
  def getCurrentReading(): AccelerometerReading
}

object IAccelerometer {
  @scala.inline
  def apply(
    getCurrentReading: () => AccelerometerReading,
    minimumReportInterval: scala.Double,
    onreadingchanged: js.Any,
    onshaken: js.Any,
    reportInterval: scala.Double
  ): IAccelerometer = {
    val __obj = js.Dynamic.literal(getCurrentReading = js.Any.fromFunction0(getCurrentReading), minimumReportInterval = minimumReportInterval, onreadingchanged = onreadingchanged, onshaken = onshaken, reportInterval = reportInterval)
  
    __obj.asInstanceOf[IAccelerometer]
  }
}

