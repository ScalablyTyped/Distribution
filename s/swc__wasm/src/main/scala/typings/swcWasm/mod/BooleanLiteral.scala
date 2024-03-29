package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanLiteral
  extends StObject
     with Node
     with HasSpan
     with Literal
     with TsLiteral {
  
  @JSName("type")
  var type_BooleanLiteral: typings.swcWasm.swcWasmStrings.BooleanLiteral
  
  var value: Boolean
}
object BooleanLiteral {
  
  inline def apply(span: Span, value: Boolean): BooleanLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[BooleanLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BooleanLiteral] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.BooleanLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
