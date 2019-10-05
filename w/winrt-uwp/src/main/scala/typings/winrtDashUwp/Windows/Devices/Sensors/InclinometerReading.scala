package typings.winrtDashUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an inclinometer reading. */
@JSGlobal("Windows.Devices.Sensors.InclinometerReading")
@js.native
abstract class InclinometerReading () extends js.Object {
  /** Gets the rotation in degrees around the x-axis. */
  var pitchDegrees: Double = js.native
  /** Gets the rotation in degrees around the y-axis. */
  var rollDegrees: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date = js.native
  /** Gets the inclinometer's z-axis accuracy. */
  var yawAccuracy: MagnetometerAccuracy = js.native
  /** Gets the rotation in degrees around the z-axis. */
  var yawDegrees: Double = js.native
}

