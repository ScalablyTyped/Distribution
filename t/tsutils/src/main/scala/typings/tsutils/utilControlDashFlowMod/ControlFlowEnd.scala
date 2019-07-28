package typings.tsutils.utilControlDashFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlFlowEnd extends js.Object {
  val end: Boolean
  val statements: js.Array[ControlFlowStatement]
}

object ControlFlowEnd {
  @scala.inline
  def apply(end: Boolean, statements: js.Array[ControlFlowStatement]): ControlFlowEnd = {
    val __obj = js.Dynamic.literal(end = end, statements = statements)
  
    __obj.asInstanceOf[ControlFlowEnd]
  }
}

