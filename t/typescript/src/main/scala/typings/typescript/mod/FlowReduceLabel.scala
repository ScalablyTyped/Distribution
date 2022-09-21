package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowReduceLabel
  extends StObject
     with FlowNodeBase
     with FlowNode {
  
  var antecedent: FlowNode
  
  var antecedents: js.Array[FlowNode]
  
  var target: FlowLabel
}
object FlowReduceLabel {
  
  inline def apply(antecedent: FlowNode, antecedents: js.Array[FlowNode], flags: FlowFlags, target: FlowLabel): FlowReduceLabel = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], antecedents = antecedents.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowReduceLabel]
  }
  
  extension [Self <: FlowReduceLabel](x: Self) {
    
    inline def setAntecedent(value: FlowNode): Self = StObject.set(x, "antecedent", value.asInstanceOf[js.Any])
    
    inline def setAntecedents(value: js.Array[FlowNode]): Self = StObject.set(x, "antecedents", value.asInstanceOf[js.Any])
    
    inline def setAntecedentsVarargs(value: FlowNode*): Self = StObject.set(x, "antecedents", js.Array(value*))
    
    inline def setTarget(value: FlowLabel): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
