package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a change that has occurred in an appointment store. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreChange")
@js.native
abstract class AppointmentStoreChange ()
  extends typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChange {
  /** Gets the Appointment associated with the change. */
  /* CompleteClass */
  override var appointment: typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment = js.native
  /** Gets the AppointmentCalendar in which the change occurred. */
  /* CompleteClass */
  override var appointmentCalendar: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentCalendar = js.native
  /** Gets an AppointmentStoreChangeType value indicating the type of change represented by the object. */
  /* CompleteClass */
  override var changeType: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangeType = js.native
}

