package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreInts.`24`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentExpression
  extends StObject
     with Node2
     with JSChildNode
     with SSRCodegenNode {
  
  var left: SimpleExpressionNode
  
  var right: JSChildNode
  
  @JSName("type")
  var type_AssignmentExpression: `24`
}
object AssignmentExpression {
  
  inline def apply(left: SimpleExpressionNode, loc: SourceLocation, right: JSChildNode): AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(24)
    __obj.asInstanceOf[AssignmentExpression]
  }
  
  extension [Self <: AssignmentExpression](x: Self) {
    
    inline def setLeft(value: SimpleExpressionNode): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: JSChildNode): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: `24`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
