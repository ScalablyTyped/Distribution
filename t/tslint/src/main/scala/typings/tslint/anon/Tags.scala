package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tags extends StObject {
  
  var tags: Properties
  
  var visibilities: Enum
}
object Tags {
  
  inline def apply(tags: Properties, visibilities: Enum): Tags = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any], visibilities = visibilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tags] (val x: Self) extends AnyVal {
    
    inline def setTags(value: Properties): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setVisibilities(value: Enum): Self = StObject.set(x, "visibilities", value.asInstanceOf[js.Any])
  }
}
