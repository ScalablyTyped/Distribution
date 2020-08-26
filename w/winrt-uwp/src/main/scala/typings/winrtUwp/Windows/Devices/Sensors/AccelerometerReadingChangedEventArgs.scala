package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the accelerometer reading–changed event. */
@js.native
trait AccelerometerReadingChangedEventArgs extends js.Object {
  /** Gets the most recent accelerometer reading. */
  var reading: AccelerometerReading = js.native
}

object AccelerometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: AccelerometerReading): AccelerometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerReadingChangedEventArgs]
  }
  @scala.inline
  implicit class AccelerometerReadingChangedEventArgsOps[Self <: AccelerometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReading(value: AccelerometerReading): Self = this.set("reading", value.asInstanceOf[js.Any])
  }
  
}

