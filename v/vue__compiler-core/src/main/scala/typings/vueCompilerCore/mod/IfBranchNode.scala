package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`10`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfBranchNode
  extends TemplateChildNode
     with Node2
     with ParentNode2 {
  
  var children: js.Array[TemplateChildNode] = js.native
  
  var condition: js.UndefOr[ExpressionNode] = js.native
  
  @JSName("type")
  var type_IfBranchNode: `10` = js.native
  
  var userKey: js.UndefOr[AttributeNode | DirectiveNode] = js.native
}
object IfBranchNode {
  
  @scala.inline
  def apply(children: js.Array[TemplateChildNode], loc: SourceLocation, `type`: `10`): IfBranchNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfBranchNode]
  }
  
  @scala.inline
  implicit class IfBranchNodeOps[Self <: IfBranchNode] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: TemplateChildNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[TemplateChildNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `10`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: ExpressionNode): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setUserKey(value: AttributeNode | DirectiveNode): Self = this.set("userKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserKey: Self = this.set("userKey", js.undefined)
  }
}
