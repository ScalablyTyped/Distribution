package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.ContactField")
@js.native
class ContactField protected () extends IContactField {
  def this(value: java.lang.String, `type`: ContactFieldType) = this()
  def this(value: java.lang.String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
  def this(name: java.lang.String, value: java.lang.String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
  /* CompleteClass */
  override var category: ContactFieldCategory = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var `type`: ContactFieldType = js.native
  /* CompleteClass */
  override var value: java.lang.String = js.native
}

