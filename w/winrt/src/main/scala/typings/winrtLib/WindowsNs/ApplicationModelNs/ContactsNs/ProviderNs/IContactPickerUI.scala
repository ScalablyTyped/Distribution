package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactPickerUI extends js.Object {
  var desiredFields: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var oncontactremoved: js.Any
  var selectionMode: winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode
  def addContact(id: java.lang.String, contact: winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.Contact): AddContactResult
  def containsContact(id: java.lang.String): scala.Boolean
  def removeContact(id: java.lang.String): scala.Unit
}

object IContactPickerUI {
  @scala.inline
  def apply(
    addContact: js.Function2[
      java.lang.String, 
      winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.Contact, 
      AddContactResult
    ],
    containsContact: js.Function1[java.lang.String, scala.Boolean],
    desiredFields: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    oncontactremoved: js.Any,
    removeContact: js.Function1[java.lang.String, scala.Unit],
    selectionMode: winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode
  ): IContactPickerUI = {
    val __obj = js.Dynamic.literal(addContact = addContact, containsContact = containsContact, desiredFields = desiredFields, oncontactremoved = oncontactremoved, removeContact = removeContact, selectionMode = selectionMode)
  
    __obj.asInstanceOf[IContactPickerUI]
  }
}

