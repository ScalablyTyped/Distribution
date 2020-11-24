package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContactInformation extends js.Object {
  
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
  implicit class IContactInformationOps[Self <: IContactInformation] (val x: Self) extends AnyVal {
    
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
    def setCustomFields(value: IVectorView[ContactField]): Self = this.set("customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmails(value: IVectorView[ContactField]): Self = this.set("emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetThumbnailAsync(value: () => IAsyncOperation[IRandomAccessStreamWithContentType]): Self = this.set("getThumbnailAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstantMessages(value: IVectorView[ContactInstantMessageField]): Self = this.set("instantMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: IVectorView[ContactLocationField]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumbers(value: IVectorView[ContactField]): Self = this.set("phoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryCustomFields(value: String => IVectorView[ContactField]): Self = this.set("queryCustomFields", js.Any.fromFunction1(value))
  }
}
