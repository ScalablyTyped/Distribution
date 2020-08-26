package typings.vegaTypings.markMod

import typings.vegaTypings.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.anon.Order
  - typings.vegaTypings.anon.FieldOrder
*/
trait Compare extends js.Object

object Compare {
  @scala.inline
  def Order(field: String | ExprRef | SignalRef): Compare = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compare]
  }
  @scala.inline
  def FieldOrder(field: js.Array[String | ExprRef | SignalRef]): Compare = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compare]
  }
}

