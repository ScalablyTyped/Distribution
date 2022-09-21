package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedCrudProps extends StObject {
  
  var api: AdvancedApi
  
  var auth: AdvancedAuth
  
  var schema: AdvancedSchema
}
object AdvancedCrudProps {
  
  inline def apply(api: AdvancedApi, auth: AdvancedAuth, schema: AdvancedSchema): AdvancedCrudProps = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedCrudProps]
  }
  
  extension [Self <: AdvancedCrudProps](x: Self) {
    
    inline def setApi(value: AdvancedApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setAuth(value: AdvancedAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: AdvancedSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
