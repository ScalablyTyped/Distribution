package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentsProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the operation object associated with replacing an appointment. Appointments provider apps use this info to perform the operation. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.ReplaceAppointmentOperation")
@js.native
abstract class ReplaceAppointmentOperation () extends js.Object {
  /** Gets the unique identifier of the appointment to replace. */
  var appointmentId: java.lang.String = js.native
  /** Gets the Appointment info from the activation request. */
  var appointmentInformation: winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.Appointment = js.native
  /** Gets the start date and time of the appointment instance to replace. */
  var instanceStartDate: stdLib.Date = js.native
  /** Gets the package family name of the app that is requesting the operation. */
  var sourcePackageFamilyName: java.lang.String = js.native
  /** Dismisses the UI for the operation that replaces an appointment. */
  def dismissUI(): scala.Unit = js.native
  /** Informs the activating app that the operation was canceled by the user. */
  def reportCanceled(): scala.Unit = js.native
  /**
                       * Informs the activating app that the operation was completed successfully.
                       * @param itemId A unique appointment ID that the activating app can later use to remove this appointment if necessary or to replace it again.
                       */
  def reportCompleted(itemId: java.lang.String): scala.Unit = js.native
  /**
                       * Informs the activating app that the operation couldn't be completed because of a provider error.
                       * @param value A string that contains info about the error.
                       */
  def reportError(value: java.lang.String): scala.Unit = js.native
}

