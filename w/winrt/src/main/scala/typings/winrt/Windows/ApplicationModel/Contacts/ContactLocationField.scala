package typings.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.ContactLocationField")
@js.native
class ContactLocationField protected () extends IContactLocationField {
  def this(unstructuredAddress: String) = this()
  def this(unstructuredAddress: String, category: ContactFieldCategory) = this()
  def this(
    unstructuredAddress: String,
    category: ContactFieldCategory,
    street: String,
    city: String,
    region: String,
    country: String,
    postalCode: String
  ) = this()
  /* CompleteClass */
  override var category: ContactFieldCategory = js.native
  /* CompleteClass */
  override var city: String = js.native
  /* CompleteClass */
  override var country: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var postalCode: String = js.native
  /* CompleteClass */
  override var region: String = js.native
  /* CompleteClass */
  override var street: String = js.native
  /* CompleteClass */
  override var `type`: ContactFieldType = js.native
  /* CompleteClass */
  override var unstructuredAddress: String = js.native
  /* CompleteClass */
  override var value: String = js.native
}

