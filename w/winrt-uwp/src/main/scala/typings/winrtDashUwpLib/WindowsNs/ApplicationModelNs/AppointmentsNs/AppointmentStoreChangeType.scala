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
  
  val appointmentCreated: appointmentCreated with java.lang.String = js.native
  val appointmentDeleted: appointmentDeleted with java.lang.String = js.native
  val appointmentModified: appointmentModified with java.lang.String = js.native
  val calendarCreated: calendarCreated with java.lang.String = js.native
  val calendarDeleted: calendarDeleted with java.lang.String = js.native
  val calendarModified: calendarModified with java.lang.String = js.native
  val changeTrackingLost: changeTrackingLost with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStoreChangeType with java.lang.String
  ] = js.native
}

