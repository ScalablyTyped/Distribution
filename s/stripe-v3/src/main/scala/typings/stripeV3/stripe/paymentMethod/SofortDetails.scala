package typings.stripeV3.stripe.paymentMethod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SofortDetails extends StObject {
  
  var bank_code: String
  
  var bank_name: String
  
  var bic: String
  
  var country: String
  
  var iban_last4: String
  
  var verified_name: String
}
object SofortDetails {
  
  inline def apply(
    bank_code: String,
    bank_name: String,
    bic: String,
    country: String,
    iban_last4: String,
    verified_name: String
  ): SofortDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], bic = bic.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], iban_last4 = iban_last4.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SofortDetails]
  }
  
  extension [Self <: SofortDetails](x: Self) {
    
    inline def setBank_code(value: String): Self = StObject.set(x, "bank_code", value.asInstanceOf[js.Any])
    
    inline def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    
    inline def setBic(value: String): Self = StObject.set(x, "bic", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setIban_last4(value: String): Self = StObject.set(x, "iban_last4", value.asInstanceOf[js.Any])
    
    inline def setVerified_name(value: String): Self = StObject.set(x, "verified_name", value.asInstanceOf[js.Any])
  }
}
