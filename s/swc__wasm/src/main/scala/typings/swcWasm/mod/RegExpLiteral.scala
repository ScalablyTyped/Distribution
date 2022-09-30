package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpLiteral
  extends StObject
     with Node
     with HasSpan
     with Literal {
  
  var flags: String
  
  var pattern: String
  
  @JSName("type")
  var type_RegExpLiteral: typings.swcWasm.swcWasmStrings.RegExpLiteral
}
object RegExpLiteral {
  
  inline def apply(flags: String, pattern: String, span: Span): RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[RegExpLiteral]
  }
  
  extension [Self <: RegExpLiteral](x: Self) {
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.RegExpLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
