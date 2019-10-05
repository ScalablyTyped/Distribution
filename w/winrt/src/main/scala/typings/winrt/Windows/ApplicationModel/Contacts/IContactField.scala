package typings.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactField extends js.Object {
  var category: ContactFieldCategory
  var name: String
  var `type`: ContactFieldType
  var value: String
}

object IContactField {
  @scala.inline
  def apply(category: ContactFieldCategory, name: String, `type`: ContactFieldType, value: String): IContactField = {
    val __obj = js.Dynamic.literal(category = category, name = name, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IContactField]
  }
}

