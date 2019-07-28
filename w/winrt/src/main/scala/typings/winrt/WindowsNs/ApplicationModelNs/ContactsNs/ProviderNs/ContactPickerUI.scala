package typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs

import typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.Contact
import typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.Provider.ContactPickerUI")
@js.native
class ContactPickerUI () extends IContactPickerUI {
  /* CompleteClass */
  override var desiredFields: IVectorView[String] = js.native
  /* CompleteClass */
  override var oncontactremoved: js.Any = js.native
  /* CompleteClass */
  override var selectionMode: ContactSelectionMode = js.native
  /* CompleteClass */
  override def addContact(id: String, contact: Contact): AddContactResult = js.native
  /* CompleteClass */
  override def containsContact(id: String): Boolean = js.native
  /* CompleteClass */
  override def removeContact(id: String): Unit = js.native
}

