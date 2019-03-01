package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactField extends js.Object {
  var category: ContactFieldCategory
  var name: java.lang.String
  var `type`: ContactFieldType
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

