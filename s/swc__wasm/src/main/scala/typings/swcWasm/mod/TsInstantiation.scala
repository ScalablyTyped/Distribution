package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsInstantiation
  extends StObject
     with Node
     with HasSpan
     with Expression {
  
  var expression: Expression
  
  var typeArguments: TsTypeParameterInstantiation
  
  @JSName("type")
  var type_TsInstantiation: typings.swcWasm.swcWasmStrings.TsInstantiation
}
object TsInstantiation {
  
  inline def apply(expression: Expression, span: Span, typeArguments: TsTypeParameterInstantiation): TsInstantiation = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeArguments = typeArguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInstantiation")
    __obj.asInstanceOf[TsInstantiation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsInstantiation] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: TsTypeParameterInstantiation): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
  }
}
