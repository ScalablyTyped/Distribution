package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesHeight extends StObject {
  
  var properties: Height
  
  var value: js.Array[Any]
}
object PropertiesHeight {
  
  inline def apply(properties: Height, value: js.Array[Any]): PropertiesHeight = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesHeight]
  }
  
  extension [Self <: PropertiesHeight](x: Self) {
    
    inline def setProperties(value: Height): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
