package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.std.Date
import typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentRecurrence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the information associated with a meeting. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMeetingInfo")
@js.native
/** Initializes a new instance of the EmailMeetingInfo class. */
class EmailMeetingInfo ()
  extends typings.winrtUwp.Windows.ApplicationModel.Email.EmailMeetingInfo {
  /** Gets or sets a Boolean value indicating whether the proposal of a new time is allowed. */
  /* CompleteClass */
  override var allowNewTimeProposal: Boolean = js.native
  /** Gets or sets the start time for a meeting. */
  /* CompleteClass */
  override var appointmentOriginalStartTime: Date = js.native
  /** Gets or sets the server identifier for the appointment associated with an email message. */
  /* CompleteClass */
  override var appointmentRoamingId: String = js.native
  /** Gets or sets the duration of the meeting. */
  /* CompleteClass */
  override var duration: Double = js.native
  /** Gets or sets a Boolean value indicating whether the meeting is an all day event. */
  /* CompleteClass */
  override var isAllDay: Boolean = js.native
  /** Gets a Boolean value indicating if the meeting is reported as out of date by the server. */
  /* CompleteClass */
  override var isReportedOutOfDateByServer: Boolean = js.native
  /** Gets or sets a Boolean value indicating whether a response to the meeting request is required. */
  /* CompleteClass */
  override var isResponseRequested: Boolean = js.native
  /** Gets or sets the meeting location. */
  /* CompleteClass */
  override var location: String = js.native
  /** Gets or sets the proposed duration for the proposed meeting change. */
  /* CompleteClass */
  override var proposedDuration: Double = js.native
  /** Gets or sets the proposed start time for the proposed meeting change. */
  /* CompleteClass */
  override var proposedStartTime: Date = js.native
  /** Gets or sets the recurrence parameters. */
  /* CompleteClass */
  override var recurrence: AppointmentRecurrence = js.native
  /** Gets or sets the first instance of the recurrence pattern. */
  /* CompleteClass */
  override var recurrenceStartTime: Date = js.native
  /** Gets or sets the change number on the server that identifies the meeting email change number. */
  /* CompleteClass */
  override var remoteChangeNumber: Double = js.native
  /** Gets or sets the start time for the meeting. */
  /* CompleteClass */
  override var startTime: Date = js.native
}

