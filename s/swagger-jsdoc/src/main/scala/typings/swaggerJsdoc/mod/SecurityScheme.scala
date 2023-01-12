package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityScheme
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var bearerFormat: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var flows: js.UndefOr[OAuthFlows] = js.undefined
  
  var in: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var openIdConnectUrl: js.UndefOr[String] = js.undefined
  
  var scheme: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object SecurityScheme {
  
  inline def apply(`type`: String): SecurityScheme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityScheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityScheme] (val x: Self) extends AnyVal {
    
    inline def setBearerFormat(value: String): Self = StObject.set(x, "bearerFormat", value.asInstanceOf[js.Any])
    
    inline def setBearerFormatUndefined: Self = StObject.set(x, "bearerFormat", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFlows(value: OAuthFlows): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    inline def setFlowsUndefined: Self = StObject.set(x, "flows", js.undefined)
    
    inline def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpenIdConnectUrl(value: String): Self = StObject.set(x, "openIdConnectUrl", value.asInstanceOf[js.Any])
    
    inline def setOpenIdConnectUrlUndefined: Self = StObject.set(x, "openIdConnectUrl", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
