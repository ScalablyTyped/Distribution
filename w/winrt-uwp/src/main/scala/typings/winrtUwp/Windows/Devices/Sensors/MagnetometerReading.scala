package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a magnetometer reading. */
trait MagnetometerReading extends js.Object {
  /** Gets the magnetometer's directional accuracy. */
  var directionalAccuracy: MagnetometerAccuracy
  /** Gets the magnetic field strength in microteslas along the X axis. */
  var magneticFieldX: Double
  /** Gets the magnetic field strength in microteslas along the Y axis. */
  var magneticFieldY: Double
  /** Gets the magnetic field strength in microteslas along the Z axis. */
  var magneticFieldZ: Double
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date
}

object MagnetometerReading {
  @scala.inline
  def apply(
    directionalAccuracy: MagnetometerAccuracy,
    magneticFieldX: Double,
    magneticFieldY: Double,
    magneticFieldZ: Double,
    timestamp: Date
  ): MagnetometerReading = {
    val __obj = js.Dynamic.literal(directionalAccuracy = directionalAccuracy.asInstanceOf[js.Any], magneticFieldX = magneticFieldX.asInstanceOf[js.Any], magneticFieldY = magneticFieldY.asInstanceOf[js.Any], magneticFieldZ = magneticFieldZ.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagnetometerReading]
  }
}

