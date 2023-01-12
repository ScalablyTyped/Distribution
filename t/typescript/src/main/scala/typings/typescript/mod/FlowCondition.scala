package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowCondition
  extends StObject
     with FlowNodeBase
     with FlowNode {
  
  var antecedent: FlowNode
  
  var node: Expression
}
object FlowCondition {
  
  inline def apply(antecedent: FlowNode, flags: FlowFlags, node: Expression): FlowCondition = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlowCondition] (val x: Self) extends AnyVal {
    
    inline def setAntecedent(value: FlowNode): Self = StObject.set(x, "antecedent", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Expression): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
