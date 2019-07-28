package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentParticipantRole extends js.Object

/** Specifies the role of an item concerning an appointment invitation. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentParticipantRole")
@js.native
object AppointmentParticipantRole extends js.Object {
  /** The participant's attendance at the appointment is optional. */
  @js.native
  sealed trait optionalAttendee extends AppointmentParticipantRole
  
  /** The participant's attendance at the appointment is required. */
  @js.native
  sealed trait requiredAttendee extends AppointmentParticipantRole
  
  /** The item is a resource that is needed at the appointment. */
  @js.native
  sealed trait resource extends AppointmentParticipantRole
  
  /* 1 */ val optionalAttendee: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantRole.optionalAttendee with Double = js.native
  /* 0 */ val requiredAttendee: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantRole.requiredAttendee with Double = js.native
  /* 2 */ val resource: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantRole.resource with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentParticipantRole with Double] = js.native
}

