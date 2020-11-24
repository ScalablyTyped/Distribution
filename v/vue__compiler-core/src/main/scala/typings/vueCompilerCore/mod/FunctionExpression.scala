package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`18`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionExpression
  extends JSChildNode
     with Node2 {
  
  var body: js.UndefOr[BlockStatement | IfStatement] = js.native
  
  /**
    * This flag is for codegen to determine whether it needs to generate the
    * withScopeId() wrapper
    */
  var isSlot: Boolean = js.native
  
  var newline: Boolean = js.native
  
  var params: js.UndefOr[ExpressionNode | String | (js.Array[ExpressionNode | String])] = js.native
  
  var returns: js.UndefOr[TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode] = js.native
  
  @JSName("type")
  var type_FunctionExpression: `18` = js.native
}
object FunctionExpression {
  
  @scala.inline
  def apply(isSlot: Boolean, loc: SourceLocation, newline: Boolean, `type`: `18`): FunctionExpression = {
    val __obj = js.Dynamic.literal(isSlot = isSlot.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionExpression]
  }
  
  @scala.inline
  implicit class FunctionExpressionOps[Self <: FunctionExpression] (val x: Self) extends AnyVal {
    
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
    def setIsSlot(value: Boolean): Self = this.set("isSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewline(value: Boolean): Self = this.set("newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `18`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: BlockStatement | IfStatement): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: (ExpressionNode | String)*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: ExpressionNode | String | (js.Array[ExpressionNode | String])): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setReturnsVarargs(value: TemplateChildNode*): Self = this.set("returns", js.Array(value :_*))
    
    @scala.inline
    def setReturns(value: TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode): Self = this.set("returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturns: Self = this.set("returns", js.undefined)
  }
}
