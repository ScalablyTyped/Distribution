package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOutboundPaymentCrea extends StObject {
  
  val DestinationPaymentMethodData: TypeofDestinationPaymentM
  
  val DestinationPaymentMethodOptions: TypeofDestinationPaymentM
}
object TypeofOutboundPaymentCrea {
  
  inline def apply(
    DestinationPaymentMethodData: TypeofDestinationPaymentM,
    DestinationPaymentMethodOptions: TypeofDestinationPaymentM
  ): TypeofOutboundPaymentCrea = {
    val __obj = js.Dynamic.literal(DestinationPaymentMethodData = DestinationPaymentMethodData.asInstanceOf[js.Any], DestinationPaymentMethodOptions = DestinationPaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOutboundPaymentCrea]
  }
  
  extension [Self <: TypeofOutboundPaymentCrea](x: Self) {
    
    inline def setDestinationPaymentMethodData(value: TypeofDestinationPaymentM): Self = StObject.set(x, "DestinationPaymentMethodData", value.asInstanceOf[js.Any])
    
    inline def setDestinationPaymentMethodOptions(value: TypeofDestinationPaymentM): Self = StObject.set(x, "DestinationPaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
