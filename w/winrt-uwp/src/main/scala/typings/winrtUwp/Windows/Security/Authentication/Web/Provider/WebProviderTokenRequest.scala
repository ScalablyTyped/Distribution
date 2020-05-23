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
trait WebProviderTokenRequest extends js.Object {
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri
  /** Gets the web token request made by the client. */
  var clientRequest: WebTokenRequest
  /** Gets the web account selection options. */
  var webAccountSelectionOptions: WebAccountSelectionOptions
  /** Gets the web accounts for the request. */
  var webAccounts: IVectorView[WebAccount]
  /**
    * Gets a token binding key for the app asynchronously.
    * @param keyType The type of key to get.
    * @param target The target Uri.
    * @return When this method completes, it returns a cryptographic key.
    */
  def getApplicationTokenBindingKeyAsync(keyType: TokenBindingKeyType, target: Uri): IPromiseWithIAsyncOperation[CryptographicKey]
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
}

