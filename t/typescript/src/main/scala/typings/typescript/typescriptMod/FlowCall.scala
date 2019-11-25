package typings.typescript.typescriptMod

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
  def apply(antecedent: FlowNode, flags: FlowFlags, node: CallExpression, id: Int | Double = null): FlowCall = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowCall]
  }
}

