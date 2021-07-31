package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typings.winrtUwp.Windows.Web.Http.HttpCookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a retrieve cookies operation made by a web account provider. */
trait WebAccountProviderRetrieveCookiesOperation extends StObject {
  
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri
  
  /** Gets the context of the retrieve cookies operation. */
  var context: Uri
  
  /** Gets the cookies. */
  var cookies: IVector[HttpCookie]
  
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind
  
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit
  
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit
  
  /** Gets or sets the Uri to retrieve cookies from. */
  var uri: Uri
}
object WebAccountProviderRetrieveCookiesOperation {
  
  @scala.inline
  def apply(
    applicationCallbackUri: Uri,
    context: Uri,
    cookies: IVector[HttpCookie],
    kind: WebAccountProviderOperationKind,
    reportCompleted: () => Unit,
    reportError: WebProviderError => Unit,
    uri: Uri
  ): WebAccountProviderRetrieveCookiesOperation = {
    val __obj = js.Dynamic.literal(applicationCallbackUri = applicationCallbackUri.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], reportCompleted = js.Any.fromFunction0(reportCompleted), reportError = js.Any.fromFunction1(reportError), uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderRetrieveCookiesOperation]
  }
  
  @scala.inline
  implicit class WebAccountProviderRetrieveCookiesOperationMutableBuilder[Self <: WebAccountProviderRetrieveCookiesOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationCallbackUri(value: Uri): Self = StObject.set(x, "applicationCallbackUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: Uri): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookies(value: IVector[HttpCookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: WebAccountProviderOperationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportCompleted(value: () => Unit): Self = StObject.set(x, "reportCompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReportError(value: WebProviderError => Unit): Self = StObject.set(x, "reportError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
