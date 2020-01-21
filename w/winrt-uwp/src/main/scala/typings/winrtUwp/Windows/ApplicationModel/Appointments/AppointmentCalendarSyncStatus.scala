package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentCalendarSyncStatus with Double] = js.native
  /* 3 */ @js.native
  object authenticationError extends TopLevel[authenticationError with Double]
  
  /* 0 */ @js.native
  object idle extends TopLevel[idle with Double]
  
  /* 6 */ @js.native
  object manualAccountRemovalRequired extends TopLevel[manualAccountRemovalRequired with Double]
  
  /* 4 */ @js.native
  object policyError extends TopLevel[policyError with Double]
  
  /* 1 */ @js.native
  object syncing extends TopLevel[syncing with Double]
  
  /* 5 */ @js.native
  object unknownError extends TopLevel[unknownError with Double]
  
  /* 2 */ @js.native
  object upToDate extends TopLevel[upToDate with Double]
  
}

