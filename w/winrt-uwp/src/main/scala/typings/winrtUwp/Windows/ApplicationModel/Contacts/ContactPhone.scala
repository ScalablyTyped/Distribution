package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents info about the phone for a contact. */
@js.native
trait ContactPhone extends js.Object {
  /** Gets and sets the description of the phone for a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  /** Gets and sets the kind of phone for a contact. */
  var kind: ContactPhoneKind = js.native
  /** Gets and sets the phone number of a phone for a contact. The maximum string length for the phone number is 50 characters. */
  var number: String = js.native
}

object ContactPhone {
  @scala.inline
  def apply(description: String, kind: ContactPhoneKind, number: String): ContactPhone = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactPhone]
  }
  @scala.inline
  implicit class ContactPhoneOps[Self <: ContactPhone] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ContactPhoneKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
  }
  
}

