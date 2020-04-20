package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when the accelerometer changes.
	 */
trait AccelerometerUpdateEvent extends AccelerometerBaseEvent {
  /**
  		 * Reference timestamp since the previous change. This is not a valid timestamp and should
  		 * simply be used to determine the number of milliseconds between events.
  		 */
  var timestamp: Double
  /**
  		 * Current `x` axis of the device.
  		 */
  var x: Double
  /**
  		 * Current `y` axis of the device.
  		 */
  var y: Double
  /**
  		 * Current `z` axis of the device.
  		 */
  var z: Double
}

object AccelerometerUpdateEvent {
  @scala.inline
  def apply(source: Accelerometer, timestamp: Double, x: Double, y: Double, z: Double): AccelerometerUpdateEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerUpdateEvent]
  }
}

