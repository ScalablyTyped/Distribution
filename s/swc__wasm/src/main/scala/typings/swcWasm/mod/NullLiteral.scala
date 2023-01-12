package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullLiteral
  extends StObject
     with Node
     with HasSpan
     with Literal {
  
  @JSName("type")
  var type_NullLiteral: typings.swcWasm.swcWasmStrings.NullLiteral
}
object NullLiteral {
  
  inline def apply(span: Span): NullLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[NullLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NullLiteral] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.NullLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
