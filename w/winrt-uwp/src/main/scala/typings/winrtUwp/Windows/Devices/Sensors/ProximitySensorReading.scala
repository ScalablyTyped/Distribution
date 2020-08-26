package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reading from the proximity sensor. */
@js.native
trait ProximitySensorReading extends js.Object {
  /** Gets the distance from the proximity sensor to the detected object. */
  var distanceInMillimeters: Double = js.native
  /** Gets whether or not an object is detected by the proximity sensor. */
  var isDetected: Boolean = js.native
  /** Gets the time for the most recent proximity sensor reading. */
  var timestamp: Date = js.native
}

object ProximitySensorReading {
  @scala.inline
  def apply(distanceInMillimeters: Double, isDetected: Boolean, timestamp: Date): ProximitySensorReading = {
    val __obj = js.Dynamic.literal(distanceInMillimeters = distanceInMillimeters.asInstanceOf[js.Any], isDetected = isDetected.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximitySensorReading]
  }
  @scala.inline
  implicit class ProximitySensorReadingOps[Self <: ProximitySensorReading] (val x: Self) extends AnyVal {
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
    def setDistanceInMillimeters(value: Double): Self = this.set("distanceInMillimeters", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDetected(value: Boolean): Self = this.set("isDetected", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

