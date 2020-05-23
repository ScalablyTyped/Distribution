package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.std.Date
import typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentRecurrence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the information associated with a meeting. */
trait EmailMeetingInfo extends js.Object {
  /** Gets or sets a Boolean value indicating whether the proposal of a new time is allowed. */
  var allowNewTimeProposal: Boolean
  /** Gets or sets the start time for a meeting. */
  var appointmentOriginalStartTime: Date
  /** Gets or sets the server identifier for the appointment associated with an email message. */
  var appointmentRoamingId: String
  /** Gets or sets the duration of the meeting. */
  var duration: Double
  /** Gets or sets a Boolean value indicating whether the meeting is an all day event. */
  var isAllDay: Boolean
  /** Gets a Boolean value indicating if the meeting is reported as out of date by the server. */
  var isReportedOutOfDateByServer: Boolean
  /** Gets or sets a Boolean value indicating whether a response to the meeting request is required. */
  var isResponseRequested: Boolean
  /** Gets or sets the meeting location. */
  var location: String
  /** Gets or sets the proposed duration for the proposed meeting change. */
  var proposedDuration: Double
  /** Gets or sets the proposed start time for the proposed meeting change. */
  var proposedStartTime: Date
  /** Gets or sets the recurrence parameters. */
  var recurrence: AppointmentRecurrence
  /** Gets or sets the first instance of the recurrence pattern. */
  var recurrenceStartTime: Date
  /** Gets or sets the change number on the server that identifies the meeting email change number. */
  var remoteChangeNumber: Double
  /** Gets or sets the start time for the meeting. */
  var startTime: Date
}

object EmailMeetingInfo {
  @scala.inline
  def apply(
    allowNewTimeProposal: Boolean,
    appointmentOriginalStartTime: Date,
    appointmentRoamingId: String,
    duration: Double,
    isAllDay: Boolean,
    isReportedOutOfDateByServer: Boolean,
    isResponseRequested: Boolean,
    location: String,
    proposedDuration: Double,
    proposedStartTime: Date,
    recurrence: AppointmentRecurrence,
    recurrenceStartTime: Date,
    remoteChangeNumber: Double,
    startTime: Date
  ): EmailMeetingInfo = {
    val __obj = js.Dynamic.literal(allowNewTimeProposal = allowNewTimeProposal.asInstanceOf[js.Any], appointmentOriginalStartTime = appointmentOriginalStartTime.asInstanceOf[js.Any], appointmentRoamingId = appointmentRoamingId.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], isAllDay = isAllDay.asInstanceOf[js.Any], isReportedOutOfDateByServer = isReportedOutOfDateByServer.asInstanceOf[js.Any], isResponseRequested = isResponseRequested.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], proposedDuration = proposedDuration.asInstanceOf[js.Any], proposedStartTime = proposedStartTime.asInstanceOf[js.Any], recurrence = recurrence.asInstanceOf[js.Any], recurrenceStartTime = recurrenceStartTime.asInstanceOf[js.Any], remoteChangeNumber = remoteChangeNumber.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMeetingInfo]
  }
}

