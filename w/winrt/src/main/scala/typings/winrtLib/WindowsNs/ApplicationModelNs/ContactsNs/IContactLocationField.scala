package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactLocationField extends IContactField {
  var city: java.lang.String
  var country: java.lang.String
  var postalCode: java.lang.String
  var region: java.lang.String
  var street: java.lang.String
  var unstructuredAddress: java.lang.String
}

object IContactLocationField {
  @scala.inline
  def apply(
    category: ContactFieldCategory,
    city: java.lang.String,
    country: java.lang.String,
    name: java.lang.String,
    postalCode: java.lang.String,
    region: java.lang.String,
    street: java.lang.String,
    `type`: ContactFieldType,
    unstructuredAddress: java.lang.String,
    value: java.lang.String
  ): IContactLocationField = {
    val __obj = js.Dynamic.literal(category = category, city = city, country = country, name = name, postalCode = postalCode, region = region, street = street, unstructuredAddress = unstructuredAddress, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IContactLocationField]
  }
}

