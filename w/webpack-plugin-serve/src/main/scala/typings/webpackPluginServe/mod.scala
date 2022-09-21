package typings.webpackPluginServe

import org.scalablytyped.runtime.Instantiable1
import typings.connectHistoryApiFallback.mod.Options
import typings.httpProxyMiddleware.typesMod.RequestHandler
import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.^
import typings.koaCompress.mod.CompressOptions
import typings.node.http2Mod.SecureServerOptions
import typings.node.http2Mod.ServerOptions
import typings.node.nodeHttpMod.IncomingMessage
import typings.node.nodeHttpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import typings.webpackPluginServe.anon.Address
import typings.webpackPluginServe.anon.App
import typings.webpackPluginServe.anon.Apply
import typings.webpackPluginServe.anon.Level
import typings.webpackPluginServe.webpackPluginServeStrings.`refresh-on-failure`
import typings.webpackPluginServe.webpackPluginServeStrings.minimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-plugin-serve", "WebpackPluginServe")
  @js.native
  open class WebpackPluginServe[Compiler] () extends StObject {
    def this(opts: WebpackPluginServeOptions) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    def attach(): Apply[Compiler] = js.native
    
    def hook(compiler: Compiler): Unit = js.native
  }
  
  @js.native
  trait Builtins extends StObject {
    
    def compress(opts: CompressOptions): Unit = js.native
    
    def four0four(): Unit = js.native
    def four0four(fn: js.Function1[/* ctx */ Context, Unit]): Unit = js.native
    
    def historyFallback(opts: Options): Unit = js.native
    
    def proxy(args: typings.httpProxyMiddleware.typesMod.Options): RequestHandler = js.native
    
    def static(paths: js.Array[String]): Unit = js.native
    def static(paths: js.Array[String], opts: typings.koaStatic.mod.Options): Unit = js.native
    
    def websocket(): Unit = js.native
  }
  
  trait StaticObject extends StObject {
    
    var glob: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var options: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobbyOptions */ Any
      ] = js.undefined
  }
  object StaticObject {
    
    inline def apply(): StaticObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticObject]
    }
    
    extension [Self <: StaticObject](x: Self) {
      
      inline def setGlob(value: String | js.Array[String]): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      inline def setGlobVarargs(value: String*): Self = StObject.set(x, "glob", js.Array(value*))
      
      inline def setOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobbyOptions */ Any
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait WebpackPluginServeOptions extends StObject {
    
    var client: js.UndefOr[Address] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var historyFallback: js.UndefOr[Boolean | Options] = js.undefined
    
    var hmr: js.UndefOr[Boolean | `refresh-on-failure`] = js.undefined
    
    var host: js.UndefOr[String | js.Promise[String]] = js.undefined
    
    var http2: js.UndefOr[Boolean | ServerOptions | SecureServerOptions] = js.undefined
    
    var https: js.UndefOr[
        typings.node.httpsMod.ServerOptions[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ]
      ] = js.undefined
    
    var liveReload: js.UndefOr[Boolean] = js.undefined
    
    var log: js.UndefOr[Level] = js.undefined
    
    var middleware: js.UndefOr[
        js.Function2[/* app */ ^[DefaultState, DefaultContext], /* builtins */ Builtins, Unit]
      ] = js.undefined
    
    var open: js.UndefOr[Boolean | App] = js.undefined
    
    var port: js.UndefOr[Double | js.Promise[Double]] = js.undefined
    
    var progress: js.UndefOr[Boolean | minimal] = js.undefined
    
    var static: js.UndefOr[String | js.Array[String] | StaticObject] = js.undefined
    
    var status: js.UndefOr[Boolean] = js.undefined
    
    var waitForBuild: js.UndefOr[Boolean] = js.undefined
  }
  object WebpackPluginServeOptions {
    
    inline def apply(): WebpackPluginServeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebpackPluginServeOptions]
    }
    
    extension [Self <: WebpackPluginServeOptions](x: Self) {
      
      inline def setClient(value: Address): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setHistoryFallback(value: Boolean | Options): Self = StObject.set(x, "historyFallback", value.asInstanceOf[js.Any])
      
      inline def setHistoryFallbackUndefined: Self = StObject.set(x, "historyFallback", js.undefined)
      
      inline def setHmr(value: Boolean | `refresh-on-failure`): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
      
      inline def setHmrUndefined: Self = StObject.set(x, "hmr", js.undefined)
      
      inline def setHost(value: String | js.Promise[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHttp2(value: Boolean | ServerOptions | SecureServerOptions): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
      
      inline def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
      
      inline def setHttps(
        value: typings.node.httpsMod.ServerOptions[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[typings.node.httpMod.IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      inline def setLiveReload(value: Boolean): Self = StObject.set(x, "liveReload", value.asInstanceOf[js.Any])
      
      inline def setLiveReloadUndefined: Self = StObject.set(x, "liveReload", js.undefined)
      
      inline def setLog(value: Level): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMiddleware(value: (/* app */ ^[DefaultState, DefaultContext], /* builtins */ Builtins) => Unit): Self = StObject.set(x, "middleware", js.Any.fromFunction2(value))
      
      inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
      
      inline def setOpen(value: Boolean | App): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPort(value: Double | js.Promise[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProgress(value: Boolean | minimal): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setStatic(value: String | js.Array[String] | StaticObject): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      inline def setStaticVarargs(value: String*): Self = StObject.set(x, "static", js.Array(value*))
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setWaitForBuild(value: Boolean): Self = StObject.set(x, "waitForBuild", value.asInstanceOf[js.Any])
      
      inline def setWaitForBuildUndefined: Self = StObject.set(x, "waitForBuild", js.undefined)
    }
  }
}
