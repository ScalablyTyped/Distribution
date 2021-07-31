package typings.winrtUwp.Windows.ApplicationModel.Appointments

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an appointment instance that is an exception from the master appointment. */
trait AppointmentException extends StObject {
  
  /** Gets the appointment that is an exception from the master appointment. */
  var appointment: Appointment
  
  /** Gets a list of the names of the appointment properties for which an exception was found. */
  var exceptionProperties: IVectorView[String]
  
  /** Gets a value indicating whether the exception is that the appointment instance has been deleted. */
  var isDeleted: Boolean
}
object AppointmentException {
  
  @scala.inline
  def apply(appointment: Appointment, exceptionProperties: IVectorView[String], isDeleted: Boolean): AppointmentException = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], exceptionProperties = exceptionProperties.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentException]
  }
  
  @scala.inline
  implicit class AppointmentExceptionMutableBuilder[Self <: AppointmentException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointment(value: Appointment): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionProperties(value: IVectorView[String]): Self = StObject.set(x, "exceptionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
  }
}
