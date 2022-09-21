package typings.webpackDevServer.mod

import typings.bonjourService.mod.Service
import typings.connectHistoryApiFallback.mod.Options
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.qs.mod.ParsedQs
import typings.std.Record
import typings.webpackDevServer.webpackDevServerStrings.only
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  var allowedHosts: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var bonjour: js.UndefOr[Boolean | (Record[String, scala.Nothing]) | Service] = js.undefined
  
  var client: js.UndefOr[Boolean | ClientConfiguration] = js.undefined
  
  var compress: js.UndefOr[Boolean] = js.undefined
  
  var devMiddleware: js.UndefOr[
    DevMiddlewareOptions[
      Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_express-serve-static-core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        ParsedQs, 
        Record[String, Any]
      ], 
      Response_[Any, Record[String, Any]]
    ]
  ] = js.undefined
  
  var headers: js.UndefOr[
    typings.std.Headers | (js.Function3[
      /* req */ typings.std.Request, 
      /* res */ typings.std.Response, 
      /* context */ DevMiddlewareContext[typings.std.Request, typings.std.Response], 
      typings.std.Headers
    ])
  ] = js.undefined
  
  var historyApiFallback: js.UndefOr[Boolean | Options] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var hot: js.UndefOr[Boolean | only] = js.undefined
  
  var http2: js.UndefOr[Boolean] = js.undefined
  
  var https: js.UndefOr[Boolean | ServerOptions] = js.undefined
  
  var ipc: js.UndefOr[String | Boolean] = js.undefined
  
  var liveReload: js.UndefOr[Boolean] = js.undefined
  
  var magicHtml: js.UndefOr[Boolean] = js.undefined
  
  var onAfterSetupMiddleware: js.UndefOr[js.Function1[/* devServer */ Server, Unit]] = js.undefined
  
  var onBeforeSetupMiddleware: js.UndefOr[js.Function1[/* devServer */ Server, Unit]] = js.undefined
  
  var onListening: js.UndefOr[js.Function1[/* devServer */ Server, Unit]] = js.undefined
  
  var open: js.UndefOr[String | Boolean | Open | (js.Array[String | Open])] = js.undefined
  
  var port: js.UndefOr[Port] = js.undefined
  
  var proxy: js.UndefOr[ProxyConfigArrayItem | ProxyConfigMap | ProxyConfigArray] = js.undefined
  
  var server: js.UndefOr[String | ServerConfiguration] = js.undefined
  
  var setupExitSignals: js.UndefOr[Boolean] = js.undefined
  
  var setupMiddlewares: js.UndefOr[
    js.Function2[/* middlewares */ js.Array[Middleware], /* devServer */ Server, js.Array[Middleware]]
  ] = js.undefined
  
  var static: js.UndefOr[String | Boolean | Static | (js.Array[String | Static])] = js.undefined
  
  var watchFiles: js.UndefOr[String | (js.Array[String | WatchFiles]) | WatchFiles] = js.undefined
  
  var webSocketServer: js.UndefOr[String | Boolean | WebSocketServerConfiguration] = js.undefined
}
object Configuration {
  
  inline def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setAllowedHosts(value: String | js.Array[String]): Self = StObject.set(x, "allowedHosts", value.asInstanceOf[js.Any])
    
    inline def setAllowedHostsUndefined: Self = StObject.set(x, "allowedHosts", js.undefined)
    
    inline def setAllowedHostsVarargs(value: String*): Self = StObject.set(x, "allowedHosts", js.Array(value*))
    
    inline def setBonjour(value: Boolean | (Record[String, scala.Nothing]) | Service): Self = StObject.set(x, "bonjour", value.asInstanceOf[js.Any])
    
    inline def setBonjourUndefined: Self = StObject.set(x, "bonjour", js.undefined)
    
    inline def setClient(value: Boolean | ClientConfiguration): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setDevMiddleware(
      value: DevMiddlewareOptions[
          Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_express-serve-static-core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            ParsedQs, 
            Record[String, Any]
          ], 
          Response_[Any, Record[String, Any]]
        ]
    ): Self = StObject.set(x, "devMiddleware", value.asInstanceOf[js.Any])
    
    inline def setDevMiddlewareUndefined: Self = StObject.set(x, "devMiddleware", js.undefined)
    
    inline def setHeaders(
      value: typings.std.Headers | (js.Function3[
          /* req */ typings.std.Request, 
          /* res */ typings.std.Response, 
          /* context */ DevMiddlewareContext[typings.std.Request, typings.std.Response], 
          typings.std.Headers
        ])
    ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersFunction3(
      value: (/* req */ typings.std.Request, /* res */ typings.std.Response, /* context */ DevMiddlewareContext[typings.std.Request, typings.std.Response]) => typings.std.Headers
    ): Self = StObject.set(x, "headers", js.Any.fromFunction3(value))
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHistoryApiFallback(value: Boolean | Options): Self = StObject.set(x, "historyApiFallback", value.asInstanceOf[js.Any])
    
    inline def setHistoryApiFallbackUndefined: Self = StObject.set(x, "historyApiFallback", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHot(value: Boolean | only): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
    
    inline def setHotUndefined: Self = StObject.set(x, "hot", js.undefined)
    
    inline def setHttp2(value: Boolean): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    inline def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
    
    inline def setHttps(value: Boolean | ServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setIpc(value: String | Boolean): Self = StObject.set(x, "ipc", value.asInstanceOf[js.Any])
    
    inline def setIpcUndefined: Self = StObject.set(x, "ipc", js.undefined)
    
    inline def setLiveReload(value: Boolean): Self = StObject.set(x, "liveReload", value.asInstanceOf[js.Any])
    
    inline def setLiveReloadUndefined: Self = StObject.set(x, "liveReload", js.undefined)
    
    inline def setMagicHtml(value: Boolean): Self = StObject.set(x, "magicHtml", value.asInstanceOf[js.Any])
    
    inline def setMagicHtmlUndefined: Self = StObject.set(x, "magicHtml", js.undefined)
    
    inline def setOnAfterSetupMiddleware(value: /* devServer */ Server => Unit): Self = StObject.set(x, "onAfterSetupMiddleware", js.Any.fromFunction1(value))
    
    inline def setOnAfterSetupMiddlewareUndefined: Self = StObject.set(x, "onAfterSetupMiddleware", js.undefined)
    
    inline def setOnBeforeSetupMiddleware(value: /* devServer */ Server => Unit): Self = StObject.set(x, "onBeforeSetupMiddleware", js.Any.fromFunction1(value))
    
    inline def setOnBeforeSetupMiddlewareUndefined: Self = StObject.set(x, "onBeforeSetupMiddleware", js.undefined)
    
    inline def setOnListening(value: /* devServer */ Server => Unit): Self = StObject.set(x, "onListening", js.Any.fromFunction1(value))
    
    inline def setOnListeningUndefined: Self = StObject.set(x, "onListening", js.undefined)
    
    inline def setOpen(value: String | Boolean | Open | (js.Array[String | Open])): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOpenVarargs(value: (String | Open)*): Self = StObject.set(x, "open", js.Array(value*))
    
    inline def setPort(value: Port): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProxy(value: ProxyConfigArrayItem | ProxyConfigMap | ProxyConfigArray): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setProxyVarargs(
      value: (ProxyConfigArrayItem | (js.Function3[
          /* req */ js.UndefOr[typings.std.Request], 
          /* res */ js.UndefOr[typings.std.Response], 
          /* next */ js.UndefOr[NextFunction], 
          ProxyConfigArrayItem
        ]))*
    ): Self = StObject.set(x, "proxy", js.Array(value*))
    
    inline def setServer(value: String | ServerConfiguration): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setSetupExitSignals(value: Boolean): Self = StObject.set(x, "setupExitSignals", value.asInstanceOf[js.Any])
    
    inline def setSetupExitSignalsUndefined: Self = StObject.set(x, "setupExitSignals", js.undefined)
    
    inline def setSetupMiddlewares(value: (/* middlewares */ js.Array[Middleware], /* devServer */ Server) => js.Array[Middleware]): Self = StObject.set(x, "setupMiddlewares", js.Any.fromFunction2(value))
    
    inline def setSetupMiddlewaresUndefined: Self = StObject.set(x, "setupMiddlewares", js.undefined)
    
    inline def setStatic(value: String | Boolean | Static | (js.Array[String | Static])): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    inline def setStaticVarargs(value: (String | Static)*): Self = StObject.set(x, "static", js.Array(value*))
    
    inline def setWatchFiles(value: String | (js.Array[String | WatchFiles]) | WatchFiles): Self = StObject.set(x, "watchFiles", value.asInstanceOf[js.Any])
    
    inline def setWatchFilesUndefined: Self = StObject.set(x, "watchFiles", js.undefined)
    
    inline def setWatchFilesVarargs(value: (String | WatchFiles)*): Self = StObject.set(x, "watchFiles", js.Array(value*))
    
    inline def setWebSocketServer(value: String | Boolean | WebSocketServerConfiguration): Self = StObject.set(x, "webSocketServer", value.asInstanceOf[js.Any])
    
    inline def setWebSocketServerUndefined: Self = StObject.set(x, "webSocketServer", js.undefined)
  }
}
