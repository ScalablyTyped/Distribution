package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an appointment instance that is an exception from the master appointment. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentException")
@js.native
abstract class AppointmentException ()
  extends typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentException {
  /** Gets the appointment that is an exception from the master appointment. */
  /* CompleteClass */
  override var appointment: typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment = js.native
  /** Gets a list of the names of the appointment properties for which an exception was found. */
  /* CompleteClass */
  override var exceptionProperties: IVectorView[String] = js.native
  /** Gets a value indicating whether the exception is that the appointment instance has been deleted. */
  /* CompleteClass */
  override var isDeleted: Boolean = js.native
}

