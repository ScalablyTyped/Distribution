package typings.stripe.stripeMod.products

import typings.stripe.stripeMod.IDateFilter
import typings.stripe.stripeMod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProductListOptions extends IListOptions {
  /**
    * Only return products that are active or inactive (e.g. pass false to list all inactive products).
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var created: js.UndefOr[IDateFilter] = js.undefined
  /**
    * Only return products with the given IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Only return products that can be shipped (i.e., physical, not digital products).
    */
  var shippable: js.UndefOr[Boolean] = js.undefined
  /**
    * Only return products of this type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Only return products with the given url
    */
  var url: js.UndefOr[String] = js.undefined
}

object IProductListOptions {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    created: IDateFilter = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    ids: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    shippable: js.UndefOr[Boolean] = js.undefined,
    starting_after: String = null,
    `type`: String = null,
    url: String = null
  ): IProductListOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(shippable)) __obj.updateDynamic("shippable")(shippable.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProductListOptions]
  }
}

