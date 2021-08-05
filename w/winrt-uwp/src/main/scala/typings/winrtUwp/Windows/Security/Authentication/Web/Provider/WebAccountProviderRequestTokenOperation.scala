package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a request token operation. */
trait WebAccountProviderRequestTokenOperation extends StObject {
  
  /** Gets or sets the cache expiration time. */
  var cacheExpirationTime: Date
  
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind
  
  /** Gets the web provider token request. */
  var providerRequest: WebProviderTokenRequest
  
  /** Gets the web provider token responses. */
  var providerResponses: IVector[WebProviderTokenResponse]
  
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit
  
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit
  
  /** Informs the activating app that the user cancelled the operation. */
  def reportUserCanceled(): Unit
}
object WebAccountProviderRequestTokenOperation {
  
  inline def apply(
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
  
  extension [Self <: WebAccountProviderRequestTokenOperation](x: Self) {
    
    inline def setCacheExpirationTime(value: Date): Self = StObject.set(x, "cacheExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setKind(value: WebAccountProviderOperationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setProviderRequest(value: WebProviderTokenRequest): Self = StObject.set(x, "providerRequest", value.asInstanceOf[js.Any])
    
    inline def setProviderResponses(value: IVector[WebProviderTokenResponse]): Self = StObject.set(x, "providerResponses", value.asInstanceOf[js.Any])
    
    inline def setReportCompleted(value: () => Unit): Self = StObject.set(x, "reportCompleted", js.Any.fromFunction0(value))
    
    inline def setReportError(value: WebProviderError => Unit): Self = StObject.set(x, "reportError", js.Any.fromFunction1(value))
    
    inline def setReportUserCanceled(value: () => Unit): Self = StObject.set(x, "reportUserCanceled", js.Any.fromFunction0(value))
  }
}
