package typings.winston.winstonMod

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
    limit: Int | Double = null,
    order: asc | desc = null,
    rows: Int | Double = null,
    start: Int | Double = null,
    until: Date = null
  ): QueryOptions = {
    val __obj = js.Dynamic.literal(fields = fields)
    if (from != null) __obj.updateDynamic("from")(from)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until)
    __obj.asInstanceOf[QueryOptions]
  }
}

