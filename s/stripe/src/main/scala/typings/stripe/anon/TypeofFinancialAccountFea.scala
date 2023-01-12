package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFinancialAccountFea extends StObject {
  
  val CardIssuing: TypeofCardIssuing
  
  val DepositInsurance: TypeofDepositInsurance
  
  val FinancialAddresses: TypeofFinancialAddresses
  
  val InboundTransfers: TypeofInboundTransfers
  
  val IntraStripeFlows: TypeofIntraStripeFlows
  
  val OutboundPayments: TypeofOutboundPayments
  
  val OutboundTransfers: TypeofOutboundTransfers
}
object TypeofFinancialAccountFea {
  
  inline def apply(
    CardIssuing: TypeofCardIssuing,
    DepositInsurance: TypeofDepositInsurance,
    FinancialAddresses: TypeofFinancialAddresses,
    InboundTransfers: TypeofInboundTransfers,
    IntraStripeFlows: TypeofIntraStripeFlows,
    OutboundPayments: TypeofOutboundPayments,
    OutboundTransfers: TypeofOutboundTransfers
  ): TypeofFinancialAccountFea = {
    val __obj = js.Dynamic.literal(CardIssuing = CardIssuing.asInstanceOf[js.Any], DepositInsurance = DepositInsurance.asInstanceOf[js.Any], FinancialAddresses = FinancialAddresses.asInstanceOf[js.Any], InboundTransfers = InboundTransfers.asInstanceOf[js.Any], IntraStripeFlows = IntraStripeFlows.asInstanceOf[js.Any], OutboundPayments = OutboundPayments.asInstanceOf[js.Any], OutboundTransfers = OutboundTransfers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFinancialAccountFea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFinancialAccountFea] (val x: Self) extends AnyVal {
    
    inline def setCardIssuing(value: TypeofCardIssuing): Self = StObject.set(x, "CardIssuing", value.asInstanceOf[js.Any])
    
    inline def setDepositInsurance(value: TypeofDepositInsurance): Self = StObject.set(x, "DepositInsurance", value.asInstanceOf[js.Any])
    
    inline def setFinancialAddresses(value: TypeofFinancialAddresses): Self = StObject.set(x, "FinancialAddresses", value.asInstanceOf[js.Any])
    
    inline def setInboundTransfers(value: TypeofInboundTransfers): Self = StObject.set(x, "InboundTransfers", value.asInstanceOf[js.Any])
    
    inline def setIntraStripeFlows(value: TypeofIntraStripeFlows): Self = StObject.set(x, "IntraStripeFlows", value.asInstanceOf[js.Any])
    
    inline def setOutboundPayments(value: TypeofOutboundPayments): Self = StObject.set(x, "OutboundPayments", value.asInstanceOf[js.Any])
    
    inline def setOutboundTransfers(value: TypeofOutboundTransfers): Self = StObject.set(x, "OutboundTransfers", value.asInstanceOf[js.Any])
  }
}
