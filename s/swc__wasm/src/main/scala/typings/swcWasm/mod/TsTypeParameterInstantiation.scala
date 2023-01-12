package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsTypeParameterInstantiation
  extends StObject
     with Node
     with HasSpan {
  
  var params: js.Array[TsType]
  
  @JSName("type")
  var type_TsTypeParameterInstantiation: typings.swcWasm.swcWasmStrings.TsTypeParameterInstantiation
}
object TsTypeParameterInstantiation {
  
  inline def apply(params: js.Array[TsType], span: Span): TsTypeParameterInstantiation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeParameterInstantiation")
    __obj.asInstanceOf[TsTypeParameterInstantiation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsTypeParameterInstantiation] (val x: Self) extends AnyVal {
    
    inline def setParams(value: js.Array[TsType]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: TsType*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsTypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
