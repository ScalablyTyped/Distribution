package typings.winrtUwp.Windows.Security.Authentication.Web.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a web token request to an identity provider. */
trait WebTokenRequestResult extends js.Object {
  /** Gets the response data from the web token provider. */
  var responseData: IVectorView[WebTokenResponse]
  /** Gets the error returned by the web provider, if any. */
  var responseError: WebProviderError
  /** Gets the status of the request. */
  var responseStatus: WebTokenRequestStatus
  /**
    * Invalidates the current cached WebTokenRequestResult . Use this method if an access denied error is returned when trying to use a token.
    * @return This method does not return an object or value.
    */
  def invalidateCacheAsync(): IPromiseWithIAsyncAction
}

object WebTokenRequestResult {
  @scala.inline
  def apply(
    invalidateCacheAsync: () => IPromiseWithIAsyncAction,
    responseData: IVectorView[WebTokenResponse],
    responseError: WebProviderError,
    responseStatus: WebTokenRequestStatus
  ): WebTokenRequestResult = {
    val __obj = js.Dynamic.literal(invalidateCacheAsync = js.Any.fromFunction0(invalidateCacheAsync), responseData = responseData.asInstanceOf[js.Any], responseError = responseError.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebTokenRequestResult]
  }
}

