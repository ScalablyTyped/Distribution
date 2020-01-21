package typings.stripe.mod.countrySpecs

import typings.stripe.AnonCompany
import typings.stripe.mod.IResourceObject
import typings.stripe.stripeStrings.country_spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICountrySpec extends IResourceObject {
  /**
    * The default currency for this country. This applies to both payment methods and bank accounts.
    */
  var default_currency: String
  /**
    * Value is "country_spec"
    */
  @JSName("object")
  var object_ICountrySpec: country_spec
  /**
    * Currencies that can be accepted in the specified country (for payments).
    */
  var supported_payment_currencies: js.Array[String]
  /**
    * Payment methods available in the specified country. You will need to enable bitcoin and ACH payments on your account for those methods to
    * appear in this list. The stripe payment method refers to charging through your platform.
    */
  var supported_payment_methods: js.Array[String]
  /**
    * Lists the types of verification data needed to keep an account open. Includes 'minimum' fields, which every account must eventually
    * provide, as well as a 'additional' fields, which are only required for some merchants.
    */
  var verification_fields: AnonCompany
}

object ICountrySpec {
  @scala.inline
  def apply(
    default_currency: String,
    id: String,
    `object`: country_spec,
    supported_payment_currencies: js.Array[String],
    supported_payment_methods: js.Array[String],
    verification_fields: AnonCompany
  ): ICountrySpec = {
    val __obj = js.Dynamic.literal(default_currency = default_currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], supported_payment_currencies = supported_payment_currencies.asInstanceOf[js.Any], supported_payment_methods = supported_payment_methods.asInstanceOf[js.Any], verification_fields = verification_fields.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICountrySpec]
  }
}

