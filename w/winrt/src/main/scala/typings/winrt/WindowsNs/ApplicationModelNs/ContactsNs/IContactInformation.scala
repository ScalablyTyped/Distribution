package typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType
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
    val __obj = js.Dynamic.literal(customFields = customFields, emails = emails, getThumbnailAsync = js.Any.fromFunction0(getThumbnailAsync), instantMessages = instantMessages, locations = locations, name = name, phoneNumbers = phoneNumbers, queryCustomFields = js.Any.fromFunction1(queryCustomFields))
  
    __obj.asInstanceOf[IContactInformation]
  }
}

