package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesType extends StObject {
  
  var properties: Tags = js.native
  
  var `type`: String = js.native
}
object PropertiesType {
  
  @scala.inline
  def apply(properties: Tags, `type`: String): PropertiesType = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesType]
  }
  
  @scala.inline
  implicit class PropertiesTypeMutableBuilder[Self <: PropertiesType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: Tags): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
