package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an altimeter reading. */
@JSGlobal("Windows.Devices.Sensors.AltimeterReading")
@js.native
abstract class AltimeterReading () extends js.Object {
  /** Gets the current altitude determined by the altimeter sensor. */
  var altitudeChangeInMeters: scala.Double = js.native
  /** Gets the time for the most recent altimeter reading. */
  var timestamp: stdLib.Date = js.native
}

