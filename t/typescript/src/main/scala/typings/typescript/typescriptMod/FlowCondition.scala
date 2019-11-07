package typings.typescript.typescriptMod

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
    val __obj = js.Dynamic.literal(antecedent = antecedent, flags = flags, node = node)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowCondition]
  }
}

