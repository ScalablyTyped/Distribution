package typings.webpackDevServer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.bonjourService.mod.Service
import typings.connectHistoryApiFallback.mod.Options
import typings.express.mod.ErrorRequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.httpProxyMiddleware.distTypesMod.Filter
import typings.node.httpMod.ServerResponse
import typings.std.Record
import typings.webpackDevMiddleware.mod.Context
import typings.webpackDevServer.anon.ConnectionsendWebSocketse
import typings.webpackDevServer.anon.IsAlive
import typings.webpackDevServer.anon.Key
import typings.webpackDevServer.anon.ServercloseWebSocketServe
import typings.webpackDevServer.webpackDevServerStrings.auto
import typings.webpackDevServer.webpackDevServerStrings.v4
import typings.webpackDevServer.webpackDevServerStrings.v6
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * @returns {string}
  */
/* static member */
inline def findCacheDir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("findCacheDir")().asInstanceOf[String]

/**
  * @param {string} gateway
  * @returns {string | undefined}
  */
/* static member */
inline def findIp(gateway: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIp")(gateway.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]

/**
  * @param {Port} port
  * @param {string} host
  * @returns {Promise<number | string>}
  */
/* static member */
inline def getFreePort(port: Port, host: String): js.Promise[Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFreePort")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double | String]]

/**
  * @param {Host} hostname
  * @returns {Promise<string>}
  */
/* static member */
inline def getHostname(hostname: Host): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostname")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]

/**
  * @param {"v4" | "v6"} family
  * @returns {Promise<string | undefined>}
  */
/* static member */
inline def internalIP(family: v4 | v6): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("internalIP")(family.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]

/**
  * @param {"v4" | "v6"} family
  * @returns {string | undefined}
  */
/* static member */
inline def internalIPSync(family: v4 | v6): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("internalIPSync")(family.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]

/**
  * @param {string} URL
  * @returns {boolean}
  */
/* static member */
inline def isAbsoluteURL(URL: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsoluteURL")(URL.asInstanceOf[js.Any]).asInstanceOf[Boolean]

type Bonjour = typings.bonjourService.mod.Bonjour

type BonjourOptions = Service

type ByPass = js.Function3[
/* req */ typings.std.Request, 
/* res */ typings.std.Response, 
/* proxyConfig */ ProxyConfigArrayItem, 
Any]

type ClientConnection = (WebSocket & IsAlive) | ConnectionsendWebSocketse

type Compiler = typings.webpack.mod.Compiler

type ConnectHistoryApiFallbackOptions = Options

type DevMiddlewareContext[Request_1, Response_1] = Context[typings.std.Request, typings.std.Response]

type DevMiddlewareOptions[Request_1, Response_1] = typings.webpackDevMiddleware.mod.Options[typings.std.Request, typings.std.Response]

// DO NOT REMOVE THIS!
type DevServerConfiguration = Configuration

type ExpressErrorRequestHandler = ErrorRequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]

type ExpressRequestHandler = typings.express.mod.RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]

type FSWatcher = typings.chokidar.mod.FSWatcher

type Headers = js.Array[Key] | (Record[String, String | js.Array[String]])

/* Rewritten from type alias, can be one of: 
  - typings.webpackDevServer.webpackDevServerStrings.`local-ip`
  - typings.webpackDevServer.webpackDevServerStrings.`local-ipv4`
  - typings.webpackDevServer.webpackDevServerStrings.`local-ipv6`
  - java.lang.String
*/
type Host = _Host | String

type HttpProxyMiddlewareOptions = typings.httpProxyMiddleware.distTypesMod.Options

type HttpProxyMiddlewareOptionsFilter = Filter

type IPv4 = typings.ipaddrJs.mod.IPv4

type IPv6 = typings.ipaddrJs.mod.IPv6

type IncomingMessage = typings.node.httpMod.IncomingMessage

type Middleware = typings.webpackDevServer.anon.Middleware | ExpressRequestHandler | ExpressErrorRequestHandler

type MultiCompiler = typings.webpack.mod.MultiCompiler

type MultiStats = typings.webpack.mod.MultiStats

type NetworkInterfaceInfo = typings.node.osMod.NetworkInterfaceInfo

type NextFunction = typings.express.mod.NextFunction

type OpenOptions = typings.open.mod.Options

type Port = Double | String | auto

type ProxyConfigArray = js.Array[
ProxyConfigArrayItem | (js.Function3[
  /* req */ js.UndefOr[typings.std.Request], 
  /* res */ js.UndefOr[typings.std.Response], 
  /* next */ js.UndefOr[NextFunction], 
  ProxyConfigArrayItem
])]

type ProxyConfigMap = StringDictionary[String | ProxyConfigArrayItem]

type Request = Request_[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]

type RequestHandler = typings.httpProxyMiddleware.distTypesMod.RequestHandler

type Response = Response_[Any, Record[String, Any]]

type Schema = typings.schemaUtils.declarationsValidateMod.Schema

type ServeIndexOptions = typings.serveIndex.mod.Options

type ServeStaticOptions = typings.serveStatic.mod.ServeStaticOptions[ServerResponse[typings.node.httpMod.IncomingMessage]]

type Socket = typings.node.netMod.Socket

type Stats = typings.webpack.mod.Stats

type StatsCompilation = typings.webpack.mod.StatsCompilation

type StatsOptions = typings.webpack.mod.StatsOptions

type WatchOptions = typings.chokidar.mod.WatchOptions

type WebSocketServer = typings.ws.mod.WebSocketServer | ServercloseWebSocketServe

type WebpackConfiguration = typings.webpack.mod.Configuration
