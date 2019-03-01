package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowArrayMutation
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode
  var node: CallExpression | BinaryExpression
}

object FlowArrayMutation {
  @scala.inline
  def apply(
    antecedent: FlowNode,
    flags: FlowFlags,
    node: CallExpression | BinaryExpression,
    id: scala.Int | scala.Double = null
  ): FlowArrayMutation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("antecedent")(antecedent)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowArrayMutation]
  }
}

