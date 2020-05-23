package typings.stripe.mod.taxRates

import typings.stripe.mod.IDateFilter
import typings.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItaxRateSearchOptions extends IListOptions {
  /**
    * Optional flag to filter by tax rates that are either active or not active (archived)
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * A filter on the list based on the object created field.
    */
  var created: js.UndefOr[String | IDateFilter] = js.undefined
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make
    * a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in
    * order to fetch the previous page of the list.
    */
  var inclusive: js.UndefOr[Boolean] = js.undefined
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    */
  @JSName("limit")
  var limit_ItaxRateSearchOptions: Double
}

object ItaxRateSearchOptions {
  @scala.inline
  def apply(
    limit: Double,
    active: js.UndefOr[Boolean] = js.undefined,
    created: String | IDateFilter = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    inclusive: js.UndefOr[Boolean] = js.undefined,
    starting_after: String = null
  ): ItaxRateSearchOptions = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(inclusive)) __obj.updateDynamic("inclusive")(inclusive.get.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItaxRateSearchOptions]
  }
}

