package typings.typescript.mod

import org.scalablytyped.runtime.StObject
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
  implicit class FlowArrayMutationMutableBuilder[Self <: FlowArrayMutation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntecedent(value: FlowNode): Self = StObject.set(x, "antecedent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: CallExpression | BinaryExpression): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
