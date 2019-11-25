package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactInformation extends js.Object {
  var customFields: IVectorView[ContactField]
  var emails: IVectorView[ContactField]
  var instantMessages: IVectorView[ContactInstantMessageField]
  var locations: IVectorView[ContactLocationField]
  var name: String
  var phoneNumbers: IVectorView[ContactField]
  def getThumbnailAsync(): IAsyncOperation[IRandomAccessStreamWithContentType]
  def queryCustomFields(customName: String): IVectorView[ContactField]
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
}

