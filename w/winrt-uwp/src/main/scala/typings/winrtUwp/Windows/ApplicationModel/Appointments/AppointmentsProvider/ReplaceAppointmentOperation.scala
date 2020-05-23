package typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider

import typings.std.Date
import typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the operation object associated with replacing an appointment. Appointments provider apps use this info to perform the operation. */
trait ReplaceAppointmentOperation extends js.Object {
  /** Gets the unique identifier of the appointment to replace. */
  var appointmentId: String
  /** Gets the Appointment info from the activation request. */
  var appointmentInformation: Appointment
  /** Gets the start date and time of the appointment instance to replace. */
  var instanceStartDate: Date
  /** Gets the package family name of the app that is requesting the operation. */
  var sourcePackageFamilyName: String
  /** Dismisses the UI for the operation that replaces an appointment. */
  def dismissUI(): Unit
  /** Informs the activating app that the operation was canceled by the user. */
  def reportCanceled(): Unit
  /**
    * Informs the activating app that the operation was completed successfully.
    * @param itemId A unique appointment ID that the activating app can later use to remove this appointment if necessary or to replace it again.
    */
  def reportCompleted(itemId: String): Unit
  /**
    * Informs the activating app that the operation couldn't be completed because of a provider error.
    * @param value A string that contains info about the error.
    */
  def reportError(value: String): Unit
}

object ReplaceAppointmentOperation {
  @scala.inline
  def apply(
    appointmentId: String,
    appointmentInformation: Appointment,
    dismissUI: () => Unit,
    instanceStartDate: Date,
    reportCanceled: () => Unit,
    reportCompleted: String => Unit,
    reportError: String => Unit,
    sourcePackageFamilyName: String
  ): ReplaceAppointmentOperation = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], appointmentInformation = appointmentInformation.asInstanceOf[js.Any], dismissUI = js.Any.fromFunction0(dismissUI), instanceStartDate = instanceStartDate.asInstanceOf[js.Any], reportCanceled = js.Any.fromFunction0(reportCanceled), reportCompleted = js.Any.fromFunction1(reportCompleted), reportError = js.Any.fromFunction1(reportError), sourcePackageFamilyName = sourcePackageFamilyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAppointmentOperation]
  }
}

