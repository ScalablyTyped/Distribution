package typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.Contact")
@js.native
class Contact () extends IContact {
  /* CompleteClass */
  override var fields: IVector[IContactField] = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var thumbnail: IRandomAccessStreamReference = js.native
}

