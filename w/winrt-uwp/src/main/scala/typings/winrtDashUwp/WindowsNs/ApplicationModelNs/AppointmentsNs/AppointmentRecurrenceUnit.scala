package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs

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
  sealed trait daily extends AppointmentRecurrenceUnit
  
  /** Appointment occurs monthly. */
  @js.native
  sealed trait monthly extends AppointmentRecurrenceUnit
  
  /** Appointment occurs monthly on a particular day of the month. */
  @js.native
  sealed trait monthlyOnDay extends AppointmentRecurrenceUnit
  
  /** Appointment occurs weekly. */
  @js.native
  sealed trait weekly extends AppointmentRecurrenceUnit
  
  /** Appointment occurs yearly. */
  @js.native
  sealed trait yearly extends AppointmentRecurrenceUnit
  
  /** Appointment occurs yearly on a particular day of the year. */
  @js.native
  sealed trait yearlyOnDay extends AppointmentRecurrenceUnit
  
  /* 0 */ val daily: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentRecurrenceUnit.daily with Double = js.native
  /* 2 */ val monthly: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentRecurrenceUnit.monthly with Double = js.native
  /* 3 */ val monthlyOnDay: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentRecurrenceUnit.monthlyOnDay with Double = js.native
  /* 1 */ val weekly: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentRecurrenceUnit.weekly with Double = js.native
  /* 4 */ val yearly: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentRecurrenceUnit.yearly with Double = js.native
  /* 5 */ val yearlyOnDay: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentRecurrenceUnit.yearlyOnDay with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentRecurrenceUnit with Double] = js.native
}

