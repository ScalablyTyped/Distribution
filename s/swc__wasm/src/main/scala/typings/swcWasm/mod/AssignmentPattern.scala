package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentPattern
  extends StObject
     with PatternBase
     with Pattern
     with TsParameterPropertyParameter {
  
  var left: Pattern
  
  var right: Expression
  
  @JSName("type")
  var type_AssignmentPattern: typings.swcWasm.swcWasmStrings.AssignmentPattern
}
object AssignmentPattern {
  
  inline def apply(left: Pattern, right: Expression, span: Span): AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[AssignmentPattern]
  }
  
  extension [Self <: AssignmentPattern](x: Self) {
    
    inline def setLeft(value: Pattern): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.AssignmentPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
