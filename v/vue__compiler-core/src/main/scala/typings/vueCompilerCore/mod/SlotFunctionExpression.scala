package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`18`
import org.scalablytyped.runtime.StObject
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
  implicit class SlotFunctionExpressionMutableBuilder[Self <: SlotFunctionExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturns(value: js.Array[TemplateChildNode]): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnsVarargs(value: TemplateChildNode*): Self = StObject.set(x, "returns", js.Array(value :_*))
  }
}
