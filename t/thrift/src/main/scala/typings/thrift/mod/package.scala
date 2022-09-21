package typings.thrift.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import typings.thrift.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createClient[TClient](client: TClientConstructor[TClient], connection: Connection): TClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]

inline def createConnection(host: String, port: Double): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Connection]
inline def createConnection(host: String, port: Double, options: ConnectOptions): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Connection]
inline def createConnection(host: Unit, port: Double): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Connection]
inline def createConnection(host: Unit, port: Double, options: ConnectOptions): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Connection]

inline def createHttpClient[TClient](client: TClientConstructor[TClient], connection: HttpConnection): TClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createHttpClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]

inline def createHttpConnection(host: String, port: Double): HttpConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createHttpConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[HttpConnection]
inline def createHttpConnection(host: String, port: Double, options: ConnectOptions): HttpConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createHttpConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpConnection]
inline def createHttpConnection(host: Unit, port: Double): HttpConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createHttpConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[HttpConnection]
inline def createHttpConnection(host: Unit, port: Double, options: ConnectOptions): HttpConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createHttpConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpConnection]

inline def createSSLConnection(host: String, port: Double): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("createSSLConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Connection]
inline def createSSLConnection(host: String, port: Double, options: ConnectOptions): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("createSSLConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Connection]
inline def createSSLConnection(host: Unit, port: Double): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("createSSLConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Connection]
inline def createSSLConnection(host: Unit, port: Double, options: ConnectOptions): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("createSSLConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Connection]

inline def createServer[TProcessor, THandler](processor: TProcessorConstructor[TProcessor, THandler], handler: THandler): (Server[
Instantiable1[/* socket */ Socket, IncomingMessage], 
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
  ServerResponse[IncomingMessage]
]]) | typings.node.tlsMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(processor.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[(Server[
Instantiable1[/* socket */ Socket, IncomingMessage], 
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
  ServerResponse[IncomingMessage]
]]) | typings.node.tlsMod.Server]
inline def createServer[TProcessor, THandler](
  processor: TProcessorConstructor[TProcessor, THandler],
  handler: THandler,
  options: ServerOptions[TProcessor, THandler]
): (Server[
Instantiable1[/* socket */ Socket, IncomingMessage], 
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
  ServerResponse[IncomingMessage]
]]) | typings.node.tlsMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(processor.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(Server[
Instantiable1[/* socket */ Socket, IncomingMessage], 
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
  ServerResponse[IncomingMessage]
]]) | typings.node.tlsMod.Server]

inline def createStdIOClient[TClient](client: TClientConstructor[TClient], connection: Connection): TClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createStdIOClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]

inline def createWSClient[TClient](client: TClientConstructor[TClient], connection: WSConnection): TClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createWSClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]

inline def createWSConnection(host: String, port: Double): WSConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createWSConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[WSConnection]
inline def createWSConnection(host: String, port: Double, options: WSConnectOptions): WSConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createWSConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WSConnection]
inline def createWSConnection(host: Unit, port: Double): WSConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createWSConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[WSConnection]
inline def createWSConnection(host: Unit, port: Double, options: WSConnectOptions): WSConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createWSConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WSConnection]

inline def createWebServer[TProcessor, THandler](options: WebServerOptions[TProcessor, THandler]): (Server[
Instantiable1[/* socket */ Socket, IncomingMessage], 
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
  ServerResponse[IncomingMessage]
]]) | typings.node.tlsMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebServer")(options.asInstanceOf[js.Any]).asInstanceOf[(Server[
Instantiable1[/* socket */ Socket, IncomingMessage], 
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
  ServerResponse[IncomingMessage]
]]) | typings.node.tlsMod.Server]

inline def createXHRClient[TClient](client: TClientConstructor[TClient], connection: XHRConnection): TClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createXHRClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]

inline def createXHRConnection(host: String, port: Double): XHRConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createXHRConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[XHRConnection]
inline def createXHRConnection(host: String, port: Double, options: ConnectOptions): XHRConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createXHRConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[XHRConnection]
inline def createXHRConnection(host: Unit, port: Double): XHRConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createXHRConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[XHRConnection]
inline def createXHRConnection(host: Unit, port: Double, options: ConnectOptions): XHRConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createXHRConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[XHRConnection]

type HttpHeaders = StringDictionary[js.UndefOr[Double | String | js.Array[String]]]

type SeqId2Service = NumberDictionary[String]

type ServiceMap[TProcessor, THandler] = StringDictionary[ServerOptions[TProcessor, THandler]]

type TTransportCallback = js.Function2[/* msg */ js.UndefOr[Buffer], /* seqid */ js.UndefOr[Double], Unit]
