package typings.stripe.stripeMod.couponsNs

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeStrings.coupon
import typings.stripe.stripeStrings.forever
import typings.stripe.stripeStrings.once
import typings.stripe.stripeStrings.repeating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A coupon contains information about a percent-off or amount-off discount you might want to apply to a customer.
  * Coupons only apply to invoices; they do not apply to one-off charges.
  */
trait ICoupon extends IResourceObject {
  /**
    * Amount (in the currency specified) that will be taken off the subtotal of any invoices for this customer.
    */
  var amount_off: Double
  var created: Double
  /**
    * If amount_off has been set, the currency of the amount to take off.
    */
  var currency: String
  /**
    * One of "forever", "once", and "repeating". Describes how long a customer who applies this coupon will get the discount.
    */
  var duration: forever | once | repeating
  /**
    * If duration is repeating, the number of months the coupon applies. Null if coupon duration is forever or once.
    */
  var duration_in_months: Double
  var livemode: Boolean
  /**
    * Maximum number of times this coupon can be redeemed, in total, before it is no longer valid.
    */
  var max_redemptions: Double
  var metadata: IMetadata
  /**
    * Name of the coupon displayed to customers on for instance invoices or receipts.
    */
  var name: String
  /**
    * Value is 'coupon'
    */
  @JSName("object")
  var object_ICoupon: coupon
  /**
    * Percent that will be taken off the subtotal of any invoices for this customer for the duration
    * of the coupon. For example, a coupon with percent_off of 50 will make a $100 invoice $50 instead.
    */
  var percent_off: Double
  /**
    * Date after which the coupon can no longer be redeemed
    */
  var redeem_by: Double
  /**
    * Number of times this coupon has been applied to a customer.
    */
  var times_redeemed: Double
  /**
    * Taking account of the above properties, whether this coupon can still be applied to a customer
    */
  var valid: Boolean
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
    val __obj = js.Dynamic.literal(amount_off = amount_off, created = created, currency = currency, duration = duration.asInstanceOf[js.Any], duration_in_months = duration_in_months, id = id, livemode = livemode, max_redemptions = max_redemptions, metadata = metadata, name = name, percent_off = percent_off, redeem_by = redeem_by, times_redeemed = times_redeemed, valid = valid)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[ICoupon]
  }
}

