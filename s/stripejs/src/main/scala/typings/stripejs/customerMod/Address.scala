package typings.stripejs.customerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  /**
    * City/District/Suburb/Town/Village.
    */
  var city: String = js.native
  /**
    * Two-letter country code, capitalized
    * NOTE: The codes are specified by the ISO3166 alpha-2
    */
  var country: String = js.native
  /**
    * Address line 1 (Street address/PO Box/Company name).
    */
  var line1: String = js.native
  /**
    * Address line 2 (Apartment/Suite/Unit/Building).
    */
  var line2: String = js.native
  /**
    * ZIP or postal code
    */
  var postal_code: String = js.native
  /**
    * State/County/Province/Region.
    */
  var state: String = js.native
}

object Address {
  @scala.inline
  def apply(city: String, country: String, line1: String, line2: String, postal_code: String, state: String): Address = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], line2 = line2.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine1(value: String): Self = this.set("line1", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine2(value: String): Self = this.set("line2", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostal_code(value: String): Self = this.set("postal_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

