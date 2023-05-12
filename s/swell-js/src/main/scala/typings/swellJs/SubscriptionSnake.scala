package typings.swellJs

import typings.swellJs.mod.BaseModel
import typings.swellJs.mod.Discount
import typings.swellJs.mod.Tax
import typings.swellJs.swellJsStrings.active
import typings.swellJs.swellJsStrings.canceled
import typings.swellJs.swellJsStrings.complete
import typings.swellJs.swellJsStrings.daily
import typings.swellJs.swellJsStrings.monthly
import typings.swellJs.swellJsStrings.paid
import typings.swellJs.swellJsStrings.pastdue
import typings.swellJs.swellJsStrings.pending
import typings.swellJs.swellJsStrings.trial
import typings.swellJs.swellJsStrings.unpaid
import typings.swellJs.swellJsStrings.weekly
import typings.swellJs.swellJsStrings.yearly
import typings.swellJs.typesBillingMod.Billing
import typings.swellJs.typesCouponMod.Coupon
import typings.swellJs.typesInvoiceMod.Invoice
import typings.swellJs.typesPaymentMod.Payment
import typings.swellJs.typesProductMod.Product
import typings.swellJs.typesProductMod.Variant
import typings.swellJs.typesRefundMod.Refund
import typings.swellJs.typesSubscriptionMod.SubscriptionBillingSchedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionSnake
  extends StObject
     with BaseModel {
  
  var account: js.UndefOr[Account] = js.undefined
  
  var account_id: js.UndefOr[String] = js.undefined
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var billing: js.UndefOr[Billing] = js.undefined
  
  var billing_schedule: js.UndefOr[SubscriptionBillingSchedule] = js.undefined
  
  var bundle_item_id: js.UndefOr[String] = js.undefined
  
  var cancel_at_end: js.UndefOr[Boolean] = js.undefined
  
  var cancel_reason: js.UndefOr[String] = js.undefined
  
  var canceled: js.UndefOr[Boolean] = js.undefined
  
  var complete: js.UndefOr[Boolean] = js.undefined
  
  var coupon: js.UndefOr[Coupon] = js.undefined
  
  var coupon_code: js.UndefOr[String] = js.undefined
  
  var coupon_id: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currency_rate: js.UndefOr[String] = js.undefined
  
  var date_canceled: js.UndefOr[String] = js.undefined
  
  var date_order_cycle_start: js.UndefOr[String] = js.undefined
  
  var date_order_period_end: js.UndefOr[String] = js.undefined
  
  var date_order_period_start: js.UndefOr[String] = js.undefined
  
  var date_payment_expiring: js.UndefOr[String] = js.undefined
  
  var date_payment_failed: js.UndefOr[String] = js.undefined
  
  var date_payment_retry: js.UndefOr[String] = js.undefined
  
  var date_period_end: js.UndefOr[String] = js.undefined
  
  var date_period_start: js.UndefOr[String] = js.undefined
  
  var date_prorated: js.UndefOr[String] = js.undefined
  
  var date_resumed: js.UndefOr[String] = js.undefined
  
  var date_trial_end: js.UndefOr[String] = js.undefined
  
  var date_trial_start: js.UndefOr[String] = js.undefined
  
  var discount_total: js.UndefOr[Double] = js.undefined
  
  var discounts: js.UndefOr[js.Array[Discount]] = js.undefined
  
  var draft: js.UndefOr[Boolean] = js.undefined
  
  var grand_total: js.UndefOr[Double] = js.undefined
  
  var interval: js.UndefOr[monthly | yearly | weekly | daily] = js.undefined
  
  var interval_count: js.UndefOr[Double] = js.undefined
  
  var invoice_total: js.UndefOr[Double] = js.undefined
  
  var invoices: js.UndefOr[js.Array[Invoice]] = js.undefined
  
  var item_discount: js.UndefOr[Double] = js.undefined
  
  var item_tax: js.UndefOr[Double] = js.undefined
  
  var item_total: js.UndefOr[Double] = js.undefined
  
  var items: js.UndefOr[js.Array[SubscriptionItems]] = js.undefined
  
  var notes: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var order_id: js.UndefOr[String] = js.undefined
  
  var order_item_id: js.UndefOr[String] = js.undefined
  
  var order_schedule: js.UndefOr[String] = js.undefined
  
  var ordering: js.UndefOr[Boolean] = js.undefined
  
  var orders: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var paid: js.UndefOr[Boolean] = js.undefined
  
  var payment_balance: js.UndefOr[Double] = js.undefined
  
  var payment_total: js.UndefOr[Double] = js.undefined
  
  var payments: js.UndefOr[js.Array[Payment]] = js.undefined
  
  var pending_invoices: js.UndefOr[js.Array[Invoice]] = js.undefined
  
  var plan_id: js.UndefOr[String] = js.undefined
  
  var plan_name: js.UndefOr[String] = js.undefined
  
  var price: js.UndefOr[Double] = js.undefined
  
  var price_total: js.UndefOr[Double] = js.undefined
  
  var product: js.UndefOr[Product] = js.undefined
  
  var product_discount_each: js.UndefOr[Double] = js.undefined
  
  var product_discount_total: js.UndefOr[Double] = js.undefined
  
  var product_discounts: js.UndefOr[Double] = js.undefined
  
  var product_id: js.UndefOr[String] = js.undefined
  
  var product_name: js.UndefOr[String] = js.undefined
  
  var product_tax_each: js.UndefOr[Double] = js.undefined
  
  var product_tax_total: js.UndefOr[Double] = js.undefined
  
  var product_taxes: js.UndefOr[Double] = js.undefined
  
  var prorated: js.UndefOr[Boolean] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
  
  var recurring_discount_total: js.UndefOr[Double] = js.undefined
  
  var recurring_item_discount: js.UndefOr[Double] = js.undefined
  
  var recurring_item_tax: js.UndefOr[Double] = js.undefined
  
  var recurring_item_total: js.UndefOr[Double] = js.undefined
  
  var recurring_tax_included_total: js.UndefOr[Double] = js.undefined
  
  var recurring_tax_total: js.UndefOr[Double] = js.undefined
  
  var recurring_total: js.UndefOr[Double] = js.undefined
  
  var refund_total: js.UndefOr[Double] = js.undefined
  
  var refunds: js.UndefOr[Refund] = js.undefined
  
  var status: js.UndefOr[pending | active | trial | pastdue | unpaid | canceled | paid | complete] = js.undefined
  
  var sub_total: js.UndefOr[Double] = js.undefined
  
  var tax_included_total: js.UndefOr[Double] = js.undefined
  
  var tax_total: js.UndefOr[Double] = js.undefined
  
  var taxes: js.UndefOr[js.Array[Tax]] = js.undefined
  
  var taxes_fixed: js.UndefOr[Boolean] = js.undefined
  
  var trial: js.UndefOr[Boolean] = js.undefined
  
  var trial_days: js.UndefOr[Double] = js.undefined
  
  var unpaid: js.UndefOr[Boolean] = js.undefined
  
  var variant: js.UndefOr[Variant] = js.undefined
  
  var variant_id: js.UndefOr[String] = js.undefined
}
object SubscriptionSnake {
  
  inline def apply(): SubscriptionSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionSnake] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setBilling(value: Billing): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    inline def setBilling_schedule(value: SubscriptionBillingSchedule): Self = StObject.set(x, "billing_schedule", value.asInstanceOf[js.Any])
    
    inline def setBilling_scheduleUndefined: Self = StObject.set(x, "billing_schedule", js.undefined)
    
    inline def setBundle_item_id(value: String): Self = StObject.set(x, "bundle_item_id", value.asInstanceOf[js.Any])
    
    inline def setBundle_item_idUndefined: Self = StObject.set(x, "bundle_item_id", js.undefined)
    
    inline def setCancel_at_end(value: Boolean): Self = StObject.set(x, "cancel_at_end", value.asInstanceOf[js.Any])
    
    inline def setCancel_at_endUndefined: Self = StObject.set(x, "cancel_at_end", js.undefined)
    
    inline def setCancel_reason(value: String): Self = StObject.set(x, "cancel_reason", value.asInstanceOf[js.Any])
    
    inline def setCancel_reasonUndefined: Self = StObject.set(x, "cancel_reason", js.undefined)
    
    inline def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    inline def setCanceledUndefined: Self = StObject.set(x, "canceled", js.undefined)
    
    inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCoupon(value: Coupon): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
    
    inline def setCoupon_code(value: String): Self = StObject.set(x, "coupon_code", value.asInstanceOf[js.Any])
    
    inline def setCoupon_codeUndefined: Self = StObject.set(x, "coupon_code", js.undefined)
    
    inline def setCoupon_id(value: String): Self = StObject.set(x, "coupon_id", value.asInstanceOf[js.Any])
    
    inline def setCoupon_idUndefined: Self = StObject.set(x, "coupon_id", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setCurrency_rate(value: String): Self = StObject.set(x, "currency_rate", value.asInstanceOf[js.Any])
    
    inline def setCurrency_rateUndefined: Self = StObject.set(x, "currency_rate", js.undefined)
    
    inline def setDate_canceled(value: String): Self = StObject.set(x, "date_canceled", value.asInstanceOf[js.Any])
    
    inline def setDate_canceledUndefined: Self = StObject.set(x, "date_canceled", js.undefined)
    
    inline def setDate_order_cycle_start(value: String): Self = StObject.set(x, "date_order_cycle_start", value.asInstanceOf[js.Any])
    
    inline def setDate_order_cycle_startUndefined: Self = StObject.set(x, "date_order_cycle_start", js.undefined)
    
    inline def setDate_order_period_end(value: String): Self = StObject.set(x, "date_order_period_end", value.asInstanceOf[js.Any])
    
    inline def setDate_order_period_endUndefined: Self = StObject.set(x, "date_order_period_end", js.undefined)
    
    inline def setDate_order_period_start(value: String): Self = StObject.set(x, "date_order_period_start", value.asInstanceOf[js.Any])
    
    inline def setDate_order_period_startUndefined: Self = StObject.set(x, "date_order_period_start", js.undefined)
    
    inline def setDate_payment_expiring(value: String): Self = StObject.set(x, "date_payment_expiring", value.asInstanceOf[js.Any])
    
    inline def setDate_payment_expiringUndefined: Self = StObject.set(x, "date_payment_expiring", js.undefined)
    
    inline def setDate_payment_failed(value: String): Self = StObject.set(x, "date_payment_failed", value.asInstanceOf[js.Any])
    
    inline def setDate_payment_failedUndefined: Self = StObject.set(x, "date_payment_failed", js.undefined)
    
    inline def setDate_payment_retry(value: String): Self = StObject.set(x, "date_payment_retry", value.asInstanceOf[js.Any])
    
    inline def setDate_payment_retryUndefined: Self = StObject.set(x, "date_payment_retry", js.undefined)
    
    inline def setDate_period_end(value: String): Self = StObject.set(x, "date_period_end", value.asInstanceOf[js.Any])
    
    inline def setDate_period_endUndefined: Self = StObject.set(x, "date_period_end", js.undefined)
    
    inline def setDate_period_start(value: String): Self = StObject.set(x, "date_period_start", value.asInstanceOf[js.Any])
    
    inline def setDate_period_startUndefined: Self = StObject.set(x, "date_period_start", js.undefined)
    
    inline def setDate_prorated(value: String): Self = StObject.set(x, "date_prorated", value.asInstanceOf[js.Any])
    
    inline def setDate_proratedUndefined: Self = StObject.set(x, "date_prorated", js.undefined)
    
    inline def setDate_resumed(value: String): Self = StObject.set(x, "date_resumed", value.asInstanceOf[js.Any])
    
    inline def setDate_resumedUndefined: Self = StObject.set(x, "date_resumed", js.undefined)
    
    inline def setDate_trial_end(value: String): Self = StObject.set(x, "date_trial_end", value.asInstanceOf[js.Any])
    
    inline def setDate_trial_endUndefined: Self = StObject.set(x, "date_trial_end", js.undefined)
    
    inline def setDate_trial_start(value: String): Self = StObject.set(x, "date_trial_start", value.asInstanceOf[js.Any])
    
    inline def setDate_trial_startUndefined: Self = StObject.set(x, "date_trial_start", js.undefined)
    
    inline def setDiscount_total(value: Double): Self = StObject.set(x, "discount_total", value.asInstanceOf[js.Any])
    
    inline def setDiscount_totalUndefined: Self = StObject.set(x, "discount_total", js.undefined)
    
    inline def setDiscounts(value: js.Array[Discount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    inline def setDiscountsVarargs(value: Discount*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setGrand_total(value: Double): Self = StObject.set(x, "grand_total", value.asInstanceOf[js.Any])
    
    inline def setGrand_totalUndefined: Self = StObject.set(x, "grand_total", js.undefined)
    
    inline def setInterval(value: monthly | yearly | weekly | daily): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setInterval_count(value: Double): Self = StObject.set(x, "interval_count", value.asInstanceOf[js.Any])
    
    inline def setInterval_countUndefined: Self = StObject.set(x, "interval_count", js.undefined)
    
    inline def setInvoice_total(value: Double): Self = StObject.set(x, "invoice_total", value.asInstanceOf[js.Any])
    
    inline def setInvoice_totalUndefined: Self = StObject.set(x, "invoice_total", js.undefined)
    
    inline def setInvoices(value: js.Array[Invoice]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
    
    inline def setInvoicesUndefined: Self = StObject.set(x, "invoices", js.undefined)
    
    inline def setInvoicesVarargs(value: Invoice*): Self = StObject.set(x, "invoices", js.Array(value*))
    
    inline def setItem_discount(value: Double): Self = StObject.set(x, "item_discount", value.asInstanceOf[js.Any])
    
    inline def setItem_discountUndefined: Self = StObject.set(x, "item_discount", js.undefined)
    
    inline def setItem_tax(value: Double): Self = StObject.set(x, "item_tax", value.asInstanceOf[js.Any])
    
    inline def setItem_taxUndefined: Self = StObject.set(x, "item_tax", js.undefined)
    
    inline def setItem_total(value: Double): Self = StObject.set(x, "item_total", value.asInstanceOf[js.Any])
    
    inline def setItem_totalUndefined: Self = StObject.set(x, "item_total", js.undefined)
    
    inline def setItems(value: js.Array[SubscriptionItems]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SubscriptionItems*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOptions(value: js.Array[js.Object]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: js.Object*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setOrder_id(value: String): Self = StObject.set(x, "order_id", value.asInstanceOf[js.Any])
    
    inline def setOrder_idUndefined: Self = StObject.set(x, "order_id", js.undefined)
    
    inline def setOrder_item_id(value: String): Self = StObject.set(x, "order_item_id", value.asInstanceOf[js.Any])
    
    inline def setOrder_item_idUndefined: Self = StObject.set(x, "order_item_id", js.undefined)
    
    inline def setOrder_schedule(value: String): Self = StObject.set(x, "order_schedule", value.asInstanceOf[js.Any])
    
    inline def setOrder_scheduleUndefined: Self = StObject.set(x, "order_schedule", js.undefined)
    
    inline def setOrdering(value: Boolean): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
    
    inline def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
    
    inline def setOrders(value: js.Array[js.Object]): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
    
    inline def setOrdersUndefined: Self = StObject.set(x, "orders", js.undefined)
    
    inline def setOrdersVarargs(value: js.Object*): Self = StObject.set(x, "orders", js.Array(value*))
    
    inline def setPaid(value: Boolean): Self = StObject.set(x, "paid", value.asInstanceOf[js.Any])
    
    inline def setPaidUndefined: Self = StObject.set(x, "paid", js.undefined)
    
    inline def setPayment_balance(value: Double): Self = StObject.set(x, "payment_balance", value.asInstanceOf[js.Any])
    
    inline def setPayment_balanceUndefined: Self = StObject.set(x, "payment_balance", js.undefined)
    
    inline def setPayment_total(value: Double): Self = StObject.set(x, "payment_total", value.asInstanceOf[js.Any])
    
    inline def setPayment_totalUndefined: Self = StObject.set(x, "payment_total", js.undefined)
    
    inline def setPayments(value: js.Array[Payment]): Self = StObject.set(x, "payments", value.asInstanceOf[js.Any])
    
    inline def setPaymentsUndefined: Self = StObject.set(x, "payments", js.undefined)
    
    inline def setPaymentsVarargs(value: Payment*): Self = StObject.set(x, "payments", js.Array(value*))
    
    inline def setPending_invoices(value: js.Array[Invoice]): Self = StObject.set(x, "pending_invoices", value.asInstanceOf[js.Any])
    
    inline def setPending_invoicesUndefined: Self = StObject.set(x, "pending_invoices", js.undefined)
    
    inline def setPending_invoicesVarargs(value: Invoice*): Self = StObject.set(x, "pending_invoices", js.Array(value*))
    
    inline def setPlan_id(value: String): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
    
    inline def setPlan_idUndefined: Self = StObject.set(x, "plan_id", js.undefined)
    
    inline def setPlan_name(value: String): Self = StObject.set(x, "plan_name", value.asInstanceOf[js.Any])
    
    inline def setPlan_nameUndefined: Self = StObject.set(x, "plan_name", js.undefined)
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setPrice_total(value: Double): Self = StObject.set(x, "price_total", value.asInstanceOf[js.Any])
    
    inline def setPrice_totalUndefined: Self = StObject.set(x, "price_total", js.undefined)
    
    inline def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setProduct_discount_each(value: Double): Self = StObject.set(x, "product_discount_each", value.asInstanceOf[js.Any])
    
    inline def setProduct_discount_eachUndefined: Self = StObject.set(x, "product_discount_each", js.undefined)
    
    inline def setProduct_discount_total(value: Double): Self = StObject.set(x, "product_discount_total", value.asInstanceOf[js.Any])
    
    inline def setProduct_discount_totalUndefined: Self = StObject.set(x, "product_discount_total", js.undefined)
    
    inline def setProduct_discounts(value: Double): Self = StObject.set(x, "product_discounts", value.asInstanceOf[js.Any])
    
    inline def setProduct_discountsUndefined: Self = StObject.set(x, "product_discounts", js.undefined)
    
    inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    
    inline def setProduct_idUndefined: Self = StObject.set(x, "product_id", js.undefined)
    
    inline def setProduct_name(value: String): Self = StObject.set(x, "product_name", value.asInstanceOf[js.Any])
    
    inline def setProduct_nameUndefined: Self = StObject.set(x, "product_name", js.undefined)
    
    inline def setProduct_tax_each(value: Double): Self = StObject.set(x, "product_tax_each", value.asInstanceOf[js.Any])
    
    inline def setProduct_tax_eachUndefined: Self = StObject.set(x, "product_tax_each", js.undefined)
    
    inline def setProduct_tax_total(value: Double): Self = StObject.set(x, "product_tax_total", value.asInstanceOf[js.Any])
    
    inline def setProduct_tax_totalUndefined: Self = StObject.set(x, "product_tax_total", js.undefined)
    
    inline def setProduct_taxes(value: Double): Self = StObject.set(x, "product_taxes", value.asInstanceOf[js.Any])
    
    inline def setProduct_taxesUndefined: Self = StObject.set(x, "product_taxes", js.undefined)
    
    inline def setProrated(value: Boolean): Self = StObject.set(x, "prorated", value.asInstanceOf[js.Any])
    
    inline def setProratedUndefined: Self = StObject.set(x, "prorated", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRecurring_discount_total(value: Double): Self = StObject.set(x, "recurring_discount_total", value.asInstanceOf[js.Any])
    
    inline def setRecurring_discount_totalUndefined: Self = StObject.set(x, "recurring_discount_total", js.undefined)
    
    inline def setRecurring_item_discount(value: Double): Self = StObject.set(x, "recurring_item_discount", value.asInstanceOf[js.Any])
    
    inline def setRecurring_item_discountUndefined: Self = StObject.set(x, "recurring_item_discount", js.undefined)
    
    inline def setRecurring_item_tax(value: Double): Self = StObject.set(x, "recurring_item_tax", value.asInstanceOf[js.Any])
    
    inline def setRecurring_item_taxUndefined: Self = StObject.set(x, "recurring_item_tax", js.undefined)
    
    inline def setRecurring_item_total(value: Double): Self = StObject.set(x, "recurring_item_total", value.asInstanceOf[js.Any])
    
    inline def setRecurring_item_totalUndefined: Self = StObject.set(x, "recurring_item_total", js.undefined)
    
    inline def setRecurring_tax_included_total(value: Double): Self = StObject.set(x, "recurring_tax_included_total", value.asInstanceOf[js.Any])
    
    inline def setRecurring_tax_included_totalUndefined: Self = StObject.set(x, "recurring_tax_included_total", js.undefined)
    
    inline def setRecurring_tax_total(value: Double): Self = StObject.set(x, "recurring_tax_total", value.asInstanceOf[js.Any])
    
    inline def setRecurring_tax_totalUndefined: Self = StObject.set(x, "recurring_tax_total", js.undefined)
    
    inline def setRecurring_total(value: Double): Self = StObject.set(x, "recurring_total", value.asInstanceOf[js.Any])
    
    inline def setRecurring_totalUndefined: Self = StObject.set(x, "recurring_total", js.undefined)
    
    inline def setRefund_total(value: Double): Self = StObject.set(x, "refund_total", value.asInstanceOf[js.Any])
    
    inline def setRefund_totalUndefined: Self = StObject.set(x, "refund_total", js.undefined)
    
    inline def setRefunds(value: Refund): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
    
    inline def setRefundsUndefined: Self = StObject.set(x, "refunds", js.undefined)
    
    inline def setStatus(value: pending | active | trial | pastdue | unpaid | canceled | paid | complete): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSub_total(value: Double): Self = StObject.set(x, "sub_total", value.asInstanceOf[js.Any])
    
    inline def setSub_totalUndefined: Self = StObject.set(x, "sub_total", js.undefined)
    
    inline def setTax_included_total(value: Double): Self = StObject.set(x, "tax_included_total", value.asInstanceOf[js.Any])
    
    inline def setTax_included_totalUndefined: Self = StObject.set(x, "tax_included_total", js.undefined)
    
    inline def setTax_total(value: Double): Self = StObject.set(x, "tax_total", value.asInstanceOf[js.Any])
    
    inline def setTax_totalUndefined: Self = StObject.set(x, "tax_total", js.undefined)
    
    inline def setTaxes(value: js.Array[Tax]): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
    
    inline def setTaxesUndefined: Self = StObject.set(x, "taxes", js.undefined)
    
    inline def setTaxesVarargs(value: Tax*): Self = StObject.set(x, "taxes", js.Array(value*))
    
    inline def setTaxes_fixed(value: Boolean): Self = StObject.set(x, "taxes_fixed", value.asInstanceOf[js.Any])
    
    inline def setTaxes_fixedUndefined: Self = StObject.set(x, "taxes_fixed", js.undefined)
    
    inline def setTrial(value: Boolean): Self = StObject.set(x, "trial", value.asInstanceOf[js.Any])
    
    inline def setTrialUndefined: Self = StObject.set(x, "trial", js.undefined)
    
    inline def setTrial_days(value: Double): Self = StObject.set(x, "trial_days", value.asInstanceOf[js.Any])
    
    inline def setTrial_daysUndefined: Self = StObject.set(x, "trial_days", js.undefined)
    
    inline def setUnpaid(value: Boolean): Self = StObject.set(x, "unpaid", value.asInstanceOf[js.Any])
    
    inline def setUnpaidUndefined: Self = StObject.set(x, "unpaid", js.undefined)
    
    inline def setVariant(value: Variant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    inline def setVariant_id(value: String): Self = StObject.set(x, "variant_id", value.asInstanceOf[js.Any])
    
    inline def setVariant_idUndefined: Self = StObject.set(x, "variant_id", js.undefined)
  }
}
