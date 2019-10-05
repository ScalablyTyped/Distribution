package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the organizer of an appointment in a calendar. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentOrganizer")
@js.native
/** Initializes a new instance of the AppointmentOrganizer class. */
class AppointmentOrganizer () extends js.Object {
  /** Gets or sets a string that communicates the address of the organizer of an appointment. The address is required, inherited from IAppointmentParticipant , and a Simple Mail Transfer Protocol (SMTP) e-mail address. It is also of type String and between 1 and 321 characters in length (non-empty). */
  var address: String = js.native
  /** Gets or sets a string that communicates the display name of the organizer of an appointment. The display name is optional, inherited from IAppointmentParticipant , of type String , and a maximum of 256 characters in length. */
  var displayName: String = js.native
}

