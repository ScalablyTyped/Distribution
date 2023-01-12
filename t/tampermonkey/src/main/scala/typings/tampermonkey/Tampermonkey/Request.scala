package typings.tampermonkey.Tampermonkey

import typings.tampermonkey.tampermonkeyStrings.GET
import typings.tampermonkey.tampermonkeyStrings.HEAD
import typings.tampermonkey.tampermonkeyStrings.POST
import typings.tampermonkey.tampermonkeyStrings.arraybuffer
import typings.tampermonkey.tampermonkeyStrings.blob
import typings.tampermonkey.tampermonkeyStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request[TContext] extends StObject {
  
  /** Don't send cookies with the requests (please see the fetch notes) */
  var anonymous: js.UndefOr[Boolean] = js.undefined
  
  /** Send the data string in binary mode */
  var binary: js.UndefOr[Boolean] = js.undefined
  
  /** Property which will be added to the response object */
  var context: js.UndefOr[TContext] = js.undefined
  
  /** A cookie to be patched into the sent cookie set */
  var cookie: js.UndefOr[String] = js.undefined
  
  /** String to send via a POST request */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * (Beta) Use a fetch instead of a xhr request(at Chrome this causes
    * `xhr.abort`, `details.timeout` and `xhr.onprogress` to not work and
    * makes `xhr.onreadystatechange` receive only readyState 4 events)
    */
  var fetch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * i.e. user-agent, referer... (some special headers are not supported
    * by Safari and Android browsers)
    */
  var headers: js.UndefOr[RequestHeaders] = js.undefined
  
  var method: js.UndefOr[GET | HEAD | POST] = js.undefined
  
  /** Don't cache the resource */
  var nocache: js.UndefOr[Boolean] = js.undefined
  
  // Events
  /** Callback to be executed if the request was aborted */
  var onabort: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Callback to be executed if the request ended up with an error */
  var onerror: js.UndefOr[RequestEventListener[ErrorResponse]] = js.undefined
  
  /** Callback to be executed if the request was loaded */
  var onload: js.UndefOr[RequestEventListener[Response[TContext]]] = js.undefined
  
  /** Callback to be executed if the request started to load */
  var onloadstart: js.UndefOr[RequestEventListener[Response[TContext]]] = js.undefined
  
  /** Callback to be executed if the request made some progress */
  var onprogress: js.UndefOr[RequestEventListener[ProgressResponse[TContext]]] = js.undefined
  
  /** Callback to be executed if the request's ready state changed */
  var onreadystatechange: js.UndefOr[RequestEventListener[Response[TContext]]] = js.undefined
  
  /** Callback to be executed if the request failed due to a timeout */
  var ontimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** MIME type for the request */
  var overrideMimeType: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var responseType: js.UndefOr[arraybuffer | blob | json] = js.undefined
  
  /** Revalidate maybe cached content */
  var revalidate: js.UndefOr[Boolean] = js.undefined
  
  /** Timeout in ms */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** Destination URL */
  var url: String
  
  /** Username for authentication */
  var user: js.UndefOr[String] = js.undefined
}
object Request {
  
  inline def apply[TContext](url: String): Request[TContext] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request[TContext]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Request[?], TContext] (val x: Self & Request[TContext]) extends AnyVal {
    
    inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFetch(value: Boolean): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
    
    inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: GET | HEAD | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNocache(value: Boolean): Self = StObject.set(x, "nocache", value.asInstanceOf[js.Any])
    
    inline def setNocacheUndefined: Self = StObject.set(x, "nocache", js.undefined)
    
    inline def setOnabort(value: () => Unit): Self = StObject.set(x, "onabort", js.Any.fromFunction0(value))
    
    inline def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
    
    inline def setOnerror(value: RequestEventListener[ErrorResponse]): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setOnload(value: RequestEventListener[Response[TContext]]): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
    
    inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    inline def setOnloadstart(value: RequestEventListener[Response[TContext]]): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
    
    inline def setOnloadstartUndefined: Self = StObject.set(x, "onloadstart", js.undefined)
    
    inline def setOnprogress(value: RequestEventListener[ProgressResponse[TContext]]): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
    
    inline def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
    
    inline def setOnreadystatechange(value: RequestEventListener[Response[TContext]]): Self = StObject.set(x, "onreadystatechange", value.asInstanceOf[js.Any])
    
    inline def setOnreadystatechangeUndefined: Self = StObject.set(x, "onreadystatechange", js.undefined)
    
    inline def setOntimeout(value: () => Unit): Self = StObject.set(x, "ontimeout", js.Any.fromFunction0(value))
    
    inline def setOntimeoutUndefined: Self = StObject.set(x, "ontimeout", js.undefined)
    
    inline def setOverrideMimeType(value: String): Self = StObject.set(x, "overrideMimeType", value.asInstanceOf[js.Any])
    
    inline def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setResponseType(value: arraybuffer | blob | json): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setRevalidate(value: Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
    
    inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
