package typings.swellJs

import typings.swellJs.typesCartCamelMod.CartShippingCamel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCartMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesCartCamelMod.CartCamel because var conflicts: abandoned, abandoned_notifications, account, account_credit_amount, account_credit_applied, account_id, account_info_saved, account_logged_in, active, billing, checkout_id, checkout_url, comments, coupon, coupon_code, coupon_id, currency, currency_rate, date_abandoned, date_abandoned_next, date_created, date_updated, date_webhook_first_failed, date_webhook_last_succeeded, discount_total, discounts, display_currency, display_locale, gift, gift_message, giftcard_delivery, giftcard_total, giftcards, grand_total, guest, id, item_discount, item_quantity, item_shipment_weight, item_tax, item_tax_included, items, metadata, notes, number, order, order_id, orig_price, promotion_ids, promotions, purchase_link_ids, purchase_links, purchase_links_errors, recovered, schedule, shipment_delivery, shipment_discount, shipment_price, shipment_rating, shipment_tax, shipment_tax_included, shipment_total, shipping, status, sub_total, subscription, subscription_delivery, subscription_id, target_order, target_order_id, tax_included_total, tax_total, taxes, taxes_fixed, webhook_attempts_failed, webhook_response, webhook_status. Inlined  */ trait Cart
    extends StObject
       with CartSnake
  object Cart {
    
    inline def apply(): Cart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cart]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesCartCamelMod.CartGiftCardItemCamel because var conflicts: amount, code, code_formatted, giftcard, id, last4, string. Inlined  */ trait CartGiftCardItem
    extends StObject
       with CartGiftCardItemSnake
  object CartGiftCardItem {
    
    inline def apply(last4: Any, string: Any): CartGiftCardItem = {
      val __obj = js.Dynamic.literal(last4 = last4.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[CartGiftCardItem]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesCartCamelMod.CartItemCamel because var conflicts: bundle_items, date_created, date_updated, delivery, description, discount_each, discount_total, discounts, id, metadata, options, orig_price, price, price_total, product, product_id, product_name, quantity, shipment_location, shipment_weight, subscription_interval, subscription_interval_count, subscription_paid, subscription_trial_days, tax_each, tax_total, taxes, trial_price_total, variant, variant_id. Inlined  */ trait CartItem
    extends StObject
       with CartItemSnake
  object CartItem {
    
    inline def apply(): CartItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CartItem]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesCartCamelMod.CartItemOptionsCamel because var conflicts: id, name, price, shipment_weight, value, variant. Inlined  */ trait CartItemOption
    extends StObject
       with CartItemOptionsSnake
  object CartItemOption {
    
    inline def apply(shipment_weight: Double): CartItemOption = {
      val __obj = js.Dynamic.literal(shipment_weight = shipment_weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[CartItemOption]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.CartShippingSnake because var conflicts: account_address, account_address_id, address1, address2, city, country, default, first_name, last_name, name, phone, pickup, price, service, service_name, state, zip. Inlined  */ trait CartShipping
    extends StObject
       with CartShippingCamel
  object CartShipping {
    
    inline def apply(): CartShipping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CartShipping]
    }
  }
}
