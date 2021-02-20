package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Visibilities extends StObject {
  
  var overloads: Type = js.native
  
  var tags: Properties = js.native
  
  var visibilities: Enum = js.native
}
object Visibilities {
  
  @scala.inline
  def apply(overloads: Type, tags: Properties, visibilities: Enum): Visibilities = {
    val __obj = js.Dynamic.literal(overloads = overloads.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], visibilities = visibilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visibilities]
  }
  
  @scala.inline
  implicit class VisibilitiesMutableBuilder[Self <: Visibilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverloads(value: Type): Self = StObject.set(x, "overloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Properties): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilities(value: Enum): Self = StObject.set(x, "visibilities", value.asInstanceOf[js.Any])
  }
}
