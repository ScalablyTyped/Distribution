package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentParticipantRole with Double] = js.native
  /* 1 */ @js.native
  object optionalAttendee extends TopLevel[optionalAttendee with Double]
  
  /* 0 */ @js.native
  object requiredAttendee extends TopLevel[requiredAttendee with Double]
  
  /* 2 */ @js.native
  object resource extends TopLevel[resource with Double]
  
}

