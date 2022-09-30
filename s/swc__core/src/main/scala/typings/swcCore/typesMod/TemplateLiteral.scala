package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateLiteral
  extends StObject
     with ExpressionBase
     with Expression {
  
  var expressions: js.Array[Expression]
  
  var quasis: js.Array[TemplateElement]
  
  @JSName("type")
  var type_TemplateLiteral: typings.swcCore.swcCoreStrings.TemplateLiteral
}
object TemplateLiteral {
  
  inline def apply(expressions: js.Array[Expression], quasis: js.Array[TemplateElement], span: Span): TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[TemplateLiteral]
  }
  
  extension [Self <: TemplateLiteral](x: Self) {
    
    inline def setExpressions(value: js.Array[Expression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: Expression*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setQuasis(value: js.Array[TemplateElement]): Self = StObject.set(x, "quasis", value.asInstanceOf[js.Any])
    
    inline def setQuasisVarargs(value: TemplateElement*): Self = StObject.set(x, "quasis", js.Array(value*))
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TemplateLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
