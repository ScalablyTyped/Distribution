package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecScaleMod.ScaleField
import typings.vegaDashTypings.typesSpecScaleMod.SortOrder
import typings.vegaDashTypings.typesSpecScaleMod._SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldOp extends _SortField {
  var field: js.UndefOr[ScaleField] = js.undefined
  var op: ScaleField
  var order: js.UndefOr[SortOrder] = js.undefined
}

object Anon_FieldOp {
  @scala.inline
  def apply(op: ScaleField, field: ScaleField = null, order: SortOrder = null): Anon_FieldOp = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[Anon_FieldOp]
  }
}

