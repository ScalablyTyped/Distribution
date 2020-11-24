package typings.tampermonkey.Tampermonkey

import typings.tampermonkey.tampermonkeyStrings.GET
import typings.tampermonkey.tampermonkeyStrings.HEAD
import typings.tampermonkey.tampermonkeyStrings.POST
import typings.tampermonkey.tampermonkeyStrings.arraybuffer
import typings.tampermonkey.tampermonkeyStrings.blob
import typings.tampermonkey.tampermonkeyStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request[TContext] extends js.Object {
  
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
  implicit class RequestOps[Self <: Request[_], TContext] (val x: Self with Request[TContext]) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnonymous(value: Boolean): Self = this.set("anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnonymous: Self = this.set("anonymous", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFetch(value: Boolean): Self = this.set("fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | HEAD | POST): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOnabort(value: () => Unit): Self = this.set("onabort", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnabort: Self = this.set("onabort", js.undefined)
    
    @scala.inline
    def setOnerror(value: RequestEventListener[ErrorResponse]): Self = this.set("onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setOnload(value: RequestEventListener[Response[TContext]]): Self = this.set("onload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    
    @scala.inline
    def setOnloadstart(value: RequestEventListener[Response[TContext]]): Self = this.set("onloadstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnloadstart: Self = this.set("onloadstart", js.undefined)
    
    @scala.inline
    def setOnprogress(value: RequestEventListener[ProgressResponse[TContext]]): Self = this.set("onprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnprogress: Self = this.set("onprogress", js.undefined)
    
    @scala.inline
    def setOnreadystatechange(value: RequestEventListener[Response[TContext]]): Self = this.set("onreadystatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnreadystatechange: Self = this.set("onreadystatechange", js.undefined)
    
    @scala.inline
    def setOntimeout(value: () => Unit): Self = this.set("ontimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOntimeout: Self = this.set("ontimeout", js.undefined)
    
    @scala.inline
    def setOverrideMimeType(value: String): Self = this.set("overrideMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideMimeType: Self = this.set("overrideMimeType", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setResponseType(value: arraybuffer | blob | json): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
