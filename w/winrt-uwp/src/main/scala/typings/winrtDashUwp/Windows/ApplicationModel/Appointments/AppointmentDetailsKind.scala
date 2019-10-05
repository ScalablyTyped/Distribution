package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentDetailsKind extends js.Object

/** Defines the type of content in appointment details. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentDetailsKind")
@js.native
object AppointmentDetailsKind extends js.Object {
  /** Content is in HTML markup. */
  @js.native
  sealed trait html extends AppointmentDetailsKind
  
  /** Content is in plain text. */
  @js.native
  sealed trait plainText extends AppointmentDetailsKind
  
  /* 1 */ val html: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentDetailsKind.html with Double = js.native
  /* 0 */ val plainText: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentDetailsKind.plainText with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentDetailsKind with Double] = js.native
}

