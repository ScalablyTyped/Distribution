package typings.urllib

import typings.node.eventsMod.EventEmitterOptions
import typings.node.httpMod.Agent
import typings.node.urlMod.URL_
import typings.urllib.mod.Callback
import typings.urllib.mod.HttpClientResponse
import typings.urllib.mod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object urllib {
    
    @JSGlobal("urllib")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("urllib.HttpClient")
    @js.native
    class HttpClient[O /* <: RequestOptions */] ()
      extends typings.urllib.mod.HttpClient[O] {
      def this(options: EventEmitterOptions) = this()
    }
    
    @JSGlobal("urllib.HttpClient2")
    @js.native
    class HttpClient2 ()
      extends typings.urllib.mod.HttpClient2 {
      def this(options: EventEmitterOptions) = this()
    }
    
    @JSGlobal("urllib.TIMEOUT")
    @js.native
    val TIMEOUT: Double = js.native
    
    @JSGlobal("urllib.TIMEOUTS")
    @js.native
    val TIMEOUTS: js.Tuple2[Double, Double] = js.native
    
    @JSGlobal("urllib.USER_AGENT")
    @js.native
    val USER_AGENT: String = js.native
    
    @JSGlobal("urllib.agent")
    @js.native
    val agent: Agent = js.native
    
    inline def create(): typings.urllib.mod.HttpClient[RequestOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.urllib.mod.HttpClient[RequestOptions]]
    inline def create(options: RequestOptions): typings.urllib.mod.HttpClient[RequestOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.urllib.mod.HttpClient[RequestOptions]]
    
    inline def curl[T](url: String): js.Promise[HttpClientResponse[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("curl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpClientResponse[T]]]
    inline def curl[T](url: String, callback: Callback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("curl")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def curl[T](url: String, options: RequestOptions): js.Promise[HttpClientResponse[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("curl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpClientResponse[T]]]
    inline def curl[T](url: String, options: RequestOptions, callback: Callback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("curl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def curl[T](url: URL_): js.Promise[HttpClientResponse[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("curl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpClientResponse[T]]]
    inline def curl[T](url: URL_, callback: Callback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("curl")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def curl[T](url: URL_, options: RequestOptions): js.Promise[HttpClientResponse[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("curl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpClientResponse[T]]]
    inline def curl[T](url: URL_, options: RequestOptions, callback: Callback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("curl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("urllib.httpsAgent")
    @js.native
    val httpsAgent: typings.node.httpsMod.Agent = js.native
    
    inline def request[T](url: String): js.Promise[HttpClientResponse[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpClientResponse[T]]]
    inline def request[T](url: String, callback: Callback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request[T](url: String, options: RequestOptions): js.Promise[HttpClientResponse[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpClientResponse[T]]]
    inline def request[T](url: String, options: RequestOptions, callback: Callback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request[T](url: URL_): js.Promise[HttpClientResponse[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpClientResponse[T]]]
    inline def request[T](url: URL_, callback: Callback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request[T](url: URL_, options: RequestOptions): js.Promise[HttpClientResponse[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpClientResponse[T]]]
    inline def request[T](url: URL_, options: RequestOptions, callback: Callback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def requestThunk[T](url: String): js.Function1[/* callback */ Callback[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestThunk")(url.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* callback */ Callback[T], Unit]]
    inline def requestThunk[T](url: String, options: RequestOptions): js.Function1[/* callback */ Callback[T], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestThunk")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* callback */ Callback[T], Unit]]
    inline def requestThunk[T](url: URL_): js.Function1[/* callback */ Callback[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestThunk")(url.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* callback */ Callback[T], Unit]]
    inline def requestThunk[T](url: URL_, options: RequestOptions): js.Function1[/* callback */ Callback[T], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestThunk")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* callback */ Callback[T], Unit]]
    
    inline def requestWithCallback[T](url: String, callback: Callback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestWithCallback")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def requestWithCallback[T](url: String, options: RequestOptions, callback: Callback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestWithCallback")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def requestWithCallback[T](url: URL_, callback: Callback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestWithCallback")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def requestWithCallback[T](url: URL_, options: RequestOptions, callback: Callback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestWithCallback")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
