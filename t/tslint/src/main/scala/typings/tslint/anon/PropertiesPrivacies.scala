package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesPrivacies extends StObject {
  
  var properties: Privacies
  
  var `type`: String
}
object PropertiesPrivacies {
  
  inline def apply(properties: Privacies, `type`: String): PropertiesPrivacies = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesPrivacies]
  }
  
  extension [Self <: PropertiesPrivacies](x: Self) {
    
    inline def setProperties(value: Privacies): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
