package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a participant of an appointment in a calendar. */
trait AppointmentInvitee extends StObject {
  
  /** Gets or sets a string that communicates the address of a participant of an appointment. The address is inherited from IAppointmentParticipant and is a Simple Mail Transfer Protocol (SMTP) e-mail address. It is also of type String and between 1 and 321 characters in length (non-empty). */
  var address: String
  
  /** Gets or sets a string that communicates the display name of a participant of an appointment. The display name is inherited from IAppointmentParticipant , of type String , and a maximum of 256 characters in length. */
  var displayName: String
  
  /** Gets or sets a AppointmentParticipantResponse -typed value that indicates the response from a participant concerning an appointment invitation. */
  var response: AppointmentParticipantResponse
  
  /** Gets or sets a AppointmentParticipantRole -typed value that indicates the role of a participant concerning an appointment invitation. */
  var role: AppointmentParticipantRole
}
object AppointmentInvitee {
  
  inline def apply(
    address: String,
    displayName: String,
    response: AppointmentParticipantResponse,
    role: AppointmentParticipantRole
  ): AppointmentInvitee = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentInvitee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentInvitee] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: AppointmentParticipantResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setRole(value: AppointmentParticipantRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
