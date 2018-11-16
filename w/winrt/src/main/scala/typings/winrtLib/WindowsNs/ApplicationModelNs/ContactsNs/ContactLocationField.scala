package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.ContactLocationField")
@js.native
class ContactLocationField protected () extends IContactLocationField {
  def this(unstructuredAddress: java.lang.String) = this()
  def this(unstructuredAddress: java.lang.String, category: ContactFieldCategory) = this()
  def this(unstructuredAddress: java.lang.String, category: ContactFieldCategory, street: java.lang.String, city: java.lang.String, region: java.lang.String, country: java.lang.String, postalCode: java.lang.String) = this()
  /* CompleteClass */
  override var category: ContactFieldCategory = js.native
  /* CompleteClass */
  override var city: java.lang.String = js.native
  /* CompleteClass */
  override var country: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var postalCode: java.lang.String = js.native
  /* CompleteClass */
  override var region: java.lang.String = js.native
  /* CompleteClass */
  override var street: java.lang.String = js.native
  /* CompleteClass */
  override var `type`: ContactFieldType = js.native
  /* CompleteClass */
  override var unstructuredAddress: java.lang.String = js.native
  /* CompleteClass */
  override var value: java.lang.String = js.native
}

