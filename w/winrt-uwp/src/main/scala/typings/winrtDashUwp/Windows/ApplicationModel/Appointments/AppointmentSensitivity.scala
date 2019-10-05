package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

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
  
  /* 1 */ val `private`: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentSensitivity.`private` with Double = js.native
  /* 0 */ val public: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentSensitivity.public with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentSensitivity with Double] = js.native
}

