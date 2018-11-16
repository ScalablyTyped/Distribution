package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.Provider.ContactPickerUI")
@js.native
class ContactPickerUI () extends IContactPickerUI {
  /* CompleteClass */
  override var desiredFields: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /* CompleteClass */
  override var oncontactremoved: js.Any = js.native
  /* CompleteClass */
  override var selectionMode: winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode = js.native
  /* CompleteClass */
  override def addContact(id: java.lang.String, contact: winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.Contact): AddContactResult = js.native
  /* CompleteClass */
  override def containsContact(id: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def removeContact(id: java.lang.String): scala.Unit = js.native
}

