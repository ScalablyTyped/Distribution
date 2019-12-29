package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentDaysOfWeek with Double] = js.native
  /* 6 */ @js.native
  object friday extends TopLevel[friday with Double]
  
  /* 2 */ @js.native
  object monday extends TopLevel[monday with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 7 */ @js.native
  object saturday extends TopLevel[saturday with Double]
  
  /* 1 */ @js.native
  object sunday extends TopLevel[sunday with Double]
  
  /* 5 */ @js.native
  object thursday extends TopLevel[thursday with Double]
  
  /* 3 */ @js.native
  object tuesday extends TopLevel[tuesday with Double]
  
  /* 4 */ @js.native
  object wednesday extends TopLevel[wednesday with Double]
  
}

