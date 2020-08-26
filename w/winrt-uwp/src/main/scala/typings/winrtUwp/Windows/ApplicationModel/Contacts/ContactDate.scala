package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an important date for a contact. */
@js.native
trait ContactDate extends js.Object {
  /** Gets and sets the day for an important date for a contact. */
  var day: Double = js.native
  /** Gets and sets the description for an important date for a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  /** Gets and sets the kind of important date for a contact. */
  var kind: ContactDateKind = js.native
  /** Gets and sets the month for an important date for a contact. */
  var month: Double = js.native
  /** Gets and sets the year for an important date for a contact. */
  var year: Double = js.native
}

object ContactDate {
  @scala.inline
  def apply(day: Double, description: String, kind: ContactDateKind, month: Double, year: Double): ContactDate = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactDate]
  }
  @scala.inline
  implicit class ContactDateOps[Self <: ContactDate] (val x: Self) extends AnyVal {
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
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ContactDateKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
  }
  
}

