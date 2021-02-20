package typings.tampermonkey.Tampermonkey

import typings.tampermonkey.tampermonkeyStrings.GET
import typings.tampermonkey.tampermonkeyStrings.HEAD
import typings.tampermonkey.tampermonkeyStrings.POST
import typings.tampermonkey.tampermonkeyStrings.arraybuffer
import typings.tampermonkey.tampermonkeyStrings.blob
import typings.tampermonkey.tampermonkeyStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request[TContext] extends StObject {
  
  /** Don't send cookies with the requests (please see the fetch notes) */
  var anonymous: js.UndefOr[Boolean] = js.native
  
  /** Send the data string in binary mode */
  var binary: js.UndefOr[Boolean] = js.native
  
  /** Property which will be added to the response object */
  var context: js.UndefOr[TContext] = js.native
  
  /** String to send via a POST request */
  var data: js.UndefOr[String] = js.native
  
  /**
    * (Beta) Use a fetch instead of a xhr request(at Chrome this causes
    * `xhr.abort`, `details.timeout` and `xhr.onprogress` to not work and
    * makes `xhr.onreadystatechange` receive only readyState 4 events)
    */
  var fetch: js.UndefOr[Boolean] = js.native
  
  /**
    * i.e. user-agent, referer... (some special headers are not supported
    * by Safari and Android browsers)
    */
  var headers: js.UndefOr[RequestHeaders] = js.native
  
  var method: js.UndefOr[GET | HEAD | POST] = js.native
  
  // Events
  /** Callback to be executed if the request was aborted */
  var onabort: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Callback to be executed if the request ended up with an error */
  var onerror: js.UndefOr[RequestEventListener[ErrorResponse]] = js.native
  
  /** Callback to be executed if the request was loaded */
  var onload: js.UndefOr[RequestEventListener[Response[TContext]]] = js.native
  
  /** Callback to be executed if the request started to load */
  var onloadstart: js.UndefOr[RequestEventListener[Response[TContext]]] = js.native
  
  /** Callback to be executed if the request made some progress */
  var onprogress: js.UndefOr[RequestEventListener[ProgressResponse[TContext]]] = js.native
  
  /** Callback to be executed if the request's ready state changed */
  var onreadystatechange: js.UndefOr[RequestEventListener[Response[TContext]]] = js.native
  
  /** Callback to be executed if the request failed due to a timeout */
  var ontimeout: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** MIME type for the request */
  var overrideMimeType: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var responseType: js.UndefOr[arraybuffer | blob | json] = js.native
  
  /** Timeout in ms */
  var timeout: js.UndefOr[Double] = js.native
  
  /** Destination URL */
  var url: String = js.native
  
  /** Username for authentication */
  var username: js.UndefOr[String] = js.native
}
object Request {
  
  @scala.inline
  def apply[TContext](url: String): Request[TContext] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request[TContext]]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request[_], TContext] (val x: Self with Request[TContext]) extends AnyVal {
    
    @scala.inline
    def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFetch(value: Boolean): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | HEAD | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOnabort(value: () => Unit): Self = StObject.set(x, "onabort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
    
    @scala.inline
    def setOnerror(value: RequestEventListener[ErrorResponse]): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    @scala.inline
    def setOnload(value: RequestEventListener[Response[TContext]]): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    @scala.inline
    def setOnloadstart(value: RequestEventListener[Response[TContext]]): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloadstartUndefined: Self = StObject.set(x, "onloadstart", js.undefined)
    
    @scala.inline
    def setOnprogress(value: RequestEventListener[ProgressResponse[TContext]]): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
    
    @scala.inline
    def setOnreadystatechange(value: RequestEventListener[Response[TContext]]): Self = StObject.set(x, "onreadystatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnreadystatechangeUndefined: Self = StObject.set(x, "onreadystatechange", js.undefined)
    
    @scala.inline
    def setOntimeout(value: () => Unit): Self = StObject.set(x, "ontimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOntimeoutUndefined: Self = StObject.set(x, "ontimeout", js.undefined)
    
    @scala.inline
    def setOverrideMimeType(value: String): Self = StObject.set(x, "overrideMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setResponseType(value: arraybuffer | blob | json): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
