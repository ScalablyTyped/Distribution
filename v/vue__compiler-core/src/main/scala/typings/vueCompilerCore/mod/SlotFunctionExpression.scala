package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotFunctionExpression
  extends StObject
     with FunctionExpression {
  
  @JSName("returns")
  var returns_SlotFunctionExpression: js.Array[TemplateChildNode]
}
object SlotFunctionExpression {
  
  inline def apply(isSlot: Boolean, loc: SourceLocation, newline: Boolean, returns: js.Array[TemplateChildNode]): SlotFunctionExpression = {
    val __obj = js.Dynamic.literal(isSlot = isSlot.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(18)
    __obj.asInstanceOf[SlotFunctionExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotFunctionExpression] (val x: Self) extends AnyVal {
    
    inline def setReturns(value: js.Array[TemplateChildNode]): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    inline def setReturnsVarargs(value: TemplateChildNode*): Self = StObject.set(x, "returns", js.Array(value*))
  }
}
