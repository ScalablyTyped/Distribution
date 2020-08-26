package typings.winrt.Windows.ApplicationModel.Contacts.Provider

import typings.winrt.Windows.ApplicationModel.Contacts.Contact
import typings.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode
import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactPickerUI extends IContactPickerUI

object ContactPickerUI {
  @scala.inline
  def apply(
    addContact: (String, Contact) => AddContactResult,
    containsContact: String => Boolean,
    desiredFields: IVectorView[String],
    oncontactremoved: js.Any,
    removeContact: String => Unit,
    selectionMode: ContactSelectionMode
  ): ContactPickerUI = {
    val __obj = js.Dynamic.literal(addContact = js.Any.fromFunction2(addContact), containsContact = js.Any.fromFunction1(containsContact), desiredFields = desiredFields.asInstanceOf[js.Any], oncontactremoved = oncontactremoved.asInstanceOf[js.Any], removeContact = js.Any.fromFunction1(removeContact), selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactPickerUI]
  }
}

