package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod.ScaleField
import typings.vegaTypings.scaleMod.SortOrder
import typings.vegaTypings.scaleMod._UnionSortField
import typings.vegaTypings.vegaTypingsStrings.count
import typings.vegaTypings.vegaTypingsStrings.max
import typings.vegaTypings.vegaTypingsStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldOp extends _UnionSortField {
  var field: ScaleField
  var op: count | min | max
  var order: js.UndefOr[SortOrder] = js.undefined
}

object FieldOp {
  @scala.inline
  def apply(field: ScaleField, op: count | min | max, order: SortOrder = null): FieldOp = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOp]
  }
}

