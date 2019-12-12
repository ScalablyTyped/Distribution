package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentRecurrenceUnit.daily
import typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentRecurrenceUnit.monthly
import typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentRecurrenceUnit.monthlyOnDay
import typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentRecurrenceUnit.weekly
import typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentRecurrenceUnit.yearly
import typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentRecurrenceUnit.yearlyOnDay
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentRecurrenceUnit with Double] = js.native
  /* 0 */ @js.native
  object daily extends TopLevel[daily with Double]
  
  /* 2 */ @js.native
  object monthly extends TopLevel[monthly with Double]
  
  /* 3 */ @js.native
  object monthlyOnDay extends TopLevel[monthlyOnDay with Double]
  
  /* 1 */ @js.native
  object weekly extends TopLevel[weekly with Double]
  
  /* 4 */ @js.native
  object yearly extends TopLevel[yearly with Double]
  
  /* 5 */ @js.native
  object yearlyOnDay extends TopLevel[yearlyOnDay with Double]
  
}

