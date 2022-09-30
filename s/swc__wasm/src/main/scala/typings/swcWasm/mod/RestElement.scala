package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestElement
  extends StObject
     with PatternBase
     with ObjectPatternProperty
     with Pattern
     with TsFnParameter {
  
  var argument: Pattern
  
  var rest: Span
  
  @JSName("type")
  var type_RestElement: typings.swcWasm.swcWasmStrings.RestElement
}
object RestElement {
  
  inline def apply(argument: Pattern, rest: Span, span: Span): RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[RestElement]
  }
  
  extension [Self <: RestElement](x: Self) {
    
    inline def setArgument(value: Pattern): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setRest(value: Span): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.RestElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
