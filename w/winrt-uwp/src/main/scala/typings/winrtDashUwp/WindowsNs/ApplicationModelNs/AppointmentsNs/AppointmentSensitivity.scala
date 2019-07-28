package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs

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
  sealed trait `private` extends AppointmentSensitivity
  
  /** The appointment is publicly available to view. */
  @js.native
  sealed trait public extends AppointmentSensitivity
  
  /* 1 */ val `private`: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentSensitivity.`private` with Double = js.native
  /* 0 */ val public: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentSensitivity.public with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentSensitivity with Double] = js.native
}

