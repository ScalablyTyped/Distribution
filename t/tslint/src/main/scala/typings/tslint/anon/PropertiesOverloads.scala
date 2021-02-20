package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesOverloads extends StObject {
  
  var properties: Overloads = js.native
  
  var `type`: String = js.native
}
object PropertiesOverloads {
  
  @scala.inline
  def apply(properties: Overloads, `type`: String): PropertiesOverloads = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesOverloads]
  }
  
  @scala.inline
  implicit class PropertiesOverloadsMutableBuilder[Self <: PropertiesOverloads] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: Overloads): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
