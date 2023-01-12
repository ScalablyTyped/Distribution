package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var arguments: js.UndefOr[js.Array[Argument]] = js.undefined
  
  var callee: Expression
  
  var typeArguments: js.UndefOr[TsTypeParameterInstantiation] = js.undefined
  
  @JSName("type")
  var type_NewExpression: typings.swcCore.swcCoreStrings.NewExpression
}
object NewExpression {
  
  inline def apply(callee: Expression, span: Span): NewExpression = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[NewExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewExpression] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: js.Array[Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: Argument*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCallee(value: Expression): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.NewExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: TsTypeParameterInstantiation): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
  }
}
