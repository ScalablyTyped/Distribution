package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides APIs to interact with the user’s Appointments provider app (for example, the Calendar app). Call static methods to display provider-specific UI so that the user can perform tasks. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentManager")
@js.native
abstract class AppointmentManager () extends js.Object

/** Provides APIs to interact with the user’s Appointments provider app (for example, the Calendar app). Call static methods to display provider-specific UI so that the user can perform tasks. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentManager")
@js.native
object AppointmentManager extends js.Object {
  /**
                   * Requests the AppointmentStore object associated with the calling application.
                   * @param options An AppointmentStoreAccessType value indicating the level of access the returned appointment store will have.
                   * @return An asynchronous operation that returns an AppointmentStore upon successful completion.
                   */
  def requestStoreAsync(options: winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStoreAccessType): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStore] = js.native
  /**
                   * Shows the Appointments provider Add Appointment UI, to enable the user to add an appointment.
                   * @param appointment The object representing the information for the appointment to add.
                   * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Add Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Add Appointment UI displays around the button, not overlapping it.
                   * @return When this method completes, it returns a String object that represents the appointment. This serves as an appointment identifier for future reference when updating or removing. If the appointment identifier returned is an empty string, the appointment was not added to the Appointments provider app.
                   */
  def showAddAppointmentAsync(
    appointment: winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.Appointment,
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
                   * Shows the Appointments provider Add Appointment UI, to enable the user to add an appointment.
                   * @param appointment The object representing the information for the appointment to add.
                   * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Add Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Add Appointment UI displays around the button, not overlapping it.
                   * @param preferredPlacement The Placement that describes the preferred placement of the Add Appointment UI.
                   * @return When this method completes, it returns a String object that represents the appointment. This serves as an appointment identifier for future reference when updating or removing. If the appointment identifier returned is an empty string, the appointment was not added to the Appointments provider app.
                   */
  def showAddAppointmentAsync(
    appointment: winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.Appointment,
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    preferredPlacement: winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
                   * Shows the Appointments provider Appointment Details UI, to enable the user to view the specified appointment.
                   * @param appointmentId The LocalId of the appointment to be displayed.
                   * @return An asynchronous action.
                   */
  def showAppointmentDetailsAsync(appointmentId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Shows the Appointments provider Appointment Details UI, to enable the user to view the specified appointment.
                   * @param appointmentId The LocalId of the appointment to be displayed.
                   * @param instanceStartDate A DateTime object with the start time of the appointment instance to be displayed.
                   * @return An asynchronous action.
                   */
  def showAppointmentDetailsAsync(appointmentId: java.lang.String, instanceStartDate: stdLib.Date): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Shows the Appointments provider Add Appointment UI including the full edit experience, to enable the user to add an appointment.
                   * @param appointment The appointment to be added.
                   * @return An asynchronous operation that returns a string containing an appointment ID upon successful completion.
                   */
  def showEditNewAppointmentAsync(appointment: winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.Appointment): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
                   * Shows the Appointments provider Remove Appointment UI, to enable the user to remove an appointment.
                   * @param appointmentId The appointment identifier. This is typically obtained from the async return value of a previous ShowAddAppointmentAsync call.
                   * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Remove Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Remove Appointment UI displays around the button, not overlapping it.
                   * @return When this method completes, it returns a Boolean value that indicates whether the Appointment provider app removed the appointment.
                   */
  def showRemoveAppointmentAsync(appointmentId: java.lang.String, selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Shows the Appointments provider Remove Appointment UI, to enable the user to remove an appointment.
                   * @param appointmentId The appointment identifier. This is typically obtained from the async return value of a previous ShowAddAppointmentAsync call.
                   * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Remove Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Remove Appointment UI displays around the button, not overlapping it.
                   * @param preferredPlacement The Placement that describes the preferred placement of the Remove Appointment UI.
                   * @return When this method completes, it returns a Boolean value that indicates whether the Appointment provider app removed the appointment.
                   */
  def showRemoveAppointmentAsync(
    appointmentId: java.lang.String,
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    preferredPlacement: winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Shows the Appointments provider Remove Appointment UI, to enable the user to remove an appointment.
                   * @param appointmentId The appointment identifier. This is typically obtained from the async return value of a previous ShowAddAppointmentAsync call.
                   * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Remove Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Remove Appointment UI displays around the button, not overlapping it.
                   * @param preferredPlacement The Placement that describes the preferred placement of the Remove Appointment UI.
                   * @param instanceStartDate The start date and time of the appointment instance to remove.
                   * @return When this method completes, it returns a Boolean value that indicates whether the Appointment provider app removed the appointment.
                   */
  def showRemoveAppointmentAsync(
    appointmentId: java.lang.String,
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    preferredPlacement: winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement,
    instanceStartDate: stdLib.Date
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Shows the Appointments provider Replace Appointment UI, to enable the user to replace an appointment.
                   * @param appointmentId The appointment identifier of the current appointment. This is typically obtained from the async return value of a previous ShowAddAppointmentAsync or ShowReplaceAppointmentAsync call.
                   * @param appointment The object representing the information for the appointment to replace the current appointment.
                   * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Replace Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Replace Appointment UI displays around the button, not overlapping it.
                   * @return When this method completes, it returns a String object that represents the appointment. This serves as an appointment identifier for future reference when updating or removing. If the appointment identifier returned is an empty string, the appointment was not replaced in the Appointments provider app.
                   */
  def showReplaceAppointmentAsync(
    appointmentId: java.lang.String,
    appointment: winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.Appointment,
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
                   * Shows the Appointments provider Replace Appointment UI, to enable the user to replace an appointment.
                   * @param appointmentId The appointment identifier of the current appointment. This is typically obtained from the async return value of a previous ShowAddAppointmentAsync or ShowReplaceAppointmentAsync call.
                   * @param appointment The object representing the information for the appointment to replace the current appointment.
                   * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Replace Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Replace Appointment UI displays around the button, not overlapping it.
                   * @param preferredPlacement The Placement that describes the preferred placement of the Replace Appointment UI.
                   * @return When this method completes, it returns a String object that represents the appointment. This serves as an appointment identifier for future reference when updating or removing. If the appointment identifier returned is an empty string, the appointment was not replaced in the Appointments provider app.
                   */
  def showReplaceAppointmentAsync(
    appointmentId: java.lang.String,
    appointment: winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.Appointment,
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    preferredPlacement: winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
                   * Shows the Appointments provider Replace Appointment UI, to enable the user to replace an appointment.
                   * @param appointmentId The appointment identifier of the current appointment. This is typically obtained from the async return value of a previous ShowAddAppointmentAsync or ShowReplaceAppointmentAsync call.
                   * @param appointment The object representing the information for the appointment to replace the current appointment.
                   * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Replace Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Replace Appointment UI displays around the button, not overlapping it.
                   * @param preferredPlacement The Placement that describes the preferred placement of the Replace Appointment UI.
                   * @param instanceStartDate The start date and time of the appointment instance to replace.
                   * @return When this method completes, it returns a String object that represents the appointment. This serves as an appointment identifier for future reference when updating or removing. If the appointment identifier returned is an empty string, the appointment was not replaced in the Appointments provider app.
                   */
  def showReplaceAppointmentAsync(
    appointmentId: java.lang.String,
    appointment: winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.Appointment,
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    preferredPlacement: winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement,
    instanceStartDate: stdLib.Date
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
                   * Shows the Appointments provider app's primary UI. This typically displays a time frame from an appointments calendar.
                   * @param timeToShow A date and time object that specifies the beginning of the time frame that the Appointments provider app should display.
                   * @param duration A timespan that hints to the Appointments provider app how long the time frame shown should be.
                   * @return When this method returns, it does not return a result. On completion, the AsyncActionCompletedHandler specified by get_Completed / Completed is invoked.
                   */
  def showTimeFrameAsync(timeToShow: stdLib.Date, duration: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

