package typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the operation object associated with removing an appointment. Appointments provider apps use this info to perform the operation. */
trait RemoveAppointmentOperation extends js.Object {
  /** Gets the unique identifier of the appointment to remove. */
  var appointmentId: String
  /** Gets the start date and time of the appointment instance to remove. */
  var instanceStartDate: Date
  /** Gets the package family name of the app that is requesting the operation. */
  var sourcePackageFamilyName: String
  /** Dismisses the UI for the operation that removes an appointment. */
  def dismissUI(): Unit
  /** Call this method to inform the activating app that the operation was canceled by the user. */
  def reportCanceled(): Unit
  /** Informs the activating app that the operation was completed successfully. */
  def reportCompleted(): Unit
  /**
    * Informs the activating app that the operation couldn't be completed because of a provider error.
    * @param value A string that contains info about the error.
    */
  def reportError(value: String): Unit
}

object RemoveAppointmentOperation {
  @scala.inline
  def apply(
    appointmentId: String,
    dismissUI: () => Unit,
    instanceStartDate: Date,
    reportCanceled: () => Unit,
    reportCompleted: () => Unit,
    reportError: String => Unit,
    sourcePackageFamilyName: String
  ): RemoveAppointmentOperation = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], dismissUI = js.Any.fromFunction0(dismissUI), instanceStartDate = instanceStartDate.asInstanceOf[js.Any], reportCanceled = js.Any.fromFunction0(reportCanceled), reportCompleted = js.Any.fromFunction0(reportCompleted), reportError = js.Any.fromFunction1(reportError), sourcePackageFamilyName = sourcePackageFamilyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAppointmentOperation]
  }
}

