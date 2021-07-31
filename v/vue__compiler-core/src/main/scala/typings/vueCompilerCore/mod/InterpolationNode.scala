package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolationNode
  extends StObject
     with Node2
     with TemplateChildNode
     with TemplateTextChildNode {
  
  var content: ExpressionNode
  
  @JSName("type")
  var type_InterpolationNode: `5`
}
object InterpolationNode {
  
  @scala.inline
  def apply(content: ExpressionNode, loc: SourceLocation): InterpolationNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(5)
    __obj.asInstanceOf[InterpolationNode]
  }
  
  @scala.inline
  implicit class InterpolationNodeMutableBuilder[Self <: InterpolationNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ExpressionNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `5`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
