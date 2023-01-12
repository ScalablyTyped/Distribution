package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContactInformation extends StObject {
  
  var customFields: IVectorView[ContactField]
  
  var emails: IVectorView[ContactField]
  
  def getThumbnailAsync(): IAsyncOperation[IRandomAccessStreamWithContentType]
  
  var instantMessages: IVectorView[ContactInstantMessageField]
  
  var locations: IVectorView[ContactLocationField]
  
  var name: String
  
  var phoneNumbers: IVectorView[ContactField]
  
  def queryCustomFields(customName: String): IVectorView[ContactField]
}
object IContactInformation {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IContactInformation] (val x: Self) extends AnyVal {
    
    inline def setCustomFields(value: IVectorView[ContactField]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setEmails(value: IVectorView[ContactField]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setGetThumbnailAsync(value: () => IAsyncOperation[IRandomAccessStreamWithContentType]): Self = StObject.set(x, "getThumbnailAsync", js.Any.fromFunction0(value))
    
    inline def setInstantMessages(value: IVectorView[ContactInstantMessageField]): Self = StObject.set(x, "instantMessages", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: IVectorView[ContactLocationField]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbers(value: IVectorView[ContactField]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setQueryCustomFields(value: String => IVectorView[ContactField]): Self = StObject.set(x, "queryCustomFields", js.Any.fromFunction1(value))
  }
}
