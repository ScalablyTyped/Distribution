package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowStart
  extends StObject
     with FlowNodeBase
     with FlowNode {
  
  var node: js.UndefOr[FunctionExpression | ArrowFunction | MethodDeclaration] = js.undefined
}
object FlowStart {
  
  @scala.inline
  def apply(flags: FlowFlags): FlowStart = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowStart]
  }
  
  @scala.inline
  implicit class FlowStartMutableBuilder[Self <: FlowStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: FunctionExpression | ArrowFunction | MethodDeclaration): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
  }
}
