package typings.stripe.stripeMod.skus

import typings.stripe.stripeMod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISkuListOptions extends IListOptions {
  /**
    * Only return SKUs that are active or inactive (e.g. pass false to list all inactive products).
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Only return SKUs that have the specified key/value pairs in this partially constructed dictionary.
    * Can be specified only if product is also supplied. For instance, if the associated product has
    * attributes ["color", "size"], passing in attributes[color]=red returns all the SKUs for this product
    * that have color set to red.
    */
  var attributes: js.UndefOr[ISkuAttributes] = js.undefined
  /**
    * Only return SKUs with the given IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Only return SKUs that are either in stock or out of stock (e.g. pass false to list all SKUs that are out of stock).
    * If no value is provided, all SKUs are returned.
    */
  var in_stock: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the product whose SKUs will be retrieved.
    */
  var product: js.UndefOr[String] = js.undefined
}

object ISkuListOptions {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    attributes: ISkuAttributes = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    ids: js.Array[String] = null,
    in_stock: js.UndefOr[Boolean] = js.undefined,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    product: String = null,
    starting_after: String = null
  ): ISkuListOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (!js.isUndefined(in_stock)) __obj.updateDynamic("in_stock")(in_stock)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product)
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[ISkuListOptions]
  }
}

