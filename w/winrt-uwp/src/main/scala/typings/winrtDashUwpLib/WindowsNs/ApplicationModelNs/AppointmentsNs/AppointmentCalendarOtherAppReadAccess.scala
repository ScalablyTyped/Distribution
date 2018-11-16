package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentCalendarOtherAppReadAccess extends js.Object

/** Specifies the level of read access provided to an app calendar. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentCalendarOtherAppReadAccess")
@js.native
object AppointmentCalendarOtherAppReadAccess extends js.Object {
  /** Other apps on the device can read all properties of appointments in the calendar. */
  @js.native
  sealed trait full
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarOtherAppReadAccess
  
  /** Other apps on the device can read the Subject , StartTime , Duration , AllDay , LocalId properties of appointments in the calendar and the LocalId property of the calendar */
  @js.native
  sealed trait limited
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarOtherAppReadAccess
  
  /** Only the operating system can read data from the app calendar. */
  @js.native
  sealed trait systemOnly
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarOtherAppReadAccess
  
  val full: full with java.lang.String = js.native
  val limited: limited with java.lang.String = js.native
  val systemOnly: systemOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentCalendarOtherAppReadAccess with java.lang.String
  ] = js.native
}

