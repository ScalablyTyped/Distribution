package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bankcode extends StObject {
  
  var bank_code: String | Null = js.native
  
  var country: String | Null = js.native
  
  var fingerprint: String = js.native
  
  var last4: String = js.native
  
  var mandate_reference: String = js.native
}
object Bankcode {
  
  @scala.inline
  def apply(fingerprint: String, last4: String, mandate_reference: String): Bankcode = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], mandate_reference = mandate_reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bankcode]
  }
  
  @scala.inline
  implicit class BankcodeMutableBuilder[Self <: Bankcode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBank_code(value: String): Self = StObject.set(x, "bank_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBank_codeNull: Self = StObject.set(x, "bank_code", null)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryNull: Self = StObject.set(x, "country", null)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandate_reference(value: String): Self = StObject.set(x, "mandate_reference", value.asInstanceOf[js.Any])
  }
}
