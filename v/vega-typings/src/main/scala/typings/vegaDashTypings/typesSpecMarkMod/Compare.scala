package typings.vegaDashTypings.typesSpecMarkMod

import typings.vegaDashTypings.typesSpecExprMod.ExprRef
import typings.vegaDashTypings.typesSpecScaleMod.SortOrder
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compare extends js.Object {
  var field: js.UndefOr[(js.Array[String | ExprRef | SignalRef]) | ExprRef | SignalRef | String] = js.undefined
  var order: js.UndefOr[js.Array[SortOrder] | SortOrder] = js.undefined
}

object Compare {
  @scala.inline
  def apply(field: String | ExprRef | SignalRef = null, order: SortOrder = null): Compare = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[Compare]
  }
}

