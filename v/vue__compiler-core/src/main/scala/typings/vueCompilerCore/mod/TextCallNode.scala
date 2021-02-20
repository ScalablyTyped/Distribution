package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`12`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextCallNode
  extends TemplateChildNode
     with Node2 {
  
  var codegenNode: CallExpression | SimpleExpressionNode = js.native
  
  var content: TextNode | InterpolationNode | CompoundExpressionNode = js.native
  
  @JSName("type")
  var type_TextCallNode: `12` = js.native
}
object TextCallNode {
  
  @scala.inline
  def apply(
    codegenNode: CallExpression | SimpleExpressionNode,
    content: TextNode | InterpolationNode | CompoundExpressionNode,
    loc: SourceLocation,
    `type`: `12`
  ): TextCallNode = {
    val __obj = js.Dynamic.literal(codegenNode = codegenNode.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextCallNode]
  }
  
  @scala.inline
  implicit class TextCallNodeMutableBuilder[Self <: TextCallNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodegenNode(value: CallExpression | SimpleExpressionNode): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: TextNode | InterpolationNode | CompoundExpressionNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `12`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
