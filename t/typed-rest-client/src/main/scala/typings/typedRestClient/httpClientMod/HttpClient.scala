package typings.typedRestClient.httpClientMod

import typings.typedRestClient.interfacesMod.IHeaders
import typings.typedRestClient.interfacesMod.IHttpClient
import typings.typedRestClient.interfacesMod.IHttpClientResponse
import typings.typedRestClient.interfacesMod.IRequestHandler
import typings.typedRestClient.interfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/HttpClient", "HttpClient")
@js.native
class HttpClient () extends IHttpClient {
  def this(userAgent: String) = this()
  def this(userAgent: js.UndefOr[scala.Nothing], handlers: js.Array[IRequestHandler]) = this()
  def this(userAgent: String, handlers: js.Array[IRequestHandler]) = this()
  def this(userAgent: Null, handlers: js.Array[IRequestHandler]) = this()
  def this(
    userAgent: js.UndefOr[scala.Nothing],
    handlers: js.UndefOr[scala.Nothing],
    requestOptions: IRequestOptions
  ) = this()
  def this(
    userAgent: js.UndefOr[scala.Nothing],
    handlers: js.Array[IRequestHandler],
    requestOptions: IRequestOptions
  ) = this()
  def this(userAgent: String, handlers: js.UndefOr[scala.Nothing], requestOptions: IRequestOptions) = this()
  def this(userAgent: String, handlers: js.Array[IRequestHandler], requestOptions: IRequestOptions) = this()
  def this(userAgent: Null, handlers: js.UndefOr[scala.Nothing], requestOptions: IRequestOptions) = this()
  def this(userAgent: Null, handlers: js.Array[IRequestHandler], requestOptions: IRequestOptions) = this()
  var _agent: js.Any = js.native
  var _allowRedirectDowngrade: js.Any = js.native
  var _allowRedirects: js.Any = js.native
  var _allowRetries: js.Any = js.native
  var _ca: js.Any = js.native
  var _cert: js.Any = js.native
  var _certConfig: js.Any = js.native
  var _disposed: js.Any = js.native
  var _getAgent: js.Any = js.native
  var _getProxy: js.Any = js.native
  var _httpProxy: js.Any = js.native
  var _httpProxyBypassHosts: js.Any = js.native
  var _ignoreSslError: js.Any = js.native
  var _isMatchInBypassProxyList: js.Any = js.native
  var _isPresigned: js.Any = js.native
  var _keepAlive: js.Any = js.native
  var _key: js.Any = js.native
  var _maxRedirects: js.Any = js.native
  var _maxRetries: js.Any = js.native
  var _mergeHeaders: js.Any = js.native
  var _performExponentialBackoff: js.Any = js.native
  var _prepareRequest: js.Any = js.native
  var _proxyAgent: js.Any = js.native
  var _socketTimeout: js.Any = js.native
  var handlers: js.Array[IRequestHandler] = js.native
  var requestOptions: IRequestOptions = js.native
  var userAgent: js.UndefOr[String | Null] = js.native
  /**
    * Needs to be called if keepAlive is set to true in request options.
    */
  def dispose(): Unit = js.native
  def head(requestUrl: String): js.Promise[IHttpClientResponse] = js.native
  def head(requestUrl: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
}

