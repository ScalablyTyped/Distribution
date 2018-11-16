package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an accelerometer reading. */
@JSGlobal("Windows.Devices.Sensors.AccelerometerReading")
@js.native
abstract class AccelerometerReading () extends js.Object {
  /** Gets the g-force acceleration along the x-axis. */
  var accelerationX: scala.Double = js.native
  /** Gets the g-force acceleration along the y-axis. */
  var accelerationY: scala.Double = js.native
  /** Gets the g-force acceleration along the z-axis. */
  var accelerationZ: scala.Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: stdLib.Date = js.native
}

