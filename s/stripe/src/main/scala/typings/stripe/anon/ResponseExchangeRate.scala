package typings.stripe.anon

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.stripeStrings.exchange_rate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.ExchangeRate> */
trait ResponseExchangeRate extends StObject {
  
  /**
    * Unique identifier for the object. Represented as the three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html) in lowercase.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: exchange_rate
  
  /**
    * Hash where the keys are supported currencies and the values are the exchange rate at which the base id currency converts to the key currency.
    */
  var rates: StringDictionary[Double]
}
object ResponseExchangeRate {
  
  inline def apply(id: String, lastResponse: ApiVersion, rates: StringDictionary[Double]): ResponseExchangeRate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("exchange_rate")
    __obj.asInstanceOf[ResponseExchangeRate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseExchangeRate] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setObject(value: exchange_rate): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setRates(value: StringDictionary[Double]): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
  }
}
