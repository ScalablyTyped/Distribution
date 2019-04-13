package typings
package stripeLib.stripeMod.countrySpecsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICountrySpec
  extends stripeLib.stripeMod.IResourceObject {
  /**
    * The default currency for this country. This applies to both payment methods and bank accounts.
    */
  var default_currency: java.lang.String
  /**
    * Value is "country_spec"
    */
  @JSName("object")
  var object_ICountrySpec: stripeLib.stripeLibStrings.country_spec
  /**
    * Currencies that can be accepted in the specified country (for payments).
    */
  var supported_payment_currencies: js.Array[java.lang.String]
  /**
    * Payment methods available in the specified country. You will need to enable bitcoin and ACH payments on your account for those methods to
    * appear in this list. The stripe payment method refers to charging through your platform.
    */
  var supported_payment_methods: js.Array[java.lang.String]
  /**
    * Lists the types of verification data needed to keep an account open. Includes 'minimum' fields, which every account must eventually
    * provide, as well as a 'additional' fields, which are only required for some merchants.
    */
  var verification_fields: stripeLib.Anon_Company
}

object ICountrySpec {
  @scala.inline
  def apply(
    default_currency: java.lang.String,
    id: java.lang.String,
    `object`: stripeLib.stripeLibStrings.country_spec,
    supported_payment_currencies: js.Array[java.lang.String],
    supported_payment_methods: js.Array[java.lang.String],
    verification_fields: stripeLib.Anon_Company
  ): ICountrySpec = {
    val __obj = js.Dynamic.literal(default_currency = default_currency, id = id, supported_payment_currencies = supported_payment_currencies, supported_payment_methods = supported_payment_methods, verification_fields = verification_fields)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[ICountrySpec]
  }
}

