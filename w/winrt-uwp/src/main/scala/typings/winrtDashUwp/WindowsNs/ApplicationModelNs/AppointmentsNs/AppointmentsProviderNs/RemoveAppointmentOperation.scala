package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentsProviderNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the operation object associated with removing an appointment. Appointments provider apps use this info to perform the operation. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.RemoveAppointmentOperation")
@js.native
abstract class RemoveAppointmentOperation () extends js.Object {
  /** Gets the unique identifier of the appointment to remove. */
  var appointmentId: String = js.native
  /** Gets the start date and time of the appointment instance to remove. */
  var instanceStartDate: Date = js.native
  /** Gets the package family name of the app that is requesting the operation. */
  var sourcePackageFamilyName: String = js.native
  /** Dismisses the UI for the operation that removes an appointment. */
  def dismissUI(): Unit = js.native
  /** Call this method to inform the activating app that the operation was canceled by the user. */
  def reportCanceled(): Unit = js.native
  /** Informs the activating app that the operation was completed successfully. */
  def reportCompleted(): Unit = js.native
  /**
    * Informs the activating app that the operation couldn't be completed because of a provider error.
    * @param value A string that contains info about the error.
    */
  def reportError(value: String): Unit = js.native
}

