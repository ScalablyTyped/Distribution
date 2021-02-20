package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpolationNode
  extends TemplateChildNode
     with Node2
     with TemplateTextChildNode {
  
  var content: ExpressionNode = js.native
  
  @JSName("type")
  var type_InterpolationNode: `5` = js.native
}
object InterpolationNode {
  
  @scala.inline
  def apply(content: ExpressionNode, loc: SourceLocation, `type`: `5`): InterpolationNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
