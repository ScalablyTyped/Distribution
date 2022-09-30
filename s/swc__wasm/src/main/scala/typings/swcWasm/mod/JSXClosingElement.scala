package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXClosingElement
  extends StObject
     with Node
     with HasSpan {
  
  var name: JSXElementName
  
  @JSName("type")
  var type_JSXClosingElement: typings.swcWasm.swcWasmStrings.JSXClosingElement
}
object JSXClosingElement {
  
  inline def apply(name: JSXElementName, span: Span): JSXClosingElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[JSXClosingElement]
  }
  
  extension [Self <: JSXClosingElement](x: Self) {
    
    inline def setName(value: JSXElementName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.JSXClosingElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
