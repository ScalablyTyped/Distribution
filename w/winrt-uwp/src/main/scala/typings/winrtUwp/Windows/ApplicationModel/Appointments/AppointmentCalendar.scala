package typings.winrtUwp.Windows.ApplicationModel.Appointments

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a calendar with appointments. */
@js.native
trait AppointmentCalendar extends StObject {
  
  /** Gets or sets a Boolean value that indicates if the calendar supports cancelling meetings. */
  var canCancelMeetings: Boolean = js.native
  
  /** Gets or sets a Boolean value that indicates if the calendar supports creating or updating appointments. */
  var canCreateOrUpdateAppointments: Boolean = js.native
  
  /** Gets or sets a Boolean value that indicates if the calendar supports forwarding meetings. */
  var canForwardMeetings: Boolean = js.native
  
  /** Gets or sets a Boolean value that indicates if the calendar supports notifying attendees. */
  var canNotifyInvitees: Boolean = js.native
  
  /** Gets or sets a Boolean value that indicates if the calendar supports proposing new meeting times. */
  var canProposeNewTimeForMeetings: Boolean = js.native
  
  /** Gets or sets a Boolean value that indicates if the calendar supports updating meeting responses. */
  var canUpdateMeetingResponses: Boolean = js.native
  
  /**
    * Asynchronously deletes the appointment with the specified ID.
    * @param localId The LocalId of the appointment to be deleted.
    * @return An asynchronous action.
    */
  def deleteAppointmentAsync(localId: String): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously deletes the appointment instance with the specified start time of a master appointment with the specified ID.
    * @param localId The LocalId of the master appointment associated with the appointment instance to be deleted.
    * @param instanceStartTime The start time of the appointment instance to be deleted.
    * @return An asynchronous action.
    */
  def deleteAppointmentInstanceAsync(localId: String, instanceStartTime: Date): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously deletes the appointment calendar.
    * @return An asynchrounous action.
    */
  def deleteAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets the color that the built-in calendar app uses for appointments associated with the calendar. */
  var displayColor: Color = js.native
  
  /** Gets a string representing the display name for the AppointmentCalendar . */
  var displayName: String = js.native
  
  /**
    * Asynchronously retrieves a list of appointment instances of the specified master appointment that meet the specified criteria.
    * @param masterLocalId The LocalId of the master appointment for which appointment instances are retrieved.
    * @param rangeStart The start time of the time window for which appointment instances are retrieved.
    * @param rangeLength The length of the time window for which appointment instances are retrieved.
    * @return An asynchronous operation that returns IVectorView on successful completion.
    */
  def findAllInstancesAsync(masterLocalId: String, rangeStart: Date, rangeLength: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously retrieves a list of appointment instances of the specified master appointment that meet the specified criteria.
    * @param masterLocalId The LocalId of the master appointment for which appointment instances are retrieved.
    * @param rangeStart The start time of the time window for which appointment instances are retrieved.
    * @param rangeLength The length of the time window for which appointment instances are retrieved.
    * @param pOptions A FindAppointmentsOptions object that is used to specify more options for this operation.
    * @return An asynchronous operation that returns IVectorView on successful completion.
    */
  def findAllInstancesAsync(masterLocalId: String, rangeStart: Date, rangeLength: Double, pOptions: FindAppointmentsOptions): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Asynchronously retrieves a list of appointments belonging to the current AppointmentCalendar that meet the specified criteria.
    * @param rangeStart The start time of the time window for which appointments are retrieved.
    * @param rangeLength The length of the time window for which appointments are retrieved.
    * @return An asynchronous operation that returns IVectorView on successful completion.
    */
  def findAppointmentsAsync(rangeStart: Date, rangeLength: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously retrieves a list of appointments belonging to the current AppointmentCalendar that meet the specified criteria.
    * @param rangeStart The start time of the time window for which appointments are retrieved.
    * @param rangeLength The length of the time window for which appointments are retrieved.
    * @param options A FindAppointmentsOptions object that is used to specify more options for this operation.
    * @return An asynchronous operation that returns IVectorView on successful completion.
    */
  def findAppointmentsAsync(rangeStart: Date, rangeLength: Double, options: FindAppointmentsOptions): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Asynchronously retrieves a list of appointment instances that are exceptions from the specified master appointment.
    * @param masterLocalId The LocalId of the master appointment for which exceptional appointment instances are retrieved.
    * @return An asynchronous operation that returns IVectorView on successful completion.
    */
  def findExceptionsFromMasterAsync(masterLocalId: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Asynchronously retrieves a list of appointments that meet the specified criteria.
    * @return An asynchronous operation that returns IVectorView on successful completion.
    */
  def findUnexpandedAppointmentsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously retrieves a list of appointments that meet the specified criteria.
    * @param options A FindAppointmentsOptions object that is used to specify more options for this operation.
    * @return An asynchronous operation that returns IVectorView on successful completion.
    */
  def findUnexpandedAppointmentsAsync(options: FindAppointmentsOptions): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Asynchronously retrieves the Appointment with the specified ID.
    * @param localId The LocalId of the appointment to be retrieved.
    * @return An asynchronous operation that returns Appointment on successful completion.
    */
  def getAppointmentAsync(localId: String): IPromiseWithIAsyncOperation[Appointment] = js.native
  /**
    * (Applies to Windows Phone only) Asynchronously retrieves the Appointment with the specified ID and includes data for the specified properties.
    * @param localId The LocalId of the appointment to be retrieved.
    * @param prefetchProperties A list of names of the properties for which data should be included when the appointment is retrieved.
    * @return An asynchronous operation that returns Appointment on successful completion.
    */
  def getAppointmentAsync(localId: String, prefetchProperties: IIterable[String]): IPromiseWithIAsyncOperation[Appointment] = js.native
  
  /**
    * Asynchronously retrieves the appointment instance of the specified master appointment that has the specified start time.
    * @param localId The ID of the master appointment to which the retrieved appointment instance belongs.
    * @param instanceStartTime The start time of the appointment instance to be retrieved.
    * @return An asynchronous operation that returns Appointment on successful completion.
    */
  def getAppointmentInstanceAsync(localId: String, instanceStartTime: Date): IPromiseWithIAsyncOperation[Appointment] = js.native
  
  /** Gets whether the AppointmentCalendar is hidden in the device's built-in calendar UI. */
  var isHidden: Boolean = js.native
  
  /** Gets a string that uniquely identifies the appointment calendar on the local device. */
  var localId: String = js.native
  
  /** Gets or sets a Boolean value that indicates if invitees must be sent notifications. */
  var mustNofityInvitees: Boolean = js.native
  
  /** Gets or sets a boolean value indicating whether other apps on the device have read access to the appointment calendar. */
  var otherAppReadAccess: AppointmentCalendarOtherAppReadAccess = js.native
  
  /** Gets or sets a boolean value indicating whether other apps on the device have write access to the appointment calendar. */
  var otherAppWriteAccess: AppointmentCalendarOtherAppWriteAccess = js.native
  
  /** Gets the remote ID for the AppointmentCalendar . */
  var remoteId: String = js.native
  
  /**
    * Asynchronously saves the provided appointment to the calendar.
    * @param pAppointment The appointment to be saved.
    * @return An asynchronous action.
    */
  def saveAppointmentAsync(pAppointment: Appointment): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously saves changes to the appointment calendar.
    * @return An asynchronous action.
    */
  def saveAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets a string that describes the provider for the appointment calendar. */
  var sourceDisplayName: String = js.native
  
  /** Gets or sets how the summary card for the calendar's appointments are displayed. */
  var summaryCardView: AppointmentSummaryCardView = js.native
  
  /** Gets the AppointmentCalendarSyncManager which can be used to sync with the remote server. */
  var syncManager: AppointmentCalendarSyncManager = js.native
  
  /**
    * Asynchronously attempts to cancel a meeting.
    * @param meeting The meeting to cancel.
    * @param subject The subject for the cancellation notification.
    * @param comment The body of the cancellation notification.
    * @param notifyInvitees A Boolean value indicating if invitees should be notified.
    * @return A Boolean value indicating if the operation was successful.
    */
  def tryCancelMeetingAsync(meeting: Appointment, subject: String, comment: String, notifyInvitees: Boolean): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Asynchronously attempts to create or update a meeting.
    * @param appointment The meeting to create or update.
    * @param notifyInvitees A Boolean value indicating if invitees should be notified.
    * @return A Boolean value indicating if the operation was successful.
    */
  def tryCreateOrUpdateAppointmentAsync(appointment: Appointment, notifyInvitees: Boolean): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Asynchronously attempts to forward a meeting.
    * @param meeting The meeting to forward.
    * @param invitees A list of new invitees to receive the forwarded meeting.
    * @param subject The subject of the meeting invitation.
    * @param forwardHeader A new meeting header that includes the new invitees.
    * @param comment The body of the forwarded meeting invitation.
    * @return A Boolean value indicating if the operation was successful.
    */
  def tryForwardMeetingAsync(
    meeting: Appointment,
    invitees: IIterable[AppointmentInvitee],
    subject: String,
    forwardHeader: String,
    comment: String
  ): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Asynchronously attempts to propose a new meeting time.
    * @param meeting The meeting to update.
    * @param newStartTime The proposed new start time.
    * @param newDuration A new duration for the meeting.
    * @param subject The subject of the meeting invitation.
    * @param comment The body of the meeting invitation.
    * @return A Boolean value indicating if the operation was successful.
    */
  def tryProposeNewTimeForMeetingAsync(meeting: Appointment, newStartTime: Date, newDuration: Double, subject: String, comment: String): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Asynchronously attempts to update the response to a meeting invitation.
    * @param meeting The meeting to update.
    * @param response The response to the meeting invitation, such as accept, tentative or decline.
    * @param subject The subject of the response.
    * @param comment The body of the response.
    * @param sendUpdate A Boolean value indicating whether or not to send the response to the meeting organizer.
    * @return A Boolean value indicating if the operation was successful.
    */
  def tryUpdateMeetingResponseAsync(
    meeting: Appointment,
    response: AppointmentParticipantResponse,
    subject: String,
    comment: String,
    sendUpdate: Boolean
  ): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /** Get the identifier of the user account data for the AppointmentCalendar . */
  var userDataAccountId: String = js.native
}
