package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsConstAssertion
  extends StObject
     with ExpressionBase
     with Expression {
  
  var expression: Expression
  
  @JSName("type")
  var type_TsConstAssertion: typings.swcCore.swcCoreStrings.TsConstAssertion
}
object TsConstAssertion {
  
  inline def apply(expression: Expression, span: Span): TsConstAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstAssertion")
    __obj.asInstanceOf[TsConstAssertion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsConstAssertion] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsConstAssertion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
