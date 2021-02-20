package typings.stripe.mod

import typings.stripe.stripeStrings.coupon
import typings.stripe.stripeStrings.discount
import typings.stripe.stripeStrings.forever
import typings.stripe.stripeStrings.once
import typings.stripe.stripeStrings.repeating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coupons {
  
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
    implicit class ICouponMutableBuilder[Self <: ICoupon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount_off(value: Double): Self = StObject.set(x, "amount_off", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: forever | once | repeating): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration_in_months(value: Double): Self = StObject.set(x, "duration_in_months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_redemptions(value: Double): Self = StObject.set(x, "max_redemptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: coupon): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent_off(value: Double): Self = StObject.set(x, "percent_off", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedeem_by(value: Double): Self = StObject.set(x, "redeem_by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimes_redeemed(value: Double): Self = StObject.set(x, "times_redeemed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class ICouponCreationOptionsMutableBuilder[Self <: ICouponCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount_off(value: Double): Self = StObject.set(x, "amount_off", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_offUndefined: Self = StObject.set(x, "amount_off", js.undefined)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setDuration(value: forever | once | repeating): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration_in_months(value: Double): Self = StObject.set(x, "duration_in_months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration_in_monthsUndefined: Self = StObject.set(x, "duration_in_months", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMax_redemptions(value: Double): Self = StObject.set(x, "max_redemptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_redemptionsUndefined: Self = StObject.set(x, "max_redemptions", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPercent_off(value: Double): Self = StObject.set(x, "percent_off", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent_offUndefined: Self = StObject.set(x, "percent_off", js.undefined)
      
      @scala.inline
      def setRedeem_by(value: Double): Self = StObject.set(x, "redeem_by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedeem_byUndefined: Self = StObject.set(x, "redeem_by", js.undefined)
    }
  }
  
  /**
    * A discount represents the actual application of a coupon to a particular customer. It contains information
    * about when the discount began and when it will end.
    */
  @js.native
  trait IDiscount extends IObject {
    
    /**
      * Hash describing the coupon applied to create this discount
      */
    var coupon: ICoupon = js.native
    
    var customer: String = js.native
    
    /**
      * If the coupon has a duration of once or repeating, the date that this discount will end. If the coupon
      * used has a forever duration, this attribute will be null.
      */
    var end: Double = js.native
    
    /**
      * Value is 'discount'
      */
    @JSName("object")
    var object_IDiscount: discount = js.native
    
    /**
      * Date that the coupon was applied
      */
    var start: Double = js.native
    
    /**
      * The subscription that this coupon is applied to, if it is applied to a particular subscription
      */
    var subscription: String = js.native
  }
  object IDiscount {
    
    @scala.inline
    def apply(
      coupon: ICoupon,
      customer: String,
      end: Double,
      `object`: discount,
      start: Double,
      subscription: String
    ): IDiscount = {
      val __obj = js.Dynamic.literal(coupon = coupon.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDiscount]
    }
    
    @scala.inline
    implicit class IDiscountMutableBuilder[Self <: IDiscount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoupon(value: ICoupon): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: discount): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
}
