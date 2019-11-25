package typings.stripejs.customerMod

import org.scalablytyped.runtime.StringDictionary
import typings.stripejs.stripejsStrings.Discover
import typings.stripejs.stripejsStrings.JCB
import typings.stripejs.stripejsStrings.MasterCard
import typings.stripejs.stripejsStrings.UnionPay
import typings.stripejs.stripejsStrings.Unknown
import typings.stripejs.stripejsStrings.Visa
import typings.stripejs.stripejsStrings.`American Express`
import typings.stripejs.stripejsStrings.`Diners Club`
import typings.stripejs.stripejsStrings.android_pay
import typings.stripejs.stripejsStrings.apple_pay
import typings.stripejs.stripejsStrings.card
import typings.stripejs.stripejsStrings.credit
import typings.stripejs.stripejsStrings.debit
import typings.stripejs.stripejsStrings.instant
import typings.stripejs.stripejsStrings.prepaid
import typings.stripejs.stripejsStrings.standard
import typings.stripejs.stripejsStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card extends js.Object {
  var account: js.UndefOr[String] = js.undefined
  /**
    * City/District/Suburb/Town/Village
    */
  var address_city: String
  /**
    * The country in which the address is located
    */
  var address_country: String
  /**
    * Address line 1 (Street address/PO Box/Company name)
    */
  var address_line1: String
  /**
    * The results of address_line1 if it was provided
    */
  var address_line1_check: checkStatus
  /**
    * Address line 2 (Apartment/Suite/Unit/Building)
    */
  var address_line2: String
  /**
    * State/County/Province/Region.
    */
  var address_state: String
  /**
    * ZIP or postal code
    */
  var address_zip: String
  /**
    * The results of address_zip if it was provided
    */
  var address_zip_check: checkStatus
  /**
    * A set of available payout methods for this card
    * NOTE: Only values from this set should be passed as the method when creating a transfer
    */
  var available_payout_methods: js.Array[standard] | (js.Tuple2[standard, instant])
  /**
    * The brand of the card
    */
  var brand: (`American Express`) | (`Diners Club`) | Discover | JCB | MasterCard | UnionPay | Visa | Unknown
  /**
    * Two-letter ISO code representing the country of the card
    * You could use this attribute to get a sense of the international breakdown of cards you’ve collected
    */
  var country: String
  /**
    * Three-letter ISO code for currency
    * Only applicable on accounts (not customers or recipients).
    * The card can be used as a transfer destination for funds in this currency
    */
  var currency: js.UndefOr[String] = js.undefined
  /**
    * The customer that this card belongs to
    * NOTE: This attribute will not be in the card object if the card belongs to an account or recipient instead
    */
  var customer: js.UndefOr[js.Any] = js.undefined
  /**
    * If a CVC was provided, results of the check
    */
  var cvc_check: checkStatus
  /**
    * Only applicable on accounts (not customers or recipients)
    * This indicates whether this card is the default external account for its currency
    */
  var default_for_currency: js.UndefOr[Boolean] = js.undefined
  /**
    * The last four digits of the device account number.
    * NOTE: For tokenized numbers only
    */
  var dynamic_last4: String
  /**
    * Two-digit number representing the card’s expiration month
    */
  var exp_month: Double
  /**
    * Four-digit number representing the card’s expiration year
    */
  var exp_year: Double
  /**
    * Uniquely identifies this particular card number
    */
  var fingerprint: String
  /**
    * Card funding type
    */
  var funding: credit | debit | prepaid | unknown_
  /**
    * The unique identifier of the bank account
    */
  var id: String
  /**
    * The last four digits of the card
    */
  var last4: String
  /**
    * Your own saved information with this card
    */
  var metadata: StringDictionary[String]
  /**
    * The name of the cardholder
    */
  var name: String
  /**
    * The account this card belongs to.
    * NOTE: This attribute will not be in the card object if the card belongs to a customer or recipient instead.
    */
  var `object`: card
  /**
    * The recipient that this card belongs to.
    * NOTE: This attribute will not be in the card object if the card belongs to a customer or account instead
    */
  var recipient: js.UndefOr[String] = js.undefined
  /**
    * If the card number is tokenized, this is the method that was used
    */
  var tokenization_method: apple_pay | android_pay
}

object Card {
  @scala.inline
  def apply(
    address_city: String,
    address_country: String,
    address_line1: String,
    address_line1_check: checkStatus,
    address_line2: String,
    address_state: String,
    address_zip: String,
    address_zip_check: checkStatus,
    available_payout_methods: js.Array[standard] | (js.Tuple2[standard, instant]),
    brand: (`American Express`) | (`Diners Club`) | Discover | JCB | MasterCard | UnionPay | Visa | Unknown,
    country: String,
    cvc_check: checkStatus,
    dynamic_last4: String,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: credit | debit | prepaid | unknown_,
    id: String,
    last4: String,
    metadata: StringDictionary[String],
    name: String,
    `object`: card,
    tokenization_method: apple_pay | android_pay,
    account: String = null,
    currency: String = null,
    customer: js.Any = null,
    default_for_currency: js.UndefOr[Boolean] = js.undefined,
    recipient: String = null
  ): Card = {
    val __obj = js.Dynamic.literal(address_city = address_city.asInstanceOf[js.Any], address_country = address_country.asInstanceOf[js.Any], address_line1 = address_line1.asInstanceOf[js.Any], address_line1_check = address_line1_check.asInstanceOf[js.Any], address_line2 = address_line2.asInstanceOf[js.Any], address_state = address_state.asInstanceOf[js.Any], address_zip = address_zip.asInstanceOf[js.Any], address_zip_check = address_zip_check.asInstanceOf[js.Any], available_payout_methods = available_payout_methods.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], dynamic_last4 = dynamic_last4.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tokenization_method = tokenization_method.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (!js.isUndefined(default_for_currency)) __obj.updateDynamic("default_for_currency")(default_for_currency.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
}

