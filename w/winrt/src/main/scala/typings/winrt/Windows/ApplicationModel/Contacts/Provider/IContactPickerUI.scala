package typings.winrt.Windows.ApplicationModel.Contacts.Provider

import typings.winrt.Windows.ApplicationModel.Contacts.Contact
import typings.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode
import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContactPickerUI extends js.Object {
  var desiredFields: IVectorView[String] = js.native
  var oncontactremoved: js.Any = js.native
  var selectionMode: ContactSelectionMode = js.native
  def addContact(id: String, contact: Contact): AddContactResult = js.native
  def containsContact(id: String): Boolean = js.native
  def removeContact(id: String): Unit = js.native
}

object IContactPickerUI {
  @scala.inline
  def apply(
    addContact: (String, Contact) => AddContactResult,
    containsContact: String => Boolean,
    desiredFields: IVectorView[String],
    oncontactremoved: js.Any,
    removeContact: String => Unit,
    selectionMode: ContactSelectionMode
  ): IContactPickerUI = {
    val __obj = js.Dynamic.literal(addContact = js.Any.fromFunction2(addContact), containsContact = js.Any.fromFunction1(containsContact), desiredFields = desiredFields.asInstanceOf[js.Any], oncontactremoved = oncontactremoved.asInstanceOf[js.Any], removeContact = js.Any.fromFunction1(removeContact), selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactPickerUI]
  }
  @scala.inline
  implicit class IContactPickerUIOps[Self <: IContactPickerUI] (val x: Self) extends AnyVal {
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
    def setAddContact(value: (String, Contact) => AddContactResult): Self = this.set("addContact", js.Any.fromFunction2(value))
    @scala.inline
    def setContainsContact(value: String => Boolean): Self = this.set("containsContact", js.Any.fromFunction1(value))
    @scala.inline
    def setDesiredFields(value: IVectorView[String]): Self = this.set("desiredFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setOncontactremoved(value: js.Any): Self = this.set("oncontactremoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveContact(value: String => Unit): Self = this.set("removeContact", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectionMode(value: ContactSelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
  }
  
}

