package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locations extends StObject {
  
  var locations: Enum
  
  var privacies: Enum
  
  var tags: Properties
}
object Locations {
  
  inline def apply(locations: Enum, privacies: Enum, tags: Properties): Locations = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Locations] (val x: Self) extends AnyVal {
    
    inline def setLocations(value: Enum): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setPrivacies(value: Enum): Self = StObject.set(x, "privacies", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Properties): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
