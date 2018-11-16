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

