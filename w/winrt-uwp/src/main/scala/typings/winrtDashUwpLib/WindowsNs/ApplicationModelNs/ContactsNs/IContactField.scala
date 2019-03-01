package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an object that describes a piece of contact data. */
trait IContactField extends js.Object {
  /** Gets the category for the contact data. */
  var category: ContactFieldCategory
  /** Gets the name of the field. */
  var name: java.lang.String
  /** Gets the contact field type for the data. */
  var `type`: ContactFieldType
  /** Gets the value of the contact data. */
  var value: java.lang.String
}

object IContactField {
  @scala.inline
  def apply(
    category: ContactFieldCategory,
    name: java.lang.String,
    `type`: ContactFieldType,
    value: java.lang.String
  ): IContactField = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IContactField]
  }
}

