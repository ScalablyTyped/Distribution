package typings.tsutils.controlFlowMod

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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlFlowEnd]
  }
}

