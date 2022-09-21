package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOutboundPaymentRetu extends StObject {
  
  val ReturnedDetails: Any
}
object TypeofOutboundPaymentRetu {
  
  inline def apply(ReturnedDetails: Any): TypeofOutboundPaymentRetu = {
    val __obj = js.Dynamic.literal(ReturnedDetails = ReturnedDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOutboundPaymentRetu]
  }
  
  extension [Self <: TypeofOutboundPaymentRetu](x: Self) {
    
    inline def setReturnedDetails(value: Any): Self = StObject.set(x, "ReturnedDetails", value.asInstanceOf[js.Any])
  }
}
