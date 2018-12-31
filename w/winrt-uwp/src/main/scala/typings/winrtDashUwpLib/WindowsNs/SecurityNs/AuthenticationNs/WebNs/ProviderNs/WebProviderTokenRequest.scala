package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a request for a token from a client to a provider. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebProviderTokenRequest")
@js.native
abstract class WebProviderTokenRequest () extends js.Object {
  /** Gets the app callback Uri. */
  var applicationCallbackUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the web token request made by the client. */
  var clientRequest: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequest = js.native
  /** Gets the web account selection options. */
  var webAccountSelectionOptions: WebAccountSelectionOptions = js.native
  /** Gets the web accounts for the request. */
  var webAccounts: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount] = js.native
  /**
    * Gets a token binding key for the app asynchronously.
    * @param keyType The type of key to get.
    * @param target The target Uri.
    * @return When this method completes, it returns a cryptographic key.
    */
  def getApplicationTokenBindingKeyAsync(
    keyType: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.TokenBindingKeyType,
    target: winrtDashUwpLib.WindowsNs.FoundationNs.Uri
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey] = js.native
}

