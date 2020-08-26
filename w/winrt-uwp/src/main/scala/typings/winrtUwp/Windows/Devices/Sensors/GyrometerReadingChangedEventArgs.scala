package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the gyrometer reading–changed event. */
@js.native
trait GyrometerReadingChangedEventArgs extends js.Object {
  /** Gets the current gyrometer reading. */
  var reading: GyrometerReading = js.native
}

object GyrometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: GyrometerReading): GyrometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyrometerReadingChangedEventArgs]
  }
  @scala.inline
  implicit class GyrometerReadingChangedEventArgsOps[Self <: GyrometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setReading(value: GyrometerReading): Self = this.set("reading", value.asInstanceOf[js.Any])
  }
  
}

