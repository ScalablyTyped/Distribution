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
    getThumbnailAsync: js.Function0[
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType]
    ],
    instantMessages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactInstantMessageField],
    locations: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactLocationField],
    name: java.lang.String,
    phoneNumbers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField],
    queryCustomFields: js.Function1[
      java.lang.String, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField]
    ]
  ): IContactInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customFields")(customFields)
    __obj.updateDynamic("emails")(emails)
    __obj.updateDynamic("getThumbnailAsync")(getThumbnailAsync)
    __obj.updateDynamic("instantMessages")(instantMessages)
    __obj.updateDynamic("locations")(locations)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("phoneNumbers")(phoneNumbers)
    __obj.updateDynamic("queryCustomFields")(queryCustomFields)
    __obj.asInstanceOf[IContactInformation]
  }
}

