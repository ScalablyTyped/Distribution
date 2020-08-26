package typings.vegaTypings.scaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SortField extends js.Object

object _SortField {
  @scala.inline
  def OrderSortOrder(order: SortOrder): _SortField = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SortField]
  }
  @scala.inline
  def Op(op: ScaleField): _SortField = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SortField]
  }
}

