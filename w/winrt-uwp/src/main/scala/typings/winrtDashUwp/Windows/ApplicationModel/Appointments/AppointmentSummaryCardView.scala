package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

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
  
  /* 1 */ val app: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentSummaryCardView.app with Double = js.native
  /* 0 */ val system: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentSummaryCardView.system with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentSummaryCardView with Double] = js.native
}

