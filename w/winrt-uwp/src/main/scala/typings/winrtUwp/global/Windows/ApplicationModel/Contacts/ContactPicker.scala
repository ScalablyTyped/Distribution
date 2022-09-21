package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls how the Contact Picker user interface opens and what information it shows. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactPicker")
@js.native
/** Creates a new instance of the ContactPicker class. */
open class ContactPicker ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactPicker {
  
  /** Sets the text for the confirmation button in the Contact Picker user interface. */
  /* CompleteClass */
  var commitButtonText: String = js.native
  
  /** Sets the contact fields your app is interested in. */
  /* CompleteClass */
  var desiredFields: IVector[String] = js.native
  
  /** Gets the ways to connect with a contact. */
  /* CompleteClass */
  var desiredFieldsWithContactFieldType: IVector[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType] = js.native
  
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
  override def pickContactsAsync(): IPromiseWithIAsyncOperation[IVector[Any]] = js.native
  
  /**
    * Launches the Contact Picker for selecting multiple contacts.
    * @return The operation that launches the contact picker.
    */
  /* CompleteClass */
  override def pickMultipleContactsAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
  
  /**
    * Launches the Contact Picker for selecting a single contact.
    * @return The operation that launches the Contact Picker.
    */
  /* CompleteClass */
  override def pickSingleContactAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactInformation] = js.native
  
  /** Controls whether the Contact Picker shows contacts as a complete entity or as a collection of fields. */
  /* CompleteClass */
  var selectionMode: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactSelectionMode = js.native
}
