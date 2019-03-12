package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactInformation extends js.Object {
  var customFields: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField]
  var emails: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField]
  var instantMessages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactInstantMessageField]
  var locations: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactLocationField]
  var name: java.lang.String
  var phoneNumbers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField]
  def getThumbnailAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType]
  def queryCustomFields(customName: java.lang.String): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField]
}

object IContactInformation {
  @scala.inline
  def apply(
    customFields: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField],
    emails: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField],
    getThumbnailAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType],
    instantMessages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactInstantMessageField],
    locations: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactLocationField],
    name: java.lang.String,
    phoneNumbers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField],
    queryCustomFields: java.lang.String => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField]
  ): IContactInformation = {
    val __obj = js.Dynamic.literal(customFields = customFields, emails = emails, getThumbnailAsync = js.Any.fromFunction0(getThumbnailAsync), instantMessages = instantMessages, locations = locations, name = name, phoneNumbers = phoneNumbers, queryCustomFields = js.Any.fromFunction1(queryCustomFields))
  
    __obj.asInstanceOf[IContactInformation]
  }
}

