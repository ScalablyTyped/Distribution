package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadElement
  extends StObject
     with Node
     with JSXAttributeOrSpread {
  
  var arguments: Expression
  
  var spread: Span
  
  @JSName("type")
  var type_SpreadElement: typings.swcWasm.swcWasmStrings.SpreadElement
}
object SpreadElement {
  
  inline def apply(arguments: Expression, spread: Span): SpreadElement = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadElement")
    __obj.asInstanceOf[SpreadElement]
  }
  
  extension [Self <: SpreadElement](x: Self) {
    
    inline def setArguments(value: Expression): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setSpread(value: Span): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.SpreadElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
