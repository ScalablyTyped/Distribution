package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsArrayType
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var elemType: TsType
  
  @JSName("type")
  var type_TsArrayType: typings.swcWasm.swcWasmStrings.TsArrayType
}
object TsArrayType {
  
  inline def apply(elemType: TsType, span: Span): TsArrayType = {
    val __obj = js.Dynamic.literal(elemType = elemType.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsArrayType")
    __obj.asInstanceOf[TsArrayType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsArrayType] (val x: Self) extends AnyVal {
    
    inline def setElemType(value: TsType): Self = StObject.set(x, "elemType", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsArrayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
