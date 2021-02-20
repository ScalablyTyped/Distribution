package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the information about a contact. */
@js.native
trait ContactInformation extends StObject {
  
  /** A read-only list of the custom fields stored with the contact. */
  var customFields: IVectorView[ContactField] = js.native
  
  /** A read-only list of email addresses stored with the contact. */
  var emails: IVectorView[ContactField] = js.native
  
  /**
    * Gets the thumbnail image for the contact.
    * @return An object that provides access to the thumbnail image.
    */
  def getThumbnailAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  
  /** A read-only list of instant messaging accounts stored with the contact. */
  var instantMessages: IVectorView[ContactInstantMessageField] = js.native
  
  /** A read-only list of locations stored with the contact. */
  var locations: IVectorView[ContactLocationField] = js.native
  
  /** The name of the contact. */
  var name: String = js.native
  
  /** A read-only list of phone numbers stored with the contact. */
  var phoneNumbers: IVectorView[ContactField] = js.native
  
  /**
    * Enables you to get the value for a custom field that is stored with a contact.
    * @param customName The name of the field.
    * @return The value of the field.
    */
  def queryCustomFields(customName: String): IVectorView[ContactField] = js.native
}
object ContactInformation {
  
  @scala.inline
  def apply(
    customFields: IVectorView[ContactField],
    emails: IVectorView[ContactField],
    getThumbnailAsync: () => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType],
    instantMessages: IVectorView[ContactInstantMessageField],
    locations: IVectorView[ContactLocationField],
    name: String,
    phoneNumbers: IVectorView[ContactField],
    queryCustomFields: String => IVectorView[ContactField]
  ): ContactInformation = {
    val __obj = js.Dynamic.literal(customFields = customFields.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], getThumbnailAsync = js.Any.fromFunction0(getThumbnailAsync), instantMessages = instantMessages.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phoneNumbers = phoneNumbers.asInstanceOf[js.Any], queryCustomFields = js.Any.fromFunction1(queryCustomFields))
    __obj.asInstanceOf[ContactInformation]
  }
  
  @scala.inline
  implicit class ContactInformationMutableBuilder[Self <: ContactInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomFields(value: IVectorView[ContactField]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmails(value: IVectorView[ContactField]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetThumbnailAsync(value: () => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]): Self = StObject.set(x, "getThumbnailAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstantMessages(value: IVectorView[ContactInstantMessageField]): Self = StObject.set(x, "instantMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: IVectorView[ContactLocationField]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumbers(value: IVectorView[ContactField]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryCustomFields(value: String => IVectorView[ContactField]): Self = StObject.set(x, "queryCustomFields", js.Any.fromFunction1(value))
  }
}
