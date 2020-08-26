package typings.stripeV3.stripe

import typings.stripeV3.stripeV3Strings.not_supported
import typings.stripeV3.stripeV3Strings.optional
import typings.stripeV3.stripeV3Strings.recommended
import typings.stripeV3.stripeV3Strings.required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Card extends js.Object {
  var address_city: js.UndefOr[String] = js.native
  var address_country: js.UndefOr[String] = js.native
  var address_line1: js.UndefOr[String] = js.native
  var address_line1_check: js.UndefOr[checkType] = js.native
  var address_line2: js.UndefOr[String] = js.native
  var address_state: js.UndefOr[String] = js.native
  var address_zip: js.UndefOr[String] = js.native
  var address_zip_check: js.UndefOr[checkType] = js.native
  var brand: brandType = js.native
  var country: String = js.native
  var currency: js.UndefOr[String] = js.native
  var cvc_check: js.UndefOr[checkType] = js.native
  var dynamic_last4: String = js.native
  var exp_month: Double = js.native
  var exp_year: Double = js.native
  var fingerprint: String = js.native
  var funding: fundingType = js.native
  var id: String = js.native
  var last4: String = js.native
  var metadata: js.Any = js.native
  var name: js.UndefOr[String] = js.native
  var `object`: String = js.native
  var three_d_secure: js.UndefOr[required | recommended | optional | not_supported] = js.native
  var tokenization_method: js.UndefOr[tokenizationType] = js.native
}

object Card {
  @scala.inline
  def apply(
    brand: brandType,
    country: String,
    dynamic_last4: String,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: fundingType,
    id: String,
    last4: String,
    metadata: js.Any,
    `object`: String
  ): Card = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], dynamic_last4 = dynamic_last4.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  @scala.inline
  implicit class CardOps[Self <: Card] (val x: Self) extends AnyVal {
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
    def setBrand(value: brandType): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamic_last4(value: String): Self = this.set("dynamic_last4", value.asInstanceOf[js.Any])
    @scala.inline
    def setExp_month(value: Double): Self = this.set("exp_month", value.asInstanceOf[js.Any])
    @scala.inline
    def setExp_year(value: Double): Self = this.set("exp_year", value.asInstanceOf[js.Any])
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunding(value: fundingType): Self = this.set("funding", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast4(value: String): Self = this.set("last4", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress_city(value: String): Self = this.set("address_city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress_city: Self = this.set("address_city", js.undefined)
    @scala.inline
    def setAddress_country(value: String): Self = this.set("address_country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress_country: Self = this.set("address_country", js.undefined)
    @scala.inline
    def setAddress_line1(value: String): Self = this.set("address_line1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress_line1: Self = this.set("address_line1", js.undefined)
    @scala.inline
    def setAddress_line1_check(value: checkType): Self = this.set("address_line1_check", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress_line1_check: Self = this.set("address_line1_check", js.undefined)
    @scala.inline
    def setAddress_line2(value: String): Self = this.set("address_line2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress_line2: Self = this.set("address_line2", js.undefined)
    @scala.inline
    def setAddress_state(value: String): Self = this.set("address_state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress_state: Self = this.set("address_state", js.undefined)
    @scala.inline
    def setAddress_zip(value: String): Self = this.set("address_zip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress_zip: Self = this.set("address_zip", js.undefined)
    @scala.inline
    def setAddress_zip_check(value: checkType): Self = this.set("address_zip_check", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress_zip_check: Self = this.set("address_zip_check", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setCvc_check(value: checkType): Self = this.set("cvc_check", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCvc_check: Self = this.set("cvc_check", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setThree_d_secure(value: required | recommended | optional | not_supported): Self = this.set("three_d_secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThree_d_secure: Self = this.set("three_d_secure", js.undefined)
    @scala.inline
    def setTokenization_method(value: tokenizationType): Self = this.set("tokenization_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenization_method: Self = this.set("tokenization_method", js.undefined)
  }
  
}

