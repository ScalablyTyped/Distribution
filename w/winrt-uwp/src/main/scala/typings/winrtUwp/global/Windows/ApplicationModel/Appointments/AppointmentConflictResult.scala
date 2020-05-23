package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a conflict between appointments. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentConflictResult")
@js.native
abstract class AppointmentConflictResult ()
  extends typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentConflictResult {
  /** Gets the date of the appointment conflict. */
  /* CompleteClass */
  override var date: Date = js.native
  /** Gets a value indicating the type of appointment conflict. */
  /* CompleteClass */
  override var `type`: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentConflictType = js.native
}

