package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecExprMod.ExprRef
import typings.vegaDashTypings.typesSpecMarkMod.Compare
import typings.vegaDashTypings.typesSpecScaleMod.SortOrder
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldOrderArray extends Compare {
  var field: js.Array[String | ExprRef | SignalRef]
  var order: js.UndefOr[js.Array[SortOrder]] = js.undefined
}

object Anon_FieldOrderArray {
  @scala.inline
  def apply(field: js.Array[String | ExprRef | SignalRef], order: js.Array[SortOrder] = null): Anon_FieldOrderArray = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FieldOrderArray]
  }
}

