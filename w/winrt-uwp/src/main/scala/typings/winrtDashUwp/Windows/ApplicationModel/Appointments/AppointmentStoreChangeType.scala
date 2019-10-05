package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

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
  sealed trait appointmentCreated extends AppointmentStoreChangeType
  
  /** An appointment was deleted. */
  @js.native
  sealed trait appointmentDeleted extends AppointmentStoreChangeType
  
  /** An appointment was modified. */
  @js.native
  sealed trait appointmentModified extends AppointmentStoreChangeType
  
  /** A calendar was created. */
  @js.native
  sealed trait calendarCreated extends AppointmentStoreChangeType
  
  /** A calendar was deleted. */
  @js.native
  sealed trait calendarDeleted extends AppointmentStoreChangeType
  
  /** A calendar was modified. */
  @js.native
  sealed trait calendarModified extends AppointmentStoreChangeType
  
  /** The change tracking information associated with the appointment was lost. */
  @js.native
  sealed trait changeTrackingLost extends AppointmentStoreChangeType
  
  /* 0 */ val appointmentCreated: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangeType.appointmentCreated with Double = js.native
  /* 2 */ val appointmentDeleted: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangeType.appointmentDeleted with Double = js.native
  /* 1 */ val appointmentModified: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangeType.appointmentModified with Double = js.native
  /* 4 */ val calendarCreated: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangeType.calendarCreated with Double = js.native
  /* 6 */ val calendarDeleted: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangeType.calendarDeleted with Double = js.native
  /* 5 */ val calendarModified: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangeType.calendarModified with Double = js.native
  /* 3 */ val changeTrackingLost: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangeType.changeTrackingLost with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentStoreChangeType with Double] = js.native
}

