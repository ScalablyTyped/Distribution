package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a barometer reading. */
@JSGlobal("Windows.Devices.Sensors.BarometerReading")
@js.native
abstract class BarometerReading () extends js.Object {
  /** Gets the barometric pressure determined by the barometer sensor. */
  var stationPressureInHectopascals: scala.Double = js.native
  /** Gets the time for the most recent barometer reading. */
  var timestamp: stdLib.Date = js.native
}

