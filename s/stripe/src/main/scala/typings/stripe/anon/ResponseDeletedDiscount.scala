package typings.stripe.anon

import typings.stripe.mod.Stripe.Coupon
import typings.stripe.mod.Stripe.Customer
import typings.stripe.mod.Stripe.DeletedCustomer
import typings.stripe.mod.Stripe.PromotionCode
import typings.stripe.stripeBooleans.`true`
import typings.stripe.stripeStrings.discount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.DeletedDiscount> */
trait ResponseDeletedDiscount extends StObject {
  
  /**
    * The Checkout session that this coupon is applied to, if it is applied to a particular session in payment mode. Will not be present for subscription mode.
    */
  var checkout_session: String | Null
  
  /**
    * A coupon contains information about a percent-off or amount-off discount you
    * might want to apply to a customer. Coupons may be applied to [subscriptions](https://stripe.com/docs/api#subscriptions), [invoices](https://stripe.com/docs/api#invoices),
    * [checkout sessions](https://stripe.com/docs/api/checkout/sessions), [quotes](https://stripe.com/docs/api#quotes), and more. Coupons do not work with conventional one-off [charges](https://stripe.com/docs/api#create_charge) or [payment intents](https://stripe.com/docs/api/payment_intents).
    */
  var coupon: Coupon
  
  /**
    * The ID of the customer associated with this discount.
    */
  var customer: String | Customer | DeletedCustomer | Null
  
  /**
    * Always true for a deleted object
    */
  var deleted: `true`
  
  /**
    * The ID of the discount object. Discounts cannot be fetched by ID. Use `expand[]=discounts` in API calls to expand discount IDs in an array.
    */
  var id: String
  
  /**
    * The invoice that the discount's coupon was applied to, if it was applied directly to a particular invoice.
    */
  var invoice: String | Null
  
  /**
    * The invoice item `id` (or invoice line item `id` for invoice line items of type='subscription') that the discount's coupon was applied to, if it was applied directly to a particular invoice item or invoice line item.
    */
  var invoice_item: String | Null
  
  var lastResponse: ApiVersion
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: discount
  
  /**
    * The promotion code applied to create this discount.
    */
  var promotion_code: String | PromotionCode | Null
  
  /**
    * Date that the coupon was applied.
    */
  var start: Double
  
  /**
    * The subscription that this coupon is applied to, if it is applied to a particular subscription.
    */
  var subscription: String | Null
}
object ResponseDeletedDiscount {
  
  inline def apply(coupon: Coupon, id: String, lastResponse: ApiVersion, start: Double): ResponseDeletedDiscount = {
    val __obj = js.Dynamic.literal(coupon = coupon.asInstanceOf[js.Any], deleted = true, id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], checkout_session = null, customer = null, invoice = null, invoice_item = null, promotion_code = null, subscription = null)
    __obj.updateDynamic("object")("discount")
    __obj.asInstanceOf[ResponseDeletedDiscount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseDeletedDiscount] (val x: Self) extends AnyVal {
    
    inline def setCheckout_session(value: String): Self = StObject.set(x, "checkout_session", value.asInstanceOf[js.Any])
    
    inline def setCheckout_sessionNull: Self = StObject.set(x, "checkout_session", null)
    
    inline def setCoupon(value: Coupon): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String | Customer | DeletedCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setDeleted(value: `true`): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice(value: String): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNull: Self = StObject.set(x, "invoice", null)
    
    inline def setInvoice_item(value: String): Self = StObject.set(x, "invoice_item", value.asInstanceOf[js.Any])
    
    inline def setInvoice_itemNull: Self = StObject.set(x, "invoice_item", null)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setObject(value: discount): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPromotion_code(value: String | PromotionCode): Self = StObject.set(x, "promotion_code", value.asInstanceOf[js.Any])
    
    inline def setPromotion_codeNull: Self = StObject.set(x, "promotion_code", null)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
  }
}
