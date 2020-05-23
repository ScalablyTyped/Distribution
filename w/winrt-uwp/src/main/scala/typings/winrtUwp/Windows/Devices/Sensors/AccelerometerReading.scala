package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an accelerometer reading. */
trait AccelerometerReading extends js.Object {
  /** Gets the g-force acceleration along the x-axis. */
  var accelerationX: Double
  /** Gets the g-force acceleration along the y-axis. */
  var accelerationY: Double
  /** Gets the g-force acceleration along the z-axis. */
  var accelerationZ: Double
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date
}

object AccelerometerReading {
  @scala.inline
  def apply(accelerationX: Double, accelerationY: Double, accelerationZ: Double, timestamp: Date): AccelerometerReading = {
    val __obj = js.Dynamic.literal(accelerationX = accelerationX.asInstanceOf[js.Any], accelerationY = accelerationY.asInstanceOf[js.Any], accelerationZ = accelerationZ.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerReading]
  }
}

