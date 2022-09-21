package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesDecay extends StObject {
  
  var properties: Decay
  
  var value: js.Array[Any]
}
object PropertiesDecay {
  
  inline def apply(properties: Decay, value: js.Array[Any]): PropertiesDecay = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesDecay]
  }
  
  extension [Self <: PropertiesDecay](x: Self) {
    
    inline def setProperties(value: Decay): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
