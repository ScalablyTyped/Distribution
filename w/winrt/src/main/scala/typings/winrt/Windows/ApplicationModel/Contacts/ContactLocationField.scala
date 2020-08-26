package typings.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactLocationField extends IContactLocationField

object ContactLocationField {
  @scala.inline
  def apply(
    category: ContactFieldCategory,
    city: String,
    country: String,
    name: String,
    postalCode: String,
    region: String,
    street: String,
    `type`: ContactFieldType,
    unstructuredAddress: String,
    value: String
  ): ContactLocationField = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], unstructuredAddress = unstructuredAddress.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactLocationField]
  }
}

