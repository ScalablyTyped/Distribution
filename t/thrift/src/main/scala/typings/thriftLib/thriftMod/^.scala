package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Calling with nothing at all creates a void promise
    */
  def Q(): qLib.qMod.Promise[scala.Unit] = js.native
  def Q[T](promise: T): qLib.qMod.Promise[T] = js.native
  /**
    * If value is a Q promise, returns the promise.
    * If value is a promise from another library it is coerced into a Q promise (where possible).
    * If value is not a promise, returns a promise that is fulfilled with value.
    */
  def Q[T](promise: js.Thenable[T]): qLib.qMod.Promise[T] = js.native
  def createClient[TClient](client: TClientConstructor[TClient], connection: Connection): TClient = js.native
  def createConnection(host: java.lang.String, port: scala.Double): Connection = js.native
  def createConnection(host: java.lang.String, port: scala.Double, options: ConnectOptions): Connection = js.native
  def createConnection(host: js.UndefOr[scala.Nothing], port: scala.Double): Connection = js.native
  def createConnection(host: js.UndefOr[scala.Nothing], port: scala.Double, options: ConnectOptions): Connection = js.native
  def createHttpClient[TClient](client: TClientConstructor[TClient], connection: HttpConnection): TClient = js.native
  def createHttpConnection(host: java.lang.String, port: scala.Double): HttpConnection = js.native
  def createHttpConnection(host: java.lang.String, port: scala.Double, options: ConnectOptions): HttpConnection = js.native
  def createHttpConnection(host: js.UndefOr[scala.Nothing], port: scala.Double): HttpConnection = js.native
  def createHttpConnection(host: js.UndefOr[scala.Nothing], port: scala.Double, options: ConnectOptions): HttpConnection = js.native
  def createSSLConnection(host: java.lang.String, port: scala.Double): Connection = js.native
  def createSSLConnection(host: java.lang.String, port: scala.Double, options: ConnectOptions): Connection = js.native
  def createSSLConnection(host: js.UndefOr[scala.Nothing], port: scala.Double): Connection = js.native
  def createSSLConnection(host: js.UndefOr[scala.Nothing], port: scala.Double, options: ConnectOptions): Connection = js.native
  def createServer[TProcessor, THandler](processor: TProcessorConstructor[TProcessor, THandler], handler: THandler): nodeLib.httpMod.Server | nodeLib.tlsMod.Server = js.native
  def createServer[TProcessor, THandler](
    processor: TProcessorConstructor[TProcessor, THandler],
    handler: THandler,
    options: ServerOptions[TProcessor, THandler]
  ): nodeLib.httpMod.Server | nodeLib.tlsMod.Server = js.native
  def createStdIOClient[TClient](client: TClientConstructor[TClient], connection: Connection): TClient = js.native
  def createWSClient[TClient](client: TClientConstructor[TClient], connection: WSConnection): TClient = js.native
  def createWSConnectin(host: java.lang.String, port: scala.Double): WSConnection = js.native
  def createWSConnectin(host: java.lang.String, port: scala.Double, options: WSConnectOptions): WSConnection = js.native
  def createWSConnectin(host: js.UndefOr[scala.Nothing], port: scala.Double): WSConnection = js.native
  def createWSConnectin(host: js.UndefOr[scala.Nothing], port: scala.Double, options: WSConnectOptions): WSConnection = js.native
  def createWebServer[TProcessor, THandler](options: WebServerOptions[TProcessor, THandler]): nodeLib.httpMod.Server | nodeLib.tlsMod.Server = js.native
  def createXHRClient[TClient](client: TClientConstructor[TClient], connection: XHRConnection): TClient = js.native
  def createXHRConnection(host: java.lang.String, port: scala.Double): XHRConnection = js.native
  def createXHRConnection(host: java.lang.String, port: scala.Double, options: ConnectOptions): XHRConnection = js.native
  def createXHRConnection(host: js.UndefOr[scala.Nothing], port: scala.Double): XHRConnection = js.native
  def createXHRConnection(host: js.UndefOr[scala.Nothing], port: scala.Double, options: ConnectOptions): XHRConnection = js.native
}

