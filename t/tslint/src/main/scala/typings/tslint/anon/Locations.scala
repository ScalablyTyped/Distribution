package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locations extends StObject {
  
  var locations: Enum = js.native
  
  var privacies: Enum = js.native
  
  var tags: Properties = js.native
}
object Locations {
  
  @scala.inline
  def apply(locations: Enum, privacies: Enum, tags: Properties): Locations = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locations]
  }
  
  @scala.inline
  implicit class LocationsMutableBuilder[Self <: Locations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: Enum): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacies(value: Enum): Self = StObject.set(x, "privacies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Properties): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
