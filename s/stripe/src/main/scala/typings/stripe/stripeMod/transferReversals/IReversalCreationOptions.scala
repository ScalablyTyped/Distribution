package typings.stripe.stripeMod.transferReversals

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReversalCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer in cents/pence representing how much of this transfer to reverse. Can only reverse up to the unreversed amount
    * remaining of the transfer. Partial transfer reversals are only allowed for transfers to Stripe Accounts.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * An arbitrary string which you can attach to a reversal object. It is displayed alongside the reversal in the dashboard. This will
    * be unset if you POST an empty value.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Boolean indicating whether the application fee should be refunded when reversing this transfer. If a full transfer reversal is
    * given, the full application fee will be refunded. Otherwise, the application fee will be refunded with an amount proportional to
    * the amount of the transfer reversed.
    */
  var refund_application_fee: js.UndefOr[Boolean] = js.undefined
}

object IReversalCreationOptions {
  @scala.inline
  def apply(
    amount: Int | Double = null,
    description: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    refund_application_fee: js.UndefOr[Boolean] = js.undefined
  ): IReversalCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(refund_application_fee)) __obj.updateDynamic("refund_application_fee")(refund_application_fee.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReversalCreationOptions]
  }
}

