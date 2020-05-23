package typings.winston.mod

import typings.std.Date
import typings.winston.winstonStrings.asc
import typings.winston.winstonStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var fields: js.Any
  var from: js.UndefOr[Date] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[asc | desc] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var until: js.UndefOr[Date] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(
    fields: js.Any,
    from: Date = null,
    limit: js.UndefOr[Double] = js.undefined,
    order: asc | desc = null,
    rows: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined,
    until: Date = null
  ): QueryOptions = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

