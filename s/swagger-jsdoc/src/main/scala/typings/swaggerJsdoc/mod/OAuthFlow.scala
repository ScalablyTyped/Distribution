package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthFlow
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var authorizationUrl: js.UndefOr[String] = js.undefined
  
  var refreshUrl: js.UndefOr[String] = js.undefined
  
  var scopes: StringDictionary[String]
  
  var tokenUrl: js.UndefOr[String] = js.undefined
}
object OAuthFlow {
  
  inline def apply(scopes: StringDictionary[String]): OAuthFlow = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthFlow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OAuthFlow] (val x: Self) extends AnyVal {
    
    inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUrlUndefined: Self = StObject.set(x, "authorizationUrl", js.undefined)
    
    inline def setRefreshUrl(value: String): Self = StObject.set(x, "refreshUrl", value.asInstanceOf[js.Any])
    
    inline def setRefreshUrlUndefined: Self = StObject.set(x, "refreshUrl", js.undefined)
    
    inline def setScopes(value: StringDictionary[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
    
    inline def setTokenUrlUndefined: Self = StObject.set(x, "tokenUrl", js.undefined)
  }
}
