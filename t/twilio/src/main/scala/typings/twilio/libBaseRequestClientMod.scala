package typings.twilio

import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosRequestConfig
import typings.node.bufferMod.global.Buffer
import typings.twilio.libHttpRequestMod.Headers
import typings.twilio.libHttpResponseMod.default
import typings.twilio.libInterfacesMod.HttpMethod
import typings.twilio.twilioStrings.fifo
import typings.twilio.twilioStrings.lifo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseRequestClientMod {
  
  @JSImport("twilio/lib/base/RequestClient", JSImport.Namespace)
  @js.native
  /**
    * Make http request
    * @param opts - The options passed to https.Agent
    * @param opts.timeout - https.Agent timeout option. Used as the socket timeout, AND as the default request timeout.
    * @param opts.keepAlive - https.Agent keepAlive option
    * @param opts.keepAliveMsecs - https.Agent keepAliveMsecs option
    * @param opts.maxSockets - https.Agent maxSockets option
    * @param opts.maxTotalSockets - https.Agent maxTotalSockets option
    * @param opts.maxFreeSockets - https.Agent maxFreeSockets option
    * @param opts.scheduling - https.Agent scheduling option
    * @param opts.autoRetry - Enable auto-retry requests with exponential backoff on 429 responses. Defaults to false.
    * @param opts.maxRetryDelay - Max retry delay in milliseconds for 429 Too Many Request response retries. Defaults to 3000.
    * @param opts.maxRetries - Max number of request retries for 429 Too Many Request responses. Defaults to 3.
    */
  open class ^ ()
    extends StObject
       with RequestClient {
    def this(opts: RequestClientOptions) = this()
    
    /* CompleteClass */
    var autoRetry: Boolean = js.native
    
    /* CompleteClass */
    override def axios[T, R, D](config: AxiosRequestConfig[D]): js.Promise[R] = js.native
    /* CompleteClass */
    override def axios[T, R, D](url: String): js.Promise[R] = js.native
    /* CompleteClass */
    override def axios[T, R, D](url: String, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
    /* CompleteClass */
    @JSName("axios")
    var axios_Original: AxiosInstance = js.native
    
    /* CompleteClass */
    var defaultTimeout: Double = js.native
    
    /* CompleteClass */
    override def filterLoggingHeaders(headers: Headers): js.Array[String] = js.native
    
    /* private */ /* CompleteClass */
    var logRequest: Any = js.native
    
    /* CompleteClass */
    var maxRetries: Double = js.native
    
    /* CompleteClass */
    var maxRetryDelay: Double = js.native
    
    /**
      * Make http request
      * @param opts - The options argument
      * @param opts.method - The http method
      * @param opts.uri - The request uri
      * @param opts.username - The username used for auth
      * @param opts.password - The password used for auth
      * @param opts.headers - The request headers
      * @param opts.params - The request params
      * @param opts.data - The request data
      * @param opts.timeout - The request timeout in milliseconds (default 30000)
      * @param opts.allowRedirects - Should the client follow redirects
      * @param opts.forever - Set to true to use the forever-agent
      * @param opts.logLevel - Show debug logs
      */
    /* CompleteClass */
    override def request[TData](opts: RequestOptions[TData, js.Object]): js.Promise[default[TData]] = js.native
  }
  
  trait RequestClient extends StObject {
    
    var autoRetry: Boolean
    
    def axios[T, R, D](config: AxiosRequestConfig[D]): js.Promise[R]
    def axios[T, R, D](url: String): js.Promise[R]
    def axios[T, R, D](url: String, config: AxiosRequestConfig[D]): js.Promise[R]
    @JSName("axios")
    var axios_Original: AxiosInstance
    
    var defaultTimeout: Double
    
    def filterLoggingHeaders(headers: Headers): js.Array[String]
    
    var lastRequest: js.UndefOr[typings.twilio.libHttpRequestMod.default[Any]] = js.undefined
    
    var lastResponse: js.UndefOr[default[Any]] = js.undefined
    
    /* private */ var logRequest: Any
    
    var maxRetries: Double
    
    var maxRetryDelay: Double
    
    /**
      * Make http request
      * @param opts - The options argument
      * @param opts.method - The http method
      * @param opts.uri - The request uri
      * @param opts.username - The username used for auth
      * @param opts.password - The password used for auth
      * @param opts.headers - The request headers
      * @param opts.params - The request params
      * @param opts.data - The request data
      * @param opts.timeout - The request timeout in milliseconds (default 30000)
      * @param opts.allowRedirects - Should the client follow redirects
      * @param opts.forever - Set to true to use the forever-agent
      * @param opts.logLevel - Show debug logs
      */
    def request[TData](opts: RequestOptions[TData, js.Object]): js.Promise[default[TData]]
  }
  object RequestClient {
    
    inline def apply(
      autoRetry: Boolean,
      axios: AxiosInstance,
      defaultTimeout: Double,
      filterLoggingHeaders: Headers => js.Array[String],
      logRequest: Any,
      maxRetries: Double,
      maxRetryDelay: Double,
      request: RequestOptions[Any, js.Object] => js.Promise[default[Any]]
    ): RequestClient = {
      val __obj = js.Dynamic.literal(autoRetry = autoRetry.asInstanceOf[js.Any], axios = axios.asInstanceOf[js.Any], defaultTimeout = defaultTimeout.asInstanceOf[js.Any], filterLoggingHeaders = js.Any.fromFunction1(filterLoggingHeaders), logRequest = logRequest.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], maxRetryDelay = maxRetryDelay.asInstanceOf[js.Any], request = js.Any.fromFunction1(request))
      __obj.asInstanceOf[RequestClient]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestClient] (val x: Self) extends AnyVal {
      
      inline def setAutoRetry(value: Boolean): Self = StObject.set(x, "autoRetry", value.asInstanceOf[js.Any])
      
      inline def setAxios(value: AxiosInstance): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
      
      inline def setDefaultTimeout(value: Double): Self = StObject.set(x, "defaultTimeout", value.asInstanceOf[js.Any])
      
      inline def setFilterLoggingHeaders(value: Headers => js.Array[String]): Self = StObject.set(x, "filterLoggingHeaders", js.Any.fromFunction1(value))
      
      inline def setLastRequest(value: typings.twilio.libHttpRequestMod.default[Any]): Self = StObject.set(x, "lastRequest", value.asInstanceOf[js.Any])
      
      inline def setLastRequestUndefined: Self = StObject.set(x, "lastRequest", js.undefined)
      
      inline def setLastResponse(value: default[Any]): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
      
      inline def setLastResponseUndefined: Self = StObject.set(x, "lastResponse", js.undefined)
      
      inline def setLogRequest(value: Any): Self = StObject.set(x, "logRequest", value.asInstanceOf[js.Any])
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryDelay(value: Double): Self = StObject.set(x, "maxRetryDelay", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: RequestOptions[Any, js.Object] => js.Promise[default[Any]]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    }
  }
  
  trait RequestClientOptions extends StObject {
    
    /**
      * Enable auto-retry with exponential backoff when receiving 429 Errors from
      * the API. Disabled by default.
      */
    var autoRetry: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The private CA certificate bundle (if private SSL certificate)
      */
    var ca: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * https.Agent keepAlive option
      */
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * https.Agent keepAliveMSecs option
      */
    var keepAliveMsecs: js.UndefOr[Double] = js.undefined
    
    /**
      * https.Agent maxFreeSockets option
      */
    var maxFreeSockets: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum number of request retries for 429 Error responses. Defaults to 3.
      */
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum retry delay in milliseconds for 429 Error response retries.
      * Defaults to 3000.
      */
    var maxRetryDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * https.Agent maxSockets option
      */
    var maxSockets: js.UndefOr[Double] = js.undefined
    
    /**
      * https.Agent maxTotalSockets option
      */
    var maxTotalSockets: js.UndefOr[Double] = js.undefined
    
    /**
      * https.Agent scheduling option
      */
    var scheduling: js.UndefOr[fifo | lifo] = js.undefined
    
    /**
      * A timeout in milliseconds. This will be used as the HTTPS agent's socket
      * timeout, AND as the default request timeout.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object RequestClientOptions {
    
    inline def apply(): RequestClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestClientOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoRetry(value: Boolean): Self = StObject.set(x, "autoRetry", value.asInstanceOf[js.Any])
      
      inline def setAutoRetryUndefined: Self = StObject.set(x, "autoRetry", js.undefined)
      
      inline def setCa(value: String | Buffer): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMsecs(value: Double): Self = StObject.set(x, "keepAliveMsecs", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMsecsUndefined: Self = StObject.set(x, "keepAliveMsecs", js.undefined)
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setMaxFreeSockets(value: Double): Self = StObject.set(x, "maxFreeSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxFreeSocketsUndefined: Self = StObject.set(x, "maxFreeSockets", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setMaxRetryDelay(value: Double): Self = StObject.set(x, "maxRetryDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryDelayUndefined: Self = StObject.set(x, "maxRetryDelay", js.undefined)
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      inline def setMaxTotalSockets(value: Double): Self = StObject.set(x, "maxTotalSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxTotalSocketsUndefined: Self = StObject.set(x, "maxTotalSockets", js.undefined)
      
      inline def setScheduling(value: fifo | lifo): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
      
      inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait RequestOptions[TData, TParams] extends StObject {
    
    /**
      * Should the client follow redirects
      */
    var allowRedirects: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The form data that should be submitted
      */
    var data: js.UndefOr[TData] = js.undefined
    
    /**
      * Set to true to use the forever-agent
      */
    var forever: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The request headers
      */
    var headers: js.UndefOr[Headers] = js.undefined
    
    /**
      * Set to 'debug' to enable debug logging
      */
    var logLevel: js.UndefOr[String] = js.undefined
    
    /**
      * The HTTP method
      */
    var method: HttpMethod
    
    /**
      * The object of params added as query string to the request
      */
    var params: js.UndefOr[TParams] = js.undefined
    
    /**
      * The password used for auth
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * The request timeout in milliseconds
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The request URI
      */
    var uri: String
    
    /**
      * The username used for auth
      */
    var username: js.UndefOr[String] = js.undefined
  }
  object RequestOptions {
    
    inline def apply[TData, TParams](method: HttpMethod, uri: String): RequestOptions[TData, TParams] = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions[TData, TParams]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions[?, ?], TData, TParams] (val x: Self & (RequestOptions[TData, TParams])) extends AnyVal {
      
      inline def setAllowRedirects(value: Boolean): Self = StObject.set(x, "allowRedirects", value.asInstanceOf[js.Any])
      
      inline def setAllowRedirectsUndefined: Self = StObject.set(x, "allowRedirects", js.undefined)
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setForever(value: Boolean): Self = StObject.set(x, "forever", value.asInstanceOf[js.Any])
      
      inline def setForeverUndefined: Self = StObject.set(x, "forever", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: TParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
