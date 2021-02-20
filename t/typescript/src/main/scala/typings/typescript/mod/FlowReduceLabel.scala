package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowReduceLabel
  extends FlowNodeBase
     with FlowNode {
  
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
  implicit class FlowReduceLabelMutableBuilder[Self <: FlowReduceLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntecedent(value: FlowNode): Self = StObject.set(x, "antecedent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntecedents(value: js.Array[FlowNode]): Self = StObject.set(x, "antecedents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntecedentsVarargs(value: FlowNode*): Self = StObject.set(x, "antecedents", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: FlowLabel): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
