package typings.webdriver

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.nodeColonurlMod.URL
import typings.std.Error
import typings.std.Record
import typings.wdioTypes.anon.Http
import typings.wdioTypes.buildOptionsMod.WebDriverLogTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildRequestMod {
  
  /* note: abstract class */ @JSImport("webdriver/build/request", JSImport.Default)
  @js.native
  open class default protected () extends WebDriverRequest {
    def this(method: String, endpoint: String) = this()
    def this(method: String, endpoint: String, body: Record[String, Any]) = this()
    def this(method: String, endpoint: String, body: Unit, isHubCommand: Boolean) = this()
    def this(method: String, endpoint: String, body: Record[String, Any], isHubCommand: Boolean) = this()
  }
  
  @JSImport("webdriver/build/request", "RequestLibError")
  @js.native
  open class RequestLibError ()
    extends StObject
       with Error {
    
    var body: js.UndefOr[Any] = js.native
    
    var code: js.UndefOr[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
  }
  
  type Agents = typings.wdioTypes.buildOptionsMod.Agents
  
  type RequestLibOptions = typings.wdioTypes.buildOptionsMod.RequestLibOptions
  
  type RequestLibResponse = typings.wdioTypes.buildOptionsMod.RequestLibResponse
  
  /* Inlined std.Omit<@wdio/types.@wdio/types.Options.WebDriver, 'capabilities'> */
  trait RequestOptions extends StObject {
    
    var agent: js.UndefOr[Http] = js.undefined
    
    var connectionRetryCount: js.UndefOr[Double] = js.undefined
    
    var connectionRetryTimeout: js.UndefOr[Double] = js.undefined
    
    var enableDirectConnect: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
    
    var logLevels: js.UndefOr[Record[String, WebDriverLogTypes]] = js.undefined
    
    var outputDir: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var strictSSL: js.UndefOr[Boolean] = js.undefined
    
    var transformRequest: js.UndefOr[
        js.Function1[
          /* requestOptions */ typings.wdioTypes.buildOptionsMod.RequestLibOptions, 
          typings.wdioTypes.buildOptionsMod.RequestLibOptions
        ]
      ] = js.undefined
    
    var transformResponse: js.UndefOr[
        js.Function2[
          /* response */ typings.wdioTypes.buildOptionsMod.RequestLibResponse, 
          /* requestOptions */ typings.wdioTypes.buildOptionsMod.RequestLibOptions, 
          typings.wdioTypes.buildOptionsMod.RequestLibResponse
        ]
      ] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Http): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setConnectionRetryCount(value: Double): Self = StObject.set(x, "connectionRetryCount", value.asInstanceOf[js.Any])
      
      inline def setConnectionRetryCountUndefined: Self = StObject.set(x, "connectionRetryCount", js.undefined)
      
      inline def setConnectionRetryTimeout(value: Double): Self = StObject.set(x, "connectionRetryTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionRetryTimeoutUndefined: Self = StObject.set(x, "connectionRetryTimeout", js.undefined)
      
      inline def setEnableDirectConnect(value: Boolean): Self = StObject.set(x, "enableDirectConnect", value.asInstanceOf[js.Any])
      
      inline def setEnableDirectConnectUndefined: Self = StObject.set(x, "enableDirectConnect", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLogLevel(value: WebDriverLogTypes): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogLevels(value: Record[String, WebDriverLogTypes]): Self = StObject.set(x, "logLevels", value.asInstanceOf[js.Any])
      
      inline def setLogLevelsUndefined: Self = StObject.set(x, "logLevels", js.undefined)
      
      inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      inline def setTransformRequest(
        value: /* requestOptions */ typings.wdioTypes.buildOptionsMod.RequestLibOptions => typings.wdioTypes.buildOptionsMod.RequestLibOptions
      ): Self = StObject.set(x, "transformRequest", js.Any.fromFunction1(value))
      
      inline def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
      
      inline def setTransformResponse(
        value: (/* response */ typings.wdioTypes.buildOptionsMod.RequestLibResponse, /* requestOptions */ typings.wdioTypes.buildOptionsMod.RequestLibOptions) => typings.wdioTypes.buildOptionsMod.RequestLibResponse
      ): Self = StObject.set(x, "transformResponse", js.Any.fromFunction2(value))
      
      inline def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait WebDriverRequest extends EventEmitter {
    
    /* protected */ def _createOptions(options: RequestOptions): js.Promise[RequestLibOptions] = js.native
    /* protected */ def _createOptions(options: RequestOptions, sessionId: String): js.Promise[RequestLibOptions] = js.native
    /* protected */ def _createOptions(options: RequestOptions, sessionId: String, isBrowser: Boolean): js.Promise[RequestLibOptions] = js.native
    /* protected */ def _createOptions(options: RequestOptions, sessionId: Unit, isBrowser: Boolean): js.Promise[RequestLibOptions] = js.native
    
    /* protected */ def _libPerformanceNow(): Double = js.native
    
    /* protected */ def _libRequest(url: URL, options: RequestLibOptions): js.Promise[RequestLibResponse] = js.native
    
    /* private */ var _request: Any = js.native
    
    var body: js.UndefOr[Record[String, Any]] = js.native
    
    var defaultAgents: js.UndefOr[Agents] = js.native
    
    var defaultOptions: RequestLibOptions = js.native
    
    var endpoint: String = js.native
    
    var isHubCommand: Boolean = js.native
    
    def makeRequest(options: RequestOptions): js.Promise[WebDriverResponse] = js.native
    def makeRequest(options: RequestOptions, sessionId: String): js.Promise[WebDriverResponse] = js.native
    
    var method: String = js.native
    
    var requiresSessionId: Boolean = js.native
  }
  
  trait WebDriverResponse extends StObject {
    
    /**
      * error case
      * https://w3c.github.io/webdriver/webdriver-spec.html#dfn-send-an-error
      */
    var error: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var sessionId: js.UndefOr[String] = js.undefined
    
    var stacktrace: js.UndefOr[String] = js.undefined
    
    /**
      * JSONWP property
      */
    var status: js.UndefOr[Double] = js.undefined
    
    var value: Any
  }
  object WebDriverResponse {
    
    inline def apply(value: Any): WebDriverResponse = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebDriverResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebDriverResponse] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      
      inline def setStacktrace(value: String): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
      
      inline def setStacktraceUndefined: Self = StObject.set(x, "stacktrace", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
