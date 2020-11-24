package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`5`
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
  implicit class InterpolationNodeOps[Self <: InterpolationNode] (val x: Self) extends AnyVal {
    
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
    def setContent(value: ExpressionNode): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `5`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
