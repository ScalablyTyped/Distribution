package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesDirection extends StObject {
  
  var properties: Direction
  
  var value: js.Array[Any]
}
object PropertiesDirection {
  
  inline def apply(properties: Direction, value: js.Array[Any]): PropertiesDirection = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesDirection]
  }
  
  extension [Self <: PropertiesDirection](x: Self) {
    
    inline def setProperties(value: Direction): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
