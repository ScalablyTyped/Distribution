package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlanListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  /**
    * Only return plans that are active or inactive (e.g., pass false to list all inactive products).
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only return plans for the given product.
    */
  var product: js.UndefOr[java.lang.String] = js.undefined
}

object IPlanListOptions {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    created: java.lang.String | stripeLib.stripeMod.StripeNs.IDateFilter = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    product: java.lang.String = null,
    starting_after: java.lang.String = null
  ): IPlanListOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product)
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[IPlanListOptions]
  }
}

