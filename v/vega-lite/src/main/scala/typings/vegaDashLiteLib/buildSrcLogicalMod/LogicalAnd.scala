package typings
package vegaDashLiteLib.buildSrcLogicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogicalAnd[T] extends _LogicalOperand[T] {
  var and: js.Array[LogicalOperand[T]]
}

object LogicalAnd {
  @scala.inline
  def apply[T](and: js.Array[LogicalOperand[T]]): LogicalAnd[T] = {
    val __obj = js.Dynamic.literal(and = and)
  
    __obj.asInstanceOf[LogicalAnd[T]]
  }
}

