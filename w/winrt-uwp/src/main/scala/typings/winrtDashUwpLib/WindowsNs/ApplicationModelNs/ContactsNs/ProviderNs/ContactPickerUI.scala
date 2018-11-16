package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows you to call the contact picker UI so you can select one or more contacts. */
@JSGlobal("Windows.ApplicationModel.Contacts.Provider.ContactPickerUI")
@js.native
abstract class ContactPickerUI () extends js.Object {
  /** Specifies the fields that you want returned after the user selects one or more contacts. */
  var desiredFields: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets the fields with contact field type that you want returned after the user selects one or more contacts. */
  var desiredFieldsWithContactFieldType: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType] = js.native
  /** Occurs when the user deselects or removes the contact. */
  @JSName("oncontactremoved")
  var oncontactremoved_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ContactPickerUI, ContactRemovedEventArgs] = js.native
  /** Determines the selection mode for the contact picker. The most common options are PickSingleContactAsync or PickMultipleContactsAsync . */
  var selectionMode: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode = js.native
  /**
                       * Adds a Contact .
                       * @param contact An object that contains the contact's information.
                       * @return An AddContactResult -typed value that indicates whether the contact was added successfully.
                       */
  def addContact(contact: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.Contact): AddContactResult = js.native
  /**
                       * Adds a Contact .
                       * @param id The ID for the contact.
                       * @param contact An object that contains the contact's information.
                       * @return An AddContactResult -typed value that indicates whether the contact was added successfully.
                       */
  def addContact(id: java.lang.String, contact: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.Contact): AddContactResult = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contactremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.contactremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ContactPickerUI, ContactRemovedEventArgs]
  ): scala.Unit = js.native
  /**
                       * Checks to see whether the contact was already selected by the user.
                       * @param id The ID of the contact.
                       * @return True if the contact has already been selected; otherwise, false.
                       */
  def containsContact(id: java.lang.String): scala.Boolean = js.native
  /** Occurs when the user deselects or removes the contact. */
  def oncontactremoved(ev: ContactRemovedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ContactPickerUI]): scala.Unit = js.native
  /**
                       * Removes a contact.
                       * @param id The ID of the contact to remove.
                       */
  def removeContact(id: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contactremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.contactremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ContactPickerUI, ContactRemovedEventArgs]
  ): scala.Unit = js.native
}

