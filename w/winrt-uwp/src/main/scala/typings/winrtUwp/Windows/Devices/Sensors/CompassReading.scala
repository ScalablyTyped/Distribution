package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a compass reading. */
@JSGlobal("Windows.Devices.Sensors.CompassReading")
@js.native
abstract class CompassReading () extends js.Object {
  /** Gets the compass's heading accuracy. */
  var headingAccuracy: MagnetometerAccuracy = js.native
  /** Gets the heading in degrees relative to magnetic-north. */
  var headingMagneticNorth: Double = js.native
  /** Gets the heading in degrees relative to geographic true-north. */
  var headingTrueNorth: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date = js.native
}

