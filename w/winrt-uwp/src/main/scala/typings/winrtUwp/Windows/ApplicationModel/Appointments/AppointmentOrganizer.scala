package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the organizer of an appointment in a calendar. */
trait AppointmentOrganizer extends StObject {
  
  /** Gets or sets a string that communicates the address of the organizer of an appointment. The address is required, inherited from IAppointmentParticipant , and a Simple Mail Transfer Protocol (SMTP) e-mail address. It is also of type String and between 1 and 321 characters in length (non-empty). */
  var address: String
  
  /** Gets or sets a string that communicates the display name of the organizer of an appointment. The display name is optional, inherited from IAppointmentParticipant , of type String , and a maximum of 256 characters in length. */
  var displayName: String
}
object AppointmentOrganizer {
  
  inline def apply(address: String, displayName: String): AppointmentOrganizer = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentOrganizer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentOrganizer] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
