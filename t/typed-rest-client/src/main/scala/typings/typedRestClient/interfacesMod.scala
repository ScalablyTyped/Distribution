package typings.typedRestClient

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.Url
import typings.std.RegExp
import typings.typedRestClient.anon.ArrayFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  trait IBasicCredentials extends StObject {
    
    var password: String = js.native
    
    var username: String = js.native
  }
  object IBasicCredentials {
    
    @scala.inline
    def apply(password: String, username: String): IBasicCredentials = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBasicCredentials]
    }
    
    @scala.inline
    implicit class IBasicCredentialsMutableBuilder[Self <: IBasicCredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICertConfiguration extends StObject {
    
    var caFile: js.UndefOr[String] = js.native
    
    var certFile: js.UndefOr[String] = js.native
    
    var keyFile: js.UndefOr[String] = js.native
    
    var passphrase: js.UndefOr[String] = js.native
  }
  object ICertConfiguration {
    
    @scala.inline
    def apply(): ICertConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICertConfiguration]
    }
    
    @scala.inline
    implicit class ICertConfigurationMutableBuilder[Self <: ICertConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaFile(value: String): Self = StObject.set(x, "caFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaFileUndefined: Self = StObject.set(x, "caFile", js.undefined)
      
      @scala.inline
      def setCertFile(value: String): Self = StObject.set(x, "certFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertFileUndefined: Self = StObject.set(x, "certFile", js.undefined)
      
      @scala.inline
      def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    }
  }
  
  type IHeaders = StringDictionary[js.Any]
  
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
    def request(verb: String, requestUrl: String, data: ReadableStream, headers: IHeaders): js.Promise[IHttpClientResponse] = js.native
    
    def requestRaw(info: IRequestInfo, data: String): js.Promise[IHttpClientResponse] = js.native
    def requestRaw(info: IRequestInfo, data: ReadableStream): js.Promise[IHttpClientResponse] = js.native
    
    def requestRawWithCallback(
      info: IRequestInfo,
      data: String,
      onResult: js.Function2[/* err */ js.Any, /* res */ IHttpClientResponse, Unit]
    ): Unit = js.native
    def requestRawWithCallback(
      info: IRequestInfo,
      data: ReadableStream,
      onResult: js.Function2[/* err */ js.Any, /* res */ IHttpClientResponse, Unit]
    ): Unit = js.native
    
    def sendStream(verb: String, requestUrl: String, stream: ReadableStream): js.Promise[IHttpClientResponse] = js.native
    def sendStream(verb: String, requestUrl: String, stream: ReadableStream, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
  }
  
  @js.native
  trait IHttpClientResponse extends StObject {
    
    var message: IncomingMessage = js.native
    
    def readBody(): js.Promise[String] = js.native
  }
  object IHttpClientResponse {
    
    @scala.inline
    def apply(message: IncomingMessage, readBody: () => js.Promise[String]): IHttpClientResponse = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], readBody = js.Any.fromFunction0(readBody))
      __obj.asInstanceOf[IHttpClientResponse]
    }
    
    @scala.inline
    implicit class IHttpClientResponseMutableBuilder[Self <: IHttpClientResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: IncomingMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadBody(value: () => js.Promise[String]): Self = StObject.set(x, "readBody", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IProxyConfiguration extends StObject {
    
    var proxyBypassHosts: js.UndefOr[js.Array[String]] = js.native
    
    var proxyPassword: js.UndefOr[String] = js.native
    
    var proxyUrl: String = js.native
    
    var proxyUsername: js.UndefOr[String] = js.native
  }
  object IProxyConfiguration {
    
    @scala.inline
    def apply(proxyUrl: String): IProxyConfiguration = {
      val __obj = js.Dynamic.literal(proxyUrl = proxyUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProxyConfiguration]
    }
    
    @scala.inline
    implicit class IProxyConfigurationMutableBuilder[Self <: IProxyConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProxyBypassHosts(value: js.Array[String]): Self = StObject.set(x, "proxyBypassHosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyBypassHostsUndefined: Self = StObject.set(x, "proxyBypassHosts", js.undefined)
      
      @scala.inline
      def setProxyBypassHostsVarargs(value: String*): Self = StObject.set(x, "proxyBypassHosts", js.Array(value :_*))
      
      @scala.inline
      def setProxyPassword(value: String): Self = StObject.set(x, "proxyPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyPasswordUndefined: Self = StObject.set(x, "proxyPassword", js.undefined)
      
      @scala.inline
      def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUsername(value: String): Self = StObject.set(x, "proxyUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUsernameUndefined: Self = StObject.set(x, "proxyUsername", js.undefined)
    }
  }
  
  @js.native
  trait IRequestHandler extends StObject {
    
    def canHandleAuthentication(response: IHttpClientResponse): Boolean = js.native
    
    def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): js.Promise[IHttpClientResponse] = js.native
    
    def prepareRequest(options: RequestOptions): Unit = js.native
  }
  object IRequestHandler {
    
    @scala.inline
    def apply(
      canHandleAuthentication: IHttpClientResponse => Boolean,
      handleAuthentication: (IHttpClient, IRequestInfo, js.Any) => js.Promise[IHttpClientResponse],
      prepareRequest: RequestOptions => Unit
    ): IRequestHandler = {
      val __obj = js.Dynamic.literal(canHandleAuthentication = js.Any.fromFunction1(canHandleAuthentication), handleAuthentication = js.Any.fromFunction3(handleAuthentication), prepareRequest = js.Any.fromFunction1(prepareRequest))
      __obj.asInstanceOf[IRequestHandler]
    }
    
    @scala.inline
    implicit class IRequestHandlerMutableBuilder[Self <: IRequestHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanHandleAuthentication(value: IHttpClientResponse => Boolean): Self = StObject.set(x, "canHandleAuthentication", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleAuthentication(value: (IHttpClient, IRequestInfo, js.Any) => js.Promise[IHttpClientResponse]): Self = StObject.set(x, "handleAuthentication", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPrepareRequest(value: RequestOptions => Unit): Self = StObject.set(x, "prepareRequest", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IRequestInfo extends StObject {
    
    var httpModule: js.Any = js.native
    
    var options: RequestOptions = js.native
    
    var parsedUrl: Url = js.native
  }
  object IRequestInfo {
    
    @scala.inline
    def apply(httpModule: js.Any, options: RequestOptions, parsedUrl: Url): IRequestInfo = {
      val __obj = js.Dynamic.literal(httpModule = httpModule.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parsedUrl = parsedUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestInfo]
    }
    
    @scala.inline
    implicit class IRequestInfoMutableBuilder[Self <: IRequestInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpModule(value: js.Any): Self = StObject.set(x, "httpModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: RequestOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedUrl(value: Url): Self = StObject.set(x, "parsedUrl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRequestOptions extends StObject {
    
    var allowRedirectDowngrade: js.UndefOr[Boolean] = js.native
    
    var allowRedirects: js.UndefOr[Boolean] = js.native
    
    var allowRetries: js.UndefOr[Boolean] = js.native
    
    var cert: js.UndefOr[ICertConfiguration] = js.native
    
    var headers: js.UndefOr[IHeaders] = js.native
    
    var ignoreSslError: js.UndefOr[Boolean] = js.native
    
    var keepAlive: js.UndefOr[Boolean] = js.native
    
    var maxRedirects: js.UndefOr[Double] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var maxSockets: js.UndefOr[Double] = js.native
    
    var presignedUrlPatterns: js.UndefOr[js.Array[RegExp]] = js.native
    
    var proxy: js.UndefOr[IProxyConfiguration] = js.native
    
    var socketTimeout: js.UndefOr[Double] = js.native
  }
  object IRequestOptions {
    
    @scala.inline
    def apply(): IRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRequestOptions]
    }
    
    @scala.inline
    implicit class IRequestOptionsMutableBuilder[Self <: IRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowRedirectDowngrade(value: Boolean): Self = StObject.set(x, "allowRedirectDowngrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRedirectDowngradeUndefined: Self = StObject.set(x, "allowRedirectDowngrade", js.undefined)
      
      @scala.inline
      def setAllowRedirects(value: Boolean): Self = StObject.set(x, "allowRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRedirectsUndefined: Self = StObject.set(x, "allowRedirects", js.undefined)
      
      @scala.inline
      def setAllowRetries(value: Boolean): Self = StObject.set(x, "allowRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRetriesUndefined: Self = StObject.set(x, "allowRetries", js.undefined)
      
      @scala.inline
      def setCert(value: ICertConfiguration): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setHeaders(value: IHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIgnoreSslError(value: Boolean): Self = StObject.set(x, "ignoreSslError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreSslErrorUndefined: Self = StObject.set(x, "ignoreSslError", js.undefined)
      
      @scala.inline
      def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      @scala.inline
      def setPresignedUrlPatterns(value: js.Array[RegExp]): Self = StObject.set(x, "presignedUrlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresignedUrlPatternsUndefined: Self = StObject.set(x, "presignedUrlPatterns", js.undefined)
      
      @scala.inline
      def setPresignedUrlPatternsVarargs(value: RegExp*): Self = StObject.set(x, "presignedUrlPatterns", js.Array(value :_*))
      
      @scala.inline
      def setProxy(value: IProxyConfiguration): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
    }
  }
  
  @js.native
  trait IRequestQueryParams extends StObject {
    
    var options: js.UndefOr[ArrayFormat] = js.native
    
    var params: StringDictionary[String | Double | (js.Array[String | Double])] = js.native
  }
  object IRequestQueryParams {
    
    @scala.inline
    def apply(params: StringDictionary[String | Double | (js.Array[String | Double])]): IRequestQueryParams = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestQueryParams]
    }
    
    @scala.inline
    implicit class IRequestQueryParamsMutableBuilder[Self <: IRequestQueryParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: ArrayFormat): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setParams(value: StringDictionary[String | Double | (js.Array[String | Double])]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
}
