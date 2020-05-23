package typings.winrtUwp.Windows.ApplicationModel.Appointments

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
  
}

