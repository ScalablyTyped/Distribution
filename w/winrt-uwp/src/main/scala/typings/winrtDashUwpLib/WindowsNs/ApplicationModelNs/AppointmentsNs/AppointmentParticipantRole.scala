package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

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
  sealed trait optionalAttendee
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantRole
  
  /** The participant's attendance at the appointment is required. */
  @js.native
  sealed trait requiredAttendee
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantRole
  
  /** The item is a resource that is needed at the appointment. */
  @js.native
  sealed trait resource
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantRole
  
  val optionalAttendee: optionalAttendee with java.lang.String = js.native
  val requiredAttendee: requiredAttendee with java.lang.String = js.native
  val resource: resource with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantRole with java.lang.String
  ] = js.native
}

