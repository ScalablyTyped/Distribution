package typings.winrtDashUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest
import typings.winrtDashUwp.Windows.Security.Authentication.Web.TokenBindingKeyType
import typings.winrtDashUwp.Windows.Security.Credentials.WebAccount
import typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a request for a token from a client to a provider. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebProviderTokenRequest")
@js.native
abstract class WebProviderTokenRequest () extends js.Object {
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

