package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

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
  
  /* 6 */ val friday: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentDaysOfWeek.friday with Double = js.native
  /* 2 */ val monday: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentDaysOfWeek.monday with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentDaysOfWeek.none with Double = js.native
  /* 7 */ val saturday: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentDaysOfWeek.saturday with Double = js.native
  /* 1 */ val sunday: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentDaysOfWeek.sunday with Double = js.native
  /* 5 */ val thursday: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentDaysOfWeek.thursday with Double = js.native
  /* 3 */ val tuesday: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentDaysOfWeek.tuesday with Double = js.native
  /* 4 */ val wednesday: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentDaysOfWeek.wednesday with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentDaysOfWeek with Double] = js.native
}

