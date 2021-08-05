package typings.thrift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createClient[TClient](client: typings.thrift.mod.TClientConstructor[TClient], connection: typings.thrift.mod.Connection): TClient = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]

inline def createConnection(host: java.lang.String, port: scala.Double): typings.thrift.mod.Connection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.Connection]
inline def createConnection(host: java.lang.String, port: scala.Double, options: typings.thrift.mod.ConnectOptions): typings.thrift.mod.Connection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.Connection]
inline def createConnection(host: scala.Unit, port: scala.Double): typings.thrift.mod.Connection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.Connection]
inline def createConnection(host: scala.Unit, port: scala.Double, options: typings.thrift.mod.ConnectOptions): typings.thrift.mod.Connection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.Connection]

inline def createHttpClient[TClient](
  client: typings.thrift.mod.TClientConstructor[TClient],
  connection: typings.thrift.mod.HttpConnection
): TClient = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createHttpClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]

inline def createHttpConnection(host: java.lang.String, port: scala.Double): typings.thrift.mod.HttpConnection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createHttpConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.HttpConnection]
inline def createHttpConnection(host: java.lang.String, port: scala.Double, options: typings.thrift.mod.ConnectOptions): typings.thrift.mod.HttpConnection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createHttpConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.HttpConnection]
inline def createHttpConnection(host: scala.Unit, port: scala.Double): typings.thrift.mod.HttpConnection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createHttpConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.HttpConnection]
inline def createHttpConnection(host: scala.Unit, port: scala.Double, options: typings.thrift.mod.ConnectOptions): typings.thrift.mod.HttpConnection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createHttpConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.HttpConnection]

inline def createSSLConnection(host: java.lang.String, port: scala.Double): typings.thrift.mod.Connection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSSLConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.Connection]
inline def createSSLConnection(host: java.lang.String, port: scala.Double, options: typings.thrift.mod.ConnectOptions): typings.thrift.mod.Connection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSSLConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.Connection]
inline def createSSLConnection(host: scala.Unit, port: scala.Double): typings.thrift.mod.Connection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSSLConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.Connection]
inline def createSSLConnection(host: scala.Unit, port: scala.Double, options: typings.thrift.mod.ConnectOptions): typings.thrift.mod.Connection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSSLConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.Connection]

inline def createServer[TProcessor, THandler](processor: typings.thrift.mod.TProcessorConstructor[TProcessor, THandler], handler: THandler): typings.node.httpMod.Server | typings.node.tlsMod.Server = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(processor.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.node.httpMod.Server | typings.node.tlsMod.Server]
inline def createServer[TProcessor, THandler](
  processor: typings.thrift.mod.TProcessorConstructor[TProcessor, THandler],
  handler: THandler,
  options: typings.thrift.mod.ServerOptions[TProcessor, THandler]
): typings.node.httpMod.Server | typings.node.tlsMod.Server = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(processor.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.httpMod.Server | typings.node.tlsMod.Server]

inline def createStdIOClient[TClient](client: typings.thrift.mod.TClientConstructor[TClient], connection: typings.thrift.mod.Connection): TClient = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createStdIOClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]

inline def createWSClient[TClient](
  client: typings.thrift.mod.TClientConstructor[TClient],
  connection: typings.thrift.mod.WSConnection
): TClient = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWSClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]

inline def createWSConnection(host: java.lang.String, port: scala.Double): typings.thrift.mod.WSConnection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWSConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.WSConnection]
inline def createWSConnection(host: java.lang.String, port: scala.Double, options: typings.thrift.mod.WSConnectOptions): typings.thrift.mod.WSConnection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWSConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.WSConnection]
inline def createWSConnection(host: scala.Unit, port: scala.Double): typings.thrift.mod.WSConnection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWSConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.WSConnection]
inline def createWSConnection(host: scala.Unit, port: scala.Double, options: typings.thrift.mod.WSConnectOptions): typings.thrift.mod.WSConnection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWSConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.WSConnection]

inline def createWebServer[TProcessor, THandler](options: typings.thrift.mod.WebServerOptions[TProcessor, THandler]): typings.node.httpMod.Server | typings.node.tlsMod.Server = typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWebServer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.httpMod.Server | typings.node.tlsMod.Server]

inline def createXHRClient[TClient](
  client: typings.thrift.mod.TClientConstructor[TClient],
  connection: typings.thrift.mod.XHRConnection
): TClient = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createXHRClient")(client.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[TClient]

inline def createXHRConnection(host: java.lang.String, port: scala.Double): typings.thrift.mod.XHRConnection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createXHRConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.XHRConnection]
inline def createXHRConnection(host: java.lang.String, port: scala.Double, options: typings.thrift.mod.ConnectOptions): typings.thrift.mod.XHRConnection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createXHRConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.XHRConnection]
inline def createXHRConnection(host: scala.Unit, port: scala.Double): typings.thrift.mod.XHRConnection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createXHRConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.XHRConnection]
inline def createXHRConnection(host: scala.Unit, port: scala.Double, options: typings.thrift.mod.ConnectOptions): typings.thrift.mod.XHRConnection = (typings.thrift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createXHRConnection")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.thrift.mod.XHRConnection]

type HttpHeaders = org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double | java.lang.String | js.Array[java.lang.String]]]

type SeqId2Service = org.scalablytyped.runtime.NumberDictionary[java.lang.String]

type ServiceMap[TProcessor, THandler] = org.scalablytyped.runtime.StringDictionary[typings.thrift.mod.ServerOptions[TProcessor, THandler]]

type TTransportCallback = js.Function2[
/* msg */ js.UndefOr[typings.node.Buffer], 
/* seqid */ js.UndefOr[scala.Double], 
scala.Unit]
