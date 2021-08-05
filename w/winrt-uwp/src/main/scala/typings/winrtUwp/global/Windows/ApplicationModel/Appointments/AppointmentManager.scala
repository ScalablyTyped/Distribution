package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.UI.Popups.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs to interact with the user’s Appointments provider app (for example, the Calendar app). Call static methods to display provider-specific UI so that the user can perform tasks. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentManager")
@js.native
abstract class AppointmentManager ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentManager
object AppointmentManager {
  
  @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Requests the AppointmentStore object associated with the calling application.
    * @param options An AppointmentStoreAccessType value indicating the level of access the returned appointment store will have.
    * @return An asynchronous operation that returns an AppointmentStore upon successful completion.
    */
  /* static member */
  inline def requestStoreAsync(options: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreAccessType): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStore] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestStoreAsync")(options.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStore]]
  
  /**
    * Shows the Appointments provider Add Appointment UI, to enable the user to add an appointment.
    * @param appointment The object representing the information for the appointment to add.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Add Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Add Appointment UI displays around the button, not overlapping it.
    * @return When this method completes, it returns a String object that represents the appointment. This serves as an appointment identifier for future reference when updating or removing. If the appointment identifier returned is an empty string, the appointment was not added to the Appointments provider app.
    */
  /* static member */
  inline def showAddAppointmentAsync(appointment: typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment, selection: Rect): IPromiseWithIAsyncOperation[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showAddAppointmentAsync")(appointment.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[String]]
  /**
    * Shows the Appointments provider Add Appointment UI, to enable the user to add an appointment.
    * @param appointment The object representing the information for the appointment to add.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Add Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Add Appointment UI displays around the button, not overlapping it.
    * @param preferredPlacement The Placement that describes the preferred placement of the Add Appointment UI.
    * @return When this method completes, it returns a String object that represents the appointment. This serves as an appointment identifier for future reference when updating or removing. If the appointment identifier returned is an empty string, the appointment was not added to the Appointments provider app.
    */
  /* static member */
  inline def showAddAppointmentAsync(
    appointment: typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment,
    selection: Rect,
    preferredPlacement: Placement
  ): IPromiseWithIAsyncOperation[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showAddAppointmentAsync")(appointment.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], preferredPlacement.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[String]]
  
  /**
    * Shows the Appointments provider Appointment Details UI, to enable the user to view the specified appointment.
    * @param appointmentId The LocalId of the appointment to be displayed.
    * @return An asynchronous action.
    */
  /* static member */
  inline def showAppointmentDetailsAsync(appointmentId: String): IPromiseWithIAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("showAppointmentDetailsAsync")(appointmentId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncAction]
  /**
    * Shows the Appointments provider Appointment Details UI, to enable the user to view the specified appointment.
    * @param appointmentId The LocalId of the appointment to be displayed.
    * @param instanceStartDate A DateTime object with the start time of the appointment instance to be displayed.
    * @return An asynchronous action.
    */
  /* static member */
  inline def showAppointmentDetailsAsync(appointmentId: String, instanceStartDate: Date): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("showAppointmentDetailsAsync")(appointmentId.asInstanceOf[js.Any], instanceStartDate.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  
  /**
    * Shows the Appointments provider Add Appointment UI including the full edit experience, to enable the user to add an appointment.
    * @param appointment The appointment to be added.
    * @return An asynchronous operation that returns a string containing an appointment ID upon successful completion.
    */
  /* static member */
  inline def showEditNewAppointmentAsync(appointment: typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment): IPromiseWithIAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("showEditNewAppointmentAsync")(appointment.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[String]]
  
  /**
    * Shows the Appointments provider Remove Appointment UI, to enable the user to remove an appointment.
    * @param appointmentId The appointment identifier. This is typically obtained from the async return value of a previous ShowAddAppointmentAsync call.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Remove Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Remove Appointment UI displays around the button, not overlapping it.
    * @return When this method completes, it returns a Boolean value that indicates whether the Appointment provider app removed the appointment.
    */
  /* static member */
  inline def showRemoveAppointmentAsync(appointmentId: String, selection: Rect): IPromiseWithIAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("showRemoveAppointmentAsync")(appointmentId.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  /**
    * Shows the Appointments provider Remove Appointment UI, to enable the user to remove an appointment.
    * @param appointmentId The appointment identifier. This is typically obtained from the async return value of a previous ShowAddAppointmentAsync call.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Remove Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Remove Appointment UI displays around the button, not overlapping it.
    * @param preferredPlacement The Placement that describes the preferred placement of the Remove Appointment UI.
    * @return When this method completes, it returns a Boolean value that indicates whether the Appointment provider app removed the appointment.
    */
  /* static member */
  inline def showRemoveAppointmentAsync(appointmentId: String, selection: Rect, preferredPlacement: Placement): IPromiseWithIAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("showRemoveAppointmentAsync")(appointmentId.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], preferredPlacement.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  /**
    * Shows the Appointments provider Remove Appointment UI, to enable the user to remove an appointment.
    * @param appointmentId The appointment identifier. This is typically obtained from the async return value of a previous ShowAddAppointmentAsync call.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Remove Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Remove Appointment UI displays around the button, not overlapping it.
    * @param preferredPlacement The Placement that describes the preferred placement of the Remove Appointment UI.
    * @param instanceStartDate The start date and time of the appointment instance to remove.
    * @return When this method completes, it returns a Boolean value that indicates whether the Appointment provider app removed the appointment.
    */
  /* static member */
  inline def showRemoveAppointmentAsync(appointmentId: String, selection: Rect, preferredPlacement: Placement, instanceStartDate: Date): IPromiseWithIAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("showRemoveAppointmentAsync")(appointmentId.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], preferredPlacement.asInstanceOf[js.Any], instanceStartDate.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  
  /**
    * Shows the Appointments provider Replace Appointment UI, to enable the user to replace an appointment.
    * @param appointmentId The appointment identifier of the current appointment. This is typically obtained from the async return value of a previous ShowAddAppointmentAsync or ShowReplaceAppointmentAsync call.
    * @param appointment The object representing the information for the appointment to replace the current appointment.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Replace Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Replace Appointment UI displays around the button, not overlapping it.
    * @return When this method completes, it returns a String object that represents the appointment. This serves as an appointment identifier for future reference when updating or removing. If the appointment identifier returned is an empty string, the appointment was not replaced in the Appointments provider app.
    */
  /* static member */
  inline def showReplaceAppointmentAsync(
    appointmentId: String,
    appointment: typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment,
    selection: Rect
  ): IPromiseWithIAsyncOperation[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showReplaceAppointmentAsync")(appointmentId.asInstanceOf[js.Any], appointment.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[String]]
  /**
    * Shows the Appointments provider Replace Appointment UI, to enable the user to replace an appointment.
    * @param appointmentId The appointment identifier of the current appointment. This is typically obtained from the async return value of a previous ShowAddAppointmentAsync or ShowReplaceAppointmentAsync call.
    * @param appointment The object representing the information for the appointment to replace the current appointment.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Replace Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Replace Appointment UI displays around the button, not overlapping it.
    * @param preferredPlacement The Placement that describes the preferred placement of the Replace Appointment UI.
    * @return When this method completes, it returns a String object that represents the appointment. This serves as an appointment identifier for future reference when updating or removing. If the appointment identifier returned is an empty string, the appointment was not replaced in the Appointments provider app.
    */
  /* static member */
  inline def showReplaceAppointmentAsync(
    appointmentId: String,
    appointment: typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment,
    selection: Rect,
    preferredPlacement: Placement
  ): IPromiseWithIAsyncOperation[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showReplaceAppointmentAsync")(appointmentId.asInstanceOf[js.Any], appointment.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], preferredPlacement.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[String]]
  /**
    * Shows the Appointments provider Replace Appointment UI, to enable the user to replace an appointment.
    * @param appointmentId The appointment identifier of the current appointment. This is typically obtained from the async return value of a previous ShowAddAppointmentAsync or ShowReplaceAppointmentAsync call.
    * @param appointment The object representing the information for the appointment to replace the current appointment.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the Replace Appointment UI, not within that rectangular area. For example, if an app uses a button to show the Rect, pass the Rect of the button so the Replace Appointment UI displays around the button, not overlapping it.
    * @param preferredPlacement The Placement that describes the preferred placement of the Replace Appointment UI.
    * @param instanceStartDate The start date and time of the appointment instance to replace.
    * @return When this method completes, it returns a String object that represents the appointment. This serves as an appointment identifier for future reference when updating or removing. If the appointment identifier returned is an empty string, the appointment was not replaced in the Appointments provider app.
    */
  /* static member */
  inline def showReplaceAppointmentAsync(
    appointmentId: String,
    appointment: typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment,
    selection: Rect,
    preferredPlacement: Placement,
    instanceStartDate: Date
  ): IPromiseWithIAsyncOperation[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showReplaceAppointmentAsync")(appointmentId.asInstanceOf[js.Any], appointment.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], preferredPlacement.asInstanceOf[js.Any], instanceStartDate.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[String]]
  
  /**
    * Shows the Appointments provider app's primary UI. This typically displays a time frame from an appointments calendar.
    * @param timeToShow A date and time object that specifies the beginning of the time frame that the Appointments provider app should display.
    * @param duration A timespan that hints to the Appointments provider app how long the time frame shown should be.
    * @return When this method returns, it does not return a result. On completion, the AsyncActionCompletedHandler specified by get_Completed / Completed is invoked.
    */
  /* static member */
  inline def showTimeFrameAsync(timeToShow: Date, duration: Double): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("showTimeFrameAsync")(timeToShow.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
}
