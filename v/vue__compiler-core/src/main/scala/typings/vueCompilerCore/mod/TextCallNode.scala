package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`12`
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
  implicit class TextCallNodeOps[Self <: TextCallNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCodegenNode(value: CallExpression | SimpleExpressionNode): Self = this.set("codegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: TextNode | InterpolationNode | CompoundExpressionNode): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `12`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
