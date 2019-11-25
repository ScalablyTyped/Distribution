package typings.stripe.stripeMod

import typings.stripe.stripeStrings.Discover
import typings.stripe.stripeStrings.JCB
import typings.stripe.stripeStrings.MasterCard
import typings.stripe.stripeStrings.Unknown
import typings.stripe.stripeStrings.Visa
import typings.stripe.stripeStrings.`American Express`
import typings.stripe.stripeStrings.`Diners Club`
import typings.stripe.stripeStrings.android_pay
import typings.stripe.stripeStrings.apple_pay
import typings.stripe.stripeStrings.credit
import typings.stripe.stripeStrings.debit
import typings.stripe.stripeStrings.fail
import typings.stripe.stripeStrings.pass
import typings.stripe.stripeStrings.prepaid
import typings.stripe.stripeStrings.unavailable
import typings.stripe.stripeStrings.unchecked
import typings.stripe.stripeStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardHashInfo extends js.Object {
  var address_city: String | Null
  /**
    * Billing address country, if provided when creating card
    */
  var address_country: String | Null
  var address_line1: String | Null
  /**
    * If address_line1 was provided, results of the check: pass, fail, unavailable, or unchecked.
    */
  var address_line1_check: pass | fail | unavailable | unchecked | Null
  var address_line2: String | Null
  var address_state: String | Null
  var address_zip: String | Null
  /**
    * If address_zip was provided, results of the check: pass, fail, unavailable, or unchecked.
    */
  var address_zip_check: pass | fail | unavailable | unchecked | Null
  /**
    * Card brand. Can be Visa, American Express, MasterCard, Discover, JCB, Diners Club, or Unknown.
    */
  var brand: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown
  /**
    * Two-letter ISO code representing the country of the card. You could use this
    * attribute to get a sense of the international breakdown of cards you've collected.
    */
  var country: String
  /**
    * If a CVC was provided, results of the check: pass, fail, unavailable, or unchecked
    */
  var cvc_check: pass | fail | unavailable | unchecked
  /**
    * (For Apple Pay integrations only.) The last four digits of the device account number.
    */
  var dynamic_last4: String | Null
  var exp_month: Double
  var exp_year: Double
  /**
    * Uniquely identifies this particular card number. You can use this attribute to check
    * whether two customers who've signed up with you are using the same card number, for example.
    */
  var fingerprint: String
  /**
    * Card funding type. Can be credit, debit, prepaid, or unknown
    */
  var funding: credit | debit | prepaid | unknown_
  var last4: String
  var metadata: js.UndefOr[IMetadata] = js.undefined
  /**
    * Cardholder name
    */
  var name: String | Null
  /**
    * The card number
    */
  var number: js.UndefOr[String] = js.undefined
  /**
    * If the card number is tokenized, this is the method that was
    * used. Can be "apple_pay" or "android_pay".
    */
  var tokenization_method: apple_pay | android_pay | Null
}

object ICardHashInfo {
  @scala.inline
  def apply(
    brand: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown,
    country: String,
    cvc_check: pass | fail | unavailable | unchecked,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: credit | debit | prepaid | unknown_,
    last4: String,
    address_city: String = null,
    address_country: String = null,
    address_line1: String = null,
    address_line1_check: pass | fail | unavailable | unchecked = null,
    address_line2: String = null,
    address_state: String = null,
    address_zip: String = null,
    address_zip_check: pass | fail | unavailable | unchecked = null,
    dynamic_last4: String = null,
    metadata: IMetadata = null,
    name: String = null,
    number: String = null,
    tokenization_method: apple_pay | android_pay = null
  ): ICardHashInfo = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    if (address_city != null) __obj.updateDynamic("address_city")(address_city.asInstanceOf[js.Any])
    if (address_country != null) __obj.updateDynamic("address_country")(address_country.asInstanceOf[js.Any])
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1.asInstanceOf[js.Any])
    if (address_line1_check != null) __obj.updateDynamic("address_line1_check")(address_line1_check.asInstanceOf[js.Any])
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2.asInstanceOf[js.Any])
    if (address_state != null) __obj.updateDynamic("address_state")(address_state.asInstanceOf[js.Any])
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip.asInstanceOf[js.Any])
    if (address_zip_check != null) __obj.updateDynamic("address_zip_check")(address_zip_check.asInstanceOf[js.Any])
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (tokenization_method != null) __obj.updateDynamic("tokenization_method")(tokenization_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardHashInfo]
  }
}

