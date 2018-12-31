package typings
package stripejsLib.customerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card extends js.Object {
  var account: js.UndefOr[java.lang.String] = js.undefined
  /**
    * City/District/Suburb/Town/Village
    */
  var address_city: java.lang.String
  /**
    * The country in which the address is located
    */
  var address_country: java.lang.String
  /**
    * Address line 1 (Street address/PO Box/Company name)
    */
  var address_line1: java.lang.String
  /**
    * The results of address_line1 if it was provided
    */
  var address_line1_check: checkStatus
  /**
    * Address line 2 (Apartment/Suite/Unit/Building)
    */
  var address_line2: java.lang.String
  /**
    * State/County/Province/Region.
    */
  var address_state: java.lang.String
  /**
    * ZIP or postal code
    */
  var address_zip: java.lang.String
  /**
    * The results of address_zip if it was provided
    */
  var address_zip_check: checkStatus
  /**
    * A set of available payout methods for this card
    * NOTE: Only values from this set should be passed as the method when creating a transfer
    */
  var available_payout_methods: js.Array[stripejsLib.stripejsLibStrings.standard] | (js.Tuple2[stripejsLib.stripejsLibStrings.standard, stripejsLib.stripejsLibStrings.instant])
  /**
    * The brand of the card
    */
  var brand: (stripejsLib.stripejsLibStrings.`American Express`) | (stripejsLib.stripejsLibStrings.`Diners Club`) | stripejsLib.stripejsLibStrings.Discover | stripejsLib.stripejsLibStrings.JCB | stripejsLib.stripejsLibStrings.MasterCard | stripejsLib.stripejsLibStrings.UnionPay | stripejsLib.stripejsLibStrings.Visa | stripejsLib.stripejsLibStrings.Unknown
  /**
    * Two-letter ISO code representing the country of the card
    * You could use this attribute to get a sense of the international breakdown of cards you’ve collected
    */
  var country: java.lang.String
  /**
    * Three-letter ISO code for currency
    * Only applicable on accounts (not customers or recipients).
    * The card can be used as a transfer destination for funds in this currency
    */
  var currency: js.UndefOr[java.lang.String] = js.undefined
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
  var default_for_currency: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The last four digits of the device account number.
    * NOTE: For tokenized numbers only
    */
  var dynamic_last4: java.lang.String
  /**
    * Two-digit number representing the card’s expiration month
    */
  var exp_month: scala.Double
  /**
    * Four-digit number representing the card’s expiration year
    */
  var exp_year: scala.Double
  /**
    * Uniquely identifies this particular card number
    */
  var fingerprint: java.lang.String
  /**
    * Card funding type
    */
  var funding: stripejsLib.stripejsLibStrings.credit | stripejsLib.stripejsLibStrings.debit | stripejsLib.stripejsLibStrings.prepaid | stripejsLib.stripejsLibStrings.unknown
  /**
    * The unique identifier of the bank account
    */
  var id: java.lang.String
  /**
    * The last four digits of the card
    */
  var last4: java.lang.String
  /**
    * Your own saved information with this card
    */
  var metadata: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * The name of the cardholder
    */
  var name: java.lang.String
  /**
    * The account this card belongs to.
    * NOTE: This attribute will not be in the card object if the card belongs to a customer or recipient instead.
    */
  var `object`: stripejsLib.stripejsLibStrings.card
  /**
    * The recipient that this card belongs to.
    * NOTE: This attribute will not be in the card object if the card belongs to a customer or account instead
    */
  var recipient: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the card number is tokenized, this is the method that was used
    */
  var tokenization_method: stripejsLib.stripejsLibStrings.apple_pay | stripejsLib.stripejsLibStrings.android_pay
}

