package typings.winrtUwp.Windows.ApplicationModel.Appointments

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a conflict between appointments. */
@js.native
trait AppointmentConflictResult extends js.Object {
  /** Gets the date of the appointment conflict. */
  var date: Date = js.native
  /** Gets a value indicating the type of appointment conflict. */
  var `type`: AppointmentConflictType = js.native
}

object AppointmentConflictResult {
  @scala.inline
  def apply(date: Date, `type`: AppointmentConflictType): AppointmentConflictResult = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentConflictResult]
  }
  @scala.inline
  implicit class AppointmentConflictResultOps[Self <: AppointmentConflictResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: AppointmentConflictType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

