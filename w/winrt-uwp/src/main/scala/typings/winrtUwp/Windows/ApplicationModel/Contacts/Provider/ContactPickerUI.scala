package typings.winrtUwp.Windows.ApplicationModel.Contacts.Provider

import typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact
import typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType
import typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactSelectionMode
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.contactremoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows you to call the contact picker UI so you can select one or more contacts. */
@js.native
trait ContactPickerUI extends js.Object {
  /** Specifies the fields that you want returned after the user selects one or more contacts. */
  var desiredFields: IVectorView[String] = js.native
  /** Gets the fields with contact field type that you want returned after the user selects one or more contacts. */
  var desiredFieldsWithContactFieldType: IVector[ContactFieldType] = js.native
  /** Occurs when the user deselects or removes the contact. */
  @JSName("oncontactremoved")
  var oncontactremoved_Original: TypedEventHandler[ContactPickerUI, ContactRemovedEventArgs] = js.native
  /** Determines the selection mode for the contact picker. The most common options are PickSingleContactAsync or PickMultipleContactsAsync . */
  var selectionMode: ContactSelectionMode = js.native
  /**
    * Adds a Contact .
    * @param contact An object that contains the contact's information.
    * @return An AddContactResult -typed value that indicates whether the contact was added successfully.
    */
  def addContact(contact: Contact): AddContactResult = js.native
  /**
    * Adds a Contact .
    * @param id The ID for the contact.
    * @param contact An object that contains the contact's information.
    * @return An AddContactResult -typed value that indicates whether the contact was added successfully.
    */
  def addContact(id: String, contact: Contact): AddContactResult = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contactremoved(`type`: contactremoved, listener: TypedEventHandler[ContactPickerUI, ContactRemovedEventArgs]): Unit = js.native
  /**
    * Checks to see whether the contact was already selected by the user.
    * @param id The ID of the contact.
    * @return True if the contact has already been selected; otherwise, false.
    */
  def containsContact(id: String): Boolean = js.native
  /** Occurs when the user deselects or removes the contact. */
  def oncontactremoved(ev: ContactRemovedEventArgs with WinRTEvent[ContactPickerUI]): Unit = js.native
  /**
    * Removes a contact.
    * @param id The ID of the contact to remove.
    */
  def removeContact(id: String): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contactremoved(`type`: contactremoved, listener: TypedEventHandler[ContactPickerUI, ContactRemovedEventArgs]): Unit = js.native
}

