package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a background task deferral returned by the AppointmentStoreChangedEventArgs.GetDeferral method. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreChangedDeferral")
@js.native
abstract class AppointmentStoreChangedDeferral ()
  extends typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangedDeferral {
  /** Informs the system that an asynchronous operation associated with an AppointmentStore has finished. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}

