package typings.typedDashRestDashClient.httpClientMod

import typings.typedDashRestDashClient.interfacesMod.IHeaders
import typings.typedDashRestDashClient.interfacesMod.IHttpClient
import typings.typedDashRestDashClient.interfacesMod.IHttpClientResponse
import typings.typedDashRestDashClient.interfacesMod.IRequestHandler
import typings.typedDashRestDashClient.interfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/HttpClient", "HttpClient")
@js.native
class HttpClient protected () extends IHttpClient {
  def this(userAgent: String) = this()
  def this(userAgent: String, handlers: js.Array[IRequestHandler]) = this()
  def this(userAgent: String, handlers: js.Array[IRequestHandler], requestOptions: IRequestOptions) = this()
  var _agent: js.Any = js.native
  var _allowRedirects: js.Any = js.native
  var _allowRetries: js.Any = js.native
  var _ca: js.Any = js.native
  var _cert: js.Any = js.native
  var _certConfig: js.Any = js.native
  var _disposed: js.Any = js.native
  var _httpProxy: js.Any = js.native
  var _httpProxyBypassHosts: js.Any = js.native
  var _ignoreSslError: js.Any = js.native
  var _keepAlive: js.Any = js.native
  var _key: js.Any = js.native
  var _maxRedirects: js.Any = js.native
  var _maxRetries: js.Any = js.native
  var _proxyAgent: js.Any = js.native
  var _socketTimeout: js.Any = js.native
  var handlers: js.Array[IRequestHandler] = js.native
  var requestOptions: IRequestOptions = js.native
  var userAgent: String = js.native
  /* private */ def _getAgent(requestUrl: js.Any): js.Any = js.native
  /* private */ def _getProxy(requestUrl: js.Any): js.Any = js.native
  /* private */ def _isBypassProxy(requestUrl: js.Any): js.Any = js.native
  /* private */ def _isPresigned(requestUrl: js.Any): js.Any = js.native
  /* private */ def _mergeHeaders(headers: js.Any): js.Any = js.native
  /* private */ def _performExponentialBackoff(retryNumber: js.Any): js.Any = js.native
  /* private */ def _prepareRequest(method: js.Any, requestUrl: js.Any, headers: js.Any): js.Any = js.native
  /**
    * Needs to be called if keepAlive is set to true in request options.
    */
  def dispose(): Unit = js.native
  def head(requestUrl: String): js.Promise[IHttpClientResponse] = js.native
  def head(requestUrl: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
}

