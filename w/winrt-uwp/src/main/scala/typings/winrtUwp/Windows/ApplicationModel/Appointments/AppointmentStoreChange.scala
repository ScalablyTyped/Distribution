package typings.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a change that has occurred in an appointment store. */
trait AppointmentStoreChange extends js.Object {
  /** Gets the Appointment associated with the change. */
  var appointment: Appointment
  /** Gets the AppointmentCalendar in which the change occurred. */
  var appointmentCalendar: AppointmentCalendar
  /** Gets an AppointmentStoreChangeType value indicating the type of change represented by the object. */
  var changeType: AppointmentStoreChangeType
}

object AppointmentStoreChange {
  @scala.inline
  def apply(
    appointment: Appointment,
    appointmentCalendar: AppointmentCalendar,
    changeType: AppointmentStoreChangeType
  ): AppointmentStoreChange = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], appointmentCalendar = appointmentCalendar.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentStoreChange]
  }
}

