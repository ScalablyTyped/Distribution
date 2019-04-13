package typings
package stripeLib.stripeMod.couponsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICouponCreationOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
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
    * Name of the coupon displayed to customers on, for instance invoices, or receipts. By default the id is shown if name is not set.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
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

object ICouponCreationOptions {
  @scala.inline
  def apply(
    duration: stripeLib.stripeLibStrings.forever | stripeLib.stripeLibStrings.once | stripeLib.stripeLibStrings.repeating,
    amount_off: scala.Int | scala.Double = null,
    currency: java.lang.String = null,
    duration_in_months: scala.Int | scala.Double = null,
    expand: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    include: js.Array[java.lang.String] = null,
    max_redemptions: scala.Int | scala.Double = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    name: java.lang.String = null,
    percent_off: scala.Int | scala.Double = null,
    redeem_by: scala.Int | scala.Double = null
  ): ICouponCreationOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    if (amount_off != null) __obj.updateDynamic("amount_off")(amount_off.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (duration_in_months != null) __obj.updateDynamic("duration_in_months")(duration_in_months.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (id != null) __obj.updateDynamic("id")(id)
    if (include != null) __obj.updateDynamic("include")(include)
    if (max_redemptions != null) __obj.updateDynamic("max_redemptions")(max_redemptions.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (percent_off != null) __obj.updateDynamic("percent_off")(percent_off.asInstanceOf[js.Any])
    if (redeem_by != null) __obj.updateDynamic("redeem_by")(redeem_by.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICouponCreationOptions]
  }
}

