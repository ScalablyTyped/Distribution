package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a store that contains appointments. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStore")
@js.native
abstract class AppointmentStore () extends js.Object {
  /** Returns the AppointmentStoreChangeTracker associated with the appointment store. */
  var changeTracker: AppointmentStoreChangeTracker = js.native
  /** Occurs when the AppointmentStore changes. */
  @JSName("onstorechanged")
  var onstorechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppointmentStore, AppointmentStoreChangedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.storechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppointmentStore, AppointmentStoreChangedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Asynchronously creates a new AppointmentCalendar within the appointment store using the specified parameters.
                   * @param name The name for the new AppointmentCalendar .
                   * @return An async operation that provides access to the newly created AppointmentCalendar .
                   */
  def createAppointmentCalendarAsync(name: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[AppointmentCalendar] = js.native
  /**
                   * Asynchronously creates a new AppointmentCalendar within the appointment store with the specified name and user data account ID.
                   * @param name The name for the new AppointmentCalendar .
                   * @param userDataAccountId The identifier for the user data account used to create the AppointmentCalendar .
                   * @return An async operation that provides access to the newly created AppointmentCalendar .
                   */
  def createAppointmentCalendarAsync(name: java.lang.String, userDataAccountId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[AppointmentCalendar] = js.native
  /**
                   * Retrieves a list of all of the appointment calendars in the appointment store.
                   * @return An asynchronous operation that returns an IVectorView upon successful completion.
                   */
  def findAppointmentCalendarsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Retrieves a list of appointment calendars in the appointment store that meet the criteria specified by the supplied FindAppointmentCalendarsOptions object..
                   * @param options The object that specifies the criteria that determines which appointment calendars are returned.
                   * @return An asynchronous operation that returns an IVectorView upon successful completion.
                   */
  def findAppointmentCalendarsAsync(options: FindAppointmentCalendarsOptions): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Retrieves a list of appointments in the appointment calendar that fall within the specified date range.
                   * @param rangeStart The start of the date range for which appointments are retrieved.
                   * @param rangeLength The length of the date range for which appointments are retrieved.
                   * @return An asynchronous operation that returns an IVectorView upon successful completion.
                   */
  def findAppointmentsAsync(rangeStart: stdLib.Date, rangeLength: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Retrieves a list of appointments in the appointment calendar that fall within the specified date range and meet the criteria specified by the supplied FindAppointmentsOptions object..
                   * @param rangeStart The start of the date range for which appointments are retrieved.
                   * @param rangeLength The length of the date range for which appointments are retrieved.
                   * @param options The object that specifies the criteria that determines which appointments are returned.
                   * @return An asynchronous operation that returns an IVectorView upon successful completion.
                   */
  def findAppointmentsAsync(rangeStart: stdLib.Date, rangeLength: scala.Double, options: FindAppointmentsOptions): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Returns an AppointmentConflictResult representing a conflict between the specified appointment and an existing appointment in the appointment store.
                   * @param appointment The appointment for which a conflict is sought.
                   * @return An asynchronous operation that returns an AppointmentConflictResult upon successful completion.
                   */
  def findConflictAsync(appointment: Appointment): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[AppointmentConflictResult] = js.native
  /**
                   * Returns an AppointmentConflictResult representing a conflict between the specified appointment and an existing appointment instance in the appointment store.
                   * @param appointment The appointment for which a conflict is sought.
                   * @param instanceStartTime The start time of the appointment instance for which a conflict is sought.
                   * @return An asynchronous operation that returns an AppointmentConflictResult upon successful completion.
                   */
  def findConflictAsync(appointment: Appointment, instanceStartTime: stdLib.Date): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[AppointmentConflictResult] = js.native
  /**
                   * Returns a list of LocalId values for appointment instances with the specified RoamingId value.
                   * @param roamingId The RoamingId value for which local ID values are sought.
                   * @return An asynchronous operation that returns an IVectorView upon successful completion.
                   */
  def findLocalIdsFromRoamingIdAsync(roamingId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Retrieves the Appointment with the specified LocalId .
                   * @param localId The LocalId of the appointment to be retrieved.
                   * @return An asynchronous operation that returns an Appointment upon successful completion.
                   */
  def getAppointmentAsync(localId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[Appointment] = js.native
  /**
                   * Retrieves the AppointmentCalendar with the specified LocalId or RemoteId .
                   * @param calendarId The LocalId or RemoteId of the AppointmentCalendar to be retrieved.
                   * @return An asynchronous operation that returns an AppointmentCalendar upon successful completion.
                   */
  def getAppointmentCalendarAsync(calendarId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[AppointmentCalendar] = js.native
  /**
                   * Retrieves the instance of the Appointment with the specified LocalId and the specified start time.
                   * @param localId The LocalId of the appointment instance to be retrieved.
                   * @param instanceStartTime The start time of the appointment instance to be retrieved.
                   * @return An asynchronous operation that returns an Appointment upon successful completion.
                   */
  def getAppointmentInstanceAsync(localId: java.lang.String, instanceStartTime: stdLib.Date): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[Appointment] = js.native
  /**
                   * Moves the specified Appointment object to the specified AppointmentCalendar .
                   * @param appointment The appointment to be moved.
                   * @param destinationCalendar The appointment calendar to which the appointment is moved.
                   * @return An asynchronous action.
                   */
  def moveAppointmentAsync(appointment: Appointment, destinationCalendar: AppointmentCalendar): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Occurs when the AppointmentStore changes. */
  def onstorechanged(ev: AppointmentStoreChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AppointmentStore]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.storechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppointmentStore, AppointmentStoreChangedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Shows the Appointments provider Add Appointment UI, to enable the user to add an appointment.
                   * @param appointment The object representing the information for the appointment to add.
                   * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Add Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Add Appointment UI displays around the button, not overlapping it.
                   * @return When this method completes, it returns a String object that represents the RoamingId of the appointment. If the appointment identifier returned is an empty string, the appointment was not added to the Appointments provider app.
                   */
  def showAddAppointmentAsync(appointment: Appointment, selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
                   * Shows the Appointments provider Appointment Details UI, to enable the user to view the specified appointment.
                   * @param localId The LocalId of the appointment to be displayed.
                   * @return An asynchronous action.
                   */
  def showAppointmentDetailsAsync(localId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Shows the Appointments provider Appointment Details UI, to enable the user to view the specified appointment.
                   * @param localId The LocalId of the appointment to be displayed.
                   * @param instanceStartDate A DateTime object with the start time of the appointment instance to be displayed.
                   * @return An asynchronous action.
                   */
  def showAppointmentDetailsAsync(localId: java.lang.String, instanceStartDate: stdLib.Date): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Shows the Appointments provider Add Appointment UI including the full edit experience, to enable the user to add an appointment.
                   * @param appointment The appointment to be added.
                   * @return When this method completes, it returns a String object that represents the RoamingId of the appointment. If the appointment identifier returned is an empty string, the appointment was not added to the Appointments provider app.
                   */
  def showEditNewAppointmentAsync(appointment: Appointment): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
                   * Shows the Appointments provider Remove Appointment UI, to enable the user to remove an appointment.
                   * @param localId The LocalId of the appointment to be removed.
                   * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Remove Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Remove Appointment UI displays around the button, not overlapping it.
                   * @return When this method completes, it returns a Boolean value that indicates whether the Appointment provider app removed the appointment.
                   */
  def showRemoveAppointmentAsync(localId: java.lang.String, selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Shows the Appointments provider Remove Appointment UI, to enable the user to remove an appointment.
                   * @param localId The LocalId of the appointment to be removed.
                   * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Remove Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Remove Appointment UI displays around the button, not overlapping it.
                   * @param preferredPlacement The Placement that describes the preferred placement of the Remove Appointment UI.
                   * @param instanceStartDate The start date and time of the appointment instance to remove.
                   * @return When this method completes, it returns a Boolean value that indicates whether the Appointment provider app removed the appointment.
                   */
  def showRemoveAppointmentAsync(
    localId: java.lang.String,
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    preferredPlacement: winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement,
    instanceStartDate: stdLib.Date
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Shows the Appointments provider Replace Appointment UI, to enable the user to replace an appointment.
                   * @param localId The LocalId of the appointment to be replaced.
                   * @param appointment The object representing the appointment to replace the existing appointment.
                   * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Replace Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Replace Appointment UI displays around the button, not overlapping it.
                   * @return When this method completes, it returns a String object that represents the RoamingId of the appointment that replaced the existing appointment.
                   */
  def showReplaceAppointmentAsync(
    localId: java.lang.String,
    appointment: Appointment,
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
                   * Shows the Appointments provider Replace Appointment UI, to enable the user to replace an appointment.
                   * @param localId The LocalId of the appointment to be replaced.
                   * @param appointment The object representing the appointment to replace the existing appointment.
                   * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Replace Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Replace Appointment UI displays around the button, not overlapping it.
                   * @param preferredPlacement The Placement that describes the preferred placement of the Replace Appointment UI.
                   * @param instanceStartDate The start date and time of the appointment instance to replace.
                   * @return When this method completes, it returns a String object that represents the RoamingId of the appointment that replaced the existing appointment.
                   */
  def showReplaceAppointmentAsync(
    localId: java.lang.String,
    appointment: Appointment,
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    preferredPlacement: winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement,
    instanceStartDate: stdLib.Date
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
}

