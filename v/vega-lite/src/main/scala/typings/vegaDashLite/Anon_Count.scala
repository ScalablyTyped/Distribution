package typings.vegaDashLite

import typings.vegaDashLite.buildSrcSortMod.SortOrder
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgUnionSortField
import typings.vegaDashLite.vegaDashLiteStrings.count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends VgUnionSortField {
  var op: count
  var order: js.UndefOr[SortOrder] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(op: count, order: SortOrder = null): Anon_Count = {
    val __obj = js.Dynamic.literal(op = op)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Count]
  }
}

