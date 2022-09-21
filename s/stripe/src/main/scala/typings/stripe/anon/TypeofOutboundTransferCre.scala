package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOutboundTransferCre extends StObject {
  
  val DestinationPaymentMethodOptions: TypeofDestinationPaymentM
}
object TypeofOutboundTransferCre {
  
  inline def apply(DestinationPaymentMethodOptions: TypeofDestinationPaymentM): TypeofOutboundTransferCre = {
    val __obj = js.Dynamic.literal(DestinationPaymentMethodOptions = DestinationPaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOutboundTransferCre]
  }
  
  extension [Self <: TypeofOutboundTransferCre](x: Self) {
    
    inline def setDestinationPaymentMethodOptions(value: TypeofDestinationPaymentM): Self = StObject.set(x, "DestinationPaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
