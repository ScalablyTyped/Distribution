package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesDirection extends StObject {
  
  var properties: Direction
  
  var value: js.Array[js.Any]
}
object PropertiesDirection {
  
  inline def apply(properties: Direction, value: js.Array[js.Any]): PropertiesDirection = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesDirection]
  }
  
  extension [Self <: PropertiesDirection](x: Self) {
    
    inline def setProperties(value: Direction): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
