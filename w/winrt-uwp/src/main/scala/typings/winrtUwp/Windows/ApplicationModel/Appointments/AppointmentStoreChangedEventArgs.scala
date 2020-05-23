package typings.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a StoreChanged event. */
trait AppointmentStoreChangedEventArgs extends js.Object {
  /**
    * Gets the deferral object for the StoreChanged event.
    * @return The deferral object for the StoreChanged event.
    */
  def getDeferral(): AppointmentStoreChangedDeferral
}

object AppointmentStoreChangedEventArgs {
  @scala.inline
  def apply(getDeferral: () => AppointmentStoreChangedDeferral): AppointmentStoreChangedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[AppointmentStoreChangedEventArgs]
  }
}

