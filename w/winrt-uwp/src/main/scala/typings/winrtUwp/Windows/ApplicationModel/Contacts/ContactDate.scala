package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an important date for a contact. */
trait ContactDate extends js.Object {
  /** Gets and sets the day for an important date for a contact. */
  var day: Double
  /** Gets and sets the description for an important date for a contact. The maximum string length for the description is 512 characters. */
  var description: String
  /** Gets and sets the kind of important date for a contact. */
  var kind: ContactDateKind
  /** Gets and sets the month for an important date for a contact. */
  var month: Double
  /** Gets and sets the year for an important date for a contact. */
  var year: Double
}

object ContactDate {
  @scala.inline
  def apply(day: Double, description: String, kind: ContactDateKind, month: Double, year: Double): ContactDate = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactDate]
  }
}

