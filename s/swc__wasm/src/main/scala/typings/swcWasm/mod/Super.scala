package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Super
  extends StObject
     with Node
     with HasSpan {
  
  @JSName("type")
  var type_Super: typings.swcWasm.swcWasmStrings.Super
}
object Super {
  
  inline def apply(span: Span): Super = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[Super]
  }
  
  extension [Self <: Super](x: Self) {
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.Super): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
