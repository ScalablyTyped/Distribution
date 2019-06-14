package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentCalendarOtherAppWriteAccess extends js.Object

/** Specifies the level of write access provided to an app calendar. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentCalendarOtherAppWriteAccess")
@js.native
object AppointmentCalendarOtherAppWriteAccess extends js.Object {
  /** Only the app that created the calendar can write to it. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarOtherAppWriteAccess
  
  /** The operating system can write to the calendar. */
  @js.native
  sealed trait systemOnly
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarOtherAppWriteAccess
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val systemOnly: systemOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarOtherAppWriteAccess with scala.Double
  ] = js.native
}

