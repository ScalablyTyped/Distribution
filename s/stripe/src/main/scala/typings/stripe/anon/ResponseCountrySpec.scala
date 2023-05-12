package typings.stripe.anon

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.mod.Stripe.CountrySpec.VerificationFields
import typings.stripe.stripeStrings.country_spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.CountrySpec> */
trait ResponseCountrySpec extends StObject {
  
  /**
    * The default currency for this country. This applies to both payment methods and bank accounts.
    */
  var default_currency: String
  
  /**
    * Unique identifier for the object. Represented as the ISO country code for this country.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: country_spec
  
  /**
    * Currencies that can be accepted in the specific country (for transfers).
    */
  var supported_bank_account_currencies: StringDictionary[js.Array[String]]
  
  /**
    * Currencies that can be accepted in the specified country (for payments).
    */
  var supported_payment_currencies: js.Array[String]
  
  /**
    * Payment methods available in the specified country. You may need to enable some payment methods (e.g., [ACH](https://stripe.com/docs/ach)) on your account before they appear in this list. The `stripe` payment method refers to [charging through your platform](https://stripe.com/docs/connect/destination-charges).
    */
  var supported_payment_methods: js.Array[String]
  
  /**
    * Countries that can accept transfers from the specified country.
    */
  var supported_transfer_countries: js.Array[String]
  
  var verification_fields: VerificationFields
}
object ResponseCountrySpec {
  
  inline def apply(
    default_currency: String,
    id: String,
    lastResponse: ApiVersion,
    supported_bank_account_currencies: StringDictionary[js.Array[String]],
    supported_payment_currencies: js.Array[String],
    supported_payment_methods: js.Array[String],
    supported_transfer_countries: js.Array[String],
    verification_fields: VerificationFields
  ): ResponseCountrySpec = {
    val __obj = js.Dynamic.literal(default_currency = default_currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], supported_bank_account_currencies = supported_bank_account_currencies.asInstanceOf[js.Any], supported_payment_currencies = supported_payment_currencies.asInstanceOf[js.Any], supported_payment_methods = supported_payment_methods.asInstanceOf[js.Any], supported_transfer_countries = supported_transfer_countries.asInstanceOf[js.Any], verification_fields = verification_fields.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("country_spec")
    __obj.asInstanceOf[ResponseCountrySpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCountrySpec] (val x: Self) extends AnyVal {
    
    inline def setDefault_currency(value: String): Self = StObject.set(x, "default_currency", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setObject(value: country_spec): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setSupported_bank_account_currencies(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "supported_bank_account_currencies", value.asInstanceOf[js.Any])
    
    inline def setSupported_payment_currencies(value: js.Array[String]): Self = StObject.set(x, "supported_payment_currencies", value.asInstanceOf[js.Any])
    
    inline def setSupported_payment_currenciesVarargs(value: String*): Self = StObject.set(x, "supported_payment_currencies", js.Array(value*))
    
    inline def setSupported_payment_methods(value: js.Array[String]): Self = StObject.set(x, "supported_payment_methods", value.asInstanceOf[js.Any])
    
    inline def setSupported_payment_methodsVarargs(value: String*): Self = StObject.set(x, "supported_payment_methods", js.Array(value*))
    
    inline def setSupported_transfer_countries(value: js.Array[String]): Self = StObject.set(x, "supported_transfer_countries", value.asInstanceOf[js.Any])
    
    inline def setSupported_transfer_countriesVarargs(value: String*): Self = StObject.set(x, "supported_transfer_countries", js.Array(value*))
    
    inline def setVerification_fields(value: VerificationFields): Self = StObject.set(x, "verification_fields", value.asInstanceOf[js.Any])
  }
}
