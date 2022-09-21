package typings.webpackDevServer.mod

import org.scalablytyped.runtime.Instantiable1
import typings.express.mod.Application_
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.node.httpMod.ServerResponse
import typings.qs.mod.ParsedQs
import typings.std.Record
import typings.std.ReturnType
import typings.webpackDevMiddleware.mod.API
import typings.webpackDevMiddleware.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server extends StObject {
  
  /**
    * @private
    * @param {Compiler} compiler
    */
  /* private */ var addAdditionalEntries: Any = js.native
  
  /** @type {import("express").Application | undefined}*/
  var app: js.UndefOr[Application_] = js.native
  
  /**
    * @private
    * @type {Bonjour | undefined}
    */
  /* private */ var bonjour: Any = js.native
  
  /**
    * @private
    * @param {{ [key: string]: string | undefined }} headers
    * @param {string} headerToCheck
    * @returns {boolean}
    */
  /* private */ var checkHeader: Any = js.native
  
  /**
    * @param {(err?: Error) => void} [callback]
    * @returns {void}
    */
  def close(): Unit = js.native
  def close(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  var compiler: Compiler | MultiCompiler = js.native
  
  /**
    * @private
    * @returns {void}
    */
  /* private */ var createServer: Any = js.native
  
  /**
    * @private
    * @returns {void}
    */
  /* private */ var createWebSocketServer: Any = js.native
  
  /**
    * @private
    * @type {string | undefined}
    */
  /* private */ var currentHash: Any = js.native
  
  /**
    * @private
    * @returns {string}
    */
  /* private */ var getClientTransport: Any = js.native
  
  /**
    * @private
    * @returns {Compiler["options"]}
    */
  /* private */ var getCompilerOptions: Any = js.native
  
  /**
    * @private
    * @returns {string}
    */
  /* private */ var getServerTransport: Any = js.native
  
  /**
    * @private
    * @param {Stats | MultiStats} statsObj
    * @returns {StatsCompilation}
    */
  /* private */ var getStats: Any = js.native
  
  /**
    * @private
    * @returns {Promise<void>}
    */
  /* private */ var initialize: Any = js.native
  
  /**
    * @param {import("webpack-dev-middleware").Callback} [callback]
    */
  def invalidate(): Unit = js.native
  def invalidate(callback: Callback): Unit = js.native
  
  /**
    * @param {Port} port
    * @param {Host} hostname
    * @param {(err?: Error) => void} fn
    * @returns {void}
    */
  def listen(port: Port, hostname: Host, fn: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  /**
    * @private
    * @type {{ name: string | symbol, listener: (...args: any[]) => void}[] }}
    */
  /* private */ var listeners: Any = js.native
  
  /**
    * @private
    * @returns {void}
    */
  /* private */ var logStatus: Any = js.native
  
  /**
    * @type {ReturnType<Compiler["getInfrastructureLogger"]>}
    * */
  var logger: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: webpack-dev-server.webpack-dev-server.Compiler['getInfrastructureLogger'] */ js.Any
  ] = js.native
  
  var middleware: js.UndefOr[
    (API[
      Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_express-serve-static-core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        ParsedQs, 
        Record[String, Any]
      ], 
      Response_[Any, Record[String, Any]]
    ]) | Null
  ] = js.native
  
  /**
    * @private
    * @returns {Promise<void>}
    */
  /* private */ var normalizeOptions: Any = js.native
  
  /**
    * @private
    * @param {string} defaultOpenTarget
    * @returns {void}
    */
  /* private */ var openBrowser: Any = js.native
  
  var options: Configuration = js.native
  
  /**
    * @private
    * @returns {void}
    */
  /* private */ var runBonjour: Any = js.native
  
  /**
    * @param {ClientConnection[]} clients
    * @param {string} type
    * @param {any} [data]
    * @param {any} [params]
    */
  def sendMessage(clients: js.Array[ClientConnection], `type`: String): Unit = js.native
  def sendMessage(clients: js.Array[ClientConnection], `type`: String, data: Any): Unit = js.native
  def sendMessage(clients: js.Array[ClientConnection], `type`: String, data: Any, params: Any): Unit = js.native
  def sendMessage(clients: js.Array[ClientConnection], `type`: String, data: Unit, params: Any): Unit = js.native
  
  /**
    * @private
    * @param {ClientConnection[]} clients
    * @param {StatsCompilation} stats
    * @param {boolean} [force]
    */
  /* private */ var sendStats: Any = js.native
  
  /**
    * @private
    * @param {Request} req
    * @param {Response} res
    * @param {NextFunction} next
    * @returns {void}
    */
  /* private */ var serveMagicHtml: Any = js.native
  
  /** @type {import("http").Server | undefined | null} */
  var server: js.UndefOr[
    (typings.node.httpMod.Server[
      Instantiable1[/* socket */ typings.node.nodeNetMod.Socket, typings.node.httpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typings.node.httpMod.IncomingMessage]
      ]
    ]) | Null
  ] = js.native
  
  /**
    * @private
    * @param {Request} req
    * @param {Response} res
    * @param {NextFunction} next
    */
  /* private */ var setHeaders: Any = js.native
  
  /**
    * @private
    * @returns {void}
    */
  /* private */ var setupApp: Any = js.native
  
  /**
    * @private
    * @returns {void}
    */
  /* private */ var setupBuiltInRoutes: Any = js.native
  
  /**
    * @private
    * @returns {void}
    */
  /* private */ var setupDevMiddleware: Any = js.native
  
  /**
    * @private
    * @returns {void}
    */
  /* private */ var setupHooks: Any = js.native
  
  /**
    * @private
    * @returns {void}
    */
  /* private */ var setupHostHeaderCheck: Any = js.native
  
  /**
    * @private
    * @returns {void}
    */
  /* private */ var setupMiddlewares: Any = js.native
  
  /**
    * @private
    * @returns {void}
    */
  /* private */ var setupProgressPlugin: Any = js.native
  
  /**
    * @private
    * @returns {void}
    */
  /* private */ var setupWatchFiles: Any = js.native
  
  /**
    * @private
    * @returns {void}
    */
  /* private */ var setupWatchStaticFiles: Any = js.native
  
  /**
    * @type {Socket[]}
    */
  var sockets: js.Array[Socket] = js.native
  
  /**
    * @returns {Promise<void>}
    */
  def start(): js.Promise[Unit] = js.native
  
  /**
    * @param {(err?: Error) => void} [callback]
    */
  def startCallback(): Unit = js.native
  def startCallback(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  /**
    * @type {FSWatcher[]}
    */
  var staticWatchers: js.Array[FSWatcher] = js.native
  
  /**
    * @private
    * @type {Stats | MultiStats}
    */
  /* private */ var stats: Any = js.native
  
  /**
    * @returns {Promise<void>}
    */
  def stop(): js.Promise[Unit] = js.native
  
  /**
    * @private
    * @returns {void}
    */
  /* private */ var stopBonjour: Any = js.native
  
  /**
    * @param {(err?: Error) => void} [callback]
    */
  def stopCallback(): Unit = js.native
  def stopCallback(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  /**
    * @param {string | string[]} watchPath
    * @param {WatchOptions} [watchOptions]
    */
  def watchFiles(watchPath: String): Unit = js.native
  def watchFiles(watchPath: String, watchOptions: typings.chokidar.mod.WatchOptions): Unit = js.native
  def watchFiles(watchPath: js.Array[String]): Unit = js.native
  def watchFiles(watchPath: js.Array[String], watchOptions: typings.chokidar.mod.WatchOptions): Unit = js.native
  
  /**
    * @private
    * @type {RequestHandler[]}
    */
  /* private */ var webSocketProxies: Any = js.native
  
  /** @type {WebSocketServerImplementation | undefined | null} */
  var webSocketServer: js.UndefOr[WebSocketServerImplementation | Null] = js.native
}
