package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsAsExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var expression: Expression
  
  var typeAnnotation: TsType
  
  @JSName("type")
  var type_TsAsExpression: typings.swcCore.swcCoreStrings.TsAsExpression
}
object TsAsExpression {
  
  inline def apply(expression: Expression, span: Span, typeAnnotation: TsType): TsAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsAsExpression")
    __obj.asInstanceOf[TsAsExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsAsExpression] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsAsExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
