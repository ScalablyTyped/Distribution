package typings
package typedDashRestDashClientLib.httpClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/HttpClient", "HttpClient")
@js.native
class HttpClient protected ()
  extends typedDashRestDashClientLib.interfacesMod.IHttpClient {
  def this(userAgent: java.lang.String) = this()
  def this(userAgent: java.lang.String, handlers: js.Array[typedDashRestDashClientLib.interfacesMod.IRequestHandler]) = this()
  def this(userAgent: java.lang.String, handlers: js.Array[typedDashRestDashClientLib.interfacesMod.IRequestHandler], requestOptions: typedDashRestDashClientLib.interfacesMod.IRequestOptions) = this()
  var _agent: js.Any = js.native
  var _allowRedirects: js.Any = js.native
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
  var _proxyAgent: js.Any = js.native
  var _socketTimeout: js.Any = js.native
  var handlers: js.Array[typedDashRestDashClientLib.interfacesMod.IRequestHandler] = js.native
  var requestOptions: typedDashRestDashClientLib.interfacesMod.IRequestOptions = js.native
  var userAgent: java.lang.String = js.native
  /* private */ def _getAgent(requestUrl: js.Any): js.Any = js.native
  /* private */ def _getProxy(requestUrl: js.Any): js.Any = js.native
  /* private */ def _isBypassProxy(requestUrl: js.Any): js.Any = js.native
  /* private */ def _mergeHeaders(headers: js.Any): js.Any = js.native
  /* private */ def _prepareRequest(method: js.Any, requestUrl: js.Any, headers: js.Any): js.Any = js.native
  /**
    * Needs to be called if keepAlive is set to true in request options.
    */
  def dispose(): scala.Unit = js.native
  def head(requestUrl: java.lang.String): js.Promise[typedDashRestDashClientLib.interfacesMod.IHttpClientResponse] = js.native
  def head(requestUrl: java.lang.String, additionalHeaders: typedDashRestDashClientLib.interfacesMod.IHeaders): js.Promise[typedDashRestDashClientLib.interfacesMod.IHttpClientResponse] = js.native
}

