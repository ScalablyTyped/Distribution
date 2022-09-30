package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsParenthesizedType
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var typeAnnotation: TsType
  
  @JSName("type")
  var type_TsParenthesizedType: typings.swcWasm.swcWasmStrings.TsParenthesizedType
}
object TsParenthesizedType {
  
  inline def apply(span: Span, typeAnnotation: TsType): TsParenthesizedType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsParenthesizedType")
    __obj.asInstanceOf[TsParenthesizedType]
  }
  
  extension [Self <: TsParenthesizedType](x: Self) {
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsParenthesizedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
