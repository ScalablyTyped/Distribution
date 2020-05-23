package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email address of a contact. */
trait ContactEmail extends js.Object {
  /** Gets and sets the email address of a contact. The maximum string length for the description is 321 characters. */
  var address: String
  /** Gets and sets the description of an email address of a contact. The maximum string length for the description is 512 characters. */
  var description: String
  /** Gets and sets the kind of email address of a contact. */
  var kind: ContactEmailKind
}

object ContactEmail {
  @scala.inline
  def apply(address: String, description: String, kind: ContactEmailKind): ContactEmail = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactEmail]
  }
}

