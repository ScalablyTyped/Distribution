package typings.winrtUwp.Windows.ApplicationModel.Appointments

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an appointment instance that is an exception from the master appointment. */
@js.native
trait AppointmentException extends js.Object {
  
  /** Gets the appointment that is an exception from the master appointment. */
  var appointment: Appointment = js.native
  
  /** Gets a list of the names of the appointment properties for which an exception was found. */
  var exceptionProperties: IVectorView[String] = js.native
  
  /** Gets a value indicating whether the exception is that the appointment instance has been deleted. */
  var isDeleted: Boolean = js.native
}
object AppointmentException {
  
  @scala.inline
  def apply(appointment: Appointment, exceptionProperties: IVectorView[String], isDeleted: Boolean): AppointmentException = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], exceptionProperties = exceptionProperties.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentException]
  }
  
  @scala.inline
  implicit class AppointmentExceptionOps[Self <: AppointmentException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppointment(value: Appointment): Self = this.set("appointment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionProperties(value: IVectorView[String]): Self = this.set("exceptionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
  }
}
