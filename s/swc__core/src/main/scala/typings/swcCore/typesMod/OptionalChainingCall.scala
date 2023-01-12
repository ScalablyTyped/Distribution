package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalChainingCall
  extends StObject
     with ExpressionBase {
  
  var arguments: js.Array[ExprOrSpread]
  
  var callee: Expression
  
  var typeArguments: js.UndefOr[TsTypeParameterInstantiation] = js.undefined
  
  @JSName("type")
  var type_OptionalChainingCall: typings.swcCore.swcCoreStrings.CallExpression
}
object OptionalChainingCall {
  
  inline def apply(arguments: js.Array[ExprOrSpread], callee: Expression, span: Span): OptionalChainingCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[OptionalChainingCall]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionalChainingCall] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: js.Array[ExprOrSpread]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: ExprOrSpread*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCallee(value: Expression): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.CallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: TsTypeParameterInstantiation): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
  }
}
