package typings.xhr2Cookies.xmlHttpRequestMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import typings.node.httpsMod.Agent
import typings.std.ArrayBuffer
import typings.xhr2Cookies.anon.BaseUrl
import typings.xhr2Cookies.xmlHttpRequestEventTargetMod.ProgressEventListener
import typings.xhr2Cookies.xmlHttpRequestEventTargetMod.XMLHttpRequestEventTarget
import typings.xhr2Cookies.xmlHttpRequestUploadMod.XMLHttpRequestUpload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest")
@js.native
class XMLHttpRequest () extends XMLHttpRequestEventTarget {
  def this(options: XMLHttpRequestOptions) = this()
  var DONE: Double = js.native
  var HEADERS_RECEIVED: Double = js.native
  var LOADING: Double = js.native
  var OPENED: Double = js.native
  var UNSENT: Double = js.native
  var _aborting: js.Any = js.native
  var _anonymous: js.Any = js.native
  var _error: js.Any = js.native
  var _headers: js.Any = js.native
  var _lengthComputable: js.Any = js.native
  var _loadedBytes: js.Any = js.native
  var _loweredHeaders: js.Any = js.native
  var _method: js.Any = js.native
  var _mimeOverride: js.Any = js.native
  var _privateHeaders: js.Any = js.native
  var _request: js.Any = js.native
  var _response: js.Any = js.native
  var _responseHeaders: js.Any = js.native
  var _responseParts: js.Any = js.native
  var _restrictedHeaders: js.Any = js.native
  var _restrictedMethods: js.Any = js.native
  var _sync: js.Any = js.native
  var _totalBytes: js.Any = js.native
  var _url: js.Any = js.native
  var _userAgent: js.Any = js.native
  var nodejsBaseUrl: String | Null = js.native
  var nodejsHttpAgent: Agent = js.native
  var nodejsHttpsAgent: Agent = js.native
  var onreadystatechange: ProgressEventListener | Null = js.native
  var readyState: Double = js.native
  var response: String | ArrayBuffer | Buffer | js.Object | Null = js.native
  var responseText: String = js.native
  var responseType: String = js.native
  var responseUrl: String = js.native
  var status: Double = js.native
  var statusText: String = js.native
  var timeout: Double = js.native
  var upload: XMLHttpRequestUpload = js.native
  var withCredentials: Boolean = js.native
  /* private */ def _dispatchProgress(eventType: js.Any): js.Any = js.native
  /* private */ def _finalizeHeaders(): js.Any = js.native
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
  /* private */ def _sendFile(data: js.Any): js.Any = js.native
  /* private */ def _sendHttp(data: js.Any): js.Any = js.native
  /* private */ def _sendHxxpRequest(): js.Any = js.native
  /* private */ def _setError(): js.Any = js.native
  /* private */ def _setReadyState(readyState: js.Any): js.Any = js.native
  def abort(): Unit = js.native
  def getAllResponseHeaders(): String = js.native
  def getResponseHeader(name: String): String = js.native
  def nodejsSet(options: BaseUrl): Unit = js.native
  def open(method: String, url: String): Unit = js.native
  def open(
    method: String,
    url: String,
    async: js.UndefOr[scala.Nothing],
    user: js.UndefOr[scala.Nothing],
    password: String
  ): Unit = js.native
  def open(method: String, url: String, async: js.UndefOr[scala.Nothing], user: String): Unit = js.native
  def open(method: String, url: String, async: js.UndefOr[scala.Nothing], user: String, password: String): Unit = js.native
  def open(method: String, url: String, async: Boolean): Unit = js.native
  def open(method: String, url: String, async: Boolean, user: js.UndefOr[scala.Nothing], password: String): Unit = js.native
  def open(method: String, url: String, async: Boolean, user: String): Unit = js.native
  def open(method: String, url: String, async: Boolean, user: String, password: String): Unit = js.native
  def overrideMimeType(mimeType: String): Unit = js.native
  def send(): Unit = js.native
  def send(data: String): Unit = js.native
  def send(data: ArrayBuffer): Unit = js.native
  def setRequestHeader(name: String, value: js.Any): Unit = js.native
}

/* static members */
@JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest")
@js.native
object XMLHttpRequest extends js.Object {
  var DONE: Double = js.native
  var HEADERS_RECEIVED: Double = js.native
  var InvalidStateError: Instantiable0[typings.xhr2Cookies.errorsMod.InvalidStateError] = js.native
  var LOADING: Double = js.native
  var NetworkError: Instantiable0[typings.xhr2Cookies.errorsMod.NetworkError] = js.native
  var OPENED: Double = js.native
  var ProgressEvent: Instantiable1[/* type */ String, typings.xhr2Cookies.progressEventMod.ProgressEvent] = js.native
  var SecurityError: Instantiable0[typings.xhr2Cookies.errorsMod.SecurityError] = js.native
  var SyntaxError: Instantiable0[typings.xhr2Cookies.errorsMod.SyntaxError] = js.native
  var UNSENT: Double = js.native
  var XMLHttpRequestUpload: Instantiable0[typings.xhr2Cookies.xmlHttpRequestUploadMod.XMLHttpRequestUpload] = js.native
  var cookieJar: js.Any = js.native
  def nodejsSet(options: BaseUrl): Unit = js.native
}

