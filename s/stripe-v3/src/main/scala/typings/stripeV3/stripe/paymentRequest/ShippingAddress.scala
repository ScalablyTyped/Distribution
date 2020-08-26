package typings.stripeV3.stripe.paymentRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingAddress extends js.Object {
  var addressLine: js.Array[String] = js.native
  var city: String = js.native
  var country: String = js.native
  var dependentLocality: js.UndefOr[String] = js.native
  var phone: String = js.native
  var postalCode: String = js.native
  var recipient: String = js.native
  var region: String = js.native
  var sortingCode: js.UndefOr[String] = js.native
}

object ShippingAddress {
  @scala.inline
  def apply(
    addressLine: js.Array[String],
    city: String,
    country: String,
    phone: String,
    postalCode: String,
    recipient: String,
    region: String
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal(addressLine = addressLine.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingAddress]
  }
  @scala.inline
  implicit class ShippingAddressOps[Self <: ShippingAddress] (val x: Self) extends AnyVal {
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
    def setAddressLineVarargs(value: String*): Self = this.set("addressLine", js.Array(value :_*))
    @scala.inline
    def setAddressLine(value: js.Array[String]): Self = this.set("addressLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipient(value: String): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependentLocality(value: String): Self = this.set("dependentLocality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependentLocality: Self = this.set("dependentLocality", js.undefined)
    @scala.inline
    def setSortingCode(value: String): Self = this.set("sortingCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortingCode: Self = this.set("sortingCode", js.undefined)
  }
  
}

