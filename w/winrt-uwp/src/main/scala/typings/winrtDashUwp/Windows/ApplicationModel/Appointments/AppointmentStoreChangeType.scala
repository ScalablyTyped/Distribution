package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentStoreChangeType with Double] = js.native
  /* 0 */ @js.native
  object appointmentCreated extends TopLevel[appointmentCreated with Double]
  
  /* 2 */ @js.native
  object appointmentDeleted extends TopLevel[appointmentDeleted with Double]
  
  /* 1 */ @js.native
  object appointmentModified extends TopLevel[appointmentModified with Double]
  
  /* 4 */ @js.native
  object calendarCreated extends TopLevel[calendarCreated with Double]
  
  /* 6 */ @js.native
  object calendarDeleted extends TopLevel[calendarDeleted with Double]
  
  /* 5 */ @js.native
  object calendarModified extends TopLevel[calendarModified with Double]
  
  /* 3 */ @js.native
  object changeTrackingLost extends TopLevel[changeTrackingLost with Double]
  
}

