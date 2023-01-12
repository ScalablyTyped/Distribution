package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.stripe.mod.Stripe.TestHelpers.Treasury.InboundTransfersResource
import typings.stripe.mod.Stripe.TestHelpers.Treasury.OutboundPaymentsResource
import typings.stripe.mod.Stripe.TestHelpers.Treasury.OutboundTransfersResource
import typings.stripe.mod.Stripe.TestHelpers.Treasury.ReceivedCreditsResource
import typings.stripe.mod.Stripe.TestHelpers.Treasury.ReceivedDebitsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTreasury extends StObject {
  
  val InboundTransferFailParams: TypeofInboundTransferFail
  
  var InboundTransfersResource: Instantiable0[typings.stripe.mod.Stripe.TestHelpers.Treasury.InboundTransfersResource]
  
  val OutboundPaymentReturnOutboundPaymentParams: TypeofOutboundPaymentRetu
  
  var OutboundPaymentsResource: Instantiable0[typings.stripe.mod.Stripe.TestHelpers.Treasury.OutboundPaymentsResource]
  
  val OutboundTransferReturnOutboundTransferParams: TypeofOutboundTransferRet
  
  var OutboundTransfersResource: Instantiable0[typings.stripe.mod.Stripe.TestHelpers.Treasury.OutboundTransfersResource]
  
  val ReceivedCreditCreateParams: TypeofReceivedCreditCreat
  
  var ReceivedCreditsResource: Instantiable0[typings.stripe.mod.Stripe.TestHelpers.Treasury.ReceivedCreditsResource]
  
  val ReceivedDebitCreateParams: TypeofReceivedDebitCreate
  
  var ReceivedDebitsResource: Instantiable0[typings.stripe.mod.Stripe.TestHelpers.Treasury.ReceivedDebitsResource]
}
object TypeofTreasury {
  
  inline def apply(
    InboundTransferFailParams: TypeofInboundTransferFail,
    InboundTransfersResource: Instantiable0[InboundTransfersResource],
    OutboundPaymentReturnOutboundPaymentParams: TypeofOutboundPaymentRetu,
    OutboundPaymentsResource: Instantiable0[OutboundPaymentsResource],
    OutboundTransferReturnOutboundTransferParams: TypeofOutboundTransferRet,
    OutboundTransfersResource: Instantiable0[OutboundTransfersResource],
    ReceivedCreditCreateParams: TypeofReceivedCreditCreat,
    ReceivedCreditsResource: Instantiable0[ReceivedCreditsResource],
    ReceivedDebitCreateParams: TypeofReceivedDebitCreate,
    ReceivedDebitsResource: Instantiable0[ReceivedDebitsResource]
  ): TypeofTreasury = {
    val __obj = js.Dynamic.literal(InboundTransferFailParams = InboundTransferFailParams.asInstanceOf[js.Any], InboundTransfersResource = InboundTransfersResource.asInstanceOf[js.Any], OutboundPaymentReturnOutboundPaymentParams = OutboundPaymentReturnOutboundPaymentParams.asInstanceOf[js.Any], OutboundPaymentsResource = OutboundPaymentsResource.asInstanceOf[js.Any], OutboundTransferReturnOutboundTransferParams = OutboundTransferReturnOutboundTransferParams.asInstanceOf[js.Any], OutboundTransfersResource = OutboundTransfersResource.asInstanceOf[js.Any], ReceivedCreditCreateParams = ReceivedCreditCreateParams.asInstanceOf[js.Any], ReceivedCreditsResource = ReceivedCreditsResource.asInstanceOf[js.Any], ReceivedDebitCreateParams = ReceivedDebitCreateParams.asInstanceOf[js.Any], ReceivedDebitsResource = ReceivedDebitsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTreasury]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTreasury] (val x: Self) extends AnyVal {
    
    inline def setInboundTransferFailParams(value: TypeofInboundTransferFail): Self = StObject.set(x, "InboundTransferFailParams", value.asInstanceOf[js.Any])
    
    inline def setInboundTransfersResource(value: Instantiable0[InboundTransfersResource]): Self = StObject.set(x, "InboundTransfersResource", value.asInstanceOf[js.Any])
    
    inline def setOutboundPaymentReturnOutboundPaymentParams(value: TypeofOutboundPaymentRetu): Self = StObject.set(x, "OutboundPaymentReturnOutboundPaymentParams", value.asInstanceOf[js.Any])
    
    inline def setOutboundPaymentsResource(value: Instantiable0[OutboundPaymentsResource]): Self = StObject.set(x, "OutboundPaymentsResource", value.asInstanceOf[js.Any])
    
    inline def setOutboundTransferReturnOutboundTransferParams(value: TypeofOutboundTransferRet): Self = StObject.set(x, "OutboundTransferReturnOutboundTransferParams", value.asInstanceOf[js.Any])
    
    inline def setOutboundTransfersResource(value: Instantiable0[OutboundTransfersResource]): Self = StObject.set(x, "OutboundTransfersResource", value.asInstanceOf[js.Any])
    
    inline def setReceivedCreditCreateParams(value: TypeofReceivedCreditCreat): Self = StObject.set(x, "ReceivedCreditCreateParams", value.asInstanceOf[js.Any])
    
    inline def setReceivedCreditsResource(value: Instantiable0[ReceivedCreditsResource]): Self = StObject.set(x, "ReceivedCreditsResource", value.asInstanceOf[js.Any])
    
    inline def setReceivedDebitCreateParams(value: TypeofReceivedDebitCreate): Self = StObject.set(x, "ReceivedDebitCreateParams", value.asInstanceOf[js.Any])
    
    inline def setReceivedDebitsResource(value: Instantiable0[ReceivedDebitsResource]): Self = StObject.set(x, "ReceivedDebitsResource", value.asInstanceOf[js.Any])
  }
}
