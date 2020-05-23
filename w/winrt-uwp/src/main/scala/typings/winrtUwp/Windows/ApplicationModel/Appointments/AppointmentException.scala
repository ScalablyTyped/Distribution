package typings.winrtUwp.Windows.ApplicationModel.Appointments

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an appointment instance that is an exception from the master appointment. */
trait AppointmentException extends js.Object {
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
}

