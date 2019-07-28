package typings.vegaDashLite.buildSrcLogicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogicalNot[T] extends _LogicalOperand[T] {
  var not: LogicalOperand[T]
}

object LogicalNot {
  @scala.inline
  def apply[T](not: LogicalOperand[T]): LogicalNot[T] = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogicalNot[T]]
  }
}

