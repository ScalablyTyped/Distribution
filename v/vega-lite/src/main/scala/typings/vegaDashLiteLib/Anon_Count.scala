package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count
  extends vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgUnionSortField {
  var op: vegaDashLiteLib.vegaDashLiteLibStrings.count
  var order: js.UndefOr[vegaDashLiteLib.buildSrcSortMod.SortOrder] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(
    op: vegaDashLiteLib.vegaDashLiteLibStrings.count,
    order: vegaDashLiteLib.buildSrcSortMod.SortOrder = null
  ): Anon_Count = {
    val __obj = js.Dynamic.literal(op = op)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Count]
  }
}

