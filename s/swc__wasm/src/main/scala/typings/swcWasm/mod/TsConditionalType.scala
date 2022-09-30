package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsConditionalType
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var checkType: TsType
  
  var extendsType: TsType
  
  var falseType: TsType
  
  var trueType: TsType
  
  @JSName("type")
  var type_TsConditionalType: typings.swcWasm.swcWasmStrings.TsConditionalType
}
object TsConditionalType {
  
  inline def apply(checkType: TsType, extendsType: TsType, falseType: TsType, span: Span, trueType: TsType): TsConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConditionalType")
    __obj.asInstanceOf[TsConditionalType]
  }
  
  extension [Self <: TsConditionalType](x: Self) {
    
    inline def setCheckType(value: TsType): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
    
    inline def setExtendsType(value: TsType): Self = StObject.set(x, "extendsType", value.asInstanceOf[js.Any])
    
    inline def setFalseType(value: TsType): Self = StObject.set(x, "falseType", value.asInstanceOf[js.Any])
    
    inline def setTrueType(value: TsType): Self = StObject.set(x, "trueType", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsConditionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
