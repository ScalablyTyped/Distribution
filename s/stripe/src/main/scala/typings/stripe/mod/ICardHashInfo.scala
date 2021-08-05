package typings.stripe.mod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICardHashInfo extends StObject {
  
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
  
  inline def apply(
    brand: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown,
    country: String,
    cvc_check: pass | fail | unavailable | unchecked,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: credit | debit | prepaid | unknown_,
    last4: String
  ): ICardHashInfo = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], address_city = null, address_country = null, address_line1 = null, address_line1_check = null, address_line2 = null, address_state = null, address_zip = null, address_zip_check = null, dynamic_last4 = null, name = null, tokenization_method = null)
    __obj.asInstanceOf[ICardHashInfo]
  }
  
  extension [Self <: ICardHashInfo](x: Self) {
    
    inline def setAddress_city(value: String): Self = StObject.set(x, "address_city", value.asInstanceOf[js.Any])
    
    inline def setAddress_cityNull: Self = StObject.set(x, "address_city", null)
    
    inline def setAddress_country(value: String): Self = StObject.set(x, "address_country", value.asInstanceOf[js.Any])
    
    inline def setAddress_countryNull: Self = StObject.set(x, "address_country", null)
    
    inline def setAddress_line1(value: String): Self = StObject.set(x, "address_line1", value.asInstanceOf[js.Any])
    
    inline def setAddress_line1Null: Self = StObject.set(x, "address_line1", null)
    
    inline def setAddress_line1_check(value: pass | fail | unavailable | unchecked): Self = StObject.set(x, "address_line1_check", value.asInstanceOf[js.Any])
    
    inline def setAddress_line1_checkNull: Self = StObject.set(x, "address_line1_check", null)
    
    inline def setAddress_line2(value: String): Self = StObject.set(x, "address_line2", value.asInstanceOf[js.Any])
    
    inline def setAddress_line2Null: Self = StObject.set(x, "address_line2", null)
    
    inline def setAddress_state(value: String): Self = StObject.set(x, "address_state", value.asInstanceOf[js.Any])
    
    inline def setAddress_stateNull: Self = StObject.set(x, "address_state", null)
    
    inline def setAddress_zip(value: String): Self = StObject.set(x, "address_zip", value.asInstanceOf[js.Any])
    
    inline def setAddress_zipNull: Self = StObject.set(x, "address_zip", null)
    
    inline def setAddress_zip_check(value: pass | fail | unavailable | unchecked): Self = StObject.set(x, "address_zip_check", value.asInstanceOf[js.Any])
    
    inline def setAddress_zip_checkNull: Self = StObject.set(x, "address_zip_check", null)
    
    inline def setBrand(value: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCvc_check(value: pass | fail | unavailable | unchecked): Self = StObject.set(x, "cvc_check", value.asInstanceOf[js.Any])
    
    inline def setDynamic_last4(value: String): Self = StObject.set(x, "dynamic_last4", value.asInstanceOf[js.Any])
    
    inline def setDynamic_last4Null: Self = StObject.set(x, "dynamic_last4", null)
    
    inline def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
    
    inline def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFunding(value: credit | debit | prepaid | unknown_): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
    
    inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setTokenization_method(value: apple_pay | android_pay): Self = StObject.set(x, "tokenization_method", value.asInstanceOf[js.Any])
    
    inline def setTokenization_methodNull: Self = StObject.set(x, "tokenization_method", null)
  }
}
