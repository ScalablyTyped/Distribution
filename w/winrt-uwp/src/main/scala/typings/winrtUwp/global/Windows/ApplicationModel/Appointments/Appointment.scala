package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an appointment in a calendar. This class is used when an app is activated using the AppointmentsProvider value for ActivationKind , as a value for AppointmentInformation properties. */
@JSGlobal("Windows.ApplicationModel.Appointments.Appointment")
@js.native
/** Initializes a new instance of the Appointment class. */
open class Appointment ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment {
  
  /** Gets or sets a Boolean value that indicates whether the appointment will last all day. The default is FALSE for won't last all day. */
  /* CompleteClass */
  var allDay: Boolean = js.native
  
  /** Gets or sets a value that indicates whether the appointment will allow users to propose a new time. */
  /* CompleteClass */
  var allowNewTimeProposal: Boolean = js.native
  
  /** Gets or sets a AppointmentBusyStatus -typed value that indicates the busy status for a participant of an appointment. */
  /* CompleteClass */
  var busyStatus: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentBusyStatus = js.native
  
  /** Gets the unique identifier for the calendar associated with the appointment. */
  /* CompleteClass */
  var calendarId: String = js.native
  
  /** Gets the current change number of the local version of the Appointment . */
  /* CompleteClass */
  var changeNumber: Double = js.native
  
  /** Gets or sets a string value. The string contains extended details that describe the appointment. Details is of type String and a maximum of 1,073,741,823 characters in length, which is the maximum length of a JET database string. */
  /* CompleteClass */
  var details: String = js.native
  
  /** Gets or sets the type of appointment details, plain text or HTML. */
  /* CompleteClass */
  var detailsKind: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentDetailsKind = js.native
  
  /** Gets or sets a time span that represents the time duration of the appointment. Duration is of type TimeSpan and must be non-negative. */
  /* CompleteClass */
  var duration: Double = js.native
  
  /** Gets a value that indicates whether the appointment has invitees. */
  /* CompleteClass */
  var hasInvitees: Boolean = js.native
  
  /** Gets the list of participants for the appointment. Invitees is of type IVector(AppointmentInvitee) . If an organizer is set and invitee length is greater than 0, a call to an AppointmentManager API fails with E_INVALIDARG. The number of invitees is unlimited. */
  /* CompleteClass */
  var invitees: IVector[typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentInvitee] = js.native
  
  /** Gets or sets a value that indicates whether the appointment has been cancelled. */
  /* CompleteClass */
  var isCanceledMeeting: Boolean = js.native
  
  /** Gets or sets a value that indicates whether the appointment was organized by the current user. */
  /* CompleteClass */
  var isOrganizedByUser: Boolean = js.native
  
  /** Gets or sets a value that indicates whether a response to the appointment invitation is requested. */
  /* CompleteClass */
  var isResponseRequested: Boolean = js.native
  
  /** Gets a string that uniquely identifies the appointment on the local device. */
  /* CompleteClass */
  var localId: String = js.native
  
  /** Gets or sets a string that communicates the physical location of the appointment. Location is of type String and a maximum of 32,768 characters in length. */
  /* CompleteClass */
  var location: String = js.native
  
  /** Gets or sets a string value that is a URL used to join the online meeting for the appointment. */
  /* CompleteClass */
  var onlineMeetingLink: String = js.native
  
  /** Gets or sets the organizer of the appointment. Organizer is of type AppointmentOrganizer . If an organizer is set and invitee length is greater than 0, a call to an AppointmentManager API fails with E_INVALIDARG. The number of invitees is unlimited. */
  /* CompleteClass */
  var organizer: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentOrganizer = js.native
  
  /** Gets the original starting time for a recurring appointment. */
  /* CompleteClass */
  var originalStartTime: js.Date = js.native
  
  /** Gets or sets the object that describes when and how often the appointment occurs. Recurrence is of type AppointmentRecurrence . */
  /* CompleteClass */
  var recurrence: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentRecurrence = js.native
  
  /** Gets or sets a time span value. The value declares the amount of time to subtract from the StartTime , and that time used as the issue time for a reminder for an appointment. A null value indicates that the appointment will not issue a reminder. Reminder is of type IReference(TimeSpan) . */
  /* CompleteClass */
  var reminder: Double = js.native
  
  /** Gets or sets the current change number of the server version of the Appointment . */
  /* CompleteClass */
  var remoteChangeNumber: Double = js.native
  
  /** Gets or sets the date and time that the user responded to the appointment request. */
  /* CompleteClass */
  var replyTime: js.Date = js.native
  
  /** Gets or sets a string that uniquely identifies an appointment across devices. */
  /* CompleteClass */
  var roamingId: String = js.native
  
  /** Gets or sets a AppointmentSensitivity -typed value that indicates the sensitivity of the appointment. */
  /* CompleteClass */
  var sensitivity: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentSensitivity = js.native
  
  /** Gets or sets the starting time for the appointment. StartTime is of type DateTime . */
  /* CompleteClass */
  var startTime: js.Date = js.native
  
  /** Gets or sets a string that communicates the subject of the appointment. Subject is of type String and a maximum of 255 characters in length. */
  /* CompleteClass */
  var subject: String = js.native
  
  /** Gets the Uniform Resource Identifier ( Uri ) for the appointment. Allows the Calendar app to perform an association launch to go back to the source app or other URI that represents this appointment. */
  /* CompleteClass */
  var uri: Uri = js.native
  
  /** Gets or sets the user's response to the appointment request. */
  /* CompleteClass */
  var userResponse: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentParticipantResponse = js.native
}
