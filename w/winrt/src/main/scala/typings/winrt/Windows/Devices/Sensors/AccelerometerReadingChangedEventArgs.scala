package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccelerometerReadingChangedEventArgs extends IAccelerometerReadingChangedEventArgs

object AccelerometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: AccelerometerReading): AccelerometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerReadingChangedEventArgs]
  }
}

