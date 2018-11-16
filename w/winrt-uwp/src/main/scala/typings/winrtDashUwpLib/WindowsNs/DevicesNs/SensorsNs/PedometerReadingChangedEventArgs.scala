package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the pedometer reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.PedometerReadingChangedEventArgs")
@js.native
abstract class PedometerReadingChangedEventArgs () extends js.Object {
  /** Gets the most recent pedometer reading. */
  var reading: PedometerReading = js.native
}

