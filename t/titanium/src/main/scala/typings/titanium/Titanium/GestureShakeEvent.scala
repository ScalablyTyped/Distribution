package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when the device is shaken.
	 */
trait GestureShakeEvent extends GestureBaseEvent {
  /**
  		 * Time interval since previous shake event. On iOS, this value is 0 for the first shake
  		 * event in a series.
  		 */
  var timestamp: Double
  /**
  		 * Acceleration along the X axis, in Gs.
  		 */
  var x: Double
  /**
  		 * Acceleration along the Y axis, in Gs.
  		 */
  var y: Double
  /**
  		 * Acceleration along the Z axis, in Gs.
  		 */
  var z: Double
}

object GestureShakeEvent {
  @scala.inline
  def apply(source: Gesture, timestamp: Double, x: Double, y: Double, z: Double): GestureShakeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureShakeEvent]
  }
}

