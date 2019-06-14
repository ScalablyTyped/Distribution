package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentWeekOfMonth extends js.Object

/** Specifies the week of the month for which the appointment occurs. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentWeekOfMonth")
@js.native
object AppointmentWeekOfMonth extends js.Object {
  /** The appointment occurs on the first week of the month. */
  @js.native
  sealed trait first
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentWeekOfMonth
  
  /** The appointment occurs on the fourth week of the month. */
  @js.native
  sealed trait fourth
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentWeekOfMonth
  
  /** The appointment occurs on the last week of the month. */
  @js.native
  sealed trait last
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentWeekOfMonth
  
  /** The appointment occurs on the second week of the month. */
  @js.native
  sealed trait second
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentWeekOfMonth
  
  /** The appointment occurs on the third week of the month. */
  @js.native
  sealed trait third
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentWeekOfMonth
  
  /* 0 */ val first: first with scala.Double = js.native
  /* 3 */ val fourth: fourth with scala.Double = js.native
  /* 4 */ val last: last with scala.Double = js.native
  /* 1 */ val second: second with scala.Double = js.native
  /* 2 */ val third: third with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentWeekOfMonth with scala.Double
  ] = js.native
}

