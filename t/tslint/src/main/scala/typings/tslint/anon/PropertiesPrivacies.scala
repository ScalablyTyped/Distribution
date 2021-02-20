package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesPrivacies extends StObject {
  
  var properties: Privacies = js.native
  
  var `type`: String = js.native
}
object PropertiesPrivacies {
  
  @scala.inline
  def apply(properties: Privacies, `type`: String): PropertiesPrivacies = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesPrivacies]
  }
  
  @scala.inline
  implicit class PropertiesPrivaciesMutableBuilder[Self <: PropertiesPrivacies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: Privacies): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
