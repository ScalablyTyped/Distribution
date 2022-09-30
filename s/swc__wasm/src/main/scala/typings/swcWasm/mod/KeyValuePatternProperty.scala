package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValuePatternProperty
  extends StObject
     with Node
     with ObjectPatternProperty {
  
  var key: PropertyName
  
  @JSName("type")
  var type_KeyValuePatternProperty: typings.swcWasm.swcWasmStrings.KeyValuePatternProperty
  
  var value: Pattern
}
object KeyValuePatternProperty {
  
  inline def apply(key: PropertyName, value: Pattern): KeyValuePatternProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("KeyValuePatternProperty")
    __obj.asInstanceOf[KeyValuePatternProperty]
  }
  
  extension [Self <: KeyValuePatternProperty](x: Self) {
    
    inline def setKey(value: PropertyName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.KeyValuePatternProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Pattern): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
