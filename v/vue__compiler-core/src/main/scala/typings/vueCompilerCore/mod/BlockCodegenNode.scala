package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreStrings.LeftcurlybracketRightcurlybracket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueCompilerCore.mod.VNodeCall
  - typings.vueCompilerCore.mod.RenderSlotCall
*/
trait BlockCodegenNode extends StObject
object BlockCodegenNode {
  
  @scala.inline
  def RenderSlotCall(
    arguments: (js.Tuple2[String, String | ExpressionNode]) | (js.Tuple3[String, String | ExpressionNode, PropsExpression]) | (js.Tuple4[
      String, 
      String | ExpressionNode, 
      PropsExpression | LeftcurlybracketRightcurlybracket, 
      js.Array[TemplateChildNode]
    ]),
    callee: js.Symbol,
    loc: SourceLocation
  ): typings.vueCompilerCore.mod.RenderSlotCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(14)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.RenderSlotCall]
  }
  
  @scala.inline
  def VNodeCall(
    disableTracking: Boolean,
    isBlock: Boolean,
    loc: SourceLocation,
    tag: String | js.Symbol | CallExpression
  ): typings.vueCompilerCore.mod.VNodeCall = {
    val __obj = js.Dynamic.literal(disableTracking = disableTracking.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(13)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.VNodeCall]
  }
}
