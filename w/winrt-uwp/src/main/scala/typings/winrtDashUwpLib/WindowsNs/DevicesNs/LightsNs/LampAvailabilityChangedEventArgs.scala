package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.LightsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AvailabilityChanged event. */
@JSGlobal("Windows.Devices.Lights.LampAvailabilityChangedEventArgs")
@js.native
abstract class LampAvailabilityChangedEventArgs () extends js.Object {
  /** Gets a value indicating whether the lamp device that triggered the event is available. */
  var isAvailable: scala.Boolean = js.native
}

