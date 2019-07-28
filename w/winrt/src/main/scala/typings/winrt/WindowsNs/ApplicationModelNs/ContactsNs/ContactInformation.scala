package typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.ContactInformation")
@js.native
class ContactInformation () extends IContactInformation {
  /* CompleteClass */
  override var customFields: IVectorView[ContactField] = js.native
  /* CompleteClass */
  override var emails: IVectorView[ContactField] = js.native
  /* CompleteClass */
  override var instantMessages: IVectorView[ContactInstantMessageField] = js.native
  /* CompleteClass */
  override var locations: IVectorView[ContactLocationField] = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var phoneNumbers: IVectorView[ContactField] = js.native
  /* CompleteClass */
  override def getThumbnailAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  /* CompleteClass */
  override def queryCustomFields(customName: String): IVectorView[ContactField] = js.native
}

