package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentParticipantResponse extends js.Object

/** Specifies the response from a participant concerning an appointment invitation. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentParticipantResponse")
@js.native
object AppointmentParticipantResponse extends js.Object {
  /** The participant accepted the appointment invitation. */
  @js.native
  sealed trait accepted extends AppointmentParticipantResponse
  
  /** The participant declined the appointment invitation. */
  @js.native
  sealed trait declined extends AppointmentParticipantResponse
  
  /** No response. */
  @js.native
  sealed trait none extends AppointmentParticipantResponse
  
  /** The participant might attend the appointment. */
  @js.native
  sealed trait tentative extends AppointmentParticipantResponse
  
  /** The response is unknown. */
  @js.native
  sealed trait unknown extends AppointmentParticipantResponse
  
  /* 2 */ val accepted: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantResponse.accepted with Double = js.native
  /* 3 */ val declined: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantResponse.declined with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantResponse.none with Double = js.native
  /* 1 */ val tentative: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantResponse.tentative with Double = js.native
  /* 4 */ val unknown: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantResponse.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentParticipantResponse with Double] = js.native
}

