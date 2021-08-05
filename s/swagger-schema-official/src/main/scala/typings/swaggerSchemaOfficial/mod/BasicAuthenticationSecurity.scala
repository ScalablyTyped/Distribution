package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.basic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicAuthenticationSecurity
  extends StObject
     with BaseSecurity
     with Security {
  
  @JSName("type")
  var type_BasicAuthenticationSecurity: basic
}
object BasicAuthenticationSecurity {
  
  inline def apply(): BasicAuthenticationSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("basic")
    __obj.asInstanceOf[BasicAuthenticationSecurity]
  }
  
  extension [Self <: BasicAuthenticationSecurity](x: Self) {
    
    inline def setType(value: basic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
