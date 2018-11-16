package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentRecurrenceUnit extends js.Object

/** Specifies the frequency for which an appointment occurs. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentRecurrenceUnit")
@js.native
object AppointmentRecurrenceUnit extends js.Object {
  /** Appointment occurs daily. */
  @js.native
  sealed trait daily
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentRecurrenceUnit
  
  /** Appointment occurs monthly. */
  @js.native
  sealed trait monthly
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentRecurrenceUnit
  
  /** Appointment occurs monthly on a particular day of the month. */
  @js.native
  sealed trait monthlyOnDay
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentRecurrenceUnit
  
  /** Appointment occurs weekly. */
  @js.native
  sealed trait weekly
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentRecurrenceUnit
  
  /** Appointment occurs yearly. */
  @js.native
  sealed trait yearly
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentRecurrenceUnit
  
  /** Appointment occurs yearly on a particular day of the year. */
  @js.native
  sealed trait yearlyOnDay
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentRecurrenceUnit
  
  val daily: daily with java.lang.String = js.native
  val monthly: monthly with java.lang.String = js.native
  val monthlyOnDay: monthlyOnDay with java.lang.String = js.native
  val weekly: weekly with java.lang.String = js.native
  val yearly: yearly with java.lang.String = js.native
  val yearlyOnDay: yearlyOnDay with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentRecurrenceUnit with java.lang.String
  ] = js.native
}

