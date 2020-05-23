package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents info about the phone for a contact. */
trait ContactPhone extends js.Object {
  /** Gets and sets the description of the phone for a contact. The maximum string length for the description is 512 characters. */
  var description: String
  /** Gets and sets the kind of phone for a contact. */
  var kind: ContactPhoneKind
  /** Gets and sets the phone number of a phone for a contact. The maximum string length for the phone number is 50 characters. */
  var number: String
}

object ContactPhone {
  @scala.inline
  def apply(description: String, kind: ContactPhoneKind, number: String): ContactPhone = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactPhone]
  }
}

