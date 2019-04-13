package typings
package winstonLib.winstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var fields: js.Any
  var from: js.UndefOr[stdLib.Date] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var order: js.UndefOr[winstonLib.winstonLibStrings.asc | winstonLib.winstonLibStrings.desc] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  var until: js.UndefOr[stdLib.Date] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(
    fields: js.Any,
    from: stdLib.Date = null,
    limit: scala.Int | scala.Double = null,
    order: winstonLib.winstonLibStrings.asc | winstonLib.winstonLibStrings.desc = null,
    rows: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null,
    until: stdLib.Date = null
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

