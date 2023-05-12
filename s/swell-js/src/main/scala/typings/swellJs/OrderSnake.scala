package typings.swellJs

import typings.swellJs.mod.BaseModel
import typings.swellJs.mod.Discount
import typings.swellJs.mod.Tax
import typings.swellJs.swellJsStrings.canceled
import typings.swellJs.swellJsStrings.complete
import typings.swellJs.swellJsStrings.delivery_pending
import typings.swellJs.swellJsStrings.draft
import typings.swellJs.swellJsStrings.hold
import typings.swellJs.swellJsStrings.payment_pending
import typings.swellJs.swellJsStrings.pending
import typings.swellJs.typesBillingMod.Billing
import typings.swellJs.typesCartMod.Cart
import typings.swellJs.typesCouponMod.Coupon
import typings.swellJs.typesOrderMod.Order
import typings.swellJs.typesOrderMod.OrderGiftCard
import typings.swellJs.typesOrderMod.OrderShipping
import typings.swellJs.typesPaymentMod.Payment
import typings.swellJs.typesPromotionMod.Promotion
import typings.swellJs.typesPurchaseLinkMod.PurhcaseLink
import typings.swellJs.typesShipmentRatingMod.ShipmentRating
import typings.swellJs.typesSubscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderSnake
  extends StObject
     with BaseModel {
  
  var account: js.UndefOr[Account] = js.undefined
  
  var account_credit_amount: js.UndefOr[Double] = js.undefined
  
  var account_credit_applied: js.UndefOr[Boolean] = js.undefined
  
  var account_id: js.UndefOr[String] = js.undefined
  
  var account_info_saved: js.UndefOr[Boolean] = js.undefined
  
  var account_logged_in: js.UndefOr[Boolean] = js.undefined
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var authorized_payment: js.UndefOr[Payment] = js.undefined
  
  var authorized_payment_id: js.UndefOr[String] = js.undefined
  
  var billing: js.UndefOr[Billing] = js.undefined
  
  var cancel_reason: js.UndefOr[String] = js.undefined
  
  var canceled: js.UndefOr[Boolean] = js.undefined
  
  var cart: js.UndefOr[Cart] = js.undefined
  
  var cart_id: js.UndefOr[String] = js.undefined
  
  var closed: js.UndefOr[Boolean] = js.undefined
  
  var comments: js.UndefOr[String] = js.undefined
  
  var coupon: js.UndefOr[Coupon] = js.undefined
  
  var coupon_code: js.UndefOr[String] = js.undefined
  
  var coupon_id: js.UndefOr[String] = js.undefined
  
  var credit_total: js.UndefOr[Double] = js.undefined
  
  var credits: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currency_rate: js.UndefOr[Double] = js.undefined
  
  var date_canceled: js.UndefOr[String] = js.undefined
  
  var date_payment_retry: js.UndefOr[String] = js.undefined
  
  var date_period_end: js.UndefOr[String] = js.undefined
  
  var date_period_start: js.UndefOr[String] = js.undefined
  
  var date_scheduled: js.UndefOr[String] = js.undefined
  
  var date_webhook_first_failed: js.UndefOr[String] = js.undefined
  
  var date_webhook_last_succeeded: js.UndefOr[String] = js.undefined
  
  var delivered: js.UndefOr[Boolean] = js.undefined
  
  var delivery_marked: js.UndefOr[Boolean] = js.undefined
  
  var discount_total: js.UndefOr[Double] = js.undefined
  
  var discounts: js.UndefOr[js.Array[Discount]] = js.undefined
  
  var display_currency: js.UndefOr[String] = js.undefined
  
  var display_locale: js.UndefOr[String] = js.undefined
  
  var draft: js.UndefOr[Boolean] = js.undefined
  
  var gift: js.UndefOr[Boolean] = js.undefined
  
  var gift_message: js.UndefOr[String] = js.undefined
  
  var giftcard_delivery: js.UndefOr[Boolean] = js.undefined
  
  var giftcard_total: js.UndefOr[Double] = js.undefined
  
  var giftcards: js.UndefOr[js.Array[OrderGiftCard]] = js.undefined
  
  var grand_total: js.UndefOr[Double] = js.undefined
  
  var guest: js.UndefOr[Boolean] = js.undefined
  
  var hold: js.UndefOr[Boolean] = js.undefined
  
  var invoices: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var item_discount: js.UndefOr[Double] = js.undefined
  
  var item_quantity: js.UndefOr[Double] = js.undefined
  
  var item_quantity_canceled: js.UndefOr[Double] = js.undefined
  
  var item_quantity_creditable: js.UndefOr[Double] = js.undefined
  
  var item_quantity_credited: js.UndefOr[Double] = js.undefined
  
  var item_quantity_deliverable: js.UndefOr[Double] = js.undefined
  
  var item_quantity_delivered: js.UndefOr[Double] = js.undefined
  
  var item_quantity_giftcard_deliverable: js.UndefOr[Double] = js.undefined
  
  var item_quantity_invoiceable: js.UndefOr[Double] = js.undefined
  
  var item_quantity_invoiced: js.UndefOr[Double] = js.undefined
  
  var item_quantity_returnable: js.UndefOr[Double] = js.undefined
  
  var item_quantity_returned: js.UndefOr[Double] = js.undefined
  
  var item_quantity_shipment_deliverable: js.UndefOr[Double] = js.undefined
  
  var item_quantity_subscription_deliverable: js.UndefOr[Double] = js.undefined
  
  var item_shipment_weight: js.UndefOr[Double] = js.undefined
  
  var item_tax: js.UndefOr[Double] = js.undefined
  
  var item_tax_included: js.UndefOr[Boolean] = js.undefined
  
  var items: js.UndefOr[js.Array[OrderItemSnake]] = js.undefined
  
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  var next: js.UndefOr[Order] = js.undefined
  
  var next_id: js.UndefOr[String] = js.undefined
  
  var notes: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
  
  var paid: js.UndefOr[Boolean] = js.undefined
  
  var parent_id: js.UndefOr[String] = js.undefined
  
  var payment_balance: js.UndefOr[Double] = js.undefined
  
  var payment_error: js.UndefOr[String] = js.undefined
  
  var payment_marked: js.UndefOr[Boolean] = js.undefined
  
  var payment_retry_count: js.UndefOr[Double] = js.undefined
  
  var payment_retry_resolve: js.UndefOr[String] = js.undefined
  
  var payment_total: js.UndefOr[String] = js.undefined
  
  var payments: js.UndefOr[js.Array[Payment]] = js.undefined
  
  var pending_invoices: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var prev: js.UndefOr[Order] = js.undefined
  
  var prev_id: js.UndefOr[String] = js.undefined
  
  var promotion_ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
  
  var purchase_link_ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var purchase_links: js.UndefOr[js.Array[PurhcaseLink]] = js.undefined
  
  var purchase_links_errors: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var refund_marked: js.UndefOr[Boolean] = js.undefined
  
  var refund_total: js.UndefOr[Double] = js.undefined
  
  var refunded: js.UndefOr[Boolean] = js.undefined
  
  var refunds: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var return_credit_tax: js.UndefOr[Double] = js.undefined
  
  var return_credit_total: js.UndefOr[Double] = js.undefined
  
  var return_item_tax: js.UndefOr[Double] = js.undefined
  
  var return_item_tax_included: js.UndefOr[Double] = js.undefined
  
  var return_item_total: js.UndefOr[Double] = js.undefined
  
  var return_total: js.UndefOr[Double] = js.undefined
  
  var schedule: js.UndefOr[js.Object] = js.undefined
  
  var shipment_delivery: js.UndefOr[Boolean] = js.undefined
  
  var shipment_discount: js.UndefOr[Double] = js.undefined
  
  var shipment_price: js.UndefOr[Double] = js.undefined
  
  var shipment_rating: js.UndefOr[ShipmentRating] = js.undefined
  
  var shipment_tax: js.UndefOr[Double] = js.undefined
  
  var shipment_tax_included: js.UndefOr[Boolean] = js.undefined
  
  var shipment_total: js.UndefOr[Double] = js.undefined
  
  var shipment_total_credited: js.UndefOr[Double] = js.undefined
  
  var shipments: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var shipping: js.UndefOr[OrderShipping] = js.undefined
  
  var status: js.UndefOr[
    pending | draft | payment_pending | delivery_pending | hold | complete | canceled
  ] = js.undefined
  
  var sub_total: js.UndefOr[Double] = js.undefined
  
  var subscription: js.UndefOr[Subscription] = js.undefined
  
  var subscription_delivery: js.UndefOr[Boolean] = js.undefined
  
  var subscription_id: js.UndefOr[String] = js.undefined
  
  var tax_included_total: js.UndefOr[Double] = js.undefined
  
  var tax_total: js.UndefOr[Double] = js.undefined
  
  var taxes: js.UndefOr[js.Array[Tax]] = js.undefined
  
  var taxes_fixed: js.UndefOr[Boolean] = js.undefined
  
  var test: js.UndefOr[Boolean] = js.undefined
  
  var webhook_attempts_failed: js.UndefOr[Double] = js.undefined
  
  var webhook_response: js.UndefOr[String] = js.undefined
  
  var webhook_status: js.UndefOr[Double] = js.undefined
}
object OrderSnake {
  
  inline def apply(): OrderSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderSnake] (val x: Self) extends AnyVal {
    
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
    
    inline def setAuthorized_payment(value: Payment): Self = StObject.set(x, "authorized_payment", value.asInstanceOf[js.Any])
    
    inline def setAuthorized_paymentUndefined: Self = StObject.set(x, "authorized_payment", js.undefined)
    
    inline def setAuthorized_payment_id(value: String): Self = StObject.set(x, "authorized_payment_id", value.asInstanceOf[js.Any])
    
    inline def setAuthorized_payment_idUndefined: Self = StObject.set(x, "authorized_payment_id", js.undefined)
    
    inline def setBilling(value: Billing): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    inline def setCancel_reason(value: String): Self = StObject.set(x, "cancel_reason", value.asInstanceOf[js.Any])
    
    inline def setCancel_reasonUndefined: Self = StObject.set(x, "cancel_reason", js.undefined)
    
    inline def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    inline def setCanceledUndefined: Self = StObject.set(x, "canceled", js.undefined)
    
    inline def setCart(value: Cart): Self = StObject.set(x, "cart", value.asInstanceOf[js.Any])
    
    inline def setCartUndefined: Self = StObject.set(x, "cart", js.undefined)
    
    inline def setCart_id(value: String): Self = StObject.set(x, "cart_id", value.asInstanceOf[js.Any])
    
    inline def setCart_idUndefined: Self = StObject.set(x, "cart_id", js.undefined)
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCoupon(value: Coupon): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
    
    inline def setCoupon_code(value: String): Self = StObject.set(x, "coupon_code", value.asInstanceOf[js.Any])
    
    inline def setCoupon_codeUndefined: Self = StObject.set(x, "coupon_code", js.undefined)
    
    inline def setCoupon_id(value: String): Self = StObject.set(x, "coupon_id", value.asInstanceOf[js.Any])
    
    inline def setCoupon_idUndefined: Self = StObject.set(x, "coupon_id", js.undefined)
    
    inline def setCredit_total(value: Double): Self = StObject.set(x, "credit_total", value.asInstanceOf[js.Any])
    
    inline def setCredit_totalUndefined: Self = StObject.set(x, "credit_total", js.undefined)
    
    inline def setCredits(value: js.Array[js.Object]): Self = StObject.set(x, "credits", value.asInstanceOf[js.Any])
    
    inline def setCreditsUndefined: Self = StObject.set(x, "credits", js.undefined)
    
    inline def setCreditsVarargs(value: js.Object*): Self = StObject.set(x, "credits", js.Array(value*))
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setCurrency_rate(value: Double): Self = StObject.set(x, "currency_rate", value.asInstanceOf[js.Any])
    
    inline def setCurrency_rateUndefined: Self = StObject.set(x, "currency_rate", js.undefined)
    
    inline def setDate_canceled(value: String): Self = StObject.set(x, "date_canceled", value.asInstanceOf[js.Any])
    
    inline def setDate_canceledUndefined: Self = StObject.set(x, "date_canceled", js.undefined)
    
    inline def setDate_payment_retry(value: String): Self = StObject.set(x, "date_payment_retry", value.asInstanceOf[js.Any])
    
    inline def setDate_payment_retryUndefined: Self = StObject.set(x, "date_payment_retry", js.undefined)
    
    inline def setDate_period_end(value: String): Self = StObject.set(x, "date_period_end", value.asInstanceOf[js.Any])
    
    inline def setDate_period_endUndefined: Self = StObject.set(x, "date_period_end", js.undefined)
    
    inline def setDate_period_start(value: String): Self = StObject.set(x, "date_period_start", value.asInstanceOf[js.Any])
    
    inline def setDate_period_startUndefined: Self = StObject.set(x, "date_period_start", js.undefined)
    
    inline def setDate_scheduled(value: String): Self = StObject.set(x, "date_scheduled", value.asInstanceOf[js.Any])
    
    inline def setDate_scheduledUndefined: Self = StObject.set(x, "date_scheduled", js.undefined)
    
    inline def setDate_webhook_first_failed(value: String): Self = StObject.set(x, "date_webhook_first_failed", value.asInstanceOf[js.Any])
    
    inline def setDate_webhook_first_failedUndefined: Self = StObject.set(x, "date_webhook_first_failed", js.undefined)
    
    inline def setDate_webhook_last_succeeded(value: String): Self = StObject.set(x, "date_webhook_last_succeeded", value.asInstanceOf[js.Any])
    
    inline def setDate_webhook_last_succeededUndefined: Self = StObject.set(x, "date_webhook_last_succeeded", js.undefined)
    
    inline def setDelivered(value: Boolean): Self = StObject.set(x, "delivered", value.asInstanceOf[js.Any])
    
    inline def setDeliveredUndefined: Self = StObject.set(x, "delivered", js.undefined)
    
    inline def setDelivery_marked(value: Boolean): Self = StObject.set(x, "delivery_marked", value.asInstanceOf[js.Any])
    
    inline def setDelivery_markedUndefined: Self = StObject.set(x, "delivery_marked", js.undefined)
    
    inline def setDiscount_total(value: Double): Self = StObject.set(x, "discount_total", value.asInstanceOf[js.Any])
    
    inline def setDiscount_totalUndefined: Self = StObject.set(x, "discount_total", js.undefined)
    
    inline def setDiscounts(value: js.Array[Discount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    inline def setDiscountsVarargs(value: Discount*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setDisplay_currency(value: String): Self = StObject.set(x, "display_currency", value.asInstanceOf[js.Any])
    
    inline def setDisplay_currencyUndefined: Self = StObject.set(x, "display_currency", js.undefined)
    
    inline def setDisplay_locale(value: String): Self = StObject.set(x, "display_locale", value.asInstanceOf[js.Any])
    
    inline def setDisplay_localeUndefined: Self = StObject.set(x, "display_locale", js.undefined)
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setGift(value: Boolean): Self = StObject.set(x, "gift", value.asInstanceOf[js.Any])
    
    inline def setGiftUndefined: Self = StObject.set(x, "gift", js.undefined)
    
    inline def setGift_message(value: String): Self = StObject.set(x, "gift_message", value.asInstanceOf[js.Any])
    
    inline def setGift_messageUndefined: Self = StObject.set(x, "gift_message", js.undefined)
    
    inline def setGiftcard_delivery(value: Boolean): Self = StObject.set(x, "giftcard_delivery", value.asInstanceOf[js.Any])
    
    inline def setGiftcard_deliveryUndefined: Self = StObject.set(x, "giftcard_delivery", js.undefined)
    
    inline def setGiftcard_total(value: Double): Self = StObject.set(x, "giftcard_total", value.asInstanceOf[js.Any])
    
    inline def setGiftcard_totalUndefined: Self = StObject.set(x, "giftcard_total", js.undefined)
    
    inline def setGiftcards(value: js.Array[OrderGiftCard]): Self = StObject.set(x, "giftcards", value.asInstanceOf[js.Any])
    
    inline def setGiftcardsUndefined: Self = StObject.set(x, "giftcards", js.undefined)
    
    inline def setGiftcardsVarargs(value: OrderGiftCard*): Self = StObject.set(x, "giftcards", js.Array(value*))
    
    inline def setGrand_total(value: Double): Self = StObject.set(x, "grand_total", value.asInstanceOf[js.Any])
    
    inline def setGrand_totalUndefined: Self = StObject.set(x, "grand_total", js.undefined)
    
    inline def setGuest(value: Boolean): Self = StObject.set(x, "guest", value.asInstanceOf[js.Any])
    
    inline def setGuestUndefined: Self = StObject.set(x, "guest", js.undefined)
    
    inline def setHold(value: Boolean): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
    
    inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
    
    inline def setInvoices(value: js.Array[js.Object]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
    
    inline def setInvoicesUndefined: Self = StObject.set(x, "invoices", js.undefined)
    
    inline def setInvoicesVarargs(value: js.Object*): Self = StObject.set(x, "invoices", js.Array(value*))
    
    inline def setItem_discount(value: Double): Self = StObject.set(x, "item_discount", value.asInstanceOf[js.Any])
    
    inline def setItem_discountUndefined: Self = StObject.set(x, "item_discount", js.undefined)
    
    inline def setItem_quantity(value: Double): Self = StObject.set(x, "item_quantity", value.asInstanceOf[js.Any])
    
    inline def setItem_quantityUndefined: Self = StObject.set(x, "item_quantity", js.undefined)
    
    inline def setItem_quantity_canceled(value: Double): Self = StObject.set(x, "item_quantity_canceled", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_canceledUndefined: Self = StObject.set(x, "item_quantity_canceled", js.undefined)
    
    inline def setItem_quantity_creditable(value: Double): Self = StObject.set(x, "item_quantity_creditable", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_creditableUndefined: Self = StObject.set(x, "item_quantity_creditable", js.undefined)
    
    inline def setItem_quantity_credited(value: Double): Self = StObject.set(x, "item_quantity_credited", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_creditedUndefined: Self = StObject.set(x, "item_quantity_credited", js.undefined)
    
    inline def setItem_quantity_deliverable(value: Double): Self = StObject.set(x, "item_quantity_deliverable", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_deliverableUndefined: Self = StObject.set(x, "item_quantity_deliverable", js.undefined)
    
    inline def setItem_quantity_delivered(value: Double): Self = StObject.set(x, "item_quantity_delivered", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_deliveredUndefined: Self = StObject.set(x, "item_quantity_delivered", js.undefined)
    
    inline def setItem_quantity_giftcard_deliverable(value: Double): Self = StObject.set(x, "item_quantity_giftcard_deliverable", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_giftcard_deliverableUndefined: Self = StObject.set(x, "item_quantity_giftcard_deliverable", js.undefined)
    
    inline def setItem_quantity_invoiceable(value: Double): Self = StObject.set(x, "item_quantity_invoiceable", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_invoiceableUndefined: Self = StObject.set(x, "item_quantity_invoiceable", js.undefined)
    
    inline def setItem_quantity_invoiced(value: Double): Self = StObject.set(x, "item_quantity_invoiced", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_invoicedUndefined: Self = StObject.set(x, "item_quantity_invoiced", js.undefined)
    
    inline def setItem_quantity_returnable(value: Double): Self = StObject.set(x, "item_quantity_returnable", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_returnableUndefined: Self = StObject.set(x, "item_quantity_returnable", js.undefined)
    
    inline def setItem_quantity_returned(value: Double): Self = StObject.set(x, "item_quantity_returned", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_returnedUndefined: Self = StObject.set(x, "item_quantity_returned", js.undefined)
    
    inline def setItem_quantity_shipment_deliverable(value: Double): Self = StObject.set(x, "item_quantity_shipment_deliverable", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_shipment_deliverableUndefined: Self = StObject.set(x, "item_quantity_shipment_deliverable", js.undefined)
    
    inline def setItem_quantity_subscription_deliverable(value: Double): Self = StObject.set(x, "item_quantity_subscription_deliverable", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_subscription_deliverableUndefined: Self = StObject.set(x, "item_quantity_subscription_deliverable", js.undefined)
    
    inline def setItem_shipment_weight(value: Double): Self = StObject.set(x, "item_shipment_weight", value.asInstanceOf[js.Any])
    
    inline def setItem_shipment_weightUndefined: Self = StObject.set(x, "item_shipment_weight", js.undefined)
    
    inline def setItem_tax(value: Double): Self = StObject.set(x, "item_tax", value.asInstanceOf[js.Any])
    
    inline def setItem_taxUndefined: Self = StObject.set(x, "item_tax", js.undefined)
    
    inline def setItem_tax_included(value: Boolean): Self = StObject.set(x, "item_tax_included", value.asInstanceOf[js.Any])
    
    inline def setItem_tax_includedUndefined: Self = StObject.set(x, "item_tax_included", js.undefined)
    
    inline def setItems(value: js.Array[OrderItemSnake]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: OrderItemSnake*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNext(value: Order): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNext_id(value: String): Self = StObject.set(x, "next_id", value.asInstanceOf[js.Any])
    
    inline def setNext_idUndefined: Self = StObject.set(x, "next_id", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setPaid(value: Boolean): Self = StObject.set(x, "paid", value.asInstanceOf[js.Any])
    
    inline def setPaidUndefined: Self = StObject.set(x, "paid", js.undefined)
    
    inline def setParent_id(value: String): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
    
    inline def setParent_idUndefined: Self = StObject.set(x, "parent_id", js.undefined)
    
    inline def setPayment_balance(value: Double): Self = StObject.set(x, "payment_balance", value.asInstanceOf[js.Any])
    
    inline def setPayment_balanceUndefined: Self = StObject.set(x, "payment_balance", js.undefined)
    
    inline def setPayment_error(value: String): Self = StObject.set(x, "payment_error", value.asInstanceOf[js.Any])
    
    inline def setPayment_errorUndefined: Self = StObject.set(x, "payment_error", js.undefined)
    
    inline def setPayment_marked(value: Boolean): Self = StObject.set(x, "payment_marked", value.asInstanceOf[js.Any])
    
    inline def setPayment_markedUndefined: Self = StObject.set(x, "payment_marked", js.undefined)
    
    inline def setPayment_retry_count(value: Double): Self = StObject.set(x, "payment_retry_count", value.asInstanceOf[js.Any])
    
    inline def setPayment_retry_countUndefined: Self = StObject.set(x, "payment_retry_count", js.undefined)
    
    inline def setPayment_retry_resolve(value: String): Self = StObject.set(x, "payment_retry_resolve", value.asInstanceOf[js.Any])
    
    inline def setPayment_retry_resolveUndefined: Self = StObject.set(x, "payment_retry_resolve", js.undefined)
    
    inline def setPayment_total(value: String): Self = StObject.set(x, "payment_total", value.asInstanceOf[js.Any])
    
    inline def setPayment_totalUndefined: Self = StObject.set(x, "payment_total", js.undefined)
    
    inline def setPayments(value: js.Array[Payment]): Self = StObject.set(x, "payments", value.asInstanceOf[js.Any])
    
    inline def setPaymentsUndefined: Self = StObject.set(x, "payments", js.undefined)
    
    inline def setPaymentsVarargs(value: Payment*): Self = StObject.set(x, "payments", js.Array(value*))
    
    inline def setPending_invoices(value: js.Array[js.Object]): Self = StObject.set(x, "pending_invoices", value.asInstanceOf[js.Any])
    
    inline def setPending_invoicesUndefined: Self = StObject.set(x, "pending_invoices", js.undefined)
    
    inline def setPending_invoicesVarargs(value: js.Object*): Self = StObject.set(x, "pending_invoices", js.Array(value*))
    
    inline def setPrev(value: Order): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    inline def setPrev_id(value: String): Self = StObject.set(x, "prev_id", value.asInstanceOf[js.Any])
    
    inline def setPrev_idUndefined: Self = StObject.set(x, "prev_id", js.undefined)
    
    inline def setPromotion_ids(value: js.Array[String]): Self = StObject.set(x, "promotion_ids", value.asInstanceOf[js.Any])
    
    inline def setPromotion_idsUndefined: Self = StObject.set(x, "promotion_ids", js.undefined)
    
    inline def setPromotion_idsVarargs(value: String*): Self = StObject.set(x, "promotion_ids", js.Array(value*))
    
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
    
    inline def setRefund_marked(value: Boolean): Self = StObject.set(x, "refund_marked", value.asInstanceOf[js.Any])
    
    inline def setRefund_markedUndefined: Self = StObject.set(x, "refund_marked", js.undefined)
    
    inline def setRefund_total(value: Double): Self = StObject.set(x, "refund_total", value.asInstanceOf[js.Any])
    
    inline def setRefund_totalUndefined: Self = StObject.set(x, "refund_total", js.undefined)
    
    inline def setRefunded(value: Boolean): Self = StObject.set(x, "refunded", value.asInstanceOf[js.Any])
    
    inline def setRefundedUndefined: Self = StObject.set(x, "refunded", js.undefined)
    
    inline def setRefunds(value: js.Array[js.Object]): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
    
    inline def setRefundsUndefined: Self = StObject.set(x, "refunds", js.undefined)
    
    inline def setRefundsVarargs(value: js.Object*): Self = StObject.set(x, "refunds", js.Array(value*))
    
    inline def setReturn_credit_tax(value: Double): Self = StObject.set(x, "return_credit_tax", value.asInstanceOf[js.Any])
    
    inline def setReturn_credit_taxUndefined: Self = StObject.set(x, "return_credit_tax", js.undefined)
    
    inline def setReturn_credit_total(value: Double): Self = StObject.set(x, "return_credit_total", value.asInstanceOf[js.Any])
    
    inline def setReturn_credit_totalUndefined: Self = StObject.set(x, "return_credit_total", js.undefined)
    
    inline def setReturn_item_tax(value: Double): Self = StObject.set(x, "return_item_tax", value.asInstanceOf[js.Any])
    
    inline def setReturn_item_taxUndefined: Self = StObject.set(x, "return_item_tax", js.undefined)
    
    inline def setReturn_item_tax_included(value: Double): Self = StObject.set(x, "return_item_tax_included", value.asInstanceOf[js.Any])
    
    inline def setReturn_item_tax_includedUndefined: Self = StObject.set(x, "return_item_tax_included", js.undefined)
    
    inline def setReturn_item_total(value: Double): Self = StObject.set(x, "return_item_total", value.asInstanceOf[js.Any])
    
    inline def setReturn_item_totalUndefined: Self = StObject.set(x, "return_item_total", js.undefined)
    
    inline def setReturn_total(value: Double): Self = StObject.set(x, "return_total", value.asInstanceOf[js.Any])
    
    inline def setReturn_totalUndefined: Self = StObject.set(x, "return_total", js.undefined)
    
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
    
    inline def setShipment_total_credited(value: Double): Self = StObject.set(x, "shipment_total_credited", value.asInstanceOf[js.Any])
    
    inline def setShipment_total_creditedUndefined: Self = StObject.set(x, "shipment_total_credited", js.undefined)
    
    inline def setShipments(value: js.Array[js.Object]): Self = StObject.set(x, "shipments", value.asInstanceOf[js.Any])
    
    inline def setShipmentsUndefined: Self = StObject.set(x, "shipments", js.undefined)
    
    inline def setShipmentsVarargs(value: js.Object*): Self = StObject.set(x, "shipments", js.Array(value*))
    
    inline def setShipping(value: OrderShipping): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    inline def setStatus(value: pending | draft | payment_pending | delivery_pending | hold | complete | canceled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSub_total(value: Double): Self = StObject.set(x, "sub_total", value.asInstanceOf[js.Any])
    
    inline def setSub_totalUndefined: Self = StObject.set(x, "sub_total", js.undefined)
    
    inline def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setSubscription_delivery(value: Boolean): Self = StObject.set(x, "subscription_delivery", value.asInstanceOf[js.Any])
    
    inline def setSubscription_deliveryUndefined: Self = StObject.set(x, "subscription_delivery", js.undefined)
    
    inline def setSubscription_id(value: String): Self = StObject.set(x, "subscription_id", value.asInstanceOf[js.Any])
    
    inline def setSubscription_idUndefined: Self = StObject.set(x, "subscription_id", js.undefined)
    
    inline def setTax_included_total(value: Double): Self = StObject.set(x, "tax_included_total", value.asInstanceOf[js.Any])
    
    inline def setTax_included_totalUndefined: Self = StObject.set(x, "tax_included_total", js.undefined)
    
    inline def setTax_total(value: Double): Self = StObject.set(x, "tax_total", value.asInstanceOf[js.Any])
    
    inline def setTax_totalUndefined: Self = StObject.set(x, "tax_total", js.undefined)
    
    inline def setTaxes(value: js.Array[Tax]): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
    
    inline def setTaxesUndefined: Self = StObject.set(x, "taxes", js.undefined)
    
    inline def setTaxesVarargs(value: Tax*): Self = StObject.set(x, "taxes", js.Array(value*))
    
    inline def setTaxes_fixed(value: Boolean): Self = StObject.set(x, "taxes_fixed", value.asInstanceOf[js.Any])
    
    inline def setTaxes_fixedUndefined: Self = StObject.set(x, "taxes_fixed", js.undefined)
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setWebhook_attempts_failed(value: Double): Self = StObject.set(x, "webhook_attempts_failed", value.asInstanceOf[js.Any])
    
    inline def setWebhook_attempts_failedUndefined: Self = StObject.set(x, "webhook_attempts_failed", js.undefined)
    
    inline def setWebhook_response(value: String): Self = StObject.set(x, "webhook_response", value.asInstanceOf[js.Any])
    
    inline def setWebhook_responseUndefined: Self = StObject.set(x, "webhook_response", js.undefined)
    
    inline def setWebhook_status(value: Double): Self = StObject.set(x, "webhook_status", value.asInstanceOf[js.Any])
    
    inline def setWebhook_statusUndefined: Self = StObject.set(x, "webhook_status", js.undefined)
  }
}
