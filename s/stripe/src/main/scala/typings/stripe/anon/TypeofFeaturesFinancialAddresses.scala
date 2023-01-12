package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFeaturesFinancialAddresses extends StObject {
  
  val FinancialAddresses: Any
  
  val InboundTransfers: Any
  
  val OutboundPayments: Any
  
  val OutboundTransfers: Any
}
object TypeofFeaturesFinancialAddresses {
  
  inline def apply(FinancialAddresses: Any, InboundTransfers: Any, OutboundPayments: Any, OutboundTransfers: Any): TypeofFeaturesFinancialAddresses = {
    val __obj = js.Dynamic.literal(FinancialAddresses = FinancialAddresses.asInstanceOf[js.Any], InboundTransfers = InboundTransfers.asInstanceOf[js.Any], OutboundPayments = OutboundPayments.asInstanceOf[js.Any], OutboundTransfers = OutboundTransfers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFeaturesFinancialAddresses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFeaturesFinancialAddresses] (val x: Self) extends AnyVal {
    
    inline def setFinancialAddresses(value: Any): Self = StObject.set(x, "FinancialAddresses", value.asInstanceOf[js.Any])
    
    inline def setInboundTransfers(value: Any): Self = StObject.set(x, "InboundTransfers", value.asInstanceOf[js.Any])
    
    inline def setOutboundPayments(value: Any): Self = StObject.set(x, "OutboundPayments", value.asInstanceOf[js.Any])
    
    inline def setOutboundTransfers(value: Any): Self = StObject.set(x, "OutboundTransfers", value.asInstanceOf[js.Any])
  }
}
