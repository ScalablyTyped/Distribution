package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecExprMod.ExprRef
import typings.vegaDashTypings.typesSpecMarkMod.Compare
import typings.vegaDashTypings.typesSpecScaleMod.SortOrder
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldOrder extends Compare {
  var field: String | ExprRef | SignalRef
  var order: js.UndefOr[SortOrder] = js.undefined
}

object Anon_FieldOrder {
  @scala.inline
  def apply(field: String | ExprRef | SignalRef, order: SortOrder = null): Anon_FieldOrder = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FieldOrder]
  }
}

