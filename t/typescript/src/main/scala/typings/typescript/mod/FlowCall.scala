package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowCall
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode
  var node: CallExpression
}

object FlowCall {
  @scala.inline
  def apply(
    antecedent: FlowNode,
    flags: FlowFlags,
    node: CallExpression,
    id: js.UndefOr[Double] = js.undefined
  ): FlowCall = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowCall]
  }
}

