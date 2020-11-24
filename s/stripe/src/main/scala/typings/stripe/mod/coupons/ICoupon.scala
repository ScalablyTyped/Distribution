package typings.stripe.mod.coupons

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.stripeStrings.coupon
import typings.stripe.stripeStrings.forever
import typings.stripe.stripeStrings.once
import typings.stripe.stripeStrings.repeating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A coupon contains information about a percent-off or amount-off discount you might want to apply to a customer.
  * Coupons only apply to invoices; they do not apply to one-off charges.
  */
@js.native
trait ICoupon extends IResourceObject {
  
  /**
    * Amount (in the currency specified) that will be taken off the subtotal of any invoices for this customer.
    */
  var amount_off: Double = js.native
  
  var created: Double = js.native
  
  /**
    * If amount_off has been set, the currency of the amount to take off.
    */
  var currency: String = js.native
  
  /**
    * One of "forever", "once", and "repeating". Describes how long a customer who applies this coupon will get the discount.
    */
  var duration: forever | once | repeating = js.native
  
  /**
    * If duration is repeating, the number of months the coupon applies. Null if coupon duration is forever or once.
    */
  var duration_in_months: Double = js.native
  
  var livemode: Boolean = js.native
  
  /**
    * Maximum number of times this coupon can be redeemed, in total, before it is no longer valid.
    */
  var max_redemptions: Double = js.native
  
  var metadata: IMetadata = js.native
  
  /**
    * Name of the coupon displayed to customers on for instance invoices or receipts.
    */
  var name: String = js.native
  
  /**
    * Value is 'coupon'
    */
  @JSName("object")
  var object_ICoupon: coupon = js.native
  
  /**
    * Percent that will be taken off the subtotal of any invoices for this customer for the duration
    * of the coupon. For example, a coupon with percent_off of 50 will make a $100 invoice $50 instead.
    */
  var percent_off: Double = js.native
  
  /**
    * Date after which the coupon can no longer be redeemed
    */
  var redeem_by: Double = js.native
  
  /**
    * Number of times this coupon has been applied to a customer.
    */
  var times_redeemed: Double = js.native
  
  /**
    * Taking account of the above properties, whether this coupon can still be applied to a customer
    */
  var valid: Boolean = js.native
}
object ICoupon {
  
  @scala.inline
  def apply(
    amount_off: Double,
    created: Double,
    currency: String,
    duration: forever | once | repeating,
    duration_in_months: Double,
    id: String,
    livemode: Boolean,
    max_redemptions: Double,
    metadata: IMetadata,
    name: String,
    `object`: coupon,
    percent_off: Double,
    redeem_by: Double,
    times_redeemed: Double,
    valid: Boolean
  ): ICoupon = {
    val __obj = js.Dynamic.literal(amount_off = amount_off.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], duration_in_months = duration_in_months.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], max_redemptions = max_redemptions.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], percent_off = percent_off.asInstanceOf[js.Any], redeem_by = redeem_by.asInstanceOf[js.Any], times_redeemed = times_redeemed.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoupon]
  }
  
  @scala.inline
  implicit class ICouponOps[Self <: ICoupon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount_off(value: Double): Self = this.set("amount_off", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: forever | once | repeating): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration_in_months(value: Double): Self = this.set("duration_in_months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_redemptions(value: Double): Self = this.set("max_redemptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: coupon): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent_off(value: Double): Self = this.set("percent_off", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedeem_by(value: Double): Self = this.set("redeem_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimes_redeemed(value: Double): Self = this.set("times_redeemed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
}
