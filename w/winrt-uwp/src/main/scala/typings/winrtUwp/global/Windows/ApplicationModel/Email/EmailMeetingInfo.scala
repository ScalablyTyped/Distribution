package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentRecurrence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the information associated with a meeting. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMeetingInfo")
@js.native
/** Initializes a new instance of the EmailMeetingInfo class. */
open class EmailMeetingInfo ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailMeetingInfo {
  
  /** Gets or sets a Boolean value indicating whether the proposal of a new time is allowed. */
  /* CompleteClass */
  var allowNewTimeProposal: Boolean = js.native
  
  /** Gets or sets the start time for a meeting. */
  /* CompleteClass */
  var appointmentOriginalStartTime: js.Date = js.native
  
  /** Gets or sets the server identifier for the appointment associated with an email message. */
  /* CompleteClass */
  var appointmentRoamingId: String = js.native
  
  /** Gets or sets the duration of the meeting. */
  /* CompleteClass */
  var duration: Double = js.native
  
  /** Gets or sets a Boolean value indicating whether the meeting is an all day event. */
  /* CompleteClass */
  var isAllDay: Boolean = js.native
  
  /** Gets a Boolean value indicating if the meeting is reported as out of date by the server. */
  /* CompleteClass */
  var isReportedOutOfDateByServer: Boolean = js.native
  
  /** Gets or sets a Boolean value indicating whether a response to the meeting request is required. */
  /* CompleteClass */
  var isResponseRequested: Boolean = js.native
  
  /** Gets or sets the meeting location. */
  /* CompleteClass */
  var location: String = js.native
  
  /** Gets or sets the proposed duration for the proposed meeting change. */
  /* CompleteClass */
  var proposedDuration: Double = js.native
  
  /** Gets or sets the proposed start time for the proposed meeting change. */
  /* CompleteClass */
  var proposedStartTime: js.Date = js.native
  
  /** Gets or sets the recurrence parameters. */
  /* CompleteClass */
  var recurrence: AppointmentRecurrence = js.native
  
  /** Gets or sets the first instance of the recurrence pattern. */
  /* CompleteClass */
  var recurrenceStartTime: js.Date = js.native
  
  /** Gets or sets the change number on the server that identifies the meeting email change number. */
  /* CompleteClass */
  var remoteChangeNumber: Double = js.native
  
  /** Gets or sets the start time for the meeting. */
  /* CompleteClass */
  var startTime: js.Date = js.native
}
