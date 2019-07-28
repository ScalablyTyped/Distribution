package typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs

import typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.Contact
import typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactPickerUI extends js.Object {
  var desiredFields: IVectorView[String]
  var oncontactremoved: js.Any
  var selectionMode: ContactSelectionMode
  def addContact(id: String, contact: Contact): AddContactResult
  def containsContact(id: String): Boolean
  def removeContact(id: String): Unit
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
    val __obj = js.Dynamic.literal(addContact = js.Any.fromFunction2(addContact), containsContact = js.Any.fromFunction1(containsContact), desiredFields = desiredFields, oncontactremoved = oncontactremoved, removeContact = js.Any.fromFunction1(removeContact), selectionMode = selectionMode)
  
    __obj.asInstanceOf[IContactPickerUI]
  }
}

