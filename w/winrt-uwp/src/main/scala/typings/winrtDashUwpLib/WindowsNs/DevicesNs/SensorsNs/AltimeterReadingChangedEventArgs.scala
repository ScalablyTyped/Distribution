package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the altimeter reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.AltimeterReadingChangedEventArgs")
@js.native
abstract class AltimeterReadingChangedEventArgs () extends js.Object {
  /** Gets the most recent barometer reading. */
  var reading: AltimeterReading = js.native
}

