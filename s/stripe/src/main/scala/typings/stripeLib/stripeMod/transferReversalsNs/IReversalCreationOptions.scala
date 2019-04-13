package typings
package stripeLib.stripeMod.transferReversalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReversalCreationOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * A positive integer in cents/pence representing how much of this transfer to reverse. Can only reverse up to the unreversed amount
    * remaining of the transfer. Partial transfer reversals are only allowed for transfers to Stripe Accounts.
    */
  var amount: js.UndefOr[scala.Double] = js.undefined
  /**
    * An arbitrary string which you can attach to a reversal object. It is displayed alongside the reversal in the dashboard. This will
    * be unset if you POST an empty value.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Boolean indicating whether the application fee should be refunded when reversing this transfer. If a full transfer reversal is
    * given, the full application fee will be refunded. Otherwise, the application fee will be refunded with an amount proportional to
    * the amount of the transfer reversed.
    */
  var refund_application_fee: js.UndefOr[scala.Boolean] = js.undefined
}

object IReversalCreationOptions {
  @scala.inline
  def apply(
    amount: scala.Int | scala.Double = null,
    description: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    refund_application_fee: js.UndefOr[scala.Boolean] = js.undefined
  ): IReversalCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(refund_application_fee)) __obj.updateDynamic("refund_application_fee")(refund_application_fee)
    __obj.asInstanceOf[IReversalCreationOptions]
  }
}

