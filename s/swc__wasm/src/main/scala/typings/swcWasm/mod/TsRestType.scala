package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsRestType
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var typeAnnotation: TsType
  
  @JSName("type")
  var type_TsRestType: typings.swcWasm.swcWasmStrings.TsRestType
}
object TsRestType {
  
  inline def apply(span: Span, typeAnnotation: TsType): TsRestType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsRestType")
    __obj.asInstanceOf[TsRestType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsRestType] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsRestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
