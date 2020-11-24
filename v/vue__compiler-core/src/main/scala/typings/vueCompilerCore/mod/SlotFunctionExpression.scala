package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`18`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotFunctionExpression extends FunctionExpression {
  
  @JSName("returns")
  var returns_SlotFunctionExpression: js.Array[TemplateChildNode] = js.native
}
object SlotFunctionExpression {
  
  @scala.inline
  def apply(
    isSlot: Boolean,
    loc: SourceLocation,
    newline: Boolean,
    returns: js.Array[TemplateChildNode],
    `type`: `18`
  ): SlotFunctionExpression = {
    val __obj = js.Dynamic.literal(isSlot = isSlot.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotFunctionExpression]
  }
  
  @scala.inline
  implicit class SlotFunctionExpressionOps[Self <: SlotFunctionExpression] (val x: Self) extends AnyVal {
    
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
    def setReturns(value: js.Array[TemplateChildNode]): Self = this.set("returns", value.asInstanceOf[js.Any])
  }
}
