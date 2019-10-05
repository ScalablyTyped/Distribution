package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information about a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactInformation")
@js.native
abstract class ContactInformation () extends js.Object {
  /** A read-only list of the custom fields stored with the contact. */
  var customFields: IVectorView[ContactField] = js.native
  /** A read-only list of email addresses stored with the contact. */
  var emails: IVectorView[ContactField] = js.native
  /** A read-only list of instant messaging accounts stored with the contact. */
  var instantMessages: IVectorView[ContactInstantMessageField] = js.native
  /** A read-only list of locations stored with the contact. */
  var locations: IVectorView[ContactLocationField] = js.native
  /** The name of the contact. */
  var name: String = js.native
  /** A read-only list of phone numbers stored with the contact. */
  var phoneNumbers: IVectorView[ContactField] = js.native
  /**
    * Gets the thumbnail image for the contact.
    * @return An object that provides access to the thumbnail image.
    */
  def getThumbnailAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  /**
    * Enables you to get the value for a custom field that is stored with a contact.
    * @param customName The name of the field.
    * @return The value of the field.
    */
  def queryCustomFields(customName: String): IVectorView[ContactField] = js.native
}

