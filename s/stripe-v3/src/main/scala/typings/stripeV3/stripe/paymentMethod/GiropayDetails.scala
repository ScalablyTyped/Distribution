package typings.stripeV3.stripe.paymentMethod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GiropayDetails extends StObject {
  
  var bank_code: String = js.native
  
  var bank_name: String = js.native
  
  var bic: String = js.native
  
  var verified_name: String = js.native
}
object GiropayDetails {
  
  @scala.inline
  def apply(bank_code: String, bank_name: String, bic: String, verified_name: String): GiropayDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], bic = bic.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GiropayDetails]
  }
  
  @scala.inline
  implicit class GiropayDetailsMutableBuilder[Self <: GiropayDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBank_code(value: String): Self = StObject.set(x, "bank_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBic(value: String): Self = StObject.set(x, "bic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_name(value: String): Self = StObject.set(x, "verified_name", value.asInstanceOf[js.Any])
  }
}
