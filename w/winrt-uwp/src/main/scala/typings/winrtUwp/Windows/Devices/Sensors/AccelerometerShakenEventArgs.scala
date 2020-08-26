package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the accelerometer-shaken event. */
@js.native
trait AccelerometerShakenEventArgs extends js.Object {
  /** Gets the time at which the sensor reported the shaken event. */
  var timestamp: Date = js.native
}

object AccelerometerShakenEventArgs {
  @scala.inline
  def apply(timestamp: Date): AccelerometerShakenEventArgs = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerShakenEventArgs]
  }
  @scala.inline
  implicit class AccelerometerShakenEventArgsOps[Self <: AccelerometerShakenEventArgs] (val x: Self) extends AnyVal {
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
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

