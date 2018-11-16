package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.ContactInformation")
@js.native
class ContactInformation () extends IContactInformation {
  /* CompleteClass */
  override var customFields: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField] = js.native
  /* CompleteClass */
  override var emails: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField] = js.native
  /* CompleteClass */
  override var instantMessages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactInstantMessageField] = js.native
  /* CompleteClass */
  override var locations: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactLocationField] = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var phoneNumbers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField] = js.native
  /* CompleteClass */
  override def getThumbnailAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType] = js.native
  /* CompleteClass */
  override def queryCustomFields(customName: java.lang.String): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactField] = js.native
}

