package typings.winrtUwp.Windows.ApplicationModel.Appointments

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
  
}

