package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YieldExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var argument: js.UndefOr[Expression] = js.undefined
  
  var delegate: Boolean
  
  @JSName("type")
  var type_YieldExpression: typings.swcCore.swcCoreStrings.YieldExpression
}
object YieldExpression {
  
  inline def apply(delegate: Boolean, span: Span): YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[YieldExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YieldExpression] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setDelegate(value: Boolean): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.YieldExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
