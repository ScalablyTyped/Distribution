package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an appointment instance that is an exception from the master appointment. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentException")
@js.native
abstract class AppointmentException () extends js.Object {
  /** Gets the appointment that is an exception from the master appointment. */
  var appointment: Appointment = js.native
  /** Gets a list of the names of the appointment properties for which an exception was found. */
  var exceptionProperties: IVectorView[String] = js.native
  /** Gets a value indicating whether the exception is that the appointment instance has been deleted. */
  var isDeleted: Boolean = js.native
}

