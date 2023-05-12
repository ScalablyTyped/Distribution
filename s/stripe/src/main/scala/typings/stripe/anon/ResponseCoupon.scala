package typings.stripe.anon

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.mod.Stripe.Coupon.AppliesTo
import typings.stripe.mod.Stripe.Coupon.CurrencyOptions
import typings.stripe.mod.Stripe.Coupon.Duration
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.stripeStrings.coupon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Coupon> */
trait ResponseCoupon extends StObject {
  
  /**
    * Amount (in the `currency` specified) that will be taken off the subtotal of any invoices for this customer.
    */
  var amount_off: Double | Null
  
  var applies_to: js.UndefOr[AppliesTo] = js.undefined
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * If `amount_off` has been set, the three-letter [ISO code for the currency](https://stripe.com/docs/currencies) of the amount to take off.
    */
  var currency: String | Null
  
  /**
    * Coupons defined in each available currency option. Each key must be a three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency_options: js.UndefOr[StringDictionary[CurrencyOptions]] = js.undefined
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * One of `forever`, `once`, and `repeating`. Describes how long a customer who applies this coupon will get the discount.
    */
  var duration: Duration
  
  /**
    * If `duration` is `repeating`, the number of months the coupon applies. Null if coupon `duration` is `forever` or `once`.
    */
  var duration_in_months: Double | Null
  
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
    * Maximum number of times this coupon can be redeemed, in total, across all customers, before it is no longer valid.
    */
  var max_redemptions: Double | Null
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata | Null
  
  /**
    * Name of the coupon displayed to customers on for instance invoices or receipts.
    */
  var name: String | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: coupon
  
  /**
    * Percent that will be taken off the subtotal of any invoices for this customer for the duration of the coupon. For example, a coupon with percent_off of 50 will make a %s100 invoice %s50 instead.
    */
  var percent_off: Double | Null
  
  /**
    * Date after which the coupon can no longer be redeemed.
    */
  var redeem_by: Double | Null
  
  /**
    * Number of times this coupon has been applied to a customer.
    */
  var times_redeemed: Double
  
  /**
    * Taking account of the above properties, whether this coupon can still be applied to a customer.
    */
  var valid: Boolean
}
object ResponseCoupon {
  
  inline def apply(
    created: Double,
    duration: Duration,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    times_redeemed: Double,
    valid: Boolean
  ): ResponseCoupon = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], times_redeemed = times_redeemed.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], amount_off = null, currency = null, duration_in_months = null, max_redemptions = null, metadata = null, name = null, percent_off = null, redeem_by = null)
    __obj.updateDynamic("object")("coupon")
    __obj.asInstanceOf[ResponseCoupon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCoupon] (val x: Self) extends AnyVal {
    
    inline def setAmount_off(value: Double): Self = StObject.set(x, "amount_off", value.asInstanceOf[js.Any])
    
    inline def setAmount_offNull: Self = StObject.set(x, "amount_off", null)
    
    inline def setApplies_to(value: AppliesTo): Self = StObject.set(x, "applies_to", value.asInstanceOf[js.Any])
    
    inline def setApplies_toUndefined: Self = StObject.set(x, "applies_to", js.undefined)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrency_options(value: StringDictionary[CurrencyOptions]): Self = StObject.set(x, "currency_options", value.asInstanceOf[js.Any])
    
    inline def setCurrency_optionsUndefined: Self = StObject.set(x, "currency_options", js.undefined)
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDuration_in_months(value: Double): Self = StObject.set(x, "duration_in_months", value.asInstanceOf[js.Any])
    
    inline def setDuration_in_monthsNull: Self = StObject.set(x, "duration_in_months", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMax_redemptions(value: Double): Self = StObject.set(x, "max_redemptions", value.asInstanceOf[js.Any])
    
    inline def setMax_redemptionsNull: Self = StObject.set(x, "max_redemptions", null)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setObject(value: coupon): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPercent_off(value: Double): Self = StObject.set(x, "percent_off", value.asInstanceOf[js.Any])
    
    inline def setPercent_offNull: Self = StObject.set(x, "percent_off", null)
    
    inline def setRedeem_by(value: Double): Self = StObject.set(x, "redeem_by", value.asInstanceOf[js.Any])
    
    inline def setRedeem_byNull: Self = StObject.set(x, "redeem_by", null)
    
    inline def setTimes_redeemed(value: Double): Self = StObject.set(x, "times_redeemed", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
