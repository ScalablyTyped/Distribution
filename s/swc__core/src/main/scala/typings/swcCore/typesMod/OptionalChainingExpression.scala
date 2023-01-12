package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalChainingExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  /**
    * Call expression or member expression.
    */
  var base: MemberExpression | OptionalChainingCall
  
  var questionDotToken: Span
  
  @JSName("type")
  var type_OptionalChainingExpression: typings.swcCore.swcCoreStrings.OptionalChainingExpression
}
object OptionalChainingExpression {
  
  inline def apply(base: MemberExpression | OptionalChainingCall, questionDotToken: Span, span: Span): OptionalChainingExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], questionDotToken = questionDotToken.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalChainingExpression")
    __obj.asInstanceOf[OptionalChainingExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionalChainingExpression] (val x: Self) extends AnyVal {
    
    inline def setBase(value: MemberExpression | OptionalChainingCall): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setQuestionDotToken(value: Span): Self = StObject.set(x, "questionDotToken", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.OptionalChainingExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
