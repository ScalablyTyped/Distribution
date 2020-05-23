package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a compass reading. */
trait CompassReading extends js.Object {
  /** Gets the compass's heading accuracy. */
  var headingAccuracy: MagnetometerAccuracy
  /** Gets the heading in degrees relative to magnetic-north. */
  var headingMagneticNorth: Double
  /** Gets the heading in degrees relative to geographic true-north. */
  var headingTrueNorth: Double
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date
}

object CompassReading {
  @scala.inline
  def apply(
    headingAccuracy: MagnetometerAccuracy,
    headingMagneticNorth: Double,
    headingTrueNorth: Double,
    timestamp: Date
  ): CompassReading = {
    val __obj = js.Dynamic.literal(headingAccuracy = headingAccuracy.asInstanceOf[js.Any], headingMagneticNorth = headingMagneticNorth.asInstanceOf[js.Any], headingTrueNorth = headingTrueNorth.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassReading]
  }
}

