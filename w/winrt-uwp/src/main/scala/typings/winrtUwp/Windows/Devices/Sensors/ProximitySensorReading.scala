package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reading from the proximity sensor. */
trait ProximitySensorReading extends js.Object {
  /** Gets the distance from the proximity sensor to the detected object. */
  var distanceInMillimeters: Double
  /** Gets whether or not an object is detected by the proximity sensor. */
  var isDetected: Boolean
  /** Gets the time for the most recent proximity sensor reading. */
  var timestamp: Date
}

object ProximitySensorReading {
  @scala.inline
  def apply(distanceInMillimeters: Double, isDetected: Boolean, timestamp: Date): ProximitySensorReading = {
    val __obj = js.Dynamic.literal(distanceInMillimeters = distanceInMillimeters.asInstanceOf[js.Any], isDetected = isDetected.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximitySensorReading]
  }
}

