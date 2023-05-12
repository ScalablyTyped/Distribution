package typings.stripe.anon

import typings.stripe.mod.Stripe.Coupon
import typings.stripe.mod.Stripe.Customer
import typings.stripe.mod.Stripe.DeletedCustomer
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.PromotionCode.Restrictions
import typings.stripe.stripeStrings.promotion_code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.PromotionCode> */
trait ResponsePromotionCode extends StObject {
  
  /**
    * Whether the promotion code is currently active. A promotion code is only active if the coupon is also valid.
    */
  var active: Boolean
  
  /**
    * The customer-facing code. Regardless of case, this code must be unique across all active promotion codes for each customer.
    */
  var code: String
  
  /**
    * A coupon contains information about a percent-off or amount-off discount you
    * might want to apply to a customer. Coupons may be applied to [subscriptions](https://stripe.com/docs/api#subscriptions), [invoices](https://stripe.com/docs/api#invoices),
    * [checkout sessions](https://stripe.com/docs/api/checkout/sessions), [quotes](https://stripe.com/docs/api#quotes), and more. Coupons do not work with conventional one-off [charges](https://stripe.com/docs/api#create_charge) or [payment intents](https://stripe.com/docs/api/payment_intents).
    */
  var coupon: Coupon
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * The customer that this promotion code can be used by.
    */
  var customer: String | Customer | DeletedCustomer | Null
  
  /**
    * Date at which the promotion code can no longer be redeemed.
    */
  var expires_at: Double | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Maximum number of times this promotion code can be redeemed.
    */
  var max_redemptions: Double | Null
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: promotion_code
  
  var restrictions: Restrictions
  
  /**
    * Number of times this promotion code has been used.
    */
  var times_redeemed: Double
}
object ResponsePromotionCode {
  
  inline def apply(
    active: Boolean,
    code: String,
    coupon: Coupon,
    created: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    restrictions: Restrictions,
    times_redeemed: Double
  ): ResponsePromotionCode = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], coupon = coupon.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], times_redeemed = times_redeemed.asInstanceOf[js.Any], customer = null, expires_at = null, max_redemptions = null, metadata = null)
    __obj.updateDynamic("object")("promotion_code")
    __obj.asInstanceOf[ResponsePromotionCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsePromotionCode] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCoupon(value: Coupon): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String | Customer | DeletedCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_atNull: Self = StObject.set(x, "expires_at", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMax_redemptions(value: Double): Self = StObject.set(x, "max_redemptions", value.asInstanceOf[js.Any])
    
    inline def setMax_redemptionsNull: Self = StObject.set(x, "max_redemptions", null)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setObject(value: promotion_code): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setRestrictions(value: Restrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setTimes_redeemed(value: Double): Self = StObject.set(x, "times_redeemed", value.asInstanceOf[js.Any])
  }
}
