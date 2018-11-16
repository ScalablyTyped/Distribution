package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls how the Contact Picker user interface opens and what information it shows. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactPicker")
@js.native
class ContactPicker () extends js.Object {
  /** Sets the text for the confirmation button in the Contact Picker user interface. */
  var commitButtonText: java.lang.String = js.native
  /** Sets the contact fields your app is interested in. */
  var desiredFields: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets the ways to connect with a contact. */
  var desiredFieldsWithContactFieldType: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ContactFieldType] = js.native
  /** Controls whether the Contact Picker shows contacts as a complete entity or as a collection of fields. */
  var selectionMode: ContactSelectionMode = js.native
  /**
                   * Launches the Contact Picker to select a single contact.
                   * @return The operation that launches the Contact Picker.
                   */
  def pickContactAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[Contact] = js.native
  /**
                   * Launches the Contact Picker for selecting multiple contacts.
                   * @return The operation that launches the contact picker.
                   */
  def pickContactsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[_]] = js.native
  /**
                   * Launches the Contact Picker for selecting multiple contacts.
                   * @return The operation that launches the contact picker.
                   */
  def pickMultipleContactsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Launches the Contact Picker for selecting a single contact.
                   * @return The operation that launches the Contact Picker.
                   */
  def pickSingleContactAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ContactInformation] = js.native
}

