package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information about a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactInformation")
@js.native
abstract class ContactInformation ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactInformation {
  /** A read-only list of the custom fields stored with the contact. */
  /* CompleteClass */
  override var customFields: IVectorView[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactField] = js.native
  /** A read-only list of email addresses stored with the contact. */
  /* CompleteClass */
  override var emails: IVectorView[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactField] = js.native
  /** A read-only list of instant messaging accounts stored with the contact. */
  /* CompleteClass */
  override var instantMessages: IVectorView[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactInstantMessageField] = js.native
  /** A read-only list of locations stored with the contact. */
  /* CompleteClass */
  override var locations: IVectorView[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactLocationField] = js.native
  /** The name of the contact. */
  /* CompleteClass */
  override var name: String = js.native
  /** A read-only list of phone numbers stored with the contact. */
  /* CompleteClass */
  override var phoneNumbers: IVectorView[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactField] = js.native
  /**
    * Gets the thumbnail image for the contact.
    * @return An object that provides access to the thumbnail image.
    */
  /* CompleteClass */
  override def getThumbnailAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  /**
    * Enables you to get the value for a custom field that is stored with a contact.
    * @param customName The name of the field.
    * @return The value of the field.
    */
  /* CompleteClass */
  override def queryCustomFields(customName: String): IVectorView[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactField] = js.native
}

