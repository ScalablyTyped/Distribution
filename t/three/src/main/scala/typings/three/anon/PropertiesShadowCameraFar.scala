package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesShadowCameraFar extends StObject {
  
  var properties: ShadowCameraFar
  
  var value: js.Array[Any]
}
object PropertiesShadowCameraFar {
  
  inline def apply(properties: ShadowCameraFar, value: js.Array[Any]): PropertiesShadowCameraFar = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesShadowCameraFar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesShadowCameraFar] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: ShadowCameraFar): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
