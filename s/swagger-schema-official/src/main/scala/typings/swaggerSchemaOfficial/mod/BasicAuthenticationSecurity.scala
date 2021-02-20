package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.basic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicAuthenticationSecurity
  extends BaseSecurity
     with Security {
  
  @JSName("type")
  var type_BasicAuthenticationSecurity: basic = js.native
}
object BasicAuthenticationSecurity {
  
  @scala.inline
  def apply(`type`: basic): BasicAuthenticationSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicAuthenticationSecurity]
  }
  
  @scala.inline
  implicit class BasicAuthenticationSecurityMutableBuilder[Self <: BasicAuthenticationSecurity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: basic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
