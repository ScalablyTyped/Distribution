package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldOp extends js.Object {
  var field: js.UndefOr[vegaDashTypingsLib.typesSpecScaleMod.ScaleField] = js.undefined
  var op: vegaDashTypingsLib.typesSpecScaleMod.ScaleField
  var order: js.UndefOr[vegaDashTypingsLib.typesSpecScaleMod.SortOrder] = js.undefined
}

object Anon_FieldOp {
  @scala.inline
  def apply(
    op: vegaDashTypingsLib.typesSpecScaleMod.ScaleField,
    field: vegaDashTypingsLib.typesSpecScaleMod.ScaleField = null,
    order: vegaDashTypingsLib.typesSpecScaleMod.SortOrder = null
  ): Anon_FieldOp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[Anon_FieldOp]
  }
}

