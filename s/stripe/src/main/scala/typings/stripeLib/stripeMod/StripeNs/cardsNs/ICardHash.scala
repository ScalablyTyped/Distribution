package typings
package stripeLib.stripeMod.StripeNs.cardsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hash describing the card used to make the charge
  */
trait ICardHash
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  var address_city: java.lang.String | scala.Null
  /**
    * Billing address country, if provided when creating card
    */
  var address_country: java.lang.String | scala.Null
  var address_line1: java.lang.String | scala.Null
  /**
    * If address_line1 was provided, results of the check: pass, fail, unavailable, or unchecked.
    */
  var address_line1_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.fail | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked | scala.Null
  var address_line2: java.lang.String | scala.Null
  var address_state: java.lang.String | scala.Null
  var address_zip: java.lang.String | scala.Null
  /**
    * If address_zip was provided, results of the check: pass, fail, unavailable, or unchecked.
    */
  var address_zip_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.fail | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked | scala.Null
  /**
    * Card brand. Can be Visa, American Express, MasterCard, Discover, JCB, Diners Club, or Unknown.
    */
  var brand: stripeLib.stripeLibStrings.Visa | (stripeLib.stripeLibStrings.`American Express`) | stripeLib.stripeLibStrings.MasterCard | stripeLib.stripeLibStrings.Discover | stripeLib.stripeLibStrings.JCB | (stripeLib.stripeLibStrings.`Diners Club`) | stripeLib.stripeLibStrings.Unknown
  /**
    * Two-letter ISO code representing the country of the card. You could use this
    * attribute to get a sense of the international breakdown of cards you've collected.
    */
  var country: java.lang.String
  /**
    * If a CVC was provided, results of the check: pass, fail, unavailable, or unchecked
    */
  var cvc_check: stripeLib.stripeLibStrings.pass | stripeLib.stripeLibStrings.fail | stripeLib.stripeLibStrings.unavailable | stripeLib.stripeLibStrings.unchecked
  /**
    * (For Apple Pay integrations only.) The last four digits of the device account number.
    */
  var dynamic_last4: java.lang.String | scala.Null
  var exp_month: scala.Double
  var exp_year: scala.Double
  /**
    * Uniquely identifies this particular card number. You can use this attribute to check
    * whether two customers who've signed up with you are using the same card number, for example.
    */
  var fingerprint: java.lang.String
  /**
    * Card funding type. Can be credit, debit, prepaid, or unknown
    */
  var funding: stripeLib.stripeLibStrings.credit | stripeLib.stripeLibStrings.debit | stripeLib.stripeLibStrings.prepaid | stripeLib.stripeLibStrings.unknown
  var last4: java.lang.String
  var metadata: js.UndefOr[stripeLib.stripeMod.StripeNs.IMetadata] = js.undefined
  /**
    * Cardholder name
    */
  var name: java.lang.String | scala.Null
  /**
    * The card number
    */
  var number: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Value is 'card'
    */
  @JSName("object")
  var object_ICardHash: stripeLib.stripeLibStrings.card
  /**
    * If the card number is tokenized, this is the method that was
    * used. Can be "apple_pay" or "android_pay".
    */
  var tokenization_method: stripeLib.stripeLibStrings.apple_pay | stripeLib.stripeLibStrings.android_pay | scala.Null
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
    metadata: stripeLib.stripeMod.StripeNs.IMetadata = null,
    name: java.lang.String = null,
    number: java.lang.String = null,
    tokenization_method: stripeLib.stripeLibStrings.apple_pay | stripeLib.stripeLibStrings.android_pay = null
  ): ICardHash = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("cvc_check")(cvc_check.asInstanceOf[js.Any])
    __obj.updateDynamic("exp_month")(exp_month)
    __obj.updateDynamic("exp_year")(exp_year)
    __obj.updateDynamic("fingerprint")(fingerprint)
    __obj.updateDynamic("funding")(funding.asInstanceOf[js.Any])
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("last4")(last4)
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

