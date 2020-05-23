package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls how the Contact Picker user interface opens and what information it shows. */
trait ContactPicker extends js.Object {
  /** Sets the text for the confirmation button in the Contact Picker user interface. */
  var commitButtonText: String
  /** Sets the contact fields your app is interested in. */
  var desiredFields: IVector[String]
  /** Gets the ways to connect with a contact. */
  var desiredFieldsWithContactFieldType: IVector[ContactFieldType]
  /** Controls whether the Contact Picker shows contacts as a complete entity or as a collection of fields. */
  var selectionMode: ContactSelectionMode
  /**
    * Launches the Contact Picker to select a single contact.
    * @return The operation that launches the Contact Picker.
    */
  def pickContactAsync(): IPromiseWithIAsyncOperation[Contact]
  /**
    * Launches the Contact Picker for selecting multiple contacts.
    * @return The operation that launches the contact picker.
    */
  def pickContactsAsync(): IPromiseWithIAsyncOperation[IVector[_]]
  /**
    * Launches the Contact Picker for selecting multiple contacts.
    * @return The operation that launches the contact picker.
    */
  def pickMultipleContactsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]]
  /**
    * Launches the Contact Picker for selecting a single contact.
    * @return The operation that launches the Contact Picker.
    */
  def pickSingleContactAsync(): IPromiseWithIAsyncOperation[ContactInformation]
}

object ContactPicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    desiredFields: IVector[String],
    desiredFieldsWithContactFieldType: IVector[ContactFieldType],
    pickContactAsync: () => IPromiseWithIAsyncOperation[Contact],
    pickContactsAsync: () => IPromiseWithIAsyncOperation[IVector[_]],
    pickMultipleContactsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
    pickSingleContactAsync: () => IPromiseWithIAsyncOperation[ContactInformation],
    selectionMode: ContactSelectionMode
  ): ContactPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], desiredFields = desiredFields.asInstanceOf[js.Any], desiredFieldsWithContactFieldType = desiredFieldsWithContactFieldType.asInstanceOf[js.Any], pickContactAsync = js.Any.fromFunction0(pickContactAsync), pickContactsAsync = js.Any.fromFunction0(pickContactsAsync), pickMultipleContactsAsync = js.Any.fromFunction0(pickMultipleContactsAsync), pickSingleContactAsync = js.Any.fromFunction0(pickSingleContactAsync), selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactPicker]
  }
}

