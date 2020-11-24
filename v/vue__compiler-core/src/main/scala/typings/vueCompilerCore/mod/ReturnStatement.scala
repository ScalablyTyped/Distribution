package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`26`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnStatement
  extends SSRCodegenNode
     with Node2 {
  
  var returns: TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode = js.native
  
  @JSName("type")
  var type_ReturnStatement: `26` = js.native
}
object ReturnStatement {
  
  @scala.inline
  def apply(
    loc: SourceLocation,
    returns: TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode,
    `type`: `26`
  ): ReturnStatement = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnStatement]
  }
  
  @scala.inline
  implicit class ReturnStatementOps[Self <: ReturnStatement] (val x: Self) extends AnyVal {
    
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
    def setReturnsVarargs(value: TemplateChildNode*): Self = this.set("returns", js.Array(value :_*))
    
    @scala.inline
    def setReturns(value: TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode): Self = this.set("returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `26`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
