package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`14`
import typings.vueCompilerCore.vueCompilerCoreStrings.LeftcurlybracketRightcurlybracket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.vueCompilerCore.mod.InferCodegenNodeType because Already inherited */ @js.native
trait RenderSlotCall
  extends CallExpression
     with BlockCodegenNode {
  
  @JSName("arguments")
  var arguments_RenderSlotCall: (js.Tuple2[String, String | ExpressionNode]) | (js.Tuple3[String, String | ExpressionNode, PropsExpression]) | (js.Tuple4[
    String, 
    String | ExpressionNode, 
    PropsExpression | LeftcurlybracketRightcurlybracket, 
    js.Array[TemplateChildNode]
  ]) = js.native
  
  @JSName("callee")
  var callee_RenderSlotCall: js.Symbol = js.native
}
object RenderSlotCall {
  
  @scala.inline
  def apply(
    arguments: (js.Tuple2[String, String | ExpressionNode]) | (js.Tuple3[String, String | ExpressionNode, PropsExpression]) | (js.Tuple4[
      String, 
      String | ExpressionNode, 
      PropsExpression | LeftcurlybracketRightcurlybracket, 
      js.Array[TemplateChildNode]
    ]),
    callee: js.Symbol,
    loc: SourceLocation,
    `type`: `14`
  ): RenderSlotCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSlotCall]
  }
  
  @scala.inline
  implicit class RenderSlotCallOps[Self <: RenderSlotCall] (val x: Self) extends AnyVal {
    
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
    def setArguments(
      value: (js.Tuple2[String, String | ExpressionNode]) | (js.Tuple3[String, String | ExpressionNode, PropsExpression]) | (js.Tuple4[
          String, 
          String | ExpressionNode, 
          PropsExpression | LeftcurlybracketRightcurlybracket, 
          js.Array[TemplateChildNode]
        ])
    ): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallee(value: js.Symbol): Self = this.set("callee", value.asInstanceOf[js.Any])
  }
}
