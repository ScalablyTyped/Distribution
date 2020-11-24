package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfNode
  extends TemplateChildNode
     with Node2 {
  
  var branches: js.Array[IfBranchNode] = js.native
  
  var codegenNode: js.UndefOr[IfConditionalExpression | CacheExpression] = js.native
  
  @JSName("type")
  var type_IfNode: `9` = js.native
}
object IfNode {
  
  @scala.inline
  def apply(branches: js.Array[IfBranchNode], loc: SourceLocation, `type`: `9`): IfNode = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfNode]
  }
  
  @scala.inline
  implicit class IfNodeOps[Self <: IfNode] (val x: Self) extends AnyVal {
    
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
    def setBranchesVarargs(value: IfBranchNode*): Self = this.set("branches", js.Array(value :_*))
    
    @scala.inline
    def setBranches(value: js.Array[IfBranchNode]): Self = this.set("branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `9`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodegenNode(value: IfConditionalExpression | CacheExpression): Self = this.set("codegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodegenNode: Self = this.set("codegenNode", js.undefined)
  }
}
