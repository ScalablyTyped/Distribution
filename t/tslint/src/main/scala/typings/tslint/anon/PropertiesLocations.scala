package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesLocations extends StObject {
  
  var properties: Locations
  
  var `type`: String
}
object PropertiesLocations {
  
  @scala.inline
  def apply(properties: Locations, `type`: String): PropertiesLocations = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesLocations]
  }
  
  @scala.inline
  implicit class PropertiesLocationsMutableBuilder[Self <: PropertiesLocations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: Locations): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
