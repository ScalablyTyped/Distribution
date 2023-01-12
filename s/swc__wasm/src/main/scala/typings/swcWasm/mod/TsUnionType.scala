package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsUnionType
  extends StObject
     with Node
     with HasSpan
     with TsUnionOrIntersectionType {
  
  @JSName("type")
  var type_TsUnionType: typings.swcWasm.swcWasmStrings.TsUnionType
  
  var types: js.Array[TsType]
}
object TsUnionType {
  
  inline def apply(span: Span, types: js.Array[TsType]): TsUnionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsUnionType")
    __obj.asInstanceOf[TsUnionType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsUnionType] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsUnionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[TsType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: TsType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
