package typings.stripe.anon

import typings.stripe.mod.Stripe.Treasury.FinancialAccountFeatures.CardIssuing
import typings.stripe.mod.Stripe.Treasury.FinancialAccountFeatures.DepositInsurance
import typings.stripe.mod.Stripe.Treasury.FinancialAccountFeatures.FinancialAddresses
import typings.stripe.mod.Stripe.Treasury.FinancialAccountFeatures.IntraStripeFlows
import typings.stripe.mod.Stripe.Treasury.FinancialAccountFeatures.OutboundPayments
import typings.stripe.mod.Stripe.Treasury.FinancialAccountFeatures.OutboundTransfers
import typings.stripe.stripeStrings.treasuryDotfinancial_account_features
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Treasury.FinancialAccountFeatures> */
trait ResponseFinancialAccountF extends StObject {
  
  /**
    * Toggle settings for enabling/disabling a feature
    */
  var card_issuing: js.UndefOr[CardIssuing] = js.undefined
  
  /**
    * Toggle settings for enabling/disabling a feature
    */
  var deposit_insurance: js.UndefOr[DepositInsurance] = js.undefined
  
  /**
    * Settings related to Financial Addresses features on a Financial Account
    */
  var financial_addresses: js.UndefOr[FinancialAddresses] = js.undefined
  
  /**
    * InboundTransfers contains inbound transfers features for a FinancialAccount.
    */
  var inbound_transfers: js.UndefOr[typings.stripe.mod.Stripe.Treasury.FinancialAccountFeatures.InboundTransfers] = js.undefined
  
  /**
    * Toggle settings for enabling/disabling a feature
    */
  var intra_stripe_flows: js.UndefOr[IntraStripeFlows] = js.undefined
  
  var lastResponse: ApiVersion
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: treasuryDotfinancial_account_features
  
  /**
    * Settings related to Outbound Payments features on a Financial Account
    */
  var outbound_payments: js.UndefOr[OutboundPayments] = js.undefined
  
  /**
    * OutboundTransfers contains outbound transfers features for a FinancialAccount.
    */
  var outbound_transfers: js.UndefOr[OutboundTransfers] = js.undefined
}
object ResponseFinancialAccountF {
  
  inline def apply(lastResponse: ApiVersion): ResponseFinancialAccountF = {
    val __obj = js.Dynamic.literal(lastResponse = lastResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("treasury.financial_account_features")
    __obj.asInstanceOf[ResponseFinancialAccountF]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseFinancialAccountF] (val x: Self) extends AnyVal {
    
    inline def setCard_issuing(value: CardIssuing): Self = StObject.set(x, "card_issuing", value.asInstanceOf[js.Any])
    
    inline def setCard_issuingUndefined: Self = StObject.set(x, "card_issuing", js.undefined)
    
    inline def setDeposit_insurance(value: DepositInsurance): Self = StObject.set(x, "deposit_insurance", value.asInstanceOf[js.Any])
    
    inline def setDeposit_insuranceUndefined: Self = StObject.set(x, "deposit_insurance", js.undefined)
    
    inline def setFinancial_addresses(value: FinancialAddresses): Self = StObject.set(x, "financial_addresses", value.asInstanceOf[js.Any])
    
    inline def setFinancial_addressesUndefined: Self = StObject.set(x, "financial_addresses", js.undefined)
    
    inline def setInbound_transfers(value: typings.stripe.mod.Stripe.Treasury.FinancialAccountFeatures.InboundTransfers): Self = StObject.set(x, "inbound_transfers", value.asInstanceOf[js.Any])
    
    inline def setInbound_transfersUndefined: Self = StObject.set(x, "inbound_transfers", js.undefined)
    
    inline def setIntra_stripe_flows(value: IntraStripeFlows): Self = StObject.set(x, "intra_stripe_flows", value.asInstanceOf[js.Any])
    
    inline def setIntra_stripe_flowsUndefined: Self = StObject.set(x, "intra_stripe_flows", js.undefined)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setObject(value: treasuryDotfinancial_account_features): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOutbound_payments(value: OutboundPayments): Self = StObject.set(x, "outbound_payments", value.asInstanceOf[js.Any])
    
    inline def setOutbound_paymentsUndefined: Self = StObject.set(x, "outbound_payments", js.undefined)
    
    inline def setOutbound_transfers(value: OutboundTransfers): Self = StObject.set(x, "outbound_transfers", value.asInstanceOf[js.Any])
    
    inline def setOutbound_transfersUndefined: Self = StObject.set(x, "outbound_transfers", js.undefined)
  }
}
