package typings
package tsutilsLib.utilControlDashFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlFlowEnd extends js.Object {
  val end: scala.Boolean
  val statements: js.Array[ControlFlowStatement]
}

object ControlFlowEnd {
  @scala.inline
  def apply(end: scala.Boolean, statements: js.Array[ControlFlowStatement]): ControlFlowEnd = {
    val __obj = js.Dynamic.literal(end = end, statements = statements)
  
    __obj.asInstanceOf[ControlFlowEnd]
  }
}

