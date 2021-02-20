package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a change that has occurred in an appointment store. */
@js.native
trait AppointmentStoreChange extends StObject {
  
  /** Gets the Appointment associated with the change. */
  var appointment: Appointment = js.native
  
  /** Gets the AppointmentCalendar in which the change occurred. */
  var appointmentCalendar: AppointmentCalendar = js.native
  
  /** Gets an AppointmentStoreChangeType value indicating the type of change represented by the object. */
  var changeType: AppointmentStoreChangeType = js.native
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
  
  @scala.inline
  implicit class AppointmentStoreChangeMutableBuilder[Self <: AppointmentStoreChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointment(value: Appointment): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentCalendar(value: AppointmentCalendar): Self = StObject.set(x, "appointmentCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeType(value: AppointmentStoreChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
  }
}
