package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXSpreadChild
  extends StObject
     with Node
     with HasSpan
     with JSXElementChild {
  
  var expression: Expression
  
  @JSName("type")
  var type_JSXSpreadChild: typings.swcCore.swcCoreStrings.JSXSpreadChild
}
object JSXSpreadChild {
  
  inline def apply(expression: Expression, span: Span): JSXSpreadChild = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[JSXSpreadChild]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXSpreadChild] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.JSXSpreadChild): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
