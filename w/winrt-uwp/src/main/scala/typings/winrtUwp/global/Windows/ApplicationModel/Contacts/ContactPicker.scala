package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls how the Contact Picker user interface opens and what information it shows. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactPicker")
@js.native
/** Creates a new instance of the ContactPicker class. */
class ContactPicker ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactPicker {
  /** Sets the text for the confirmation button in the Contact Picker user interface. */
  /* CompleteClass */
  override var commitButtonText: String = js.native
  /** Sets the contact fields your app is interested in. */
  /* CompleteClass */
  override var desiredFields: IVector[String] = js.native
  /** Gets the ways to connect with a contact. */
  /* CompleteClass */
  override var desiredFieldsWithContactFieldType: IVector[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType] = js.native
  /** Controls whether the Contact Picker shows contacts as a complete entity or as a collection of fields. */
  /* CompleteClass */
  override var selectionMode: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactSelectionMode = js.native
  /**
    * Launches the Contact Picker to select a single contact.
    * @return The operation that launches the Contact Picker.
    */
  /* CompleteClass */
  override def pickContactAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact] = js.native
  /**
    * Launches the Contact Picker for selecting multiple contacts.
    * @return The operation that launches the contact picker.
    */
  /* CompleteClass */
  override def pickContactsAsync(): IPromiseWithIAsyncOperation[IVector[_]] = js.native
  /**
    * Launches the Contact Picker for selecting multiple contacts.
    * @return The operation that launches the contact picker.
    */
  /* CompleteClass */
  override def pickMultipleContactsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Launches the Contact Picker for selecting a single contact.
    * @return The operation that launches the Contact Picker.
    */
  /* CompleteClass */
  override def pickSingleContactAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactInformation] = js.native
}

