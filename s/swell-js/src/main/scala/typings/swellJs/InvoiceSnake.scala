package typings.swellJs

import typings.swellJs.mod.BaseModel
import typings.swellJs.mod.Discount
import typings.swellJs.mod.Tax
import typings.swellJs.swellJsStrings.paid
import typings.swellJs.swellJsStrings.pending
import typings.swellJs.swellJsStrings.unpaid
import typings.swellJs.swellJsStrings.void
import typings.swellJs.typesBillingMod.Billing
import typings.swellJs.typesCouponMod.Coupon
import typings.swellJs.typesOrderMod.Order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvoiceSnake
  extends StObject
     with BaseModel {
  
  var account: js.UndefOr[Account] = js.undefined
  
  var account_id: js.UndefOr[String] = js.undefined
  
  var billing: js.UndefOr[Billing] = js.undefined
  
  var coupon: js.UndefOr[Coupon] = js.undefined
  
  var coupon_code: js.UndefOr[String] = js.undefined
  
  var coupon_id: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currency_rate: js.UndefOr[String] = js.undefined
  
  var date_due: js.UndefOr[String] = js.undefined
  
  var date_payment_retry: js.UndefOr[String] = js.undefined
  
  var date_period_end: js.UndefOr[String] = js.undefined
  
  var date_period_start: js.UndefOr[String] = js.undefined
  
  var discount_total: js.UndefOr[Double] = js.undefined
  
  var discounts: js.UndefOr[js.Array[Discount]] = js.undefined
  
  var grand_total: js.UndefOr[Double] = js.undefined
  
  var item_discount: js.UndefOr[Double] = js.undefined
  
  var item_tax: js.UndefOr[Double] = js.undefined
  
  var items: js.UndefOr[js.Array[InvoiceItems]] = js.undefined
  
  var notes: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
  
  var order: js.UndefOr[Order] = js.undefined
  
  var order_id: js.UndefOr[String] = js.undefined
  
  var paid: js.UndefOr[Boolean] = js.undefined
  
  var payment_total: js.UndefOr[Double] = js.undefined
  
  var shipping: js.UndefOr[js.Object] = js.undefined
  
  var status: js.UndefOr[pending | void | unpaid | paid] = js.undefined
  
  var sub_total: js.UndefOr[Double] = js.undefined
  
  // TODO: Add shipping
  var subscription_id: js.UndefOr[String] = js.undefined
  
  var tax_included_total: js.UndefOr[Double] = js.undefined
  
  var tax_total: js.UndefOr[Double] = js.undefined
  
  var taxes: js.UndefOr[js.Array[Tax]] = js.undefined
  
  var taxes_fixed: js.UndefOr[Boolean] = js.undefined
  
  var unpaid: js.UndefOr[Boolean] = js.undefined
}
object InvoiceSnake {
  
  inline def apply(): InvoiceSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvoiceSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvoiceSnake] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
    
    inline def setBilling(value: Billing): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
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
    
    inline def setDate_due(value: String): Self = StObject.set(x, "date_due", value.asInstanceOf[js.Any])
    
    inline def setDate_dueUndefined: Self = StObject.set(x, "date_due", js.undefined)
    
    inline def setDate_payment_retry(value: String): Self = StObject.set(x, "date_payment_retry", value.asInstanceOf[js.Any])
    
    inline def setDate_payment_retryUndefined: Self = StObject.set(x, "date_payment_retry", js.undefined)
    
    inline def setDate_period_end(value: String): Self = StObject.set(x, "date_period_end", value.asInstanceOf[js.Any])
    
    inline def setDate_period_endUndefined: Self = StObject.set(x, "date_period_end", js.undefined)
    
    inline def setDate_period_start(value: String): Self = StObject.set(x, "date_period_start", value.asInstanceOf[js.Any])
    
    inline def setDate_period_startUndefined: Self = StObject.set(x, "date_period_start", js.undefined)
    
    inline def setDiscount_total(value: Double): Self = StObject.set(x, "discount_total", value.asInstanceOf[js.Any])
    
    inline def setDiscount_totalUndefined: Self = StObject.set(x, "discount_total", js.undefined)
    
    inline def setDiscounts(value: js.Array[Discount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    inline def setDiscountsVarargs(value: Discount*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setGrand_total(value: Double): Self = StObject.set(x, "grand_total", value.asInstanceOf[js.Any])
    
    inline def setGrand_totalUndefined: Self = StObject.set(x, "grand_total", js.undefined)
    
    inline def setItem_discount(value: Double): Self = StObject.set(x, "item_discount", value.asInstanceOf[js.Any])
    
    inline def setItem_discountUndefined: Self = StObject.set(x, "item_discount", js.undefined)
    
    inline def setItem_tax(value: Double): Self = StObject.set(x, "item_tax", value.asInstanceOf[js.Any])
    
    inline def setItem_taxUndefined: Self = StObject.set(x, "item_tax", js.undefined)
    
    inline def setItems(value: js.Array[InvoiceItems]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: InvoiceItems*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrder_id(value: String): Self = StObject.set(x, "order_id", value.asInstanceOf[js.Any])
    
    inline def setOrder_idUndefined: Self = StObject.set(x, "order_id", js.undefined)
    
    inline def setPaid(value: Boolean): Self = StObject.set(x, "paid", value.asInstanceOf[js.Any])
    
    inline def setPaidUndefined: Self = StObject.set(x, "paid", js.undefined)
    
    inline def setPayment_total(value: Double): Self = StObject.set(x, "payment_total", value.asInstanceOf[js.Any])
    
    inline def setPayment_totalUndefined: Self = StObject.set(x, "payment_total", js.undefined)
    
    inline def setShipping(value: js.Object): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    inline def setStatus(value: pending | void | unpaid | paid): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSub_total(value: Double): Self = StObject.set(x, "sub_total", value.asInstanceOf[js.Any])
    
    inline def setSub_totalUndefined: Self = StObject.set(x, "sub_total", js.undefined)
    
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
    
    inline def setUnpaid(value: Boolean): Self = StObject.set(x, "unpaid", value.asInstanceOf[js.Any])
    
    inline def setUnpaidUndefined: Self = StObject.set(x, "unpaid", js.undefined)
  }
}
