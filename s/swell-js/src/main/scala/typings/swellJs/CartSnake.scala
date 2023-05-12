package typings.swellJs

import typings.swellJs.mod.BaseModel
import typings.swellJs.mod.Discount
import typings.swellJs.mod.Tax
import typings.swellJs.swellJsStrings.abandoned
import typings.swellJs.swellJsStrings.active
import typings.swellJs.swellJsStrings.converted
import typings.swellJs.swellJsStrings.recovered
import typings.swellJs.typesBillingMod.Billing
import typings.swellJs.typesCartMod.CartGiftCardItem
import typings.swellJs.typesCartMod.CartShipping
import typings.swellJs.typesCouponMod.Coupon
import typings.swellJs.typesOrderMod.Order
import typings.swellJs.typesPromotionMod.Promotion
import typings.swellJs.typesPurchaseLinkMod.PurhcaseLink
import typings.swellJs.typesShipmentRatingMod.ShipmentRating
import typings.swellJs.typesSubscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartSnake
  extends StObject
     with BaseModel {
  
  var abandoned: js.UndefOr[Boolean] = js.undefined
  
  var abandoned_notifications: js.UndefOr[Double] = js.undefined
  
  var account: js.UndefOr[Account] = js.undefined
  
  var account_credit_amount: js.UndefOr[Double] = js.undefined
  
  var account_credit_applied: js.UndefOr[Boolean] = js.undefined
  
  var account_id: js.UndefOr[String] = js.undefined
  
  var account_info_saved: js.UndefOr[Boolean] = js.undefined
  
  var account_logged_in: js.UndefOr[Boolean] = js.undefined
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var billing: js.UndefOr[Billing] = js.undefined
  
  var checkout_id: js.UndefOr[String] = js.undefined
  
  var checkout_url: js.UndefOr[String] = js.undefined
  
  var comments: js.UndefOr[String] = js.undefined
  
  var coupon: js.UndefOr[Coupon] = js.undefined
  
  var coupon_code: js.UndefOr[String] = js.undefined
  
  var coupon_id: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currency_rate: js.UndefOr[Double] = js.undefined
  
  var date_abandoned: js.UndefOr[String] = js.undefined
  
  var date_abandoned_next: js.UndefOr[String] = js.undefined
  
  var date_webhook_first_failed: js.UndefOr[String] = js.undefined
  
  var date_webhook_last_succeeded: js.UndefOr[String] = js.undefined
  
  var discount_total: js.UndefOr[Double] = js.undefined
  
  var discounts: js.UndefOr[js.Array[Discount]] = js.undefined
  
  var display_currency: js.UndefOr[String] = js.undefined
  
  var display_locale: js.UndefOr[String] = js.undefined
  
  var gift: js.UndefOr[Boolean] = js.undefined
  
  var gift_message: js.UndefOr[String] = js.undefined
  
  var giftcard_delivery: js.UndefOr[Boolean] = js.undefined
  
  var giftcard_total: js.UndefOr[Double] = js.undefined
  
  var giftcards: js.UndefOr[js.Array[CartGiftCardItem]] = js.undefined
  
  var grand_total: js.UndefOr[Double] = js.undefined
  
  var guest: js.UndefOr[Boolean] = js.undefined
  
  var item_discount: js.UndefOr[Double] = js.undefined
  
  var item_quantity: js.UndefOr[Double] = js.undefined
  
  var item_shipment_weight: js.UndefOr[Double] = js.undefined
  
  var item_tax: js.UndefOr[Double] = js.undefined
  
  var item_tax_included: js.UndefOr[Boolean] = js.undefined
  
  var items: js.UndefOr[js.Array[CartItemSnake]] = js.undefined
  
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  var notes: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
  
  var order: js.UndefOr[Order] = js.undefined
  
  var order_id: js.UndefOr[String] = js.undefined
  
  var orig_price: js.UndefOr[Double] = js.undefined
  
  var promotion_ids: js.UndefOr[js.Array[Any]] = js.undefined
  
  var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
  
  var purchase_link_ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var purchase_links: js.UndefOr[js.Array[PurhcaseLink]] = js.undefined
  
  var purchase_links_errors: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var recovered: js.UndefOr[Boolean] = js.undefined
  
  var schedule: js.UndefOr[js.Object] = js.undefined
  
  var shipment_delivery: js.UndefOr[Boolean] = js.undefined
  
  var shipment_discount: js.UndefOr[Double] = js.undefined
  
  var shipment_price: js.UndefOr[Double] = js.undefined
  
  var shipment_rating: js.UndefOr[ShipmentRating] = js.undefined
  
  var shipment_tax: js.UndefOr[Double] = js.undefined
  
  var shipment_tax_included: js.UndefOr[Boolean] = js.undefined
  
  var shipment_total: js.UndefOr[Double] = js.undefined
  
  var shipping: js.UndefOr[CartShipping] = js.undefined
  
  var status: js.UndefOr[active | converted | abandoned | recovered] = js.undefined
  
  var sub_total: js.UndefOr[Double] = js.undefined
  
  var subscription: js.UndefOr[Subscription] = js.undefined
  
  var subscription_delivery: js.UndefOr[Boolean] = js.undefined
  
  var subscription_id: js.UndefOr[String] = js.undefined
  
  var target_order: js.UndefOr[Order] = js.undefined
  
  var target_order_id: js.UndefOr[String] = js.undefined
  
  var tax_included_total: js.UndefOr[Double] = js.undefined
  
  var tax_total: js.UndefOr[Double] = js.undefined
  
  var taxes: js.UndefOr[js.Array[Tax]] = js.undefined
  
  var taxes_fixed: js.UndefOr[Boolean] = js.undefined
  
  var webhook_attempts_failed: js.UndefOr[Double] = js.undefined
  
  var webhook_response: js.UndefOr[String] = js.undefined
  
  var webhook_status: js.UndefOr[Double] = js.undefined
}
object CartSnake {
  
  inline def apply(): CartSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CartSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartSnake] (val x: Self) extends AnyVal {
    
    inline def setAbandoned(value: Boolean): Self = StObject.set(x, "abandoned", value.asInstanceOf[js.Any])
    
    inline def setAbandonedUndefined: Self = StObject.set(x, "abandoned", js.undefined)
    
    inline def setAbandoned_notifications(value: Double): Self = StObject.set(x, "abandoned_notifications", value.asInstanceOf[js.Any])
    
    inline def setAbandoned_notificationsUndefined: Self = StObject.set(x, "abandoned_notifications", js.undefined)
    
    inline def setAccount(value: Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAccount_credit_amount(value: Double): Self = StObject.set(x, "account_credit_amount", value.asInstanceOf[js.Any])
    
    inline def setAccount_credit_amountUndefined: Self = StObject.set(x, "account_credit_amount", js.undefined)
    
    inline def setAccount_credit_applied(value: Boolean): Self = StObject.set(x, "account_credit_applied", value.asInstanceOf[js.Any])
    
    inline def setAccount_credit_appliedUndefined: Self = StObject.set(x, "account_credit_applied", js.undefined)
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
    
    inline def setAccount_info_saved(value: Boolean): Self = StObject.set(x, "account_info_saved", value.asInstanceOf[js.Any])
    
    inline def setAccount_info_savedUndefined: Self = StObject.set(x, "account_info_saved", js.undefined)
    
    inline def setAccount_logged_in(value: Boolean): Self = StObject.set(x, "account_logged_in", value.asInstanceOf[js.Any])
    
    inline def setAccount_logged_inUndefined: Self = StObject.set(x, "account_logged_in", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setBilling(value: Billing): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    inline def setCheckout_id(value: String): Self = StObject.set(x, "checkout_id", value.asInstanceOf[js.Any])
    
    inline def setCheckout_idUndefined: Self = StObject.set(x, "checkout_id", js.undefined)
    
    inline def setCheckout_url(value: String): Self = StObject.set(x, "checkout_url", value.asInstanceOf[js.Any])
    
    inline def setCheckout_urlUndefined: Self = StObject.set(x, "checkout_url", js.undefined)
    
    inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCoupon(value: Coupon): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
    
    inline def setCoupon_code(value: String): Self = StObject.set(x, "coupon_code", value.asInstanceOf[js.Any])
    
    inline def setCoupon_codeUndefined: Self = StObject.set(x, "coupon_code", js.undefined)
    
    inline def setCoupon_id(value: String): Self = StObject.set(x, "coupon_id", value.asInstanceOf[js.Any])
    
    inline def setCoupon_idUndefined: Self = StObject.set(x, "coupon_id", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setCurrency_rate(value: Double): Self = StObject.set(x, "currency_rate", value.asInstanceOf[js.Any])
    
    inline def setCurrency_rateUndefined: Self = StObject.set(x, "currency_rate", js.undefined)
    
    inline def setDate_abandoned(value: String): Self = StObject.set(x, "date_abandoned", value.asInstanceOf[js.Any])
    
    inline def setDate_abandonedUndefined: Self = StObject.set(x, "date_abandoned", js.undefined)
    
    inline def setDate_abandoned_next(value: String): Self = StObject.set(x, "date_abandoned_next", value.asInstanceOf[js.Any])
    
    inline def setDate_abandoned_nextUndefined: Self = StObject.set(x, "date_abandoned_next", js.undefined)
    
    inline def setDate_webhook_first_failed(value: String): Self = StObject.set(x, "date_webhook_first_failed", value.asInstanceOf[js.Any])
    
    inline def setDate_webhook_first_failedUndefined: Self = StObject.set(x, "date_webhook_first_failed", js.undefined)
    
    inline def setDate_webhook_last_succeeded(value: String): Self = StObject.set(x, "date_webhook_last_succeeded", value.asInstanceOf[js.Any])
    
    inline def setDate_webhook_last_succeededUndefined: Self = StObject.set(x, "date_webhook_last_succeeded", js.undefined)
    
    inline def setDiscount_total(value: Double): Self = StObject.set(x, "discount_total", value.asInstanceOf[js.Any])
    
    inline def setDiscount_totalUndefined: Self = StObject.set(x, "discount_total", js.undefined)
    
    inline def setDiscounts(value: js.Array[Discount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    inline def setDiscountsVarargs(value: Discount*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setDisplay_currency(value: String): Self = StObject.set(x, "display_currency", value.asInstanceOf[js.Any])
    
    inline def setDisplay_currencyUndefined: Self = StObject.set(x, "display_currency", js.undefined)
    
    inline def setDisplay_locale(value: String): Self = StObject.set(x, "display_locale", value.asInstanceOf[js.Any])
    
    inline def setDisplay_localeUndefined: Self = StObject.set(x, "display_locale", js.undefined)
    
    inline def setGift(value: Boolean): Self = StObject.set(x, "gift", value.asInstanceOf[js.Any])
    
    inline def setGiftUndefined: Self = StObject.set(x, "gift", js.undefined)
    
    inline def setGift_message(value: String): Self = StObject.set(x, "gift_message", value.asInstanceOf[js.Any])
    
    inline def setGift_messageUndefined: Self = StObject.set(x, "gift_message", js.undefined)
    
    inline def setGiftcard_delivery(value: Boolean): Self = StObject.set(x, "giftcard_delivery", value.asInstanceOf[js.Any])
    
    inline def setGiftcard_deliveryUndefined: Self = StObject.set(x, "giftcard_delivery", js.undefined)
    
    inline def setGiftcard_total(value: Double): Self = StObject.set(x, "giftcard_total", value.asInstanceOf[js.Any])
    
    inline def setGiftcard_totalUndefined: Self = StObject.set(x, "giftcard_total", js.undefined)
    
    inline def setGiftcards(value: js.Array[CartGiftCardItem]): Self = StObject.set(x, "giftcards", value.asInstanceOf[js.Any])
    
    inline def setGiftcardsUndefined: Self = StObject.set(x, "giftcards", js.undefined)
    
    inline def setGiftcardsVarargs(value: CartGiftCardItem*): Self = StObject.set(x, "giftcards", js.Array(value*))
    
    inline def setGrand_total(value: Double): Self = StObject.set(x, "grand_total", value.asInstanceOf[js.Any])
    
    inline def setGrand_totalUndefined: Self = StObject.set(x, "grand_total", js.undefined)
    
    inline def setGuest(value: Boolean): Self = StObject.set(x, "guest", value.asInstanceOf[js.Any])
    
    inline def setGuestUndefined: Self = StObject.set(x, "guest", js.undefined)
    
    inline def setItem_discount(value: Double): Self = StObject.set(x, "item_discount", value.asInstanceOf[js.Any])
    
    inline def setItem_discountUndefined: Self = StObject.set(x, "item_discount", js.undefined)
    
    inline def setItem_quantity(value: Double): Self = StObject.set(x, "item_quantity", value.asInstanceOf[js.Any])
    
    inline def setItem_quantityUndefined: Self = StObject.set(x, "item_quantity", js.undefined)
    
    inline def setItem_shipment_weight(value: Double): Self = StObject.set(x, "item_shipment_weight", value.asInstanceOf[js.Any])
    
    inline def setItem_shipment_weightUndefined: Self = StObject.set(x, "item_shipment_weight", js.undefined)
    
    inline def setItem_tax(value: Double): Self = StObject.set(x, "item_tax", value.asInstanceOf[js.Any])
    
    inline def setItem_taxUndefined: Self = StObject.set(x, "item_tax", js.undefined)
    
    inline def setItem_tax_included(value: Boolean): Self = StObject.set(x, "item_tax_included", value.asInstanceOf[js.Any])
    
    inline def setItem_tax_includedUndefined: Self = StObject.set(x, "item_tax_included", js.undefined)
    
    inline def setItems(value: js.Array[CartItemSnake]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: CartItemSnake*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrder_id(value: String): Self = StObject.set(x, "order_id", value.asInstanceOf[js.Any])
    
    inline def setOrder_idUndefined: Self = StObject.set(x, "order_id", js.undefined)
    
    inline def setOrig_price(value: Double): Self = StObject.set(x, "orig_price", value.asInstanceOf[js.Any])
    
    inline def setOrig_priceUndefined: Self = StObject.set(x, "orig_price", js.undefined)
    
    inline def setPromotion_ids(value: js.Array[Any]): Self = StObject.set(x, "promotion_ids", value.asInstanceOf[js.Any])
    
    inline def setPromotion_idsUndefined: Self = StObject.set(x, "promotion_ids", js.undefined)
    
    inline def setPromotion_idsVarargs(value: Any*): Self = StObject.set(x, "promotion_ids", js.Array(value*))
    
    inline def setPromotions(value: js.Array[Promotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    inline def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    inline def setPromotionsVarargs(value: Promotion*): Self = StObject.set(x, "promotions", js.Array(value*))
    
    inline def setPurchase_link_ids(value: js.Array[String]): Self = StObject.set(x, "purchase_link_ids", value.asInstanceOf[js.Any])
    
    inline def setPurchase_link_idsUndefined: Self = StObject.set(x, "purchase_link_ids", js.undefined)
    
    inline def setPurchase_link_idsVarargs(value: String*): Self = StObject.set(x, "purchase_link_ids", js.Array(value*))
    
    inline def setPurchase_links(value: js.Array[PurhcaseLink]): Self = StObject.set(x, "purchase_links", value.asInstanceOf[js.Any])
    
    inline def setPurchase_linksUndefined: Self = StObject.set(x, "purchase_links", js.undefined)
    
    inline def setPurchase_linksVarargs(value: PurhcaseLink*): Self = StObject.set(x, "purchase_links", js.Array(value*))
    
    inline def setPurchase_links_errors(value: js.Array[js.Object]): Self = StObject.set(x, "purchase_links_errors", value.asInstanceOf[js.Any])
    
    inline def setPurchase_links_errorsUndefined: Self = StObject.set(x, "purchase_links_errors", js.undefined)
    
    inline def setPurchase_links_errorsVarargs(value: js.Object*): Self = StObject.set(x, "purchase_links_errors", js.Array(value*))
    
    inline def setRecovered(value: Boolean): Self = StObject.set(x, "recovered", value.asInstanceOf[js.Any])
    
    inline def setRecoveredUndefined: Self = StObject.set(x, "recovered", js.undefined)
    
    inline def setSchedule(value: js.Object): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setShipment_delivery(value: Boolean): Self = StObject.set(x, "shipment_delivery", value.asInstanceOf[js.Any])
    
    inline def setShipment_deliveryUndefined: Self = StObject.set(x, "shipment_delivery", js.undefined)
    
    inline def setShipment_discount(value: Double): Self = StObject.set(x, "shipment_discount", value.asInstanceOf[js.Any])
    
    inline def setShipment_discountUndefined: Self = StObject.set(x, "shipment_discount", js.undefined)
    
    inline def setShipment_price(value: Double): Self = StObject.set(x, "shipment_price", value.asInstanceOf[js.Any])
    
    inline def setShipment_priceUndefined: Self = StObject.set(x, "shipment_price", js.undefined)
    
    inline def setShipment_rating(value: ShipmentRating): Self = StObject.set(x, "shipment_rating", value.asInstanceOf[js.Any])
    
    inline def setShipment_ratingUndefined: Self = StObject.set(x, "shipment_rating", js.undefined)
    
    inline def setShipment_tax(value: Double): Self = StObject.set(x, "shipment_tax", value.asInstanceOf[js.Any])
    
    inline def setShipment_taxUndefined: Self = StObject.set(x, "shipment_tax", js.undefined)
    
    inline def setShipment_tax_included(value: Boolean): Self = StObject.set(x, "shipment_tax_included", value.asInstanceOf[js.Any])
    
    inline def setShipment_tax_includedUndefined: Self = StObject.set(x, "shipment_tax_included", js.undefined)
    
    inline def setShipment_total(value: Double): Self = StObject.set(x, "shipment_total", value.asInstanceOf[js.Any])
    
    inline def setShipment_totalUndefined: Self = StObject.set(x, "shipment_total", js.undefined)
    
    inline def setShipping(value: CartShipping): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    inline def setStatus(value: active | converted | abandoned | recovered): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSub_total(value: Double): Self = StObject.set(x, "sub_total", value.asInstanceOf[js.Any])
    
    inline def setSub_totalUndefined: Self = StObject.set(x, "sub_total", js.undefined)
    
    inline def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setSubscription_delivery(value: Boolean): Self = StObject.set(x, "subscription_delivery", value.asInstanceOf[js.Any])
    
    inline def setSubscription_deliveryUndefined: Self = StObject.set(x, "subscription_delivery", js.undefined)
    
    inline def setSubscription_id(value: String): Self = StObject.set(x, "subscription_id", value.asInstanceOf[js.Any])
    
    inline def setSubscription_idUndefined: Self = StObject.set(x, "subscription_id", js.undefined)
    
    inline def setTarget_order(value: Order): Self = StObject.set(x, "target_order", value.asInstanceOf[js.Any])
    
    inline def setTarget_orderUndefined: Self = StObject.set(x, "target_order", js.undefined)
    
    inline def setTarget_order_id(value: String): Self = StObject.set(x, "target_order_id", value.asInstanceOf[js.Any])
    
    inline def setTarget_order_idUndefined: Self = StObject.set(x, "target_order_id", js.undefined)
    
    inline def setTax_included_total(value: Double): Self = StObject.set(x, "tax_included_total", value.asInstanceOf[js.Any])
    
    inline def setTax_included_totalUndefined: Self = StObject.set(x, "tax_included_total", js.undefined)
    
    inline def setTax_total(value: Double): Self = StObject.set(x, "tax_total", value.asInstanceOf[js.Any])
    
    inline def setTax_totalUndefined: Self = StObject.set(x, "tax_total", js.undefined)
    
    inline def setTaxes(value: js.Array[Tax]): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
    
    inline def setTaxesUndefined: Self = StObject.set(x, "taxes", js.undefined)
    
    inline def setTaxesVarargs(value: Tax*): Self = StObject.set(x, "taxes", js.Array(value*))
    
    inline def setTaxes_fixed(value: Boolean): Self = StObject.set(x, "taxes_fixed", value.asInstanceOf[js.Any])
    
    inline def setTaxes_fixedUndefined: Self = StObject.set(x, "taxes_fixed", js.undefined)
    
    inline def setWebhook_attempts_failed(value: Double): Self = StObject.set(x, "webhook_attempts_failed", value.asInstanceOf[js.Any])
    
    inline def setWebhook_attempts_failedUndefined: Self = StObject.set(x, "webhook_attempts_failed", js.undefined)
    
    inline def setWebhook_response(value: String): Self = StObject.set(x, "webhook_response", value.asInstanceOf[js.Any])
    
    inline def setWebhook_responseUndefined: Self = StObject.set(x, "webhook_response", js.undefined)
    
    inline def setWebhook_status(value: Double): Self = StObject.set(x, "webhook_status", value.asInstanceOf[js.Any])
    
    inline def setWebhook_statusUndefined: Self = StObject.set(x, "webhook_status", js.undefined)
  }
}
