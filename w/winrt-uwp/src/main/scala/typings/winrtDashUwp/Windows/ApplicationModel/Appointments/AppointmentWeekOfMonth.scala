package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
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
  sealed trait first extends AppointmentWeekOfMonth
  
  /** The appointment occurs on the fourth week of the month. */
  @js.native
  sealed trait fourth extends AppointmentWeekOfMonth
  
  /** The appointment occurs on the last week of the month. */
  @js.native
  sealed trait last extends AppointmentWeekOfMonth
  
  /** The appointment occurs on the second week of the month. */
  @js.native
  sealed trait second extends AppointmentWeekOfMonth
  
  /** The appointment occurs on the third week of the month. */
  @js.native
  sealed trait third extends AppointmentWeekOfMonth
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentWeekOfMonth with Double] = js.native
  /* 0 */ @js.native
  object first extends TopLevel[first with Double]
  
  /* 3 */ @js.native
  object fourth extends TopLevel[fourth with Double]
  
  /* 4 */ @js.native
  object last extends TopLevel[last with Double]
  
  /* 1 */ @js.native
  object second extends TopLevel[second with Double]
  
  /* 2 */ @js.native
  object third extends TopLevel[third with Double]
  
}

