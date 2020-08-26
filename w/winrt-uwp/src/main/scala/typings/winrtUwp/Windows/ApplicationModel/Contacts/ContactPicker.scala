package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls how the Contact Picker user interface opens and what information it shows. */
@js.native
trait ContactPicker extends js.Object {
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
  @scala.inline
  implicit class ContactPickerOps[Self <: ContactPicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommitButtonText(value: String): Self = this.set("commitButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesiredFields(value: IVector[String]): Self = this.set("desiredFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesiredFieldsWithContactFieldType(value: IVector[ContactFieldType]): Self = this.set("desiredFieldsWithContactFieldType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPickContactAsync(value: () => IPromiseWithIAsyncOperation[Contact]): Self = this.set("pickContactAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setPickContactsAsync(value: () => IPromiseWithIAsyncOperation[IVector[_]]): Self = this.set("pickContactsAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setPickMultipleContactsAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = this.set("pickMultipleContactsAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setPickSingleContactAsync(value: () => IPromiseWithIAsyncOperation[ContactInformation]): Self = this.set("pickSingleContactAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setSelectionMode(value: ContactSelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
  }
  
}

