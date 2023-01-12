package typings.stripeV3.stripe.paymentMethod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SepaDebitDetails extends StObject {
  
  var bank_code: String
  
  var branch_code: String
  
  var country: String
  
  var fingerprint: String
  
  var last4: String
}
object SepaDebitDetails {
  
  inline def apply(bank_code: String, branch_code: String, country: String, fingerprint: String, last4: String): SepaDebitDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code.asInstanceOf[js.Any], branch_code = branch_code.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[SepaDebitDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SepaDebitDetails] (val x: Self) extends AnyVal {
    
    inline def setBank_code(value: String): Self = StObject.set(x, "bank_code", value.asInstanceOf[js.Any])
    
    inline def setBranch_code(value: String): Self = StObject.set(x, "branch_code", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
  }
}
