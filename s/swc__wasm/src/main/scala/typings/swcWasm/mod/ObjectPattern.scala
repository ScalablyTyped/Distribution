package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectPattern
  extends StObject
     with PatternBase
     with Pattern
     with TsFnParameter {
  
  var optional: Boolean
  
  var properties: js.Array[ObjectPatternProperty]
  
  @JSName("type")
  var type_ObjectPattern: typings.swcWasm.swcWasmStrings.ObjectPattern
}
object ObjectPattern {
  
  inline def apply(optional: Boolean, properties: js.Array[ObjectPatternProperty], span: Span): ObjectPattern = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[ObjectPattern]
  }
  
  extension [Self <: ObjectPattern](x: Self) {
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[ObjectPatternProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: ObjectPatternProperty*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.ObjectPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
