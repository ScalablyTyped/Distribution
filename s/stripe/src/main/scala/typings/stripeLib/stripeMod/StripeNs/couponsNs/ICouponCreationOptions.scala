package typings
package stripeLib.stripeMod.StripeNs.couponsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICouponCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * A positive integer representing the amount to subtract from an invoice total (required if percent_off is not passed)
    */
  var amount_off: js.UndefOr[scala.Double] = js.undefined
  /**
    * Currency of the amount_off parameter (required if amount_off is passed)
    */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies how long the discount will be in effect. Can be forever, once, or repeating.
    */
  var duration: stripeLib.stripeLibStrings.forever | stripeLib.stripeLibStrings.once | stripeLib.stripeLibStrings.repeating
  /**
    * Required only if duration is repeating, in which case it must be a positive integer that specifies the number of months
    * the discount will be in effect.
    */
  var duration_in_months: js.UndefOr[scala.Double] = js.undefined
  /**
    * Unique string of your choice that will be used to identify this coupon when applying it to a customer. This is often a specific
    * code you’ll give to your customer to use when signing up (e.g. FALL25OFF). If you don’t want to specify a particular code, you
    * can leave the ID blank and we’ll generate a random code for you.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A positive integer specifying the number of times the coupon can be redeemed before it’s no longer valid.
    *
    * For example, you might have a 50% off coupon that the first 20 readers of your blog can use.
    */
  var max_redemptions: js.UndefOr[scala.Double] = js.undefined
  /**
    * A positive integer between 1 and 100 that represents the discount the coupon will apply (required if amount_off is not passed)
    */
  var percent_off: js.UndefOr[scala.Double] = js.undefined
  /**
    * Unix timestamp specifying the last time at which the coupon can be redeemed.
    * After the redeem_by date, the coupon can no longer be applied to new customers.
    */
  var redeem_by: js.UndefOr[scala.Double] = js.undefined
}

