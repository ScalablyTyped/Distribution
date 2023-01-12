package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Privacies extends StObject {
  
  var locations: Enum
  
  var overloads: Type
  
  var privacies: Enum
  
  var tags: Properties
}
object Privacies {
  
  inline def apply(locations: Enum, overloads: Type, privacies: Enum, tags: Properties): Privacies = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], overloads = overloads.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Privacies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Privacies] (val x: Self) extends AnyVal {
    
    inline def setLocations(value: Enum): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setOverloads(value: Type): Self = StObject.set(x, "overloads", value.asInstanceOf[js.Any])
    
    inline def setPrivacies(value: Enum): Self = StObject.set(x, "privacies", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Properties): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
