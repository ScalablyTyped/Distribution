package typings.swellJs

import typings.swellJs.mod.BaseModel
import typings.swellJs.swellJsStrings.authorized
import typings.swellJs.swellJsStrings.error
import typings.swellJs.swellJsStrings.pending
import typings.swellJs.swellJsStrings.success
import typings.swellJs.typesInvoiceMod.Invoice
import typings.swellJs.typesOrderMod.Order
import typings.swellJs.typesRefundMod.Refund
import typings.swellJs.typesSubscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentSnake
  extends StObject
     with BaseModel {
  
  var account: js.UndefOr[Account] = js.undefined
  
  var account_card: js.UndefOr[js.Object] = js.undefined
  
  // TODO: Account Card
  var account_card_id: js.UndefOr[String] = js.undefined
  
  var account_id: js.UndefOr[String] = js.undefined
  
  var amazon: js.UndefOr[js.Object] = js.undefined
  
  var amount: Double
  
  var amount_refundable: js.UndefOr[Double] = js.undefined
  
  var amount_refunded: js.UndefOr[Double] = js.undefined
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var authorized: js.UndefOr[Boolean] = js.undefined
  
  var captured: js.UndefOr[Boolean] = js.undefined
  
  var card: js.UndefOr[Card] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currency_rate: js.UndefOr[Double] = js.undefined
  
  var date_async_update: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[js.Object] = js.undefined
  
  var gateway: js.UndefOr[String] = js.undefined
  
  var giftcard: js.UndefOr[js.Object] = js.undefined
  
  // TODO: Add Gift Card
  var giftcard_id: js.UndefOr[String] = js.undefined
  
  var intent: js.UndefOr[js.Object] = js.undefined
  
  var invoice: js.UndefOr[Invoice] = js.undefined
  
  var invoice_id: js.UndefOr[String] = js.undefined
  
  var method: String
  
  var number: js.UndefOr[String] = js.undefined
  
  var order: js.UndefOr[Order] = js.undefined
  
  var order_id: js.UndefOr[String] = js.undefined
  
  var paypal: js.UndefOr[js.Object] = js.undefined
  
  //TODO: Add Paypal Object
  var refunds: js.UndefOr[js.Array[Refund]] = js.undefined
  
  var status: js.UndefOr[pending | error | success | authorized] = js.undefined
  
  var subscription: js.UndefOr[Subscription] = js.undefined
  
  var subscription_id: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[Boolean] = js.undefined
  
  var test: js.UndefOr[Boolean] = js.undefined
  
  var transaction_id: js.UndefOr[String] = js.undefined
}
object PaymentSnake {
  
  inline def apply(amount: Double, method: String): PaymentSnake = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentSnake] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAccount_card(value: js.Object): Self = StObject.set(x, "account_card", value.asInstanceOf[js.Any])
    
    inline def setAccount_cardUndefined: Self = StObject.set(x, "account_card", js.undefined)
    
    inline def setAccount_card_id(value: String): Self = StObject.set(x, "account_card_id", value.asInstanceOf[js.Any])
    
    inline def setAccount_card_idUndefined: Self = StObject.set(x, "account_card_id", js.undefined)
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
    
    inline def setAmazon(value: js.Object): Self = StObject.set(x, "amazon", value.asInstanceOf[js.Any])
    
    inline def setAmazonUndefined: Self = StObject.set(x, "amazon", js.undefined)
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmount_refundable(value: Double): Self = StObject.set(x, "amount_refundable", value.asInstanceOf[js.Any])
    
    inline def setAmount_refundableUndefined: Self = StObject.set(x, "amount_refundable", js.undefined)
    
    inline def setAmount_refunded(value: Double): Self = StObject.set(x, "amount_refunded", value.asInstanceOf[js.Any])
    
    inline def setAmount_refundedUndefined: Self = StObject.set(x, "amount_refunded", js.undefined)
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setAuthorized(value: Boolean): Self = StObject.set(x, "authorized", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedUndefined: Self = StObject.set(x, "authorized", js.undefined)
    
    inline def setCaptured(value: Boolean): Self = StObject.set(x, "captured", value.asInstanceOf[js.Any])
    
    inline def setCapturedUndefined: Self = StObject.set(x, "captured", js.undefined)
    
    inline def setCard(value: Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setCurrency_rate(value: Double): Self = StObject.set(x, "currency_rate", value.asInstanceOf[js.Any])
    
    inline def setCurrency_rateUndefined: Self = StObject.set(x, "currency_rate", js.undefined)
    
    inline def setDate_async_update(value: String): Self = StObject.set(x, "date_async_update", value.asInstanceOf[js.Any])
    
    inline def setDate_async_updateUndefined: Self = StObject.set(x, "date_async_update", js.undefined)
    
    inline def setError(value: js.Object): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
    
    inline def setGiftcard(value: js.Object): Self = StObject.set(x, "giftcard", value.asInstanceOf[js.Any])
    
    inline def setGiftcardUndefined: Self = StObject.set(x, "giftcard", js.undefined)
    
    inline def setGiftcard_id(value: String): Self = StObject.set(x, "giftcard_id", value.asInstanceOf[js.Any])
    
    inline def setGiftcard_idUndefined: Self = StObject.set(x, "giftcard_id", js.undefined)
    
    inline def setIntent(value: js.Object): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setInvoice(value: Invoice): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
    
    inline def setInvoiceUndefined: Self = StObject.set(x, "invoice", js.undefined)
    
    inline def setInvoice_id(value: String): Self = StObject.set(x, "invoice_id", value.asInstanceOf[js.Any])
    
    inline def setInvoice_idUndefined: Self = StObject.set(x, "invoice_id", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrder_id(value: String): Self = StObject.set(x, "order_id", value.asInstanceOf[js.Any])
    
    inline def setOrder_idUndefined: Self = StObject.set(x, "order_id", js.undefined)
    
    inline def setPaypal(value: js.Object): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
    
    inline def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
    
    inline def setRefunds(value: js.Array[Refund]): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
    
    inline def setRefundsUndefined: Self = StObject.set(x, "refunds", js.undefined)
    
    inline def setRefundsVarargs(value: Refund*): Self = StObject.set(x, "refunds", js.Array(value*))
    
    inline def setStatus(value: pending | error | success | authorized): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setSubscription_id(value: String): Self = StObject.set(x, "subscription_id", value.asInstanceOf[js.Any])
    
    inline def setSubscription_idUndefined: Self = StObject.set(x, "subscription_id", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
    
    inline def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
  }
}
