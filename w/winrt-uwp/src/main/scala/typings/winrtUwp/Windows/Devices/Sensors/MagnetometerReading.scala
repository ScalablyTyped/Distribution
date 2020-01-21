package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a magnetometer reading. */
@JSGlobal("Windows.Devices.Sensors.MagnetometerReading")
@js.native
abstract class MagnetometerReading () extends js.Object {
  /** Gets the magnetometer's directional accuracy. */
  var directionalAccuracy: MagnetometerAccuracy = js.native
  /** Gets the magnetic field strength in microteslas along the X axis. */
  var magneticFieldX: Double = js.native
  /** Gets the magnetic field strength in microteslas along the Y axis. */
  var magneticFieldY: Double = js.native
  /** Gets the magnetic field strength in microteslas along the Z axis. */
  var magneticFieldZ: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date = js.native
}

