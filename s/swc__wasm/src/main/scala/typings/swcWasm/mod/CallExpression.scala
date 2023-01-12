package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var arguments: js.Array[Argument]
  
  var callee: Super | Import | Expression
  
  var typeArguments: js.UndefOr[TsTypeParameterInstantiation] = js.undefined
  
  @JSName("type")
  var type_CallExpression: typings.swcWasm.swcWasmStrings.CallExpression
}
object CallExpression {
  
  inline def apply(arguments: js.Array[Argument], callee: Super | Import | Expression, span: Span): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[CallExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallExpression] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: js.Array[Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: Argument*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCallee(value: Super | Import | Expression): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.CallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: TsTypeParameterInstantiation): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
  }
}
