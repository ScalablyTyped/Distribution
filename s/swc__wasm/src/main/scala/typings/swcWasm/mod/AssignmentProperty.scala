package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentProperty
  extends StObject
     with Node
     with Property {
  
  var key: Identifier
  
  @JSName("type")
  var type_AssignmentProperty: typings.swcWasm.swcWasmStrings.AssignmentProperty
  
  var value: Expression
}
object AssignmentProperty {
  
  inline def apply(key: Identifier, value: Expression): AssignmentProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentProperty")
    __obj.asInstanceOf[AssignmentProperty]
  }
  
  extension [Self <: AssignmentProperty](x: Self) {
    
    inline def setKey(value: Identifier): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.AssignmentProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
