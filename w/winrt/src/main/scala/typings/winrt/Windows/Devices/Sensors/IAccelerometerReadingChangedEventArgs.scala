package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccelerometerReadingChangedEventArgs extends js.Object {
  var reading: AccelerometerReading
}

object IAccelerometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: AccelerometerReading): IAccelerometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccelerometerReadingChangedEventArgs]
  }
}

