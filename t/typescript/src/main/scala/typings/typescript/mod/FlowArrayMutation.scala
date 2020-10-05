package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowArrayMutation
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode = js.native
  var node: CallExpression | BinaryExpression = js.native
}

object FlowArrayMutation {
  @scala.inline
  def apply(antecedent: FlowNode, flags: FlowFlags, node: CallExpression | BinaryExpression): FlowArrayMutation = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowArrayMutation]
  }
  @scala.inline
  implicit class FlowArrayMutationOps[Self <: FlowArrayMutation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAntecedent(value: FlowNode): Self = this.set("antecedent", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: CallExpression | BinaryExpression): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

