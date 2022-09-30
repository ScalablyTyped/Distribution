package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var alternate: Expression
  
  var consequent: Expression
  
  var test: Expression
  
  @JSName("type")
  var type_ConditionalExpression: typings.swcCore.swcCoreStrings.ConditionalExpression
}
object ConditionalExpression {
  
  inline def apply(alternate: Expression, consequent: Expression, span: Span, test: Expression): ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[ConditionalExpression]
  }
  
  extension [Self <: ConditionalExpression](x: Self) {
    
    inline def setAlternate(value: Expression): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setConsequent(value: Expression): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ConditionalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
