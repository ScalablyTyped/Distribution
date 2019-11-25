package typings.vegaDashTypings.typesSpecMarkMod

import typings.vegaDashTypings.typesSpecExprMod.ExprRef
import typings.vegaDashTypings.typesSpecScaleMod.SortOrder
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.Anon_FieldOrder
  - typings.vegaDashTypings.Anon_FieldOrderArray
*/
trait Compare extends js.Object

object Compare {
  @scala.inline
  def Anon_FieldOrder(field: String | ExprRef | SignalRef, order: SortOrder = null): Compare = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compare]
  }
  @scala.inline
  def Anon_FieldOrderArray(field: js.Array[String | ExprRef | SignalRef], order: js.Array[SortOrder] = null): Compare = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compare]
  }
}

