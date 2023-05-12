package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSubscriptionMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesSubscriptionCamelMod.SubscriptionCamel because var conflicts: account, account_id, active, billing, billing_schedule, bundle_item_id, cancel_at_end, cancel_reason, canceled, complete, coupon, coupon_code, coupon_id, currency, currency_rate, date_canceled, date_created, date_order_cycle_start, date_order_period_end, date_order_period_start, date_payment_expiring, date_payment_failed, date_payment_retry, date_period_end, date_period_start, date_prorated, date_resumed, date_trial_end, date_trial_start, date_updated, discount_total, discounts, draft, grand_total, id, interval, interval_count, invoice_total, invoices, item_discount, item_tax, item_total, items, notes, number, options, order_id, order_item_id, order_schedule, ordering, orders, paid, payment_balance, payment_total, payments, pending_invoices, plan_id, plan_name, price, price_total, product, product_discount_each, product_discount_total, product_discounts, product_id, product_name, product_tax_each, product_tax_total, product_taxes, prorated, quantity, recurring_discount_total, recurring_item_discount, recurring_item_tax, recurring_item_total, recurring_tax_included_total, recurring_tax_total, recurring_total, refund_total, refunds, status, sub_total, tax_included_total, tax_total, taxes, taxes_fixed, trial, trial_days, unpaid, variant, variant_id. Inlined  */ trait Subscription
    extends StObject
       with SubscriptionSnake
  object Subscription {
    
    inline def apply(): Subscription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Subscription]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesSubscriptionCamelMod.SubscriptionBillingScheduleCamel because var conflicts: date_limit_end, interval, interval_count, limit, limit_current, trial_days. Inlined  */ trait SubscriptionBillingSchedule
    extends StObject
       with SubscriptionBillingScheduleSnake
  object SubscriptionBillingSchedule {
    
    inline def apply(): SubscriptionBillingSchedule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionBillingSchedule]
    }
  }
}
