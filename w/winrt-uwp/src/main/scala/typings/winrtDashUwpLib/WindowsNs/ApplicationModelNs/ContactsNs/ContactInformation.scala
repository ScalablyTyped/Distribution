package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information about a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactInformation")
@js.native
abstract class ContactInformation () extends js.Object {
  /** A read-only list of the custom fields stored with the contact. */
  var customFields: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField] = js.native
  /** A read-only list of email addresses stored with the contact. */
  var emails: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField] = js.native
  /** A read-only list of instant messaging accounts stored with the contact. */
  var instantMessages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactInstantMessageField] = js.native
  /** A read-only list of locations stored with the contact. */
  var locations: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactLocationField] = js.native
  /** The name of the contact. */
  var name: java.lang.String = js.native
  /** A read-only list of phone numbers stored with the contact. */
  var phoneNumbers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField] = js.native
  /**
    * Gets the thumbnail image for the contact.
    * @return An object that provides access to the thumbnail image.
    */
  def getThumbnailAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType] = js.native
  /**
    * Enables you to get the value for a custom field that is stored with a contact.
    * @param customName The name of the field.
    * @return The value of the field.
    */
  def queryCustomFields(customName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField] = js.native
}

