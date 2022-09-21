package typings.webpackHotClient

import typings.node.netMod.Server
import typings.webpack.mod.Compiler
import typings.webpack.mod.MultiCompiler
import typings.webpack.mod.Stats
import typings.webpackHotClient.anon.ReadonlyOptions
import typings.webpackHotClient.webpackHotClientStrings.debug
import typings.webpackHotClient.webpackHotClientStrings.error
import typings.webpackHotClient.webpackHotClientStrings.info
import typings.webpackHotClient.webpackHotClientStrings.silent
import typings.webpackHotClient.webpackHotClientStrings.trace
import typings.webpackHotClient.webpackHotClientStrings.warn
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(compiler: Compiler, options: Options): Client = (^.asInstanceOf[js.Dynamic].apply(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Client]
  inline def apply(compiler: MultiCompiler, options: Options): Client = (^.asInstanceOf[js.Dynamic].apply(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Client]
  
  @JSImport("webpack-hot-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Client extends StObject {
    
    /** Function that closes the WebSocketServer opened by the module. */
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    /** Readonly version of the options after applying defaults */
    var options: ReadonlyOptions = js.native
    
    /** WebSocketServer instance with some hot-client specific method overrides */
    var server: WebSocketServer = js.native
  }
  
  trait Options extends StObject {
    
    /** Automatically configure every entry */
    var allEntries: js.UndefOr[Boolean] = js.undefined
    
    /** Auto configure the given webpack config with the hot configuration */
    var autoConfigure: js.UndefOr[Boolean] = js.undefined
    
    /** Enable hot module reloading */
    var hmr: js.UndefOr[Boolean] = js.undefined
    
    /** Host that the WebSocket listens on */
    var host: js.UndefOr[WebpackHotHost | String] = js.undefined
    
    /** Enable HTTPS */
    var https: js.UndefOr[Boolean] = js.undefined
    
    /** Level of information for webpack-hot-client to output */
    var logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.undefined
    
    /** Prepend timestamp to each log line */
    var logTime: js.UndefOr[Boolean] = js.undefined
    
    /** Port that the WebSocket listens on */
    var port: js.UndefOr[Double] = js.undefined
    
    /** Reload the page if a patch cannot be applied by webpack */
    var reload: js.UndefOr[Boolean] = js.undefined
    
    /** Server instance for webpack-hot-client to connect to */
    var server: js.UndefOr[Server] = js.undefined
    
    /** Webpack stats configuration */
    var stats: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ Any
      ] = js.undefined
    
    /** Webpack compile target */
    var validTargets: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllEntries(value: Boolean): Self = StObject.set(x, "allEntries", value.asInstanceOf[js.Any])
      
      inline def setAllEntriesUndefined: Self = StObject.set(x, "allEntries", js.undefined)
      
      inline def setAutoConfigure(value: Boolean): Self = StObject.set(x, "autoConfigure", value.asInstanceOf[js.Any])
      
      inline def setAutoConfigureUndefined: Self = StObject.set(x, "autoConfigure", js.undefined)
      
      inline def setHmr(value: Boolean): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
      
      inline def setHmrUndefined: Self = StObject.set(x, "hmr", js.undefined)
      
      inline def setHost(value: WebpackHotHost | String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      inline def setLogLevel(value: trace | debug | info | warn | error | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogTime(value: Boolean): Self = StObject.set(x, "logTime", value.asInstanceOf[js.Any])
      
      inline def setLogTimeUndefined: Self = StObject.set(x, "logTime", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      inline def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setStats(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ Any
      ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setValidTargets(value: js.Array[String]): Self = StObject.set(x, "validTargets", value.asInstanceOf[js.Any])
      
      inline def setValidTargetsUndefined: Self = StObject.set(x, "validTargets", js.undefined)
      
      inline def setValidTargetsVarargs(value: String*): Self = StObject.set(x, "validTargets", js.Array(value*))
    }
  }
  
  @js.native
  trait WebSocketServer
    extends typings.ws.mod.Server[WebSocket] {
    
    /** Forwards a message to each open client on the WebSocketServer */
    def broadcast(data: Any): Unit = js.native
    
    /** Processes stats and sends messages through broadcast() */
    def send(stats: Stats): Unit = js.native
  }
  
  trait WebpackHotHost extends StObject {
    
    /** Client hostname that is used in the browser by WebSockets */
    var client: String
    
    /** Server hostname */
    var server: String
  }
  object WebpackHotHost {
    
    inline def apply(client: String, server: String): WebpackHotHost = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackHotHost]
    }
    
    extension [Self <: WebpackHotHost](x: Self) {
      
      inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
