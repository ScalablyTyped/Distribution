package typings.vegaDashLite.buildSrcLogicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogicalOr[T] extends _LogicalOperand[T] {
  var or: js.Array[LogicalOperand[T]]
}

object LogicalOr {
  @scala.inline
  def apply[T](or: js.Array[LogicalOperand[T]]): LogicalOr[T] = {
    val __obj = js.Dynamic.literal(or = or)
  
    __obj.asInstanceOf[LogicalOr[T]]
  }
}

