package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentSummaryCardView extends js.Object

/** Specifies how the summary card for an appointment is displayed. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentSummaryCardView")
@js.native
object AppointmentSummaryCardView extends js.Object {
  /** The appointment summary card is displayed by the app that owns the appointment calendar. */
  @js.native
  sealed trait app extends AppointmentSummaryCardView
  
  /** The appointment summary card is displayed by the system. */
  @js.native
  sealed trait system extends AppointmentSummaryCardView
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentSummaryCardView with Double] = js.native
  /* 1 */ @js.native
  object app extends TopLevel[app with Double]
  
  /* 0 */ @js.native
  object system extends TopLevel[system with Double]
  
}

