package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a gyrometer reading. */
trait GyrometerReading extends js.Object {
  /** Gets the angular velocity, in degrees per second, about the x-axis. */
  var angularVelocityX: Double
  /** Gets the angular velocity, in degrees per second, about the y-axis. */
  var angularVelocityY: Double
  /** Gets the angular velocity, in degrees per second, about the z-axis. */
  var angularVelocityZ: Double
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date
}

object GyrometerReading {
  @scala.inline
  def apply(angularVelocityX: Double, angularVelocityY: Double, angularVelocityZ: Double, timestamp: Date): GyrometerReading = {
    val __obj = js.Dynamic.literal(angularVelocityX = angularVelocityX.asInstanceOf[js.Any], angularVelocityY = angularVelocityY.asInstanceOf[js.Any], angularVelocityZ = angularVelocityZ.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyrometerReading]
  }
}

