package typings.xhr2Cookies

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import typings.node.httpsMod.Agent
import typings.node.urlMod.Url
import typings.std.ArrayBuffer
import typings.xhr2Cookies.anon.BaseUrl
import typings.xhr2Cookies.errorsMod.InvalidStateError
import typings.xhr2Cookies.errorsMod.NetworkError
import typings.xhr2Cookies.errorsMod.SecurityError
import typings.xhr2Cookies.errorsMod.SyntaxError
import typings.xhr2Cookies.progressEventMod.ProgressEvent
import typings.xhr2Cookies.xmlHttpRequestEventTargetMod.ProgressEventListener
import typings.xhr2Cookies.xmlHttpRequestEventTargetMod.XMLHttpRequestEventTarget
import typings.xhr2Cookies.xmlHttpRequestUploadMod.XMLHttpRequestUpload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlHttpRequestMod {
  
  @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest")
  @js.native
  class XMLHttpRequest () extends XMLHttpRequestEventTarget {
    def this(options: XMLHttpRequestOptions) = this()
    
    var DONE: Double = js.native
    
    var HEADERS_RECEIVED: Double = js.native
    
    var LOADING: Double = js.native
    
    var OPENED: Double = js.native
    
    var UNSENT: Double = js.native
    
    /* private */ var _aborting: js.Any = js.native
    
    /* private */ var _anonymous: js.Any = js.native
    
    /* private */ def _dispatchProgress(eventType: js.Any): js.Any = js.native
    
    /* private */ var _error: js.Any = js.native
    
    /* private */ def _finalizeHeaders(): js.Any = js.native
    
    /* private */ var _headers: js.Any = js.native
    
    /* private */ var _lengthComputable: js.Any = js.native
    
    /* private */ var _loadedBytes: js.Any = js.native
    
    /* private */ var _loweredHeaders: js.Any = js.native
    
    /* private */ var _method: js.Any = js.native
    
    /* private */ var _mimeOverride: js.Any = js.native
    
    /* private */ def _onHttpRequestError(request: js.Any, error: js.Any): js.Any = js.native
    
    /* private */ def _onHttpResponse(request: js.Any, response: js.Any): js.Any = js.native
    
    /* private */ def _onHttpResponseClose(response: js.Any): js.Any = js.native
    
    /* private */ def _onHttpResponseData(response: js.Any, data: js.Any): js.Any = js.native
    
    /* private */ def _onHttpResponseEnd(response: js.Any): js.Any = js.native
    
    /* private */ def _onHttpTimeout(request: js.Any): js.Any = js.native
    
    /* private */ def _parseResponse(): js.Any = js.native
    
    /* private */ def _parseResponseEncoding(): js.Any = js.native
    
    /* private */ def _parseResponseHeaders(response: js.Any): js.Any = js.native
    
    /* private */ def _parseUrl(urlString: js.Any, user: js.Any, password: js.Any): js.Any = js.native
    
    /* private */ var _privateHeaders: js.Any = js.native
    
    /* private */ var _request: js.Any = js.native
    
    /* private */ var _response: js.Any = js.native
    
    /* private */ var _responseHeaders: js.Any = js.native
    
    /* private */ var _responseParts: js.Any = js.native
    
    /* private */ var _restrictedHeaders: js.Any = js.native
    
    /* private */ var _restrictedMethods: js.Any = js.native
    
    /* private */ def _sendFile(data: js.Any): js.Any = js.native
    
    /* private */ def _sendHttp(data: js.Any): js.Any = js.native
    
    /* private */ def _sendHxxpRequest(): js.Any = js.native
    
    /* private */ def _setError(): js.Any = js.native
    
    /* private */ def _setReadyState(readyState: js.Any): js.Any = js.native
    
    /* private */ var _sync: js.Any = js.native
    
    /* private */ var _totalBytes: js.Any = js.native
    
    /* private */ var _url: js.Any = js.native
    
    /* private */ var _userAgent: js.Any = js.native
    
    def abort(): Unit = js.native
    
    def getAllResponseHeaders(): String = js.native
    
    def getResponseHeader(name: String): String = js.native
    
    var nodejsBaseUrl: String | Null = js.native
    
    var nodejsHttpAgent: Agent = js.native
    
    var nodejsHttpsAgent: Agent = js.native
    
    def nodejsSet(options: BaseUrl): Unit = js.native
    
    var onreadystatechange: ProgressEventListener | Null = js.native
    
    def open(method: String, url: String): Unit = js.native
    def open(method: String, url: String, async: Boolean): Unit = js.native
    def open(method: String, url: String, async: Boolean, user: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, user: String, password: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, user: Unit, password: String): Unit = js.native
    def open(method: String, url: String, async: Unit, user: String): Unit = js.native
    def open(method: String, url: String, async: Unit, user: String, password: String): Unit = js.native
    def open(method: String, url: String, async: Unit, user: Unit, password: String): Unit = js.native
    
    def overrideMimeType(mimeType: String): Unit = js.native
    
    var readyState: Double = js.native
    
    var response: String | ArrayBuffer | Buffer | js.Object | Null = js.native
    
    var responseText: String = js.native
    
    var responseType: String = js.native
    
    var responseUrl: String = js.native
    
    def send(): Unit = js.native
    def send(data: String): Unit = js.native
    def send(data: ArrayBuffer): Unit = js.native
    
    def setRequestHeader(name: String, value: js.Any): Unit = js.native
    
    var status: Double = js.native
    
    var statusText: String = js.native
    
    var timeout: Double = js.native
    
    var upload: XMLHttpRequestUpload = js.native
    
    var withCredentials: Boolean = js.native
  }
  /* static members */
  object XMLHttpRequest {
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.DONE")
    @js.native
    def DONE: Double = js.native
    inline def DONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DONE")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.HEADERS_RECEIVED")
    @js.native
    def HEADERS_RECEIVED: Double = js.native
    inline def HEADERS_RECEIVED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADERS_RECEIVED")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.InvalidStateError")
    @js.native
    def InvalidStateError: Instantiable0[typings.xhr2Cookies.errorsMod.InvalidStateError] = js.native
    inline def InvalidStateError_=(x: Instantiable0[InvalidStateError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InvalidStateError")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.LOADING")
    @js.native
    def LOADING: Double = js.native
    inline def LOADING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADING")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.NetworkError")
    @js.native
    def NetworkError: Instantiable0[typings.xhr2Cookies.errorsMod.NetworkError] = js.native
    inline def NetworkError_=(x: Instantiable0[NetworkError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NetworkError")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.OPENED")
    @js.native
    def OPENED: Double = js.native
    inline def OPENED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENED")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.ProgressEvent")
    @js.native
    def ProgressEvent: Instantiable1[/* type */ String, typings.xhr2Cookies.progressEventMod.ProgressEvent] = js.native
    inline def ProgressEvent_=(x: Instantiable1[/* type */ String, ProgressEvent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProgressEvent")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.SecurityError")
    @js.native
    def SecurityError: Instantiable0[typings.xhr2Cookies.errorsMod.SecurityError] = js.native
    inline def SecurityError_=(x: Instantiable0[SecurityError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SecurityError")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.SyntaxError")
    @js.native
    def SyntaxError: Instantiable0[typings.xhr2Cookies.errorsMod.SyntaxError] = js.native
    inline def SyntaxError_=(x: Instantiable0[SyntaxError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SyntaxError")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.UNSENT")
    @js.native
    def UNSENT: Double = js.native
    inline def UNSENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSENT")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.XMLHttpRequestUpload")
    @js.native
    def XMLHttpRequestUpload: Instantiable0[typings.xhr2Cookies.xmlHttpRequestUploadMod.XMLHttpRequestUpload] = js.native
    inline def XMLHttpRequestUpload_=(x: Instantiable0[XMLHttpRequestUpload]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XMLHttpRequestUpload")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.cookieJar")
    @js.native
    def cookieJar: js.Any = js.native
    inline def cookieJar_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookieJar")(x.asInstanceOf[js.Any])
    
    inline def nodejsSet(options: BaseUrl): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nodejsSet")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait XHRUrl
    extends StObject
       with Url {
    
    var method: js.UndefOr[String] = js.undefined
  }
  object XHRUrl {
    
    inline def apply(href: String): XHRUrl = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, pathname = null, port = null, protocol = null, query = null, search = null, slashes = null)
      __obj.asInstanceOf[XHRUrl]
    }
    
    extension [Self <: XHRUrl](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  trait XMLHttpRequestOptions extends StObject {
    
    var anon: js.UndefOr[Boolean] = js.undefined
  }
  object XMLHttpRequestOptions {
    
    inline def apply(): XMLHttpRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XMLHttpRequestOptions]
    }
    
    extension [Self <: XMLHttpRequestOptions](x: Self) {
      
      inline def setAnon(value: Boolean): Self = StObject.set(x, "anon", value.asInstanceOf[js.Any])
      
      inline def setAnonUndefined: Self = StObject.set(x, "anon", js.undefined)
    }
  }
}
