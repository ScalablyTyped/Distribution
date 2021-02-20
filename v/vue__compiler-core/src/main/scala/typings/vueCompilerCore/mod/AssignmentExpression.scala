package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`24`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentExpression
  extends JSChildNode
     with Node2
     with SSRCodegenNode {
  
  var left: SimpleExpressionNode = js.native
  
  var right: JSChildNode = js.native
  
  @JSName("type")
  var type_AssignmentExpression: `24` = js.native
}
object AssignmentExpression {
  
  @scala.inline
  def apply(left: SimpleExpressionNode, loc: SourceLocation, right: JSChildNode, `type`: `24`): AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
