package typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns value for event handlers that have the 'blocking' extraInfoSpec applied. Allows the event handler to modify
  * network requests.
  */
trait BlockingResponse extends StObject {
  
  /**
    * Only used as a response to the onAuthRequired event. If set, the request is made using the supplied credentials.
    * Optional.
    */
  var authCredentials: js.UndefOr[BlockingResponseAuthCredentialsType] = js.undefined
  
  /**
    * If true, the request is cancelled. Used in onBeforeRequest, this prevents the request from being sent.
    * Optional.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only used as a response to the onBeforeRequest and onHeadersReceived events. If set,
    * the original request is prevented from being sent/completed and is instead redirected to the given URL.
    * Redirections to non-HTTP schemes such as data: are allowed. Redirects initiated by a redirect action use the original
    * request method for the redirect, with one exception: If the redirect is initiated at the onHeadersReceived stage,
    * then the redirect will be issued using the GET method.
    * Optional.
    */
  var redirectUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Only used as a response to the onBeforeSendHeaders event. If set, the request is made with these request headers instead.
    * Optional.
    */
  var requestHeaders: js.UndefOr[HttpHeaders] = js.undefined
  
  /**
    * Only used as a response to the onHeadersReceived event. If set, the server is assumed to have responded with these
    * response headers instead. Only return <code>responseHeaders</code> if you really want to modify the headers in order to
    * limit the number of conflicts (only one extension may modify <code>responseHeaders</code> for each request).
    * Optional.
    */
  var responseHeaders: js.UndefOr[HttpHeaders] = js.undefined
  
  /**
    * Only used as a response to the onBeforeRequest event. If set, the original request is prevented from being
    * sent/completed and is instead upgraded to a secure request.  If any extension returns <code>redirectUrl</code>
    * during onBeforeRequest, <code>upgradeToSecure</code> will have no affect.
    * Optional.
    */
  var upgradeToSecure: js.UndefOr[Boolean] = js.undefined
}
object BlockingResponse {
  
  inline def apply(): BlockingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockingResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthCredentials(value: BlockingResponseAuthCredentialsType): Self = StObject.set(x, "authCredentials", value.asInstanceOf[js.Any])
    
    inline def setAuthCredentialsUndefined: Self = StObject.set(x, "authCredentials", js.undefined)
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    inline def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    inline def setRequestHeaders(value: HttpHeaders): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    inline def setRequestHeadersVarargs(value: HttpHeadersItemType*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
    
    inline def setResponseHeaders(value: HttpHeaders): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    inline def setResponseHeadersVarargs(value: HttpHeadersItemType*): Self = StObject.set(x, "responseHeaders", js.Array(value*))
    
    inline def setUpgradeToSecure(value: Boolean): Self = StObject.set(x, "upgradeToSecure", value.asInstanceOf[js.Any])
    
    inline def setUpgradeToSecureUndefined: Self = StObject.set(x, "upgradeToSecure", js.undefined)
  }
}
