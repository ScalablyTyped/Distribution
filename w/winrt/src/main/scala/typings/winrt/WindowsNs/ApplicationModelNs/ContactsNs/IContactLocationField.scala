package typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactLocationField extends IContactField {
  var city: String
  var country: String
  var postalCode: String
  var region: String
  var street: String
  var unstructuredAddress: String
}

object IContactLocationField {
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
  ): IContactLocationField = {
    val __obj = js.Dynamic.literal(category = category, city = city, country = country, name = name, postalCode = postalCode, region = region, street = street, unstructuredAddress = unstructuredAddress, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IContactLocationField]
  }
}

