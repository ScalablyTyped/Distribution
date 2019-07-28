package typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the barometer reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.BarometerReadingChangedEventArgs")
@js.native
abstract class BarometerReadingChangedEventArgs () extends js.Object {
  /** Gets the most recent barometer reading. */
  var reading: BarometerReading = js.native
}

