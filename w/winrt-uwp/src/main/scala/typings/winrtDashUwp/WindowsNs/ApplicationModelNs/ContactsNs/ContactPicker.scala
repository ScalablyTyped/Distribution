package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls how the Contact Picker user interface opens and what information it shows. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactPicker")
@js.native
/** Creates a new instance of the ContactPicker class. */
class ContactPicker () extends js.Object {
  /** Sets the text for the confirmation button in the Contact Picker user interface. */
  var commitButtonText: String = js.native
  /** Sets the contact fields your app is interested in. */
  var desiredFields: IVector[String] = js.native
  /** Gets the ways to connect with a contact. */
  var desiredFieldsWithContactFieldType: IVector[ContactFieldType] = js.native
  /** Controls whether the Contact Picker shows contacts as a complete entity or as a collection of fields. */
  var selectionMode: ContactSelectionMode = js.native
  /**
    * Launches the Contact Picker to select a single contact.
    * @return The operation that launches the Contact Picker.
    */
  def pickContactAsync(): IPromiseWithIAsyncOperation[Contact] = js.native
  /**
    * Launches the Contact Picker for selecting multiple contacts.
    * @return The operation that launches the contact picker.
    */
  def pickContactsAsync(): IPromiseWithIAsyncOperation[IVector[_]] = js.native
  /**
    * Launches the Contact Picker for selecting multiple contacts.
    * @return The operation that launches the contact picker.
    */
  def pickMultipleContactsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Launches the Contact Picker for selecting a single contact.
    * @return The operation that launches the Contact Picker.
    */
  def pickSingleContactAsync(): IPromiseWithIAsyncOperation[ContactInformation] = js.native
}

