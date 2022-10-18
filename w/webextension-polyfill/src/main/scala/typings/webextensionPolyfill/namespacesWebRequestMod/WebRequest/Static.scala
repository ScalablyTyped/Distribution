package typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest

import typings.webextensionPolyfill.webextensionPolyfillInts.`20`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends StObject {
  
  /**
    * The maximum number of times that <code>handlerBehaviorChanged</code> can be called per 10 minute sustained interval.
    * <code>handlerBehaviorChanged</code> is an expensive function call that shouldn't be called often.
    */
  var MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: `20` = js.native
  
  /**
    * ...
    *
    * @param requestId
    */
  def filterResponseData(requestId: String): StreamFilter = js.native
  
  /**
    * Retrieves the security information for the request.  Returns a promise that will resolve to a SecurityInfo object.
    *
    * @param requestId
    * @param options Optional.
    */
  def getSecurityInfo(requestId: String): js.Promise[SecurityInfo] = js.native
  def getSecurityInfo(requestId: String, options: GetSecurityInfoOptionsType): js.Promise[SecurityInfo] = js.native
  
  /**
    * Needs to be called when the behavior of the webRequest handlers has changed to prevent incorrect handling due to caching.
    * This function call is expensive. Don't call it often.
    */
  def handlerBehaviorChanged(): js.Promise[Unit] = js.native
  
  /**
    * Fired when an authentication failure is received. The listener has three options: it can provide authentication
    * credentials, it can cancel the request and display the error page, or it can take no action on the challenge.
    * If bad user credentials are provided, this may be called multiple times for the same request.
    */
  var onAuthRequired: onAuthRequiredEvent = js.native
  
  /**
    * Fired when a server-initiated redirect is about to occur.
    */
  var onBeforeRedirect: onBeforeRedirectEvent = js.native
  
  /**
    * Fired when a request is about to occur.
    */
  var onBeforeRequest: onBeforeRequestEvent = js.native
  
  /**
    * Fired before sending an HTTP request, once the request headers are available. This may occur after a TCP connection is
    * made to the server, but before any HTTP data is sent.
    */
  var onBeforeSendHeaders: onBeforeSendHeadersEvent = js.native
  
  /**
    * Fired when a request is completed.
    */
  var onCompleted: onCompletedEvent = js.native
  
  /**
    * Fired when an error occurs.
    */
  var onErrorOccurred: onErrorOccurredEvent = js.native
  
  /**
    * Fired when HTTP response headers of a request have been received.
    */
  var onHeadersReceived: onHeadersReceivedEvent = js.native
  
  /**
    * Fired when the first byte of the response body is received. For HTTP requests, this means that the status line and
    * response headers are available.
    */
  var onResponseStarted: onResponseStartedEvent = js.native
  
  /**
    * Fired just before a request is going to be sent to the server (modifications of previous onBeforeSendHeaders callbacks
    * are visible by the time onSendHeaders is fired).
    */
  var onSendHeaders: onSendHeadersEvent = js.native
}
