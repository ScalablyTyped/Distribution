package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`14`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForRenderListExpression extends CallExpression {
  
  @JSName("arguments")
  var arguments_ForRenderListExpression: js.Tuple2[ExpressionNode, ForIteratorExpression] = js.native
  
  @JSName("callee")
  var callee_ForRenderListExpression: js.Symbol = js.native
}
object ForRenderListExpression {
  
  @scala.inline
  def apply(
    arguments: js.Tuple2[ExpressionNode, ForIteratorExpression],
    callee: js.Symbol,
    loc: SourceLocation,
    `type`: `14`
  ): ForRenderListExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForRenderListExpression]
  }
  
  @scala.inline
  implicit class ForRenderListExpressionOps[Self <: ForRenderListExpression] (val x: Self) extends AnyVal {
    
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
    def setArguments(value: js.Tuple2[ExpressionNode, ForIteratorExpression]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallee(value: js.Symbol): Self = this.set("callee", value.asInstanceOf[js.Any])
  }
}
