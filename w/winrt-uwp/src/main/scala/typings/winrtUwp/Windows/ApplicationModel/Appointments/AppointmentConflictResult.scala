package typings.winrtUwp.Windows.ApplicationModel.Appointments

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a conflict between appointments. */
trait AppointmentConflictResult extends js.Object {
  /** Gets the date of the appointment conflict. */
  var date: Date
  /** Gets a value indicating the type of appointment conflict. */
  var `type`: AppointmentConflictType
}

object AppointmentConflictResult {
  @scala.inline
  def apply(date: Date, `type`: AppointmentConflictType): AppointmentConflictResult = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentConflictResult]
  }
}

