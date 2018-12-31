package typings
package stripeLib.stripeMod.StripeNs.couponsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A coupon contains information about a percent-off or amount-off discount you might want to apply to a customer.
  * Coupons only apply to invoices; they do not apply to one-off charges.
  */
trait ICoupon
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
    * Amount (in the currency specified) that will be taken off the subtotal of any invoices for this customer.
    */
  var amount_off: scala.Double
  var created: scala.Double
  /**
    * If amount_off has been set, the currency of the amount to take off.
    */
  var currency: java.lang.String
  /**
    * One of "forever", "once", and "repeating". Describes how long a customer who applies this coupon will get the discount.
    */
  var duration: stripeLib.stripeLibStrings.forever | stripeLib.stripeLibStrings.once | stripeLib.stripeLibStrings.repeating
  /**
    * If duration is repeating, the number of months the coupon applies. Null if coupon duration is forever or once.
    */
  var duration_in_months: scala.Double
  var livemode: scala.Boolean
  /**
    * Maximum number of times this coupon can be redeemed, in total, before it is no longer valid.
    */
  var max_redemptions: scala.Double
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
    * Value is 'coupon'
    */
  @JSName("object")
  var object_ICoupon: stripeLib.stripeLibStrings.coupon
  /**
    * Percent that will be taken off the subtotal of any invoices for this customer for the duration
    * of the coupon. For example, a coupon with percent_off of 50 will make a $100 invoice $50 instead.
    */
  var percent_off: scala.Double
  /**
    * Date after which the coupon can no longer be redeemed
    */
  var redeem_by: scala.Double
  /**
    * Number of times this coupon has been applied to a customer.
    */
  var times_redeemed: scala.Double
  /**
    * Taking account of the above properties, whether this coupon can still be applied to a customer
    */
  var valid: scala.Boolean
}

