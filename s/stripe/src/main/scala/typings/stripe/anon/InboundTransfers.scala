package typings.stripe.anon

import typings.stripe.mod.Stripe.TestHelpers.Treasury.InboundTransfersResource
import typings.stripe.mod.Stripe.TestHelpers.Treasury.OutboundPaymentsResource
import typings.stripe.mod.Stripe.TestHelpers.Treasury.OutboundTransfersResource
import typings.stripe.mod.Stripe.TestHelpers.Treasury.ReceivedCreditsResource
import typings.stripe.mod.Stripe.TestHelpers.Treasury.ReceivedDebitsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundTransfers extends StObject {
  
  var inboundTransfers: InboundTransfersResource
  
  var outboundPayments: OutboundPaymentsResource
  
  var outboundTransfers: OutboundTransfersResource
  
  var receivedCredits: ReceivedCreditsResource
  
  var receivedDebits: ReceivedDebitsResource
}
object InboundTransfers {
  
  inline def apply(
    inboundTransfers: InboundTransfersResource,
    outboundPayments: OutboundPaymentsResource,
    outboundTransfers: OutboundTransfersResource,
    receivedCredits: ReceivedCreditsResource,
    receivedDebits: ReceivedDebitsResource
  ): InboundTransfers = {
    val __obj = js.Dynamic.literal(inboundTransfers = inboundTransfers.asInstanceOf[js.Any], outboundPayments = outboundPayments.asInstanceOf[js.Any], outboundTransfers = outboundTransfers.asInstanceOf[js.Any], receivedCredits = receivedCredits.asInstanceOf[js.Any], receivedDebits = receivedDebits.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundTransfers]
  }
  
  extension [Self <: InboundTransfers](x: Self) {
    
    inline def setInboundTransfers(value: InboundTransfersResource): Self = StObject.set(x, "inboundTransfers", value.asInstanceOf[js.Any])
    
    inline def setOutboundPayments(value: OutboundPaymentsResource): Self = StObject.set(x, "outboundPayments", value.asInstanceOf[js.Any])
    
    inline def setOutboundTransfers(value: OutboundTransfersResource): Self = StObject.set(x, "outboundTransfers", value.asInstanceOf[js.Any])
    
    inline def setReceivedCredits(value: ReceivedCreditsResource): Self = StObject.set(x, "receivedCredits", value.asInstanceOf[js.Any])
    
    inline def setReceivedDebits(value: ReceivedDebitsResource): Self = StObject.set(x, "receivedDebits", value.asInstanceOf[js.Any])
  }
}
