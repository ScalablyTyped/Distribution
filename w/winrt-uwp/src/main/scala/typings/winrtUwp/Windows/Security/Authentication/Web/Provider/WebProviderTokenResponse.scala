package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a web provider token response. */
trait WebProviderTokenResponse extends StObject {
  
  /** Gets the response from the provider to the client. */
  var clientResponse: WebTokenResponse
}
object WebProviderTokenResponse {
  
  inline def apply(clientResponse: WebTokenResponse): WebProviderTokenResponse = {
    val __obj = js.Dynamic.literal(clientResponse = clientResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebProviderTokenResponse]
  }
  
  extension [Self <: WebProviderTokenResponse](x: Self) {
    
    inline def setClientResponse(value: WebTokenResponse): Self = StObject.set(x, "clientResponse", value.asInstanceOf[js.Any])
  }
}
