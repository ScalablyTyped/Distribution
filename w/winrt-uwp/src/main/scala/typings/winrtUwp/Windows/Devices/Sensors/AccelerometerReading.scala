package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an accelerometer reading. */
@JSGlobal("Windows.Devices.Sensors.AccelerometerReading")
@js.native
abstract class AccelerometerReading () extends js.Object {
  /** Gets the g-force acceleration along the x-axis. */
  var accelerationX: Double = js.native
  /** Gets the g-force acceleration along the y-axis. */
  var accelerationY: Double = js.native
  /** Gets the g-force acceleration along the z-axis. */
  var accelerationZ: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date = js.native
}

