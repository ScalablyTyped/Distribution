package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesVisibilities extends StObject {
  
  var properties: Visibilities
  
  var `type`: String
}
object PropertiesVisibilities {
  
  inline def apply(properties: Visibilities, `type`: String): PropertiesVisibilities = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesVisibilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesVisibilities] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: Visibilities): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
