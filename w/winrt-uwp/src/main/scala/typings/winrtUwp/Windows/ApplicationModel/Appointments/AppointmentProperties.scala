package typings.winrtUwp.Windows.ApplicationModel.Appointments

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides strings that identify the properties of an appointment. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentProperties")
@js.native
abstract class AppointmentProperties () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentProperties")
@js.native
object AppointmentProperties extends js.Object {
  /** Gets the name of the AllDay property. */
  var allDay: String = js.native
  /** Gets the name of AllowNewTimeProposal the property. */
  var allowNewTimeProposal: String = js.native
  /** Gets the name of the BusyStatus property. */
  var busyStatus: String = js.native
  /** Gets the current change number of the local version of the Appointment . */
  var changeNumber: String = js.native
  /** Gets a list of names for the default appointment properties. */
  var defaultProperties: IVector[String] = js.native
  /** Gets the name of the Details property. */
  var details: String = js.native
  var detailsKind: js.Any = js.native
   /* unmapped type */ /** Gets the name of the Duration property. */
  var duration: String = js.native
  /** Gets the name of the HasInvitees property. */
  var hasInvitees: String = js.native
  /** Gets the name of the Invitees property. */
  var invitees: String = js.native
  /** Gets the name of the IsCanceledMeeting property. */
  var isCanceledMeeting: String = js.native
  /** Gets the name of the IsOrganizedByUser property. */
  var isOrganizedByUser: String = js.native
  /** Gets the name of the IsResponseRequested property. */
  var isResponseRequested: String = js.native
  /** Gets the name of the Location property. */
  var location: String = js.native
  /** Gets the name of the OnlineMeetingLink property. */
  var onlineMeetingLink: String = js.native
  /** Gets the name of the Organizer property. */
  var organizer: String = js.native
  /** Gets the name of the OriginalStartTime property. */
  var originalStartTime: String = js.native
  /** Gets the name of the Recurrence property. */
  var recurrence: String = js.native
  /** Gets the name of the Reminder property. */
  var reminder: String = js.native
  var remoteChangeNumber: js.Any = js.native
   /* unmapped type */ /** Gets the name of the ReplyTime property. */
  var replyTime: String = js.native
  /** Gets the name of the Sensitivity property. */
  var sensitivity: String = js.native
  /** Gets the name of the StartTime property. */
  var startTime: String = js.native
  /** Gets the name of the Subject property. */
  var subject: String = js.native
  /** Gets the name of the Uri property. */
  var uri: String = js.native
  /** Gets the name of the UserResponse property. */
  var userResponse: String = js.native
}

