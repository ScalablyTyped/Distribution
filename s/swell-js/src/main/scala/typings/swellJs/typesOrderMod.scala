package typings.swellJs

import typings.swellJs.typesOrderCamelMod.OrderGiftCardCamel
import typings.swellJs.typesOrderCamelMod.OrderOptionCamel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOrderMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesOrderCamelMod.OrderCamel because var conflicts: account, account_credit_amount, account_credit_applied, account_id, account_info_saved, account_logged_in, active, authorized_payment, authorized_payment_id, billing, cancel_reason, canceled, cart, cart_id, closed, comments, coupon, coupon_code, coupon_id, credit_total, credits, currency, currency_rate, date_canceled, date_created, date_payment_retry, date_period_end, date_period_start, date_scheduled, date_updated, date_webhook_first_failed, date_webhook_last_succeeded, delivered, delivery_marked, discount_total, discounts, display_currency, display_locale, draft, gift, gift_message, giftcard_delivery, giftcard_total, giftcards, grand_total, guest, hold, id, invoices, item_discount, item_quantity, item_quantity_canceled, item_quantity_creditable, item_quantity_credited, item_quantity_deliverable, item_quantity_delivered, item_quantity_giftcard_deliverable, item_quantity_invoiceable, item_quantity_invoiced, item_quantity_returnable, item_quantity_returned, item_quantity_shipment_deliverable, item_quantity_subscription_deliverable, item_shipment_weight, item_tax, item_tax_included, items, metadata, next, next_id, notes, number, paid, parent_id, payment_balance, payment_error, payment_marked, payment_retry_count, payment_retry_resolve, payment_total, payments, pending_invoices, prev, prev_id, promotion_ids, promotions, purchase_link_ids, purchase_links, purchase_links_errors, refund_marked, refund_total, refunded, refunds, return_credit_tax, return_credit_total, return_item_tax, return_item_tax_included, return_item_total, return_total, schedule, shipment_delivery, shipment_discount, shipment_price, shipment_rating, shipment_tax, shipment_tax_included, shipment_total, shipment_total_credited, shipments, shipping, status, sub_total, subscription, subscription_delivery, subscription_id, tax_included_total, tax_total, taxes, taxes_fixed, test, webhook_attempts_failed, webhook_response, webhook_status. Inlined  */ trait Order
    extends StObject
       with OrderSnake
  object Order {
    
    inline def apply(): Order = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Order]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.OrderGiftCardSnake because var conflicts: amount, code, code_formatted, giftcard, id, last4. Inlined  */ trait OrderGiftCard
    extends StObject
       with OrderGiftCardCamel
  object OrderGiftCard {
    
    inline def apply(): OrderGiftCard = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrderGiftCard]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesOrderCamelMod.OrderItemCamel because var conflicts: bundle_items, date_created, date_updated, delivery, description, discount_each, discount_total, discounts, id, metadata, options, orig_price, price, price_total, product, product_id, product_name, quantity, shipment_location, shipment_weight, subscription_interval, subscription_interval_count, subscription_paid, subscription_trial_days, tax_each, tax_total, taxes, trial_price_total, variant, variant_id. Inlined  */ trait OrderItem
    extends StObject
       with OrderItemSnake
  object OrderItem {
    
    inline def apply(): OrderItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrderItem]
    }
  }
  
  trait OrderOption
    extends StObject
       with OrderOptionCamel
  object OrderOption {
    
    inline def apply(value_id: String): OrderOption = {
      val __obj = js.Dynamic.literal(value_id = value_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrderOption]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesOrderCamelMod.OrderShippingCamel because var conflicts: account_address, account_address_id, address1, address2, city, country, default, first_name, last_name, name, phone, pickup, price, service, service_name, state, zip. Inlined  */ trait OrderShipping
    extends StObject
       with OrderShippingSnake
  object OrderShipping {
    
    inline def apply(): OrderShipping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrderShipping]
    }
  }
}
