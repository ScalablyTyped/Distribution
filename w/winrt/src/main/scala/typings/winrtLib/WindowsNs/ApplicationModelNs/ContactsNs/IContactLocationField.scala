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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("postalCode")(postalCode)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("street")(street)
    __obj.updateDynamic("unstructuredAddress")(unstructuredAddress)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IContactLocationField]
  }
}

