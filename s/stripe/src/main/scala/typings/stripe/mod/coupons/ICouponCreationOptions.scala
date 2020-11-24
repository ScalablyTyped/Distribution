package typings.stripe.mod.coupons

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.stripeStrings.forever
import typings.stripe.stripeStrings.once
import typings.stripe.stripeStrings.repeating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICouponCreationOptions extends IDataOptionsWithMetadata {
  
  /**
    * A positive integer representing the amount to subtract from an invoice total (required if percent_off is not passed)
    */
  var amount_off: js.UndefOr[Double] = js.native
  
  /**
    * Currency of the amount_off parameter (required if amount_off is passed)
    */
  var currency: js.UndefOr[String] = js.native
  
  /**
    * Specifies how long the discount will be in effect. Can be forever, once, or repeating.
    */
  var duration: forever | once | repeating = js.native
  
  /**
    * Required only if duration is repeating, in which case it must be a positive integer that specifies the number of months
    * the discount will be in effect.
    */
  var duration_in_months: js.UndefOr[Double] = js.native
  
  /**
    * Unique string of your choice that will be used to identify this coupon when applying it to a customer. This is often a specific
    * code you’ll give to your customer to use when signing up (e.g. FALL25OFF). If you don’t want to specify a particular code, you
    * can leave the ID blank and we’ll generate a random code for you.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A positive integer specifying the number of times the coupon can be redeemed before it’s no longer valid.
    *
    * For example, you might have a 50% off coupon that the first 20 readers of your blog can use.
    */
  var max_redemptions: js.UndefOr[Double] = js.native
  
  /**
    * Name of the coupon displayed to customers on, for instance invoices, or receipts. By default the id is shown if name is not set.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A positive integer between 1 and 100 that represents the discount the coupon will apply (required if amount_off is not passed)
    */
  var percent_off: js.UndefOr[Double] = js.native
  
  /**
    * Unix timestamp specifying the last time at which the coupon can be redeemed.
    * After the redeem_by date, the coupon can no longer be applied to new customers.
    */
  var redeem_by: js.UndefOr[Double] = js.native
}
object ICouponCreationOptions {
  
  @scala.inline
  def apply(duration: forever | once | repeating): ICouponCreationOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICouponCreationOptions]
  }
  
  @scala.inline
  implicit class ICouponCreationOptionsOps[Self <: ICouponCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: forever | once | repeating): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_off(value: Double): Self = this.set("amount_off", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount_off: Self = this.set("amount_off", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setDuration_in_months(value: Double): Self = this.set("duration_in_months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration_in_months: Self = this.set("duration_in_months", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMax_redemptions(value: Double): Self = this.set("max_redemptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_redemptions: Self = this.set("max_redemptions", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPercent_off(value: Double): Self = this.set("percent_off", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercent_off: Self = this.set("percent_off", js.undefined)
    
    @scala.inline
    def setRedeem_by(value: Double): Self = this.set("redeem_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedeem_by: Self = this.set("redeem_by", js.undefined)
  }
}
