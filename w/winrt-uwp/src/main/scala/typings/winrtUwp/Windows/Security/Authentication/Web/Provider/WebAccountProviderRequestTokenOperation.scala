package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a request token operation. */
@js.native
trait WebAccountProviderRequestTokenOperation extends js.Object {
  
  /** Gets or sets the cache expiration time. */
  var cacheExpirationTime: Date = js.native
  
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  
  /** Gets the web provider token request. */
  var providerRequest: WebProviderTokenRequest = js.native
  
  /** Gets the web provider token responses. */
  var providerResponses: IVector[WebProviderTokenResponse] = js.native
  
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
  
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit = js.native
  
  /** Informs the activating app that the user cancelled the operation. */
  def reportUserCanceled(): Unit = js.native
}
object WebAccountProviderRequestTokenOperation {
  
  @scala.inline
  def apply(
    cacheExpirationTime: Date,
    kind: WebAccountProviderOperationKind,
    providerRequest: WebProviderTokenRequest,
    providerResponses: IVector[WebProviderTokenResponse],
    reportCompleted: () => Unit,
    reportError: WebProviderError => Unit,
    reportUserCanceled: () => Unit
  ): WebAccountProviderRequestTokenOperation = {
    val __obj = js.Dynamic.literal(cacheExpirationTime = cacheExpirationTime.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], providerRequest = providerRequest.asInstanceOf[js.Any], providerResponses = providerResponses.asInstanceOf[js.Any], reportCompleted = js.Any.fromFunction0(reportCompleted), reportError = js.Any.fromFunction1(reportError), reportUserCanceled = js.Any.fromFunction0(reportUserCanceled))
    __obj.asInstanceOf[WebAccountProviderRequestTokenOperation]
  }
  
  @scala.inline
  implicit class WebAccountProviderRequestTokenOperationOps[Self <: WebAccountProviderRequestTokenOperation] (val x: Self) extends AnyVal {
    
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
    def setCacheExpirationTime(value: Date): Self = this.set("cacheExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: WebAccountProviderOperationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderRequest(value: WebProviderTokenRequest): Self = this.set("providerRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderResponses(value: IVector[WebProviderTokenResponse]): Self = this.set("providerResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportCompleted(value: () => Unit): Self = this.set("reportCompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReportError(value: WebProviderError => Unit): Self = this.set("reportError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReportUserCanceled(value: () => Unit): Self = this.set("reportUserCanceled", js.Any.fromFunction0(value))
  }
}
