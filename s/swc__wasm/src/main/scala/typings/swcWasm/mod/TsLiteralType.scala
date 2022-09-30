package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsLiteralType
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var literal: TsLiteral
  
  @JSName("type")
  var type_TsLiteralType: typings.swcWasm.swcWasmStrings.TsLiteralType
}
object TsLiteralType {
  
  inline def apply(literal: TsLiteral, span: Span): TsLiteralType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsLiteralType")
    __obj.asInstanceOf[TsLiteralType]
  }
  
  extension [Self <: TsLiteralType](x: Self) {
    
    inline def setLiteral(value: TsLiteral): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsLiteralType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
