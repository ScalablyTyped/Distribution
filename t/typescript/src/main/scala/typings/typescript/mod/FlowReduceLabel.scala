package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowReduceLabel extends FlowNodeBase {
  var antecedent: FlowNode = js.native
  var antecedents: js.Array[FlowNode] = js.native
  var target: FlowLabel = js.native
}

object FlowReduceLabel {
  @scala.inline
  def apply(antecedent: FlowNode, antecedents: js.Array[FlowNode], flags: FlowFlags, target: FlowLabel): FlowReduceLabel = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], antecedents = antecedents.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowReduceLabel]
  }
  @scala.inline
  implicit class FlowReduceLabelOps[Self <: FlowReduceLabel] (val x: Self) extends AnyVal {
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
    def setAntecedentsVarargs(value: FlowNode*): Self = this.set("antecedents", js.Array(value :_*))
    @scala.inline
    def setAntecedents(value: js.Array[FlowNode]): Self = this.set("antecedents", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: FlowLabel): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

