package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentParticipantResponse with Double] = js.native
  /* 2 */ @js.native
  object accepted extends TopLevel[accepted with Double]
  
  /* 3 */ @js.native
  object declined extends TopLevel[declined with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object tentative extends TopLevel[tentative with Double]
  
  /* 4 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

