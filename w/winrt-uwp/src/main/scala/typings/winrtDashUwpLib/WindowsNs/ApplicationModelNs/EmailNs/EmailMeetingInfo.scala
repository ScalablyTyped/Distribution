package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the information associated with a meeting. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMeetingInfo")
@js.native
/** Initializes a new instance of the EmailMeetingInfo class. */
class EmailMeetingInfo () extends js.Object {
  /** Gets or sets a Boolean value indicating whether the proposal of a new time is allowed. */
  var allowNewTimeProposal: scala.Boolean = js.native
  /** Gets or sets the start time for a meeting. */
  var appointmentOriginalStartTime: stdLib.Date = js.native
  /** Gets or sets the server identifier for the appointment associated with an email message. */
  var appointmentRoamingId: java.lang.String = js.native
  /** Gets or sets the duration of the meeting. */
  var duration: scala.Double = js.native
  /** Gets or sets a Boolean value indicating whether the meeting is an all day event. */
  var isAllDay: scala.Boolean = js.native
  /** Gets a Boolean value indicating if the meeting is reported as out of date by the server. */
  var isReportedOutOfDateByServer: scala.Boolean = js.native
  /** Gets or sets a Boolean value indicating whether a response to the meeting request is required. */
  var isResponseRequested: scala.Boolean = js.native
  /** Gets or sets the meeting location. */
  var location: java.lang.String = js.native
  /** Gets or sets the proposed duration for the proposed meeting change. */
  var proposedDuration: scala.Double = js.native
  /** Gets or sets the proposed start time for the proposed meeting change. */
  var proposedStartTime: stdLib.Date = js.native
  /** Gets or sets the recurrence parameters. */
  var recurrence: winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentRecurrence = js.native
  /** Gets or sets the first instance of the recurrence pattern. */
  var recurrenceStartTime: stdLib.Date = js.native
  /** Gets or sets the change number on the server that identifies the meeting email change number. */
  var remoteChangeNumber: scala.Double = js.native
  /** Gets or sets the start time for the meeting. */
  var startTime: stdLib.Date = js.native
}

