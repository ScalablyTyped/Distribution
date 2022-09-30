package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var elements: js.Array[js.UndefOr[ExprOrSpread]]
  
  @JSName("type")
  var type_ArrayExpression: typings.swcCore.swcCoreStrings.ArrayExpression
}
object ArrayExpression {
  
  inline def apply(elements: js.Array[js.UndefOr[ExprOrSpread]], span: Span): ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[ArrayExpression]
  }
  
  extension [Self <: ArrayExpression](x: Self) {
    
    inline def setElements(value: js.Array[js.UndefOr[ExprOrSpread]]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: js.UndefOr[ExprOrSpread]*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ArrayExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
