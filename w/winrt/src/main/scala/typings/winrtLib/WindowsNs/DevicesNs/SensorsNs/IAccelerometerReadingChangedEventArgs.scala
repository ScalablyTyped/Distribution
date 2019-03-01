package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccelerometerReadingChangedEventArgs extends js.Object {
  var reading: AccelerometerReading
}

object IAccelerometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: AccelerometerReading): IAccelerometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reading")(reading)
    __obj.asInstanceOf[IAccelerometerReadingChangedEventArgs]
  }
}

