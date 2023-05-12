package typings.swellJs

import typings.swellJs.anon.Code
import typings.swellJs.typesPaymentMod.Payment
import typings.swellJs.typesRefundSnakeMod.RefundSnake
import typings.swellJs.typesSubscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRefundMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesRefundCamelMod.RefundCamel because var conflicts: amount, currency, currency_rate, date_async_update, date_created, date_updated, error, id, method, number, order, order_id, parent, parent_id, reason, reason_message, status, subscription, subscription_id, success, transaction_id. Inlined  */ trait Refund
    extends StObject
       with RefundSnake
  object Refund {
    
    inline def apply(error: Code, parent: Payment, subscription: Subscription): Refund = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
      __obj.asInstanceOf[Refund]
    }
  }
}
