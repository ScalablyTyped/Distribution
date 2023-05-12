package typings.urllib

import typings.undici.typesAgentMod.Agent.Options
import typings.undici.typesDispatcherMod.default
import typings.urllib.anon.FnCall
import typings.urllib.srcEsmHttpClientMod.ClientOptions
import typings.urllib.srcEsmRequestMod.RequestOptions
import typings.urllib.srcEsmRequestMod.RequestURL
import typings.urllib.srcEsmResponseMod.HttpClientResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("urllib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("urllib", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("urllib", "default.USER_AGENT")
    @js.native
    def USER_AGENT: String = js.native
    inline def USER_AGENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_AGENT")(x.asInstanceOf[js.Any])
    
    @JSImport("urllib", "default.curl")
    @js.native
    def curl: FnCall = js.native
    inline def curl[T](url: RequestURL): js.Promise[HttpClientResponse[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("curl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpClientResponse[T]]]
    inline def curl[T](url: RequestURL, options: RequestOptions): js.Promise[HttpClientResponse[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("curl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpClientResponse[T]]]
    inline def curl_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("curl")(x.asInstanceOf[js.Any])
    
    @JSImport("urllib", "default.request")
    @js.native
    def request: FnCall = js.native
    inline def request[T](url: RequestURL): js.Promise[HttpClientResponse[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpClientResponse[T]]]
    inline def request[T](url: RequestURL, options: RequestOptions): js.Promise[HttpClientResponse[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpClientResponse[T]]]
    inline def request_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("urllib", "Agent")
  @js.native
  open class Agent ()
    extends typings.undici.mod.Agent {
    def this(opts: Options) = this()
  }
  
  /** Dispatcher is the core API used to dispatch requests. */
  @JSImport("urllib", "Dispatcher")
  @js.native
  open class Dispatcher ()
    extends typings.undici.mod.Dispatcher
  
  @JSImport("urllib", "HttpClient")
  @js.native
  open class HttpClient ()
    extends typings.urllib.srcEsmHttpClientMod.HttpClient {
    def this(clientOptions: ClientOptions) = this()
  }
  
  @JSImport("urllib", "HttpClient2")
  @js.native
  open class HttpClient2 ()
    extends typings.urllib.srcEsmHttpClientMod.HttpClient {
    def this(clientOptions: ClientOptions) = this()
  }
  
  /** A mocked Agent class that implements the Agent API. It allows one to intercept HTTP requests made through undici and return mocked responses instead. */
  @JSImport("urllib", "MockAgent")
  @js.native
  open class MockAgent[TMockAgentOptions /* <: typings.undici.typesMockAgentMod.MockAgent.Options */] ()
    extends typings.undici.mod.MockAgent[TMockAgentOptions] {
    def this(options: typings.undici.typesMockAgentMod.MockAgent.Options) = this()
  }
  
  @JSImport("urllib", "ProxyAgent")
  @js.native
  open class ProxyAgent protected ()
    extends typings.undici.mod.ProxyAgent {
    def this(options: String) = this()
    def this(options: typings.undici.typesProxyAgentMod.ProxyAgent.Options) = this()
  }
  
  @JSImport("urllib", "USER_AGENT")
  @js.native
  val USER_AGENT: String = js.native
  
  inline def curl[T](url: RequestURL): js.Promise[HttpClientResponse[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("curl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpClientResponse[T]]]
  inline def curl[T](url: RequestURL, options: RequestOptions): js.Promise[HttpClientResponse[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("curl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpClientResponse[T]]]
  
  inline def getGlobalDispatcher(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalDispatcher")().asInstanceOf[default]
  
  inline def request[T](url: RequestURL): js.Promise[HttpClientResponse[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpClientResponse[T]]]
  inline def request[T](url: RequestURL, options: RequestOptions): js.Promise[HttpClientResponse[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpClientResponse[T]]]
  
  inline def setGlobalDispatcher[DispatcherImplementation /* <: default */](dispatcher: DispatcherImplementation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalDispatcher")(dispatcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
