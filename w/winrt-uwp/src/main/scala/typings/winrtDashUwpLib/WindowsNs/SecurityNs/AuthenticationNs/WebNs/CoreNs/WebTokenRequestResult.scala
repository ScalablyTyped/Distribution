package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a web token request to an identity provider. */
@JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequestResult")
@js.native
abstract class WebTokenRequestResult () extends js.Object {
  /** Gets the response data from the web token provider. */
  var responseData: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[WebTokenResponse] = js.native
  /** Gets the error returned by the web provider, if any. */
  var responseError: WebProviderError = js.native
  /** Gets the status of the request. */
  var responseStatus: WebTokenRequestStatus = js.native
  /**
                           * Invalidates the current cached WebTokenRequestResult . Use this method if an access denied error is returned when trying to use a token.
                           * @return This method does not return an object or value.
                           */
  def invalidateCacheAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

