package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentDetailsKind.html
import typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentDetailsKind.plainText
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentDetailsKind with Double] = js.native
  /* 1 */ @js.native
  object html extends TopLevel[html with Double]
  
  /* 0 */ @js.native
  object plainText extends TopLevel[plainText with Double]
  
}

