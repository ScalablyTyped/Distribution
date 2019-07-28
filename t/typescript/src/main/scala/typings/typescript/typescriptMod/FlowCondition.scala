package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowCondition
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode
  var expression: Expression
}

object FlowCondition {
  @scala.inline
  def apply(antecedent: FlowNode, expression: Expression, flags: FlowFlags, id: Int | Double = null): FlowCondition = {
    val __obj = js.Dynamic.literal(antecedent = antecedent, expression = expression, flags = flags)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowCondition]
  }
}

