package typings
package stripeLib.stripeMod.StripeNs.productsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProductListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptions {
  /**
    * Only return products that are active or inactive (e.g. pass false to list all inactive products).
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only return products with the given IDs.
    */
  var ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Only return products that can be shipped (i.e., physical, not digital products).
    */
  var shippable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only return products with the given url
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object IProductListOptions {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    ids: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    shippable: js.UndefOr[scala.Boolean] = js.undefined,
    starting_after: java.lang.String = null,
    url: java.lang.String = null
  ): IProductListOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(shippable)) __obj.updateDynamic("shippable")(shippable)
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IProductListOptions]
  }
}

