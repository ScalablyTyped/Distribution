package typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.ContactField")
@js.native
class ContactField protected () extends IContactField {
  def this(value: String, `type`: ContactFieldType) = this()
  def this(value: String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
  def this(name: String, value: String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
  /* CompleteClass */
  override var category: ContactFieldCategory = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var `type`: ContactFieldType = js.native
  /* CompleteClass */
  override var value: String = js.native
}

