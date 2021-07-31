package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentParticipantResponse extends StObject
/** Specifies the response from a participant concerning an appointment invitation. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentParticipantResponse")
@js.native
object AppointmentParticipantResponse extends StObject {
  
  /** The participant accepted the appointment invitation. */
  @js.native
  sealed trait accepted
    extends StObject
       with AppointmentParticipantResponse
  
  /** The participant declined the appointment invitation. */
  @js.native
  sealed trait declined
    extends StObject
       with AppointmentParticipantResponse
  
  /** No response. */
  @js.native
  sealed trait none
    extends StObject
       with AppointmentParticipantResponse
  
  /** The participant might attend the appointment. */
  @js.native
  sealed trait tentative
    extends StObject
       with AppointmentParticipantResponse
  
  /** The response is unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with AppointmentParticipantResponse
}
