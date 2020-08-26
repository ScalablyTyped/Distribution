package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the accelerometer changes.
  */
@js.native
trait AccelerometerUpdateEvent extends AccelerometerBaseEvent {
  /**
    * Reference timestamp since the previous change. This is not a valid timestamp and should
    * simply be used to determine the number of milliseconds between events.
    */
  var timestamp: Double = js.native
  /**
    * Current `x` axis of the device.
    */
  var x: Double = js.native
  /**
    * Current `y` axis of the device.
    */
  var y: Double = js.native
  /**
    * Current `z` axis of the device.
    */
  var z: Double = js.native
}

object AccelerometerUpdateEvent {
  @scala.inline
  def apply(source: Accelerometer, timestamp: Double, x: Double, y: Double, z: Double): AccelerometerUpdateEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerUpdateEvent]
  }
  @scala.inline
  implicit class AccelerometerUpdateEventOps[Self <: AccelerometerUpdateEvent] (val x: Self) extends AnyVal {
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
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
  
}

