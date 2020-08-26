package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest
import typings.winrtUwp.Windows.Security.Authentication.Web.TokenBindingKeyType
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import typings.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a request for a token from a client to a provider. */
@js.native
trait WebProviderTokenRequest extends js.Object {
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri = js.native
  /** Gets the web token request made by the client. */
  var clientRequest: WebTokenRequest = js.native
  /** Gets the web account selection options. */
  var webAccountSelectionOptions: WebAccountSelectionOptions = js.native
  /** Gets the web accounts for the request. */
  var webAccounts: IVectorView[WebAccount] = js.native
  /**
    * Gets a token binding key for the app asynchronously.
    * @param keyType The type of key to get.
    * @param target The target Uri.
    * @return When this method completes, it returns a cryptographic key.
    */
  def getApplicationTokenBindingKeyAsync(keyType: TokenBindingKeyType, target: Uri): IPromiseWithIAsyncOperation[CryptographicKey] = js.native
}

object WebProviderTokenRequest {
  @scala.inline
  def apply(
    applicationCallbackUri: Uri,
    clientRequest: WebTokenRequest,
    getApplicationTokenBindingKeyAsync: (TokenBindingKeyType, Uri) => IPromiseWithIAsyncOperation[CryptographicKey],
    webAccountSelectionOptions: WebAccountSelectionOptions,
    webAccounts: IVectorView[WebAccount]
  ): WebProviderTokenRequest = {
    val __obj = js.Dynamic.literal(applicationCallbackUri = applicationCallbackUri.asInstanceOf[js.Any], clientRequest = clientRequest.asInstanceOf[js.Any], getApplicationTokenBindingKeyAsync = js.Any.fromFunction2(getApplicationTokenBindingKeyAsync), webAccountSelectionOptions = webAccountSelectionOptions.asInstanceOf[js.Any], webAccounts = webAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebProviderTokenRequest]
  }
  @scala.inline
  implicit class WebProviderTokenRequestOps[Self <: WebProviderTokenRequest] (val x: Self) extends AnyVal {
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
    def setApplicationCallbackUri(value: Uri): Self = this.set("applicationCallbackUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequest(value: WebTokenRequest): Self = this.set("clientRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetApplicationTokenBindingKeyAsync(value: (TokenBindingKeyType, Uri) => IPromiseWithIAsyncOperation[CryptographicKey]): Self = this.set("getApplicationTokenBindingKeyAsync", js.Any.fromFunction2(value))
    @scala.inline
    def setWebAccountSelectionOptions(value: WebAccountSelectionOptions): Self = this.set("webAccountSelectionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAccounts(value: IVectorView[WebAccount]): Self = this.set("webAccounts", value.asInstanceOf[js.Any])
  }
  
}

