package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecScaleMod.ScaleField
import typings.vegaDashTypings.typesSpecScaleMod.SortOrder
import typings.vegaDashTypings.typesSpecScaleMod._UnionSortField
import typings.vegaDashTypings.vegaDashTypingsStrings.count
import typings.vegaDashTypings.vegaDashTypingsStrings.max
import typings.vegaDashTypings.vegaDashTypingsStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountField extends _UnionSortField {
  var field: ScaleField
  var op: count | min | max
  var order: js.UndefOr[SortOrder] = js.undefined
}

object Anon_CountField {
  @scala.inline
  def apply(field: ScaleField, op: count | min | max, order: SortOrder = null): Anon_CountField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CountField]
  }
}

