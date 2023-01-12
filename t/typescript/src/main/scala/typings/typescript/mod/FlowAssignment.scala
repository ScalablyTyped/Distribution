package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowAssignment
  extends StObject
     with FlowNodeBase
     with FlowNode {
  
  var antecedent: FlowNode
  
  var node: Expression | VariableDeclaration | BindingElement
}
object FlowAssignment {
  
  inline def apply(antecedent: FlowNode, flags: FlowFlags, node: Expression | VariableDeclaration | BindingElement): FlowAssignment = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlowAssignment] (val x: Self) extends AnyVal {
    
    inline def setAntecedent(value: FlowNode): Self = StObject.set(x, "antecedent", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Expression | VariableDeclaration | BindingElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
