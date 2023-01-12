package typings.stripeV3.stripe.paymentMethod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AchCreditTransferDetails extends StObject {
  
  var account_number: String
  
  var bank_name: String
  
  var routing_number: String
  
  var swift_coode: String
}
object AchCreditTransferDetails {
  
  inline def apply(account_number: String, bank_name: String, routing_number: String, swift_coode: String): AchCreditTransferDetails = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], swift_coode = swift_coode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchCreditTransferDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AchCreditTransferDetails] (val x: Self) extends AnyVal {
    
    inline def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    inline def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    
    inline def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
    
    inline def setSwift_coode(value: String): Self = StObject.set(x, "swift_coode", value.asInstanceOf[js.Any])
  }
}
