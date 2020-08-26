package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email address of a contact. */
@js.native
trait ContactEmail extends js.Object {
  /** Gets and sets the email address of a contact. The maximum string length for the description is 321 characters. */
  var address: String = js.native
  /** Gets and sets the description of an email address of a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  /** Gets and sets the kind of email address of a contact. */
  var kind: ContactEmailKind = js.native
}

object ContactEmail {
  @scala.inline
  def apply(address: String, description: String, kind: ContactEmailKind): ContactEmail = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactEmail]
  }
  @scala.inline
  implicit class ContactEmailOps[Self <: ContactEmail] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ContactEmailKind): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

