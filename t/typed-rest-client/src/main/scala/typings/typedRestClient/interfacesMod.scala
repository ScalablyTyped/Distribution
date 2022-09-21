package typings.typedRestClient

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.Url
import typings.std.ReadableStream
import typings.typedRestClient.anon.ArrayFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  trait IBasicCredentials extends StObject {
    
    var password: String
    
    var username: String
  }
  object IBasicCredentials {
    
    inline def apply(password: String, username: String): IBasicCredentials = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBasicCredentials]
    }
    
    extension [Self <: IBasicCredentials](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICertConfiguration extends StObject {
    
    var caFile: js.UndefOr[String] = js.undefined
    
    var certFile: js.UndefOr[String] = js.undefined
    
    var keyFile: js.UndefOr[String] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
  }
  object ICertConfiguration {
    
    inline def apply(): ICertConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICertConfiguration]
    }
    
    extension [Self <: ICertConfiguration](x: Self) {
      
      inline def setCaFile(value: String): Self = StObject.set(x, "caFile", value.asInstanceOf[js.Any])
      
      inline def setCaFileUndefined: Self = StObject.set(x, "caFile", js.undefined)
      
      inline def setCertFile(value: String): Self = StObject.set(x, "certFile", value.asInstanceOf[js.Any])
      
      inline def setCertFileUndefined: Self = StObject.set(x, "certFile", js.undefined)
      
      inline def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
      
      inline def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    }
  }
  
  type IHeaders = StringDictionary[Any]
  
  @js.native
  trait IHttpClient extends StObject {
    
    def del(requestUrl: String): js.Promise[IHttpClientResponse] = js.native
    def del(requestUrl: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
    
    def get(requestUrl: String): js.Promise[IHttpClientResponse] = js.native
    def get(requestUrl: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
    
    def options(requestUrl: String): js.Promise[IHttpClientResponse] = js.native
    def options(requestUrl: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
    
    def patch(requestUrl: String, data: String): js.Promise[IHttpClientResponse] = js.native
    def patch(requestUrl: String, data: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
    
    def post(requestUrl: String, data: String): js.Promise[IHttpClientResponse] = js.native
    def post(requestUrl: String, data: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
    
    def put(requestUrl: String, data: String): js.Promise[IHttpClientResponse] = js.native
    def put(requestUrl: String, data: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
    
    def request(verb: String, requestUrl: String, data: String, headers: IHeaders): js.Promise[IHttpClientResponse] = js.native
    def request(verb: String, requestUrl: String, data: ReadableStream[Any], headers: IHeaders): js.Promise[IHttpClientResponse] = js.native
    
    def requestRaw(info: IRequestInfo, data: String): js.Promise[IHttpClientResponse] = js.native
    def requestRaw(info: IRequestInfo, data: ReadableStream[Any]): js.Promise[IHttpClientResponse] = js.native
    
    def requestRawWithCallback(
      info: IRequestInfo,
      data: String,
      onResult: js.Function2[/* err */ Any, /* res */ IHttpClientResponse, Unit]
    ): Unit = js.native
    def requestRawWithCallback(
      info: IRequestInfo,
      data: ReadableStream[Any],
      onResult: js.Function2[/* err */ Any, /* res */ IHttpClientResponse, Unit]
    ): Unit = js.native
    
    def sendStream(verb: String, requestUrl: String, stream: ReadableStream[Any]): js.Promise[IHttpClientResponse] = js.native
    def sendStream(verb: String, requestUrl: String, stream: ReadableStream[Any], additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
  }
  
  trait IHttpClientResponse extends StObject {
    
    var message: IncomingMessage
    
    def readBody(): js.Promise[String]
  }
  object IHttpClientResponse {
    
    inline def apply(message: IncomingMessage, readBody: () => js.Promise[String]): IHttpClientResponse = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], readBody = js.Any.fromFunction0(readBody))
      __obj.asInstanceOf[IHttpClientResponse]
    }
    
    extension [Self <: IHttpClientResponse](x: Self) {
      
      inline def setMessage(value: IncomingMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setReadBody(value: () => js.Promise[String]): Self = StObject.set(x, "readBody", js.Any.fromFunction0(value))
    }
  }
  
  trait IProxyConfiguration extends StObject {
    
    var proxyBypassHosts: js.UndefOr[js.Array[String]] = js.undefined
    
    var proxyPassword: js.UndefOr[String] = js.undefined
    
    var proxyUrl: String
    
    var proxyUsername: js.UndefOr[String] = js.undefined
  }
  object IProxyConfiguration {
    
    inline def apply(proxyUrl: String): IProxyConfiguration = {
      val __obj = js.Dynamic.literal(proxyUrl = proxyUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProxyConfiguration]
    }
    
    extension [Self <: IProxyConfiguration](x: Self) {
      
      inline def setProxyBypassHosts(value: js.Array[String]): Self = StObject.set(x, "proxyBypassHosts", value.asInstanceOf[js.Any])
      
      inline def setProxyBypassHostsUndefined: Self = StObject.set(x, "proxyBypassHosts", js.undefined)
      
      inline def setProxyBypassHostsVarargs(value: String*): Self = StObject.set(x, "proxyBypassHosts", js.Array(value*))
      
      inline def setProxyPassword(value: String): Self = StObject.set(x, "proxyPassword", value.asInstanceOf[js.Any])
      
      inline def setProxyPasswordUndefined: Self = StObject.set(x, "proxyPassword", js.undefined)
      
      inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
      
      inline def setProxyUsername(value: String): Self = StObject.set(x, "proxyUsername", value.asInstanceOf[js.Any])
      
      inline def setProxyUsernameUndefined: Self = StObject.set(x, "proxyUsername", js.undefined)
    }
  }
  
  trait IRequestHandler extends StObject {
    
    def canHandleAuthentication(response: IHttpClientResponse): Boolean
    
    def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: Any): js.Promise[IHttpClientResponse]
    
    def prepareRequest(options: RequestOptions): Unit
  }
  object IRequestHandler {
    
    inline def apply(
      canHandleAuthentication: IHttpClientResponse => Boolean,
      handleAuthentication: (IHttpClient, IRequestInfo, Any) => js.Promise[IHttpClientResponse],
      prepareRequest: RequestOptions => Unit
    ): IRequestHandler = {
      val __obj = js.Dynamic.literal(canHandleAuthentication = js.Any.fromFunction1(canHandleAuthentication), handleAuthentication = js.Any.fromFunction3(handleAuthentication), prepareRequest = js.Any.fromFunction1(prepareRequest))
      __obj.asInstanceOf[IRequestHandler]
    }
    
    extension [Self <: IRequestHandler](x: Self) {
      
      inline def setCanHandleAuthentication(value: IHttpClientResponse => Boolean): Self = StObject.set(x, "canHandleAuthentication", js.Any.fromFunction1(value))
      
      inline def setHandleAuthentication(value: (IHttpClient, IRequestInfo, Any) => js.Promise[IHttpClientResponse]): Self = StObject.set(x, "handleAuthentication", js.Any.fromFunction3(value))
      
      inline def setPrepareRequest(value: RequestOptions => Unit): Self = StObject.set(x, "prepareRequest", js.Any.fromFunction1(value))
    }
  }
  
  trait IRequestInfo extends StObject {
    
    var httpModule: Any
    
    var options: RequestOptions
    
    var parsedUrl: Url
  }
  object IRequestInfo {
    
    inline def apply(httpModule: Any, options: RequestOptions, parsedUrl: Url): IRequestInfo = {
      val __obj = js.Dynamic.literal(httpModule = httpModule.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parsedUrl = parsedUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestInfo]
    }
    
    extension [Self <: IRequestInfo](x: Self) {
      
      inline def setHttpModule(value: Any): Self = StObject.set(x, "httpModule", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: RequestOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setParsedUrl(value: Url): Self = StObject.set(x, "parsedUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRequestOptions extends StObject {
    
    var allowRedirectDowngrade: js.UndefOr[Boolean] = js.undefined
    
    var allowRedirects: js.UndefOr[Boolean] = js.undefined
    
    var allowRetries: js.UndefOr[Boolean] = js.undefined
    
    var cert: js.UndefOr[ICertConfiguration] = js.undefined
    
    var headers: js.UndefOr[IHeaders] = js.undefined
    
    var ignoreSslError: js.UndefOr[Boolean] = js.undefined
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var maxSockets: js.UndefOr[Double] = js.undefined
    
    var presignedUrlPatterns: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
    var proxy: js.UndefOr[IProxyConfiguration] = js.undefined
    
    var socketTimeout: js.UndefOr[Double] = js.undefined
  }
  object IRequestOptions {
    
    inline def apply(): IRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRequestOptions]
    }
    
    extension [Self <: IRequestOptions](x: Self) {
      
      inline def setAllowRedirectDowngrade(value: Boolean): Self = StObject.set(x, "allowRedirectDowngrade", value.asInstanceOf[js.Any])
      
      inline def setAllowRedirectDowngradeUndefined: Self = StObject.set(x, "allowRedirectDowngrade", js.undefined)
      
      inline def setAllowRedirects(value: Boolean): Self = StObject.set(x, "allowRedirects", value.asInstanceOf[js.Any])
      
      inline def setAllowRedirectsUndefined: Self = StObject.set(x, "allowRedirects", js.undefined)
      
      inline def setAllowRetries(value: Boolean): Self = StObject.set(x, "allowRetries", value.asInstanceOf[js.Any])
      
      inline def setAllowRetriesUndefined: Self = StObject.set(x, "allowRetries", js.undefined)
      
      inline def setCert(value: ICertConfiguration): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setHeaders(value: IHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIgnoreSslError(value: Boolean): Self = StObject.set(x, "ignoreSslError", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSslErrorUndefined: Self = StObject.set(x, "ignoreSslError", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      inline def setPresignedUrlPatterns(value: js.Array[js.RegExp]): Self = StObject.set(x, "presignedUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setPresignedUrlPatternsUndefined: Self = StObject.set(x, "presignedUrlPatterns", js.undefined)
      
      inline def setPresignedUrlPatternsVarargs(value: js.RegExp*): Self = StObject.set(x, "presignedUrlPatterns", js.Array(value*))
      
      inline def setProxy(value: IProxyConfiguration): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
    }
  }
  
  trait IRequestQueryParams extends StObject {
    
    var options: js.UndefOr[ArrayFormat] = js.undefined
    
    var params: StringDictionary[String | Double | (js.Array[String | Double])]
  }
  object IRequestQueryParams {
    
    inline def apply(params: StringDictionary[String | Double | (js.Array[String | Double])]): IRequestQueryParams = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestQueryParams]
    }
    
    extension [Self <: IRequestQueryParams](x: Self) {
      
      inline def setOptions(value: ArrayFormat): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setParams(value: StringDictionary[String | Double | (js.Array[String | Double])]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
}
