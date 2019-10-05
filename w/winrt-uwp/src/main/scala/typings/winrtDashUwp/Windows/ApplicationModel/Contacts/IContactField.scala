package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an object that describes a piece of contact data. */
trait IContactField extends js.Object {
  /** Gets the category for the contact data. */
  var category: ContactFieldCategory
  /** Gets the name of the field. */
  var name: String
  /** Gets the contact field type for the data. */
  var `type`: ContactFieldType
  /** Gets the value of the contact data. */
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

