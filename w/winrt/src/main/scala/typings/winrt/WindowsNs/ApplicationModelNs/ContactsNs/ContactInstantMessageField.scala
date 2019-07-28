package typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs

import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.ContactInstantMessageField")
@js.native
class ContactInstantMessageField protected () extends IContactInstantMessageField {
  def this(userName: String) = this()
  def this(userName: String, category: ContactFieldCategory) = this()
  def this(userName: String, category: ContactFieldCategory, service: String, displayText: String, verb: Uri) = this()
  /* CompleteClass */
  override var category: ContactFieldCategory = js.native
  /* CompleteClass */
  override var displayText: String = js.native
  /* CompleteClass */
  override var launchUri: Uri = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var service: String = js.native
  /* CompleteClass */
  override var `type`: ContactFieldType = js.native
  /* CompleteClass */
  override var userName: String = js.native
  /* CompleteClass */
  override var value: String = js.native
}

