package typings
package stripeLib.stripeMod.cardsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hash describing the card used to make the charge
  */
trait ICardHash
  extends stripeLib.stripeMod.IResourceObject
     with stripeLib.stripeMod.ICardHashInfo {
  /**
    * Value is 'card'
    */
  @JSName("object")
  var object_ICardHash: stripeLib.stripeLibStrings.card
}

object ICardHash {
  @scala.inline
  def apply(
    brand: stripeLib.stripeLibStrings.Visa | (stripeLib.stripeLibStrings.`American Express`) | stripeLib.stripeLibStrings.MasterCard | stripeLib.stripeLibStrings.Discover | stripeLib.stripeLibStrings.JCB | (stripeLib.stripeLibStrings.`Diners Club`) | stripeLib.stripeLibStrings.Unknown,
    country: java.lang.String,
    cvc_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.fail | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked,
    exp_month: scala.Double,
    exp_year: scala.Double,
    fingerprint: java.lang.String,
    funding: stripeLib.stripeLibStrings.credit | stripeLib.stripeLibStrings.debit | stripeLib.stripeLibStrings.prepaid | stripeLib.stripeLibStrings.unknown,
    id: java.lang.String,
    last4: java.lang.String,
    `object`: stripeLib.stripeLibStrings.card,
    address_city: java.lang.String = null,
    address_country: java.lang.String = null,
    address_line1: java.lang.String = null,
    address_line1_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.fail | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked = null,
    address_line2: java.lang.String = null,
    address_state: java.lang.String = null,
    address_zip: java.lang.String = null,
    address_zip_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.fail | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked = null,
    dynamic_last4: java.lang.String = null,
    metadata: stripeLib.stripeMod.IMetadata = null,
    name: java.lang.String = null,
    number: java.lang.String = null,
    tokenization_method: stripeLib.stripeLibStrings.apple_pay | stripeLib.stripeLibStrings.android_pay = null
  ): ICardHash = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country, cvc_check = cvc_check.asInstanceOf[js.Any], exp_month = exp_month, exp_year = exp_year, fingerprint = fingerprint, funding = funding.asInstanceOf[js.Any], id = id, last4 = last4)
    __obj.updateDynamic("object")(`object`)
    if (address_city != null) __obj.updateDynamic("address_city")(address_city)
    if (address_country != null) __obj.updateDynamic("address_country")(address_country)
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1)
    if (address_line1_check != null) __obj.updateDynamic("address_line1_check")(address_line1_check.asInstanceOf[js.Any])
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2)
    if (address_state != null) __obj.updateDynamic("address_state")(address_state)
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip)
    if (address_zip_check != null) __obj.updateDynamic("address_zip_check")(address_zip_check.asInstanceOf[js.Any])
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (number != null) __obj.updateDynamic("number")(number)
    if (tokenization_method != null) __obj.updateDynamic("tokenization_method")(tokenization_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardHash]
  }
}

