package typings.vegaTypings.markMod

import typings.vegaTypings.exprMod.ExprRef
import typings.vegaTypings.scaleMod.SortOrder
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.AnonOrder
  - typings.vegaTypings.AnonFieldOrder
*/
trait Compare extends js.Object

object Compare {
  @scala.inline
  def AnonOrder(field: String | ExprRef | SignalRef, order: SortOrder = null): Compare = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compare]
  }
  @scala.inline
  def AnonFieldOrder(field: js.Array[String | ExprRef | SignalRef], order: js.Array[SortOrder] = null): Compare = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compare]
  }
}

