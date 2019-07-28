package typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.ContactPicker")
@js.native
class ContactPicker () extends IContactPicker {
  /* CompleteClass */
  override var commitButtonText: String = js.native
  /* CompleteClass */
  override var desiredFields: IVector[String] = js.native
  /* CompleteClass */
  override var selectionMode: ContactSelectionMode = js.native
  /* CompleteClass */
  override def pickMultipleContactsAsync(): IAsyncOperation[IVectorView[ContactInformation]] = js.native
  /* CompleteClass */
  override def pickSingleContactAsync(): IAsyncOperation[ContactInformation] = js.native
}

