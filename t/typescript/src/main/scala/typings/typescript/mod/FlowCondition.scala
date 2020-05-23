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
  def apply(antecedent: FlowNode, flags: FlowFlags, node: Expression, id: js.UndefOr[Double] = js.undefined): FlowCondition = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowCondition]
  }
}

