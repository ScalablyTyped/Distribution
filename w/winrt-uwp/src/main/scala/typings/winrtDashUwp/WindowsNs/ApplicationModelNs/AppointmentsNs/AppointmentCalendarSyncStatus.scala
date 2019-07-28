package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentCalendarSyncStatus extends js.Object

/** Specifies the current sync status of an AppointmentCalendar . */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentCalendarSyncStatus")
@js.native
object AppointmentCalendarSyncStatus extends js.Object {
  /** An authentication error occurred when trying to connect to the server. */
  @js.native
  sealed trait authenticationError extends AppointmentCalendarSyncStatus
  
  /** There is no sync operation currently occurring. */
  @js.native
  sealed trait idle extends AppointmentCalendarSyncStatus
  
  /** The account must be manually removed. */
  @js.native
  sealed trait manualAccountRemovalRequired extends AppointmentCalendarSyncStatus
  
  /** A policy error occurred. */
  @js.native
  sealed trait policyError extends AppointmentCalendarSyncStatus
  
  /** A sync operation is in progress. */
  @js.native
  sealed trait syncing extends AppointmentCalendarSyncStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknownError extends AppointmentCalendarSyncStatus
  
  /** The local machine and server are up to date. */
  @js.native
  sealed trait upToDate extends AppointmentCalendarSyncStatus
  
  /* 3 */ val authenticationError: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus.authenticationError with Double = js.native
  /* 0 */ val idle: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus.idle with Double = js.native
  /* 6 */ val manualAccountRemovalRequired: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus.manualAccountRemovalRequired with Double = js.native
  /* 4 */ val policyError: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus.policyError with Double = js.native
  /* 1 */ val syncing: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus.syncing with Double = js.native
  /* 5 */ val unknownError: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus.unknownError with Double = js.native
  /* 2 */ val upToDate: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus.upToDate with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentCalendarSyncStatus with Double] = js.native
}

