package typings.urllibNext

import typings.undici.typesAgentMod.Options
import typings.urllibNext.srcEsmHttpClientMod.ClientOptions
import typings.urllibNext.srcEsmRequestMod.RequestOptions
import typings.urllibNext.srcEsmRequestMod.RequestURL
import typings.urllibNext.srcEsmResponseMod.HttpClientResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("urllib-next", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("urllib-next", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("urllib-next", "default.USER_AGENT")
    @js.native
    def USER_AGENT: String = js.native
    inline def USER_AGENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_AGENT")(x.asInstanceOf[js.Any])
    
    @JSImport("urllib-next", "default.request")
    @js.native
    def request: js.Function2[
        /* url */ RequestURL, 
        /* options */ js.UndefOr[RequestOptions], 
        js.Promise[HttpClientResponse]
      ] = js.native
    inline def request(url: RequestURL): js.Promise[HttpClientResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpClientResponse]]
    inline def request(url: RequestURL, options: RequestOptions): js.Promise[HttpClientResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpClientResponse]]
    inline def request_=(
      x: js.Function2[
          /* url */ RequestURL, 
          /* options */ js.UndefOr[RequestOptions], 
          js.Promise[HttpClientResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("urllib-next", "Agent")
  @js.native
  open class Agent ()
    extends typings.undici.mod.Agent {
    def this(opts: Options) = this()
  }
  
  /** Dispatcher is the core API used to dispatch requests. */
  @JSImport("urllib-next", "Dispatcher")
  @js.native
  open class Dispatcher ()
    extends typings.undici.mod.Dispatcher
  
  @JSImport("urllib-next", "HttpClient")
  @js.native
  open class HttpClient ()
    extends typings.urllibNext.srcEsmHttpClientMod.HttpClient {
    def this(clientOptions: ClientOptions) = this()
  }
  
  /** A mocked Agent class that implements the Agent API. It allows one to intercept HTTP requests made through undici and return mocked responses instead. */
  @JSImport("urllib-next", "MockAgent")
  @js.native
  open class MockAgent[TMockAgentOptions /* <: typings.undici.typesMockAgentMod.Options */] ()
    extends typings.undici.mod.MockAgent[TMockAgentOptions] {
    def this(options: typings.undici.typesMockAgentMod.Options) = this()
  }
  
  @JSImport("urllib-next", "ProxyAgent")
  @js.native
  open class ProxyAgent protected ()
    extends typings.undici.mod.ProxyAgent {
    def this(options: String) = this()
    def this(options: typings.undici.typesProxyAgentMod.Options) = this()
  }
  
  @JSImport("urllib-next", "USER_AGENT")
  @js.native
  val USER_AGENT: String = js.native
  
  inline def getGlobalDispatcher(): typings.undici.typesDispatcherMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalDispatcher")().asInstanceOf[typings.undici.typesDispatcherMod.^]
  
  inline def request(url: RequestURL): js.Promise[HttpClientResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpClientResponse]]
  inline def request(url: RequestURL, options: RequestOptions): js.Promise[HttpClientResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpClientResponse]]
  
  inline def setGlobalDispatcher[DispatcherImplementation /* <: typings.undici.typesDispatcherMod.^ */](dispatcher: DispatcherImplementation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalDispatcher")(dispatcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
