package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentStoreChangeType extends js.Object

/** Specifies the type of change represented by an AppointmentStoreChange object. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreChangeType")
@js.native
object AppointmentStoreChangeType extends js.Object {
  /** An appointment was created. */
  @js.native
  sealed trait appointmentCreated
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStoreChangeType
  
  /** An appointment was deleted. */
  @js.native
  sealed trait appointmentDeleted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStoreChangeType
  
  /** An appointment was modified. */
  @js.native
  sealed trait appointmentModified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStoreChangeType
  
  /** A calendar was created. */
  @js.native
  sealed trait calendarCreated
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStoreChangeType
  
  /** A calendar was deleted. */
  @js.native
  sealed trait calendarDeleted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStoreChangeType
  
  /** A calendar was modified. */
  @js.native
  sealed trait calendarModified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStoreChangeType
  
  /** The change tracking information associated with the appointment was lost. */
  @js.native
  sealed trait changeTrackingLost
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStoreChangeType
  
  /* 0 */ val appointmentCreated: appointmentCreated with scala.Double = js.native
  /* 2 */ val appointmentDeleted: appointmentDeleted with scala.Double = js.native
  /* 1 */ val appointmentModified: appointmentModified with scala.Double = js.native
  /* 4 */ val calendarCreated: calendarCreated with scala.Double = js.native
  /* 6 */ val calendarDeleted: calendarDeleted with scala.Double = js.native
  /* 5 */ val calendarModified: calendarModified with scala.Double = js.native
  /* 3 */ val changeTrackingLost: changeTrackingLost with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStoreChangeType with scala.Double
  ] = js.native
}

