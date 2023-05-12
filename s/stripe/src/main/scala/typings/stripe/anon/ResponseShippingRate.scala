package typings.stripe.anon

import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.ShippingRate.DeliveryEstimate
import typings.stripe.mod.Stripe.ShippingRate.FixedAmount
import typings.stripe.mod.Stripe.ShippingRate.TaxBehavior
import typings.stripe.mod.Stripe.TaxCode
import typings.stripe.stripeStrings.fixed_amount
import typings.stripe.stripeStrings.shipping_rate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.ShippingRate> */
trait ResponseShippingRate extends StObject {
  
  /**
    * Whether the shipping rate can be used for new purchases. Defaults to `true`.
    */
  var active: Boolean
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * The estimated range for how long shipping will take, meant to be displayable to the customer. This will appear on CheckoutSessions.
    */
  var delivery_estimate: DeliveryEstimate | Null
  
  /**
    * The name of the shipping rate, meant to be displayable to the customer. This will appear on CheckoutSessions.
    */
  var display_name: String | Null
  
  var fixed_amount: js.UndefOr[FixedAmount] = js.undefined
  
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
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: shipping_rate
  
  /**
    * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`.
    */
  var tax_behavior: TaxBehavior | Null
  
  /**
    * A [tax code](https://stripe.com/docs/tax/tax-categories) ID. The Shipping tax code is `txcd_92010001`.
    */
  var tax_code: String | TaxCode | Null
  
  /**
    * The type of calculation to use on the shipping rate. Can only be `fixed_amount` for now.
    */
  var `type`: fixed_amount
}
object ResponseShippingRate {
  
  inline def apply(
    active: Boolean,
    created: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata
  ): ResponseShippingRate = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], delivery_estimate = null, display_name = null, tax_behavior = null, tax_code = null)
    __obj.updateDynamic("object")("shipping_rate")
    __obj.updateDynamic("type")("fixed_amount")
    __obj.asInstanceOf[ResponseShippingRate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseShippingRate] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDelivery_estimate(value: DeliveryEstimate): Self = StObject.set(x, "delivery_estimate", value.asInstanceOf[js.Any])
    
    inline def setDelivery_estimateNull: Self = StObject.set(x, "delivery_estimate", null)
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setDisplay_nameNull: Self = StObject.set(x, "display_name", null)
    
    inline def setFixed_amount(value: FixedAmount): Self = StObject.set(x, "fixed_amount", value.asInstanceOf[js.Any])
    
    inline def setFixed_amountUndefined: Self = StObject.set(x, "fixed_amount", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: shipping_rate): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setTax_behavior(value: TaxBehavior): Self = StObject.set(x, "tax_behavior", value.asInstanceOf[js.Any])
    
    inline def setTax_behaviorNull: Self = StObject.set(x, "tax_behavior", null)
    
    inline def setTax_code(value: String | TaxCode): Self = StObject.set(x, "tax_code", value.asInstanceOf[js.Any])
    
    inline def setTax_codeNull: Self = StObject.set(x, "tax_code", null)
    
    inline def setType(value: fixed_amount): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
