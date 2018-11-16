package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

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
  sealed trait html
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDetailsKind
  
  /** Content is in plain text. */
  @js.native
  sealed trait plainText
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDetailsKind
  
  val html: html with java.lang.String = js.native
  val plainText: plainText with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentDetailsKind with java.lang.String
  ] = js.native
}

