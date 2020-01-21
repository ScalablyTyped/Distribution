package typings.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a change that has occurred in an appointment store. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreChange")
@js.native
abstract class AppointmentStoreChange () extends js.Object {
  /** Gets the Appointment associated with the change. */
  var appointment: Appointment = js.native
  /** Gets the AppointmentCalendar in which the change occurred. */
  var appointmentCalendar: AppointmentCalendar = js.native
  /** Gets an AppointmentStoreChangeType value indicating the type of change represented by the object. */
  var changeType: AppointmentStoreChangeType = js.native
}

