package typings.twilio

import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.twilio.libBaseRequestClientMod.^
import typings.twilio.libHttpRequestMod.Headers
import typings.twilio.libInterfacesMod.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseBaseTwilioMod {
  
  /**
    * Parent class for Twilio Client that implements request & validation logic
    */
  @JSImport("twilio/lib/base/BaseTwilio", "Client")
  @js.native
  /**
    * Create a BaseTwilio instance
    *
    * @param username -
    *          The username used for authentication. This is normally account sid, but if using key/secret auth will be
    *          the api key sid.
    * @param password -
    *          The password used for authentication. This is normally auth token, but if using key/secret auth will be
    *          the secret.
    * @param opts - The options argument
    *
    * @returns A new instance of BaseTwilio
    */
  open class Client () extends StObject {
    def this(username: String) = this()
    def this(username: String, password: String) = this()
    def this(username: Unit, password: String) = this()
    def this(username: String, password: String, opts: ClientOpts) = this()
    def this(username: String, password: Unit, opts: ClientOpts) = this()
    def this(username: Unit, password: String, opts: ClientOpts) = this()
    def this(username: Unit, password: Unit, opts: ClientOpts) = this()
    
    var _httpClient: js.UndefOr[^] = js.native
    
    var accountSid: String = js.native
    
    var autoRetry: Boolean = js.native
    
    var edge: js.UndefOr[String] = js.native
    
    var env: js.UndefOr[ProcessEnv] = js.native
    
    /**
      * Adds a region and/or edge to a given hostname
      *
      * @param hostname - A URI hostname (e.g. api.twilio.com)
      * @param targetEdge - The targeted edge location (e.g. sydney)
      * @param targetRegion - The targeted region location (e.g. au1)
      */
    def getHostname(hostname: String): String = js.native
    def getHostname(hostname: String, targetEdge: String): String = js.native
    def getHostname(hostname: String, targetEdge: String, targetRegion: String): String = js.native
    def getHostname(hostname: String, targetEdge: Unit, targetRegion: String): String = js.native
    
    def httpClient: ^ = js.native
    
    var logLevel: js.UndefOr[String] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var opts: js.UndefOr[ClientOpts] = js.native
    
    var password: String = js.native
    
    var region: js.UndefOr[String] = js.native
    
    /**
      * Makes a request to the Twilio API using the configured http client.
      * Authentication information is automatically added if none is provided.
      *
      * @param opts - The options argument
      */
    def request(opts: RequestOpts): js.Promise[Any] = js.native
    
    var userAgentExtensions: js.UndefOr[js.Array[String]] = js.native
    
    var username: String = js.native
    
    /**
      * Validates that a request to the new SSL certificate is successful.
      *
      * @throws RestException if the request fails
      *
      */
    def validateSslCert(): js.Promise[Any] = js.native
  }
  
  trait ClientOpts extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var autoRetry: js.UndefOr[Boolean] = js.undefined
    
    var edge: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[ProcessEnv] = js.undefined
    
    var httpClient: js.UndefOr[^] = js.undefined
    
    var lazyLoading: js.UndefOr[Boolean] = js.undefined
    
    var logLevel: js.UndefOr[String] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var userAgentExtensions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ClientOpts {
    
    inline def apply(): ClientOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientOpts] (val x: Self) extends AnyVal {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setAutoRetry(value: Boolean): Self = StObject.set(x, "autoRetry", value.asInstanceOf[js.Any])
      
      inline def setAutoRetryUndefined: Self = StObject.set(x, "autoRetry", js.undefined)
      
      inline def setEdge(value: String): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setHttpClient(value: ^): Self = StObject.set(x, "httpClient", value.asInstanceOf[js.Any])
      
      inline def setHttpClientUndefined: Self = StObject.set(x, "httpClient", js.undefined)
      
      inline def setLazyLoading(value: Boolean): Self = StObject.set(x, "lazyLoading", value.asInstanceOf[js.Any])
      
      inline def setLazyLoadingUndefined: Self = StObject.set(x, "lazyLoading", js.undefined)
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setUserAgentExtensions(value: js.Array[String]): Self = StObject.set(x, "userAgentExtensions", value.asInstanceOf[js.Any])
      
      inline def setUserAgentExtensionsUndefined: Self = StObject.set(x, "userAgentExtensions", js.undefined)
      
      inline def setUserAgentExtensionsVarargs(value: String*): Self = StObject.set(x, "userAgentExtensions", js.Array(value*))
    }
  }
  
  trait RequestOpts extends StObject {
    
    var allowRedirects: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[js.Object] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var logLevel: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[HttpMethod] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object RequestOpts {
    
    inline def apply(): RequestOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOpts] (val x: Self) extends AnyVal {
      
      inline def setAllowRedirects(value: Boolean): Self = StObject.set(x, "allowRedirects", value.asInstanceOf[js.Any])
      
      inline def setAllowRedirectsUndefined: Self = StObject.set(x, "allowRedirects", js.undefined)
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
