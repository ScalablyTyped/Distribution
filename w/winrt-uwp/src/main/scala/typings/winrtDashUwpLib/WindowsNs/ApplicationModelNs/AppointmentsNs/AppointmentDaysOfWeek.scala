package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

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
  sealed trait friday
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek
  
  /** The appointment occurs on Monday. */
  @js.native
  sealed trait monday
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek
  
  /** The appointment doesn't occur on any days of the week. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek
  
  /** The appointment occurs on Saturday. */
  @js.native
  sealed trait saturday
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek
  
  /** The appointment occurs on Sunday. */
  @js.native
  sealed trait sunday
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek
  
  /** The appointment occurs on Thursday. */
  @js.native
  sealed trait thursday
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek
  
  /** The appointment occurs on Tuesday. */
  @js.native
  sealed trait tuesday
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek
  
  /** The appointment occurs on Wednesday. */
  @js.native
  sealed trait wednesday
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek
  
  val friday: friday with java.lang.String = js.native
  val monday: monday with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val saturday: saturday with java.lang.String = js.native
  val sunday: sunday with java.lang.String = js.native
  val thursday: thursday with java.lang.String = js.native
  val tuesday: tuesday with java.lang.String = js.native
  val wednesday: wednesday with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDaysOfWeek with java.lang.String
  ] = js.native
}

