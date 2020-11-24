package typings.winrtUwp.Windows.Security.Authentication.Web.Core

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a request to an online identity provider for an authentication token. */
@js.native
trait WebTokenRequest extends js.Object {
  
  var appProperties: js.Any = js.native
  
   /* unmapped type */ /** Gets the Id of the client making the request. */
  var clientId: String = js.native
  
  /** Gets the prompt type of the request. */
  var promptType: WebTokenRequestPromptType = js.native
  
  /** Gets the properties of the request. */
  var properties: IMap[String, String] = js.native
  
  /** Gets the scope of the request. */
  var scope: String = js.native
  
  /** Gets the web account provider for the request. */
  var webAccountProvider: WebAccountProvider = js.native
}
object WebTokenRequest {
  
  @scala.inline
  def apply(
    appProperties: js.Any,
    clientId: String,
    promptType: WebTokenRequestPromptType,
    properties: IMap[String, String],
    scope: String,
    webAccountProvider: WebAccountProvider
  ): WebTokenRequest = {
    val __obj = js.Dynamic.literal(appProperties = appProperties.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], promptType = promptType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], webAccountProvider = webAccountProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebTokenRequest]
  }
  
  @scala.inline
  implicit class WebTokenRequestOps[Self <: WebTokenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppProperties(value: js.Any): Self = this.set("appProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptType(value: WebTokenRequestPromptType): Self = this.set("promptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IMap[String, String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAccountProvider(value: WebAccountProvider): Self = this.set("webAccountProvider", value.asInstanceOf[js.Any])
  }
}
