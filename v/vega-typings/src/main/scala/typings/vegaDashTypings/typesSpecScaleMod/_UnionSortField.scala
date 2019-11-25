package typings.vegaDashTypings.typesSpecScaleMod

import typings.vegaDashTypings.vegaDashTypingsStrings.count
import typings.vegaDashTypings.vegaDashTypingsStrings.max
import typings.vegaDashTypings.vegaDashTypingsStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnionSortField extends js.Object

object _UnionSortField {
  @scala.inline
  def Anon_CountOp(op: count, order: SortOrder = null): _UnionSortField = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnionSortField]
  }
  @scala.inline
  def Anon_CountField(field: ScaleField, op: count | min | max, order: SortOrder = null): _UnionSortField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnionSortField]
  }
}

