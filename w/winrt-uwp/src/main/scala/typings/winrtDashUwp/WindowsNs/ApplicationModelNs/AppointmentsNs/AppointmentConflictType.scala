package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentConflictType extends js.Object

/** Specifies the way in which an appointment conflicts with another appointment. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentConflictType")
@js.native
object AppointmentConflictType extends js.Object {
  /** The appointment is adjacent to another appointment. */
  @js.native
  sealed trait adjacent extends AppointmentConflictType
  
  /** There is no appointment conflict. */
  @js.native
  sealed trait none extends AppointmentConflictType
  
  /** The appointment overlaps another appointment. */
  @js.native
  sealed trait overlap extends AppointmentConflictType
  
  /* 1 */ val adjacent: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentConflictType.adjacent with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentConflictType.none with Double = js.native
  /* 2 */ val overlap: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentConflictType.overlap with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentConflictType with Double] = js.native
}

