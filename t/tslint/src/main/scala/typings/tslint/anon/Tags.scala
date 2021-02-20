package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tags extends StObject {
  
  var tags: Properties = js.native
  
  var visibilities: Enum = js.native
}
object Tags {
  
  @scala.inline
  def apply(tags: Properties, visibilities: Enum): Tags = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any], visibilities = visibilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
  
  @scala.inline
  implicit class TagsMutableBuilder[Self <: Tags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: Properties): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilities(value: Enum): Self = StObject.set(x, "visibilities", value.asInstanceOf[js.Any])
  }
}
