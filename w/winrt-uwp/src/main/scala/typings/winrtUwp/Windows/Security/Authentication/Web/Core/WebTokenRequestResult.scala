package typings.winrtUwp.Windows.Security.Authentication.Web.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the results of a web token request to an identity provider. */
@js.native
trait WebTokenRequestResult extends js.Object {
  
  /**
    * Invalidates the current cached WebTokenRequestResult . Use this method if an access denied error is returned when trying to use a token.
    * @return This method does not return an object or value.
    */
  def invalidateCacheAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets the response data from the web token provider. */
  var responseData: IVectorView[WebTokenResponse] = js.native
  
  /** Gets the error returned by the web provider, if any. */
  var responseError: WebProviderError = js.native
  
  /** Gets the status of the request. */
  var responseStatus: WebTokenRequestStatus = js.native
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
  
  @scala.inline
  implicit class WebTokenRequestResultOps[Self <: WebTokenRequestResult] (val x: Self) extends AnyVal {
    
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
    def setInvalidateCacheAsync(value: () => IPromiseWithIAsyncAction): Self = this.set("invalidateCacheAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResponseData(value: IVectorView[WebTokenResponse]): Self = this.set("responseData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseError(value: WebProviderError): Self = this.set("responseError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatus(value: WebTokenRequestStatus): Self = this.set("responseStatus", value.asInstanceOf[js.Any])
  }
}
