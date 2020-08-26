package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data for the reading–changed event of the sensor. */
@js.native
trait ActivitySensorReadingChangedEventArgs extends js.Object {
  /** Gets the most recent sensor reading. */
  var reading: ActivitySensorReading = js.native
}

object ActivitySensorReadingChangedEventArgs {
  @scala.inline
  def apply(reading: ActivitySensorReading): ActivitySensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySensorReadingChangedEventArgs]
  }
  @scala.inline
  implicit class ActivitySensorReadingChangedEventArgsOps[Self <: ActivitySensorReadingChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setReading(value: ActivitySensorReading): Self = this.set("reading", value.asInstanceOf[js.Any])
  }
  
}

