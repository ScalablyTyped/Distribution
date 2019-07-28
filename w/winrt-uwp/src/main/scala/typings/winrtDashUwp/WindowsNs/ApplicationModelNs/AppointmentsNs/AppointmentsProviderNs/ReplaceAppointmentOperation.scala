package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentsProviderNs

import typings.std.Date
import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.Appointment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the operation object associated with replacing an appointment. Appointments provider apps use this info to perform the operation. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.ReplaceAppointmentOperation")
@js.native
abstract class ReplaceAppointmentOperation () extends js.Object {
  /** Gets the unique identifier of the appointment to replace. */
  var appointmentId: String = js.native
  /** Gets the Appointment info from the activation request. */
  var appointmentInformation: Appointment = js.native
  /** Gets the start date and time of the appointment instance to replace. */
  var instanceStartDate: Date = js.native
  /** Gets the package family name of the app that is requesting the operation. */
  var sourcePackageFamilyName: String = js.native
  /** Dismisses the UI for the operation that replaces an appointment. */
  def dismissUI(): Unit = js.native
  /** Informs the activating app that the operation was canceled by the user. */
  def reportCanceled(): Unit = js.native
  /**
    * Informs the activating app that the operation was completed successfully.
    * @param itemId A unique appointment ID that the activating app can later use to remove this appointment if necessary or to replace it again.
    */
  def reportCompleted(itemId: String): Unit = js.native
  /**
    * Informs the activating app that the operation couldn't be completed because of a provider error.
    * @param value A string that contains info about the error.
    */
  def reportError(value: String): Unit = js.native
}

