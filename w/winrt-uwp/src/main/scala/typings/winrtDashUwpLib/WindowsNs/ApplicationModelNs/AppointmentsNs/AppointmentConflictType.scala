package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

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
  sealed trait adjacent
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentConflictType
  
  /** There is no appointment conflict. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentConflictType
  
  /** The appointment overlaps another appointment. */
  @js.native
  sealed trait overlap
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentConflictType
  
  val adjacent: adjacent with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val overlap: overlap with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentConflictType with java.lang.String
  ] = js.native
}

