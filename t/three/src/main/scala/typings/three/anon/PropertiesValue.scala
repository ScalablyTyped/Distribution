package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesValue extends StObject {
  
  var properties: ConeCos
  
  var value: js.Array[Any]
}
object PropertiesValue {
  
  inline def apply(properties: ConeCos, value: js.Array[Any]): PropertiesValue = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesValue] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: ConeCos): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
