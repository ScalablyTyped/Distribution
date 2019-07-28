package typings.vegaDashLite

import typings.vegaDashLite.buildSrcSortMod.SortOrder
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgFieldRef
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgSortField
import typings.vegaDashTypings.typesSpecTransformMod.AggregateOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Field extends VgSortField {
  var field: js.UndefOr[VgFieldRef] = js.undefined
  var op: AggregateOp
  var order: js.UndefOr[SortOrder] = js.undefined
}

object Anon_Field {
  @scala.inline
  def apply(op: AggregateOp, field: VgFieldRef = null, order: SortOrder = null): Anon_Field = {
    val __obj = js.Dynamic.literal(op = op)
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Field]
  }
}

