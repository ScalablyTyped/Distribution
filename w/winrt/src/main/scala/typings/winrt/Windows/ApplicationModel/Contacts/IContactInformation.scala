package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContactInformation extends StObject {
  
  var customFields: IVectorView[ContactField] = js.native
  
  var emails: IVectorView[ContactField] = js.native
  
  def getThumbnailAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  
  var instantMessages: IVectorView[ContactInstantMessageField] = js.native
  
  var locations: IVectorView[ContactLocationField] = js.native
  
  var name: String = js.native
  
  var phoneNumbers: IVectorView[ContactField] = js.native
  
  def queryCustomFields(customName: String): IVectorView[ContactField] = js.native
}
object IContactInformation {
  
  @scala.inline
  def apply(
    customFields: IVectorView[ContactField],
    emails: IVectorView[ContactField],
    getThumbnailAsync: () => IAsyncOperation[IRandomAccessStreamWithContentType],
    instantMessages: IVectorView[ContactInstantMessageField],
    locations: IVectorView[ContactLocationField],
    name: String,
    phoneNumbers: IVectorView[ContactField],
    queryCustomFields: String => IVectorView[ContactField]
  ): IContactInformation = {
    val __obj = js.Dynamic.literal(customFields = customFields.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], getThumbnailAsync = js.Any.fromFunction0(getThumbnailAsync), instantMessages = instantMessages.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phoneNumbers = phoneNumbers.asInstanceOf[js.Any], queryCustomFields = js.Any.fromFunction1(queryCustomFields))
    __obj.asInstanceOf[IContactInformation]
  }
  
  @scala.inline
  implicit class IContactInformationMutableBuilder[Self <: IContactInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomFields(value: IVectorView[ContactField]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmails(value: IVectorView[ContactField]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetThumbnailAsync(value: () => IAsyncOperation[IRandomAccessStreamWithContentType]): Self = StObject.set(x, "getThumbnailAsync", js.Any.fromFunction0(value))
    
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
