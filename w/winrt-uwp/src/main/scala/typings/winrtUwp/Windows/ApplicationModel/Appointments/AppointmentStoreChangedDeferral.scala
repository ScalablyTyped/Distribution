package typings.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a background task deferral returned by the AppointmentStoreChangedEventArgs.GetDeferral method. */
trait AppointmentStoreChangedDeferral extends js.Object {
  /** Informs the system that an asynchronous operation associated with an AppointmentStore has finished. */
  def complete(): Unit
}

object AppointmentStoreChangedDeferral {
  @scala.inline
  def apply(complete: () => Unit): AppointmentStoreChangedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[AppointmentStoreChangedDeferral]
  }
}

