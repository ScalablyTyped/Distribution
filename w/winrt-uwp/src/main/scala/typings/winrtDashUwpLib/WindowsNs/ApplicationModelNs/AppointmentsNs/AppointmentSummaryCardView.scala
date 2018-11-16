package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

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
  sealed trait app
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentSummaryCardView
  
  /** The appointment summary card is displayed by the system. */
  @js.native
  sealed trait system
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentSummaryCardView
  
  val app: app with java.lang.String = js.native
  val system: system with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentSummaryCardView with java.lang.String
  ] = js.native
}

