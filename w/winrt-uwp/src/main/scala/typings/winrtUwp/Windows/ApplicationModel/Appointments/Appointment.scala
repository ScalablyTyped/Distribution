package typings.winrtUwp.Windows.ApplicationModel.Appointments

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an appointment in a calendar. This class is used when an app is activated using the AppointmentsProvider value for ActivationKind , as a value for AppointmentInformation properties. */
trait Appointment extends StObject {
  
  /** Gets or sets a Boolean value that indicates whether the appointment will last all day. The default is FALSE for won't last all day. */
  var allDay: Boolean
  
  /** Gets or sets a value that indicates whether the appointment will allow users to propose a new time. */
  var allowNewTimeProposal: Boolean
  
  /** Gets or sets a AppointmentBusyStatus -typed value that indicates the busy status for a participant of an appointment. */
  var busyStatus: AppointmentBusyStatus
  
  /** Gets the unique identifier for the calendar associated with the appointment. */
  var calendarId: String
  
  /** Gets the current change number of the local version of the Appointment . */
  var changeNumber: Double
  
  /** Gets or sets a string value. The string contains extended details that describe the appointment. Details is of type String and a maximum of 1,073,741,823 characters in length, which is the maximum length of a JET database string. */
  var details: String
  
  /** Gets or sets the type of appointment details, plain text or HTML. */
  var detailsKind: AppointmentDetailsKind
  
  /** Gets or sets a time span that represents the time duration of the appointment. Duration is of type TimeSpan and must be non-negative. */
  var duration: Double
  
  /** Gets a value that indicates whether the appointment has invitees. */
  var hasInvitees: Boolean
  
  /** Gets the list of participants for the appointment. Invitees is of type IVector(AppointmentInvitee) . If an organizer is set and invitee length is greater than 0, a call to an AppointmentManager API fails with E_INVALIDARG. The number of invitees is unlimited. */
  var invitees: IVector[AppointmentInvitee]
  
  /** Gets or sets a value that indicates whether the appointment has been cancelled. */
  var isCanceledMeeting: Boolean
  
  /** Gets or sets a value that indicates whether the appointment was organized by the current user. */
  var isOrganizedByUser: Boolean
  
  /** Gets or sets a value that indicates whether a response to the appointment invitation is requested. */
  var isResponseRequested: Boolean
  
  /** Gets a string that uniquely identifies the appointment on the local device. */
  var localId: String
  
  /** Gets or sets a string that communicates the physical location of the appointment. Location is of type String and a maximum of 32,768 characters in length. */
  var location: String
  
  /** Gets or sets a string value that is a URL used to join the online meeting for the appointment. */
  var onlineMeetingLink: String
  
  /** Gets or sets the organizer of the appointment. Organizer is of type AppointmentOrganizer . If an organizer is set and invitee length is greater than 0, a call to an AppointmentManager API fails with E_INVALIDARG. The number of invitees is unlimited. */
  var organizer: AppointmentOrganizer
  
  /** Gets the original starting time for a recurring appointment. */
  var originalStartTime: Date
  
  /** Gets or sets the object that describes when and how often the appointment occurs. Recurrence is of type AppointmentRecurrence . */
  var recurrence: AppointmentRecurrence
  
  /** Gets or sets a time span value. The value declares the amount of time to subtract from the StartTime , and that time used as the issue time for a reminder for an appointment. A null value indicates that the appointment will not issue a reminder. Reminder is of type IReference(TimeSpan) . */
  var reminder: Double
  
  /** Gets or sets the current change number of the server version of the Appointment . */
  var remoteChangeNumber: Double
  
  /** Gets or sets the date and time that the user responded to the appointment request. */
  var replyTime: Date
  
  /** Gets or sets a string that uniquely identifies an appointment across devices. */
  var roamingId: String
  
  /** Gets or sets a AppointmentSensitivity -typed value that indicates the sensitivity of the appointment. */
  var sensitivity: AppointmentSensitivity
  
  /** Gets or sets the starting time for the appointment. StartTime is of type DateTime . */
  var startTime: Date
  
  /** Gets or sets a string that communicates the subject of the appointment. Subject is of type String and a maximum of 255 characters in length. */
  var subject: String
  
  /** Gets the Uniform Resource Identifier ( Uri ) for the appointment. Allows the Calendar app to perform an association launch to go back to the source app or other URI that represents this appointment. */
  var uri: Uri
  
  /** Gets or sets the user's response to the appointment request. */
  var userResponse: AppointmentParticipantResponse
}
object Appointment {
  
  @scala.inline
  def apply(
    allDay: Boolean,
    allowNewTimeProposal: Boolean,
    busyStatus: AppointmentBusyStatus,
    calendarId: String,
    changeNumber: Double,
    details: String,
    detailsKind: AppointmentDetailsKind,
    duration: Double,
    hasInvitees: Boolean,
    invitees: IVector[AppointmentInvitee],
    isCanceledMeeting: Boolean,
    isOrganizedByUser: Boolean,
    isResponseRequested: Boolean,
    localId: String,
    location: String,
    onlineMeetingLink: String,
    organizer: AppointmentOrganizer,
    originalStartTime: Date,
    recurrence: AppointmentRecurrence,
    reminder: Double,
    remoteChangeNumber: Double,
    replyTime: Date,
    roamingId: String,
    sensitivity: AppointmentSensitivity,
    startTime: Date,
    subject: String,
    uri: Uri,
    userResponse: AppointmentParticipantResponse
  ): Appointment = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], allowNewTimeProposal = allowNewTimeProposal.asInstanceOf[js.Any], busyStatus = busyStatus.asInstanceOf[js.Any], calendarId = calendarId.asInstanceOf[js.Any], changeNumber = changeNumber.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], detailsKind = detailsKind.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], hasInvitees = hasInvitees.asInstanceOf[js.Any], invitees = invitees.asInstanceOf[js.Any], isCanceledMeeting = isCanceledMeeting.asInstanceOf[js.Any], isOrganizedByUser = isOrganizedByUser.asInstanceOf[js.Any], isResponseRequested = isResponseRequested.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], onlineMeetingLink = onlineMeetingLink.asInstanceOf[js.Any], organizer = organizer.asInstanceOf[js.Any], originalStartTime = originalStartTime.asInstanceOf[js.Any], recurrence = recurrence.asInstanceOf[js.Any], reminder = reminder.asInstanceOf[js.Any], remoteChangeNumber = remoteChangeNumber.asInstanceOf[js.Any], replyTime = replyTime.asInstanceOf[js.Any], roamingId = roamingId.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], userResponse = userResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appointment]
  }
  
  @scala.inline
  implicit class AppointmentMutableBuilder[Self <: Appointment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNewTimeProposal(value: Boolean): Self = StObject.set(x, "allowNewTimeProposal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusyStatus(value: AppointmentBusyStatus): Self = StObject.set(x, "busyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeNumber(value: Double): Self = StObject.set(x, "changeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsKind(value: AppointmentDetailsKind): Self = StObject.set(x, "detailsKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasInvitees(value: Boolean): Self = StObject.set(x, "hasInvitees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitees(value: IVector[AppointmentInvitee]): Self = StObject.set(x, "invitees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCanceledMeeting(value: Boolean): Self = StObject.set(x, "isCanceledMeeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOrganizedByUser(value: Boolean): Self = StObject.set(x, "isOrganizedByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResponseRequested(value: Boolean): Self = StObject.set(x, "isResponseRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineMeetingLink(value: String): Self = StObject.set(x, "onlineMeetingLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizer(value: AppointmentOrganizer): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalStartTime(value: Date): Self = StObject.set(x, "originalStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrence(value: AppointmentRecurrence): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminder(value: Double): Self = StObject.set(x, "reminder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteChangeNumber(value: Double): Self = StObject.set(x, "remoteChangeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyTime(value: Date): Self = StObject.set(x, "replyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoamingId(value: String): Self = StObject.set(x, "roamingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitivity(value: AppointmentSensitivity): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserResponse(value: AppointmentParticipantResponse): Self = StObject.set(x, "userResponse", value.asInstanceOf[js.Any])
  }
}
