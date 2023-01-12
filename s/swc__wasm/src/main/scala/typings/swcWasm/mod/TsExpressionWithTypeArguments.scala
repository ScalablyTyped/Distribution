package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsExpressionWithTypeArguments
  extends StObject
     with Node
     with HasSpan {
  
  var expression: Expression
  
  var typeArguments: js.UndefOr[TsTypeParameterInstantiation] = js.undefined
  
  @JSName("type")
  var type_TsExpressionWithTypeArguments: typings.swcWasm.swcWasmStrings.TsExpressionWithTypeArguments
}
object TsExpressionWithTypeArguments {
  
  inline def apply(expression: Expression, span: Span): TsExpressionWithTypeArguments = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsExpressionWithTypeArguments")
    __obj.asInstanceOf[TsExpressionWithTypeArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsExpressionWithTypeArguments] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsExpressionWithTypeArguments): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: TsTypeParameterInstantiation): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
  }
}
