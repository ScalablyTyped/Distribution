package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var fields: js.UndefOr[ArrayOrValue[FieldParam]] = js.undefined
  var filters: js.UndefOr[ArrayOrValue[FilterParam]] = js.undefined
  var formats: js.UndefOr[ArrayOrValue[FormatParam]] = js.undefined
  var include: js.UndefOr[ArrayOrValue[IncludeParam]] = js.undefined
  var limit: js.UndefOr[ArrayOrValue[LimitParam]] = js.undefined
  var order: js.UndefOr[ArrayOrValue[OrderParam]] = js.undefined
  var page: js.UndefOr[ArrayOrValue[PageParam]] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    fields: ArrayOrValue[FieldParam] = null,
    filters: ArrayOrValue[FilterParam] = null,
    formats: ArrayOrValue[FormatParam] = null,
    include: ArrayOrValue[IncludeParam] = null,
    limit: ArrayOrValue[LimitParam] = null,
    order: ArrayOrValue[OrderParam] = null,
    page: ArrayOrValue[PageParam] = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

