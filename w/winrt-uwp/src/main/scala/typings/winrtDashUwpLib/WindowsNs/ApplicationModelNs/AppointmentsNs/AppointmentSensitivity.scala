package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentSensitivity extends js.Object

/** Specifies the sensitivity of an appointment. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentSensitivity")
@js.native
object AppointmentSensitivity extends js.Object {
  /** The appointment is private and can't be viewed publicly. */
  @js.native
  sealed trait `private`
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentSensitivity
  
  /** The appointment is publicly available to view. */
  @js.native
  sealed trait public
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentSensitivity
  
  /* 1 */ val `private`: `private` with scala.Double = js.native
  /* 0 */ val public: public with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentSensitivity with scala.Double
  ] = js.native
}

