package typings.stripe.mod.countrySpecs

import typings.stripe.anon.Company
import typings.stripe.mod.IResourceObject
import typings.stripe.stripeStrings.country_spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICountrySpec extends IResourceObject {
  /**
    * The default currency for this country. This applies to both payment methods and bank accounts.
    */
  var default_currency: String = js.native
  /**
    * Value is "country_spec"
    */
  @JSName("object")
  var object_ICountrySpec: country_spec = js.native
  /**
    * Currencies that can be accepted in the specified country (for payments).
    */
  var supported_payment_currencies: js.Array[String] = js.native
  /**
    * Payment methods available in the specified country. You will need to enable bitcoin and ACH payments on your account for those methods to
    * appear in this list. The stripe payment method refers to charging through your platform.
    */
  var supported_payment_methods: js.Array[String] = js.native
  /**
    * Lists the types of verification data needed to keep an account open. Includes 'minimum' fields, which every account must eventually
    * provide, as well as a 'additional' fields, which are only required for some merchants.
    */
  var verification_fields: Company = js.native
}

object ICountrySpec {
  @scala.inline
  def apply(
    default_currency: String,
    id: String,
    `object`: country_spec,
    supported_payment_currencies: js.Array[String],
    supported_payment_methods: js.Array[String],
    verification_fields: Company
  ): ICountrySpec = {
    val __obj = js.Dynamic.literal(default_currency = default_currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], supported_payment_currencies = supported_payment_currencies.asInstanceOf[js.Any], supported_payment_methods = supported_payment_methods.asInstanceOf[js.Any], verification_fields = verification_fields.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICountrySpec]
  }
  @scala.inline
  implicit class ICountrySpecOps[Self <: ICountrySpec] (val x: Self) extends AnyVal {
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
    def setDefault_currency(value: String): Self = this.set("default_currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: country_spec): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported_payment_currenciesVarargs(value: String*): Self = this.set("supported_payment_currencies", js.Array(value :_*))
    @scala.inline
    def setSupported_payment_currencies(value: js.Array[String]): Self = this.set("supported_payment_currencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported_payment_methodsVarargs(value: String*): Self = this.set("supported_payment_methods", js.Array(value :_*))
    @scala.inline
    def setSupported_payment_methods(value: js.Array[String]): Self = this.set("supported_payment_methods", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerification_fields(value: Company): Self = this.set("verification_fields", value.asInstanceOf[js.Any])
  }
  
}

