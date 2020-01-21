package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowCondition
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode
  var node: Expression
}

object FlowCondition {
  @scala.inline
  def apply(antecedent: FlowNode, flags: FlowFlags, node: Expression, id: Int | Double = null): FlowCondition = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowCondition]
  }
}

