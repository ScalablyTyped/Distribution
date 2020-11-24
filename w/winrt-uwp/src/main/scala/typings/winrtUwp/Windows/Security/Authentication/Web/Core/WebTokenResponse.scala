package typings.winrtUwp.Windows.Security.Authentication.Web.Core

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the response from a web account provider to a web token request. */
@js.native
trait WebTokenResponse extends js.Object {
  
  /** Gets the properties of the response */
  var properties: IMap[String, String] = js.native
  
  /** Gets the error returned by the provider, if any. */
  var providerError: WebProviderError = js.native
  
  /** Gets the authentication token. */
  var token: String = js.native
  
  /** Gets the web account for the request. */
  var webAccount: WebAccount = js.native
}
object WebTokenResponse {
  
  @scala.inline
  def apply(
    properties: IMap[String, String],
    providerError: WebProviderError,
    token: String,
    webAccount: WebAccount
  ): WebTokenResponse = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], providerError = providerError.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], webAccount = webAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebTokenResponse]
  }
  
  @scala.inline
  implicit class WebTokenResponseOps[Self <: WebTokenResponse] (val x: Self) extends AnyVal {
    
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
    def setProperties(value: IMap[String, String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderError(value: WebProviderError): Self = this.set("providerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAccount(value: WebAccount): Self = this.set("webAccount", value.asInstanceOf[js.Any])
  }
}
