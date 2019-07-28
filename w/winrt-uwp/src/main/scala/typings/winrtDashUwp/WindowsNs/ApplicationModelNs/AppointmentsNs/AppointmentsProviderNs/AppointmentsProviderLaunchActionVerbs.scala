package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentsProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the object associated with retrieving the operation of the appointments provider. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs")
@js.native
abstract class AppointmentsProviderLaunchActionVerbs () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs")
@js.native
object AppointmentsProviderLaunchActionVerbs extends js.Object {
  /** Gets the add-appointment action that the appointments provider performs. */
  var addAppointment: String = js.native
  /** Gets the remove-appointment action that the appointments provider performs. */
  var removeAppointment: String = js.native
  /** Gets the replace-appointment action that the appointments provider performs. */
  var replaceAppointment: String = js.native
  /** Gets the show-appointment-details action that the appointments provider performs. */
  var showAppointmentDetails: String = js.native
  /** Gets the show-time-frame action of an appointment that the appointments provider performs. */
  var showTimeFrame: String = js.native
}

