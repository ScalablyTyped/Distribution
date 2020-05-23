package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an inclinometer reading. */
trait InclinometerReading extends js.Object {
  /** Gets the rotation in degrees around the x-axis. */
  var pitchDegrees: Double
  /** Gets the rotation in degrees around the y-axis. */
  var rollDegrees: Double
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date
  /** Gets the inclinometer's z-axis accuracy. */
  var yawAccuracy: MagnetometerAccuracy
  /** Gets the rotation in degrees around the z-axis. */
  var yawDegrees: Double
}

object InclinometerReading {
  @scala.inline
  def apply(
    pitchDegrees: Double,
    rollDegrees: Double,
    timestamp: Date,
    yawAccuracy: MagnetometerAccuracy,
    yawDegrees: Double
  ): InclinometerReading = {
    val __obj = js.Dynamic.literal(pitchDegrees = pitchDegrees.asInstanceOf[js.Any], rollDegrees = rollDegrees.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], yawAccuracy = yawAccuracy.asInstanceOf[js.Any], yawDegrees = yawDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[InclinometerReading]
  }
}

