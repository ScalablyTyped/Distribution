package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentDaysOfWeek extends js.Object

/** Specifies the days of the week on which an appointment occurs. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentDaysOfWeek")
@js.native
object AppointmentDaysOfWeek extends js.Object {
  /** The appointment occurs on Friday. */
  @js.native
  sealed trait friday extends AppointmentDaysOfWeek
  
  /** The appointment occurs on Monday. */
  @js.native
  sealed trait monday extends AppointmentDaysOfWeek
  
  /** The appointment doesn't occur on any days of the week. */
  @js.native
  sealed trait none extends AppointmentDaysOfWeek
  
  /** The appointment occurs on Saturday. */
  @js.native
  sealed trait saturday extends AppointmentDaysOfWeek
  
  /** The appointment occurs on Sunday. */
  @js.native
  sealed trait sunday extends AppointmentDaysOfWeek
  
  /** The appointment occurs on Thursday. */
  @js.native
  sealed trait thursday extends AppointmentDaysOfWeek
  
  /** The appointment occurs on Tuesday. */
  @js.native
  sealed trait tuesday extends AppointmentDaysOfWeek
  
  /** The appointment occurs on Wednesday. */
  @js.native
  sealed trait wednesday extends AppointmentDaysOfWeek
  
  /* 6 */ val friday: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek.friday with Double = js.native
  /* 2 */ val monday: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek.monday with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek.none with Double = js.native
  /* 7 */ val saturday: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek.saturday with Double = js.native
  /* 1 */ val sunday: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek.sunday with Double = js.native
  /* 5 */ val thursday: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek.thursday with Double = js.native
  /* 3 */ val tuesday: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek.tuesday with Double = js.native
  /* 4 */ val wednesday: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek.wednesday with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentDaysOfWeek with Double] = js.native
}

