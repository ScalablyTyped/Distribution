package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigIntLiteral
  extends StObject
     with Node
     with HasSpan
     with Literal
     with PropertyName
     with TsLiteral {
  
  var raw: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_BigIntLiteral: typings.swcWasm.swcWasmStrings.BigIntLiteral
  
  var value: js.BigInt
}
object BigIntLiteral {
  
  inline def apply(span: Span, value: js.BigInt): BigIntLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[BigIntLiteral]
  }
  
  extension [Self <: BigIntLiteral](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.BigIntLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.BigInt): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
