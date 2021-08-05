package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bankcode extends StObject {
  
  var bank_code: String | Null
  
  var country: String | Null
  
  var fingerprint: String
  
  var last4: String
  
  var mandate_reference: String
}
object Bankcode {
  
  inline def apply(fingerprint: String, last4: String, mandate_reference: String): Bankcode = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], mandate_reference = mandate_reference.asInstanceOf[js.Any], bank_code = null, country = null)
    __obj.asInstanceOf[Bankcode]
  }
  
  extension [Self <: Bankcode](x: Self) {
    
    inline def setBank_code(value: String): Self = StObject.set(x, "bank_code", value.asInstanceOf[js.Any])
    
    inline def setBank_codeNull: Self = StObject.set(x, "bank_code", null)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    inline def setMandate_reference(value: String): Self = StObject.set(x, "mandate_reference", value.asInstanceOf[js.Any])
  }
}
