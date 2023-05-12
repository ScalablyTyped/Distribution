package typings.swellJs

import typings.swellJs.anon.Code
import typings.swellJs.mod.BaseModel
import typings.swellJs.swellJsStrings.account
import typings.swellJs.swellJsStrings.amazon
import typings.swellJs.swellJsStrings.card
import typings.swellJs.swellJsStrings.paypal
import typings.swellJs.typesOrderMod.Order
import typings.swellJs.typesPaymentMod.Payment
import typings.swellJs.typesSubscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRefundSnakeMod {
  
  trait RefundSnake
    extends StObject
       with BaseModel {
    
    var amount: js.UndefOr[Double] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var currency_rate: js.UndefOr[Double] = js.undefined
    
    var date_async_update: js.UndefOr[String] = js.undefined
    
    var error: Code
    
    var method: js.UndefOr[card | account | amazon | paypal] = js.undefined
    
    var number: js.UndefOr[String] = js.undefined
    
    var order: js.UndefOr[Order] = js.undefined
    
    var order_id: js.UndefOr[String] = js.undefined
    
    var parent: Payment
    
    var parent_id: js.UndefOr[String] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var reason_message: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var subscription: Subscription
    
    var subscription_id: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[Boolean] = js.undefined
    
    var transaction_id: js.UndefOr[String] = js.undefined
  }
  object RefundSnake {
    
    inline def apply(error: Code, parent: Payment, subscription: Subscription): RefundSnake = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefundSnake]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RefundSnake] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setCurrency_rate(value: Double): Self = StObject.set(x, "currency_rate", value.asInstanceOf[js.Any])
      
      inline def setCurrency_rateUndefined: Self = StObject.set(x, "currency_rate", js.undefined)
      
      inline def setDate_async_update(value: String): Self = StObject.set(x, "date_async_update", value.asInstanceOf[js.Any])
      
      inline def setDate_async_updateUndefined: Self = StObject.set(x, "date_async_update", js.undefined)
      
      inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: card | account | amazon | paypal): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrder_id(value: String): Self = StObject.set(x, "order_id", value.asInstanceOf[js.Any])
      
      inline def setOrder_idUndefined: Self = StObject.set(x, "order_id", js.undefined)
      
      inline def setParent(value: Payment): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParent_id(value: String): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
      
      inline def setParent_idUndefined: Self = StObject.set(x, "parent_id", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setReason_message(value: String): Self = StObject.set(x, "reason_message", value.asInstanceOf[js.Any])
      
      inline def setReason_messageUndefined: Self = StObject.set(x, "reason_message", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      inline def setSubscription_id(value: String): Self = StObject.set(x, "subscription_id", value.asInstanceOf[js.Any])
      
      inline def setSubscription_idUndefined: Self = StObject.set(x, "subscription_id", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
      
      inline def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
    }
  }
}
