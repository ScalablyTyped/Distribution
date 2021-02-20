package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Privacies extends StObject {
  
  var locations: Enum = js.native
  
  var overloads: Type = js.native
  
  var privacies: Enum = js.native
  
  var tags: Properties = js.native
}
object Privacies {
  
  @scala.inline
  def apply(locations: Enum, overloads: Type, privacies: Enum, tags: Properties): Privacies = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], overloads = overloads.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Privacies]
  }
  
  @scala.inline
  implicit class PrivaciesMutableBuilder[Self <: Privacies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: Enum): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverloads(value: Type): Self = StObject.set(x, "overloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacies(value: Enum): Self = StObject.set(x, "privacies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Properties): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
