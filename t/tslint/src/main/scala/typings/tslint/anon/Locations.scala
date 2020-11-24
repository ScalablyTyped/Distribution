package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locations extends js.Object {
  
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
  implicit class LocationsOps[Self <: Locations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocations(value: Enum): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacies(value: Enum): Self = this.set("privacies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Properties): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
