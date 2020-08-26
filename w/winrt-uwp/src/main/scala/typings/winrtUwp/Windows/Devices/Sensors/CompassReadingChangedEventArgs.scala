package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the compass reading–changed event. */
@js.native
trait CompassReadingChangedEventArgs extends js.Object {
  /** Gets the current compass reading. */
  var reading: CompassReading = js.native
}

object CompassReadingChangedEventArgs {
  @scala.inline
  def apply(reading: CompassReading): CompassReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassReadingChangedEventArgs]
  }
  @scala.inline
  implicit class CompassReadingChangedEventArgsOps[Self <: CompassReadingChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setReading(value: CompassReading): Self = this.set("reading", value.asInstanceOf[js.Any])
  }
  
}

