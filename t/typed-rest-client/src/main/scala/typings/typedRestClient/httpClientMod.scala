package typings.typedRestClient

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.Url
import typings.typedRestClient.interfacesMod.IHeaders
import typings.typedRestClient.interfacesMod.IHttpClient
import typings.typedRestClient.interfacesMod.IHttpClientResponse
import typings.typedRestClient.interfacesMod.IRequestHandler
import typings.typedRestClient.interfacesMod.IRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpClientMod {
  
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
    
    /**
      * Needs to be called if keepAlive is set to true in request options.
      */
    def dispose(): Unit = js.native
    
    var handlers: js.Array[IRequestHandler] = js.native
    
    def head(requestUrl: String): js.Promise[IHttpClientResponse] = js.native
    def head(requestUrl: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
    
    var requestOptions: IRequestOptions = js.native
    
    var userAgent: js.UndefOr[String | Null] = js.native
  }
  
  @JSImport("typed-rest-client/HttpClient", "HttpClientResponse")
  @js.native
  class HttpClientResponse protected () extends IHttpClientResponse {
    def this(message: IncomingMessage) = this()
  }
  
  @js.native
  sealed trait HttpCodes extends StObject
  @JSImport("typed-rest-client/HttpClient", "HttpCodes")
  @js.native
  object HttpCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HttpCodes with Double] = js.native
    
    @js.native
    sealed trait BadGateway extends HttpCodes
    /* 502 */ val BadGateway: typings.typedRestClient.httpClientMod.HttpCodes.BadGateway with Double = js.native
    
    @js.native
    sealed trait BadRequest extends HttpCodes
    /* 400 */ val BadRequest: typings.typedRestClient.httpClientMod.HttpCodes.BadRequest with Double = js.native
    
    @js.native
    sealed trait Conflict extends HttpCodes
    /* 409 */ val Conflict: typings.typedRestClient.httpClientMod.HttpCodes.Conflict with Double = js.native
    
    @js.native
    sealed trait Forbidden extends HttpCodes
    /* 403 */ val Forbidden: typings.typedRestClient.httpClientMod.HttpCodes.Forbidden with Double = js.native
    
    @js.native
    sealed trait GatewayTimeout extends HttpCodes
    /* 504 */ val GatewayTimeout: typings.typedRestClient.httpClientMod.HttpCodes.GatewayTimeout with Double = js.native
    
    @js.native
    sealed trait Gone extends HttpCodes
    /* 410 */ val Gone: typings.typedRestClient.httpClientMod.HttpCodes.Gone with Double = js.native
    
    @js.native
    sealed trait InternalServerError extends HttpCodes
    /* 500 */ val InternalServerError: typings.typedRestClient.httpClientMod.HttpCodes.InternalServerError with Double = js.native
    
    @js.native
    sealed trait MethodNotAllowed extends HttpCodes
    /* 405 */ val MethodNotAllowed: typings.typedRestClient.httpClientMod.HttpCodes.MethodNotAllowed with Double = js.native
    
    @js.native
    sealed trait MovedPermanently extends HttpCodes
    /* 301 */ val MovedPermanently: typings.typedRestClient.httpClientMod.HttpCodes.MovedPermanently with Double = js.native
    
    @js.native
    sealed trait MultipleChoices extends HttpCodes
    /* 300 */ val MultipleChoices: typings.typedRestClient.httpClientMod.HttpCodes.MultipleChoices with Double = js.native
    
    @js.native
    sealed trait NotAcceptable extends HttpCodes
    /* 406 */ val NotAcceptable: typings.typedRestClient.httpClientMod.HttpCodes.NotAcceptable with Double = js.native
    
    @js.native
    sealed trait NotFound extends HttpCodes
    /* 404 */ val NotFound: typings.typedRestClient.httpClientMod.HttpCodes.NotFound with Double = js.native
    
    @js.native
    sealed trait NotImplemented extends HttpCodes
    /* 501 */ val NotImplemented: typings.typedRestClient.httpClientMod.HttpCodes.NotImplemented with Double = js.native
    
    @js.native
    sealed trait NotModified extends HttpCodes
    /* 304 */ val NotModified: typings.typedRestClient.httpClientMod.HttpCodes.NotModified with Double = js.native
    
    @js.native
    sealed trait OK extends HttpCodes
    /* 200 */ val OK: typings.typedRestClient.httpClientMod.HttpCodes.OK with Double = js.native
    
    @js.native
    sealed trait PaymentRequired extends HttpCodes
    /* 402 */ val PaymentRequired: typings.typedRestClient.httpClientMod.HttpCodes.PaymentRequired with Double = js.native
    
    @js.native
    sealed trait PermanentRedirect extends HttpCodes
    /* 308 */ val PermanentRedirect: typings.typedRestClient.httpClientMod.HttpCodes.PermanentRedirect with Double = js.native
    
    @js.native
    sealed trait ProxyAuthenticationRequired extends HttpCodes
    /* 407 */ val ProxyAuthenticationRequired: typings.typedRestClient.httpClientMod.HttpCodes.ProxyAuthenticationRequired with Double = js.native
    
    @js.native
    sealed trait RequestTimeout extends HttpCodes
    /* 408 */ val RequestTimeout: typings.typedRestClient.httpClientMod.HttpCodes.RequestTimeout with Double = js.native
    
    @js.native
    sealed trait ResourceMoved extends HttpCodes
    /* 302 */ val ResourceMoved: typings.typedRestClient.httpClientMod.HttpCodes.ResourceMoved with Double = js.native
    
    @js.native
    sealed trait SeeOther extends HttpCodes
    /* 303 */ val SeeOther: typings.typedRestClient.httpClientMod.HttpCodes.SeeOther with Double = js.native
    
    @js.native
    sealed trait ServiceUnavailable extends HttpCodes
    /* 503 */ val ServiceUnavailable: typings.typedRestClient.httpClientMod.HttpCodes.ServiceUnavailable with Double = js.native
    
    @js.native
    sealed trait SwitchProxy extends HttpCodes
    /* 306 */ val SwitchProxy: typings.typedRestClient.httpClientMod.HttpCodes.SwitchProxy with Double = js.native
    
    @js.native
    sealed trait TemporaryRedirect extends HttpCodes
    /* 307 */ val TemporaryRedirect: typings.typedRestClient.httpClientMod.HttpCodes.TemporaryRedirect with Double = js.native
    
    @js.native
    sealed trait TooManyRequests extends HttpCodes
    /* 429 */ val TooManyRequests: typings.typedRestClient.httpClientMod.HttpCodes.TooManyRequests with Double = js.native
    
    @js.native
    sealed trait Unauthorized extends HttpCodes
    /* 401 */ val Unauthorized: typings.typedRestClient.httpClientMod.HttpCodes.Unauthorized with Double = js.native
    
    @js.native
    sealed trait UseProxy extends HttpCodes
    /* 305 */ val UseProxy: typings.typedRestClient.httpClientMod.HttpCodes.UseProxy with Double = js.native
  }
  
  @JSImport("typed-rest-client/HttpClient", "isHttps")
  @js.native
  def isHttps(requestUrl: String): Boolean = js.native
  
  @js.native
  trait RequestInfo extends StObject {
    
    var httpModule: js.Any = js.native
    
    var options: RequestOptions = js.native
    
    var parsedUrl: Url = js.native
  }
  object RequestInfo {
    
    @scala.inline
    def apply(httpModule: js.Any, options: RequestOptions, parsedUrl: Url): RequestInfo = {
      val __obj = js.Dynamic.literal(httpModule = httpModule.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parsedUrl = parsedUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestInfo]
    }
    
    @scala.inline
    implicit class RequestInfoMutableBuilder[Self <: RequestInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpModule(value: js.Any): Self = StObject.set(x, "httpModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: RequestOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedUrl(value: Url): Self = StObject.set(x, "parsedUrl", value.asInstanceOf[js.Any])
    }
  }
}
