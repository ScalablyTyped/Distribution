package typings.swcWasm.mod

import typings.swcWasm.swcWasmStrings.Computed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedPropName
  extends StObject
     with Node
     with HasSpan
     with PropertyName {
  
  var expression: Expression
  
  @JSName("type")
  var type_ComputedPropName: Computed
}
object ComputedPropName {
  
  inline def apply(expression: Expression, span: Span): ComputedPropName = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Computed")
    __obj.asInstanceOf[ComputedPropName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputedPropName] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: Computed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
