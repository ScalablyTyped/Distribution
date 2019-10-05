package typings.winrtDashUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an altimeter reading. */
@JSGlobal("Windows.Devices.Sensors.AltimeterReading")
@js.native
abstract class AltimeterReading () extends js.Object {
  /** Gets the current altitude determined by the altimeter sensor. */
  var altitudeChangeInMeters: Double = js.native
  /** Gets the time for the most recent altimeter reading. */
  var timestamp: Date = js.native
}

