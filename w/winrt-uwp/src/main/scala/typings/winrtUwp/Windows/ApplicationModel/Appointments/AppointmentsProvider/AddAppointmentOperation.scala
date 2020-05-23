package typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider

import typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the operation object associated with adding a new appointment. Appointments provider apps use this info to perform the operation. */
trait AddAppointmentOperation extends js.Object {
  /** Gets the Appointment info from the activation request. */
  var appointmentInformation: Appointment
  /** Gets the package family name of the app that is requesting the operation. */
  var sourcePackageFamilyName: String
  /** Dismisses the UI for the operation that adds a new appointment. */
  def dismissUI(): Unit
  /** Call this method to inform the activating app that the operation was canceled by the user. */
  def reportCanceled(): Unit
  /**
    * Call this method to inform the activating app that the operation was completed successfully. Provide a unique appointment ID as the itemID parameter.
    * @param itemId A unique appointment ID that the activating app can later use to remove this appointment if necessary.
    */
  def reportCompleted(itemId: String): Unit
  /**
    * Informs the activating app that the operation couldn't be completed because of a provider error.
    * @param value A string that contains info about the error.
    */
  def reportError(value: String): Unit
}

object AddAppointmentOperation {
  @scala.inline
  def apply(
    appointmentInformation: Appointment,
    dismissUI: () => Unit,
    reportCanceled: () => Unit,
    reportCompleted: String => Unit,
    reportError: String => Unit,
    sourcePackageFamilyName: String
  ): AddAppointmentOperation = {
    val __obj = js.Dynamic.literal(appointmentInformation = appointmentInformation.asInstanceOf[js.Any], dismissUI = js.Any.fromFunction0(dismissUI), reportCanceled = js.Any.fromFunction0(reportCanceled), reportCompleted = js.Any.fromFunction1(reportCompleted), reportError = js.Any.fromFunction1(reportError), sourcePackageFamilyName = sourcePackageFamilyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAppointmentOperation]
  }
}

