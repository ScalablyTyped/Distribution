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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Card extends js.Object {
  
  var account: js.UndefOr[String] = js.native
  
  /**
    * City/District/Suburb/Town/Village
    */
  var address_city: String = js.native
  
  /**
    * The country in which the address is located
    */
  var address_country: String = js.native
  
  /**
    * Address line 1 (Street address/PO Box/Company name)
    */
  var address_line1: String = js.native
  
  /**
    * The results of address_line1 if it was provided
    */
  var address_line1_check: checkStatus = js.native
  
  /**
    * Address line 2 (Apartment/Suite/Unit/Building)
    */
  var address_line2: String = js.native
  
  /**
    * State/County/Province/Region.
    */
  var address_state: String = js.native
  
  /**
    * ZIP or postal code
    */
  var address_zip: String = js.native
  
  /**
    * The results of address_zip if it was provided
    */
  var address_zip_check: checkStatus = js.native
  
  /**
    * A set of available payout methods for this card
    * NOTE: Only values from this set should be passed as the method when creating a transfer
    */
  var available_payout_methods: js.Array[standard] | (js.Tuple2[standard, instant]) = js.native
  
  /**
    * The brand of the card
    */
  var brand: (`American Express`) | (`Diners Club`) | Discover | JCB | MasterCard | UnionPay | Visa | Unknown = js.native
  
  /**
    * Two-letter ISO code representing the country of the card
    * You could use this attribute to get a sense of the international breakdown of cards you’ve collected
    */
  var country: String = js.native
  
  /**
    * Three-letter ISO code for currency
    * Only applicable on accounts (not customers or recipients).
    * The card can be used as a transfer destination for funds in this currency
    */
  var currency: js.UndefOr[String] = js.native
  
  /**
    * The customer that this card belongs to
    * NOTE: This attribute will not be in the card object if the card belongs to an account or recipient instead
    */
  var customer: js.UndefOr[js.Any] = js.native
  
  /**
    * If a CVC was provided, results of the check
    */
  var cvc_check: checkStatus = js.native
  
  /**
    * Only applicable on accounts (not customers or recipients)
    * This indicates whether this card is the default external account for its currency
    */
  var default_for_currency: js.UndefOr[Boolean] = js.native
  
  /**
    * The last four digits of the device account number.
    * NOTE: For tokenized numbers only
    */
  var dynamic_last4: String = js.native
  
  /**
    * Two-digit number representing the card’s expiration month
    */
  var exp_month: Double = js.native
  
  /**
    * Four-digit number representing the card’s expiration year
    */
  var exp_year: Double = js.native
  
  /**
    * Uniquely identifies this particular card number
    */
  var fingerprint: String = js.native
  
  /**
    * Card funding type
    */
  var funding: credit | debit | prepaid | unknown_ = js.native
  
  /**
    * The unique identifier of the bank account
    */
  var id: String = js.native
  
  /**
    * The last four digits of the card
    */
  var last4: String = js.native
  
  /**
    * Your own saved information with this card
    */
  var metadata: StringDictionary[String] = js.native
  
  /**
    * The name of the cardholder
    */
  var name: String = js.native
  
  /**
    * The account this card belongs to.
    * NOTE: This attribute will not be in the card object if the card belongs to a customer or recipient instead.
    */
  var `object`: card = js.native
  
  /**
    * The recipient that this card belongs to.
    * NOTE: This attribute will not be in the card object if the card belongs to a customer or account instead
    */
  var recipient: js.UndefOr[String] = js.native
  
  /**
    * If the card number is tokenized, this is the method that was used
    */
  var tokenization_method: apple_pay | android_pay = js.native
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
    tokenization_method: apple_pay | android_pay
  ): Card = {
    val __obj = js.Dynamic.literal(address_city = address_city.asInstanceOf[js.Any], address_country = address_country.asInstanceOf[js.Any], address_line1 = address_line1.asInstanceOf[js.Any], address_line1_check = address_line1_check.asInstanceOf[js.Any], address_line2 = address_line2.asInstanceOf[js.Any], address_state = address_state.asInstanceOf[js.Any], address_zip = address_zip.asInstanceOf[js.Any], address_zip_check = address_zip_check.asInstanceOf[js.Any], available_payout_methods = available_payout_methods.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], dynamic_last4 = dynamic_last4.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tokenization_method = tokenization_method.asInstanceOf[js.Any])
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
    def setAddress_city(value: String): Self = this.set("address_city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_country(value: String): Self = this.set("address_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line1(value: String): Self = this.set("address_line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line1_check(value: checkStatus): Self = this.set("address_line1_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line2(value: String): Self = this.set("address_line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_state(value: String): Self = this.set("address_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_zip(value: String): Self = this.set("address_zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_zip_check(value: checkStatus): Self = this.set("address_zip_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailable_payout_methodsVarargs(value: standard*): Self = this.set("available_payout_methods", js.Array(value :_*))
    
    @scala.inline
    def setAvailable_payout_methods(value: js.Array[standard] | (js.Tuple2[standard, instant])): Self = this.set("available_payout_methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrand(
      value: (`American Express`) | (`Diners Club`) | Discover | JCB | MasterCard | UnionPay | Visa | Unknown
    ): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCvc_check(value: checkStatus): Self = this.set("cvc_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamic_last4(value: String): Self = this.set("dynamic_last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp_month(value: Double): Self = this.set("exp_month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp_year(value: Double): Self = this.set("exp_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunding(value: credit | debit | prepaid | unknown_): Self = this.set("funding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast4(value: String): Self = this.set("last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: card): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenization_method(value: apple_pay | android_pay): Self = this.set("tokenization_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setCustomer(value: js.Any): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setDefault_for_currency(value: Boolean): Self = this.set("default_for_currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_for_currency: Self = this.set("default_for_currency", js.undefined)
    
    @scala.inline
    def setRecipient(value: String): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipient: Self = this.set("recipient", js.undefined)
  }
}
