package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`24`
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
  
  @scala.inline
  def apply(left: SimpleExpressionNode, loc: SourceLocation, right: JSChildNode): AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(24)
    __obj.asInstanceOf[AssignmentExpression]
  }
  
  @scala.inline
  implicit class AssignmentExpressionMutableBuilder[Self <: AssignmentExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: SimpleExpressionNode): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: JSChildNode): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `24`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
