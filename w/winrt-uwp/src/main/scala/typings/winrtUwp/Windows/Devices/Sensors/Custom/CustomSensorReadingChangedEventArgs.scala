package typings.winrtUwp.Windows.Devices.Sensors.Custom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data for the reading–changed event of the custom sensor. */
@js.native
trait CustomSensorReadingChangedEventArgs extends js.Object {
  /** Gets the most recent sensor reading. */
  var reading: CustomSensorReading = js.native
}

object CustomSensorReadingChangedEventArgs {
  @scala.inline
  def apply(reading: CustomSensorReading): CustomSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomSensorReadingChangedEventArgs]
  }
  @scala.inline
  implicit class CustomSensorReadingChangedEventArgsOps[Self <: CustomSensorReadingChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setReading(value: CustomSensorReading): Self = this.set("reading", value.asInstanceOf[js.Any])
  }
  
}

