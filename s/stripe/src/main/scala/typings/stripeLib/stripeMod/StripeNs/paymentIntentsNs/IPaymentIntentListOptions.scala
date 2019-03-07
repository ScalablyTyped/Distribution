package typings
package stripeLib.stripeMod.StripeNs.paymentIntentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  /**
    * Filter links by their expiration status. By default, all links are returned.
    */
  var expired: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only return links for the given file.
    */
  var file: js.UndefOr[scala.Boolean] = js.undefined
}

object IPaymentIntentListOptions {
  @scala.inline
  def apply(
    created: java.lang.String | stripeLib.stripeMod.StripeNs.IDateFilter = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    expired: js.UndefOr[scala.Boolean] = js.undefined,
    file: js.UndefOr[scala.Boolean] = js.undefined,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null
  ): IPaymentIntentListOptions = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (!js.isUndefined(expired)) __obj.updateDynamic("expired")(expired)
    if (!js.isUndefined(file)) __obj.updateDynamic("file")(file)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[IPaymentIntentListOptions]
  }
}

