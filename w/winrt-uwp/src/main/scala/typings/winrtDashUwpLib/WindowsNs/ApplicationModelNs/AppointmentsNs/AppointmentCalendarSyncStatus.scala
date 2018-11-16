package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

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
  sealed trait authenticationError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus
  
  /** There is no sync operation currently occurring. */
  @js.native
  sealed trait idle
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus
  
  /** The account must be manually removed. */
  @js.native
  sealed trait manualAccountRemovalRequired
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus
  
  /** A policy error occurred. */
  @js.native
  sealed trait policyError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus
  
  /** A sync operation is in progress. */
  @js.native
  sealed trait syncing
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknownError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus
  
  /** The local machine and server are up to date. */
  @js.native
  sealed trait upToDate
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus
  
  val authenticationError: authenticationError with java.lang.String = js.native
  val idle: idle with java.lang.String = js.native
  val manualAccountRemovalRequired: manualAccountRemovalRequired with java.lang.String = js.native
  val policyError: policyError with java.lang.String = js.native
  val syncing: syncing with java.lang.String = js.native
  val unknownError: unknownError with java.lang.String = js.native
  val upToDate: upToDate with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarSyncStatus with java.lang.String
  ] = js.native
}

