package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the current sync status of an AppointmentCalendar . */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentCalendarSyncStatus")
@js.native
object AppointmentCalendarSyncStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentCalendarSyncStatus & Double
  ] = js.native
  
  /* 3 */ val authenticationError: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentCalendarSyncStatus.authenticationError & Double = js.native
  
  /* 0 */ val idle: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentCalendarSyncStatus.idle & Double = js.native
  
  /* 6 */ val manualAccountRemovalRequired: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentCalendarSyncStatus.manualAccountRemovalRequired & Double = js.native
  
  /* 4 */ val policyError: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentCalendarSyncStatus.policyError & Double = js.native
  
  /* 1 */ val syncing: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentCalendarSyncStatus.syncing & Double = js.native
  
  /* 5 */ val unknownError: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentCalendarSyncStatus.unknownError & Double = js.native
  
  /* 2 */ val upToDate: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentCalendarSyncStatus.upToDate & Double = js.native
}
