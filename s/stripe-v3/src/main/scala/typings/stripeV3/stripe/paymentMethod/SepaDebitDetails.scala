package typings.stripeV3.stripe.paymentMethod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SepaDebitDetails extends StObject {
  
  var bank_code: String = js.native
  
  var branch_code: String = js.native
  
  var country: String = js.native
  
  var fingerprint: String = js.native
  
  var last4: String = js.native
}
object SepaDebitDetails {
  
  @scala.inline
  def apply(bank_code: String, branch_code: String, country: String, fingerprint: String, last4: String): SepaDebitDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code.asInstanceOf[js.Any], branch_code = branch_code.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[SepaDebitDetails]
  }
  
  @scala.inline
  implicit class SepaDebitDetailsMutableBuilder[Self <: SepaDebitDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBank_code(value: String): Self = StObject.set(x, "bank_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranch_code(value: String): Self = StObject.set(x, "branch_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
  }
}
