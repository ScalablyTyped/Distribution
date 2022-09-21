package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOutboundTransfer extends StObject {
  
  val DestinationPaymentMethodDetails: TypeofDestinationPaymentM
  
  val ReturnedDetails: Any
}
object TypeofOutboundTransfer {
  
  inline def apply(DestinationPaymentMethodDetails: TypeofDestinationPaymentM, ReturnedDetails: Any): TypeofOutboundTransfer = {
    val __obj = js.Dynamic.literal(DestinationPaymentMethodDetails = DestinationPaymentMethodDetails.asInstanceOf[js.Any], ReturnedDetails = ReturnedDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOutboundTransfer]
  }
  
  extension [Self <: TypeofOutboundTransfer](x: Self) {
    
    inline def setDestinationPaymentMethodDetails(value: TypeofDestinationPaymentM): Self = StObject.set(x, "DestinationPaymentMethodDetails", value.asInstanceOf[js.Any])
    
    inline def setReturnedDetails(value: Any): Self = StObject.set(x, "ReturnedDetails", value.asInstanceOf[js.Any])
  }
}
