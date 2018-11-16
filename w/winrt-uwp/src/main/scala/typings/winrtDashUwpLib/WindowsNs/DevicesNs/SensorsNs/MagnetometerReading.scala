package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

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
  var magneticFieldX: scala.Double = js.native
  /** Gets the magnetic field strength in microteslas along the Y axis. */
  var magneticFieldY: scala.Double = js.native
  /** Gets the magnetic field strength in microteslas along the Z axis. */
  var magneticFieldZ: scala.Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: stdLib.Date = js.native
}

