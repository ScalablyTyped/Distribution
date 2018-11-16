package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

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
  sealed trait accepted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantResponse
  
  /** The participant declined the appointment invitation. */
  @js.native
  sealed trait declined
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantResponse
  
  /** No response. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantResponse
  
  /** The participant might attend the appointment. */
  @js.native
  sealed trait tentative
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantResponse
  
  /** The response is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantResponse
  
  val accepted: accepted with java.lang.String = js.native
  val declined: declined with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val tentative: tentative with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentParticipantResponse with java.lang.String
  ] = js.native
}

