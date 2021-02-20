package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.apiKey
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.basic
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseSecurity extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var `type`: basic | apiKey | oauth2 = js.native
}
object BaseSecurity {
  
  @scala.inline
  def apply(`type`: basic | apiKey | oauth2): BaseSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSecurity]
  }
  
  @scala.inline
  implicit class BaseSecurityMutableBuilder[Self <: BaseSecurity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setType(value: basic | apiKey | oauth2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
