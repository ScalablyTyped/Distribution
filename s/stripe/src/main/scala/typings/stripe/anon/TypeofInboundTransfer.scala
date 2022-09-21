package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInboundTransfer extends StObject {
  
  val FailureDetails: Any
  
  val OriginPaymentMethodDetails: TypeofOriginPaymentMethod
}
object TypeofInboundTransfer {
  
  inline def apply(FailureDetails: Any, OriginPaymentMethodDetails: TypeofOriginPaymentMethod): TypeofInboundTransfer = {
    val __obj = js.Dynamic.literal(FailureDetails = FailureDetails.asInstanceOf[js.Any], OriginPaymentMethodDetails = OriginPaymentMethodDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInboundTransfer]
  }
  
  extension [Self <: TypeofInboundTransfer](x: Self) {
    
    inline def setFailureDetails(value: Any): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    inline def setOriginPaymentMethodDetails(value: TypeofOriginPaymentMethod): Self = StObject.set(x, "OriginPaymentMethodDetails", value.asInstanceOf[js.Any])
  }
}
