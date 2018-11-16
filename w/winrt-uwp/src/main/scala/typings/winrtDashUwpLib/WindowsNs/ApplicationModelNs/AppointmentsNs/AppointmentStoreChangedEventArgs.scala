package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a StoreChanged event. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreChangedEventArgs")
@js.native
abstract class AppointmentStoreChangedEventArgs () extends js.Object {
  /**
                   * Gets the deferral object for the StoreChanged event.
                   * @return The deferral object for the StoreChanged event.
                   */
  def getDeferral(): AppointmentStoreChangedDeferral = js.native
}

