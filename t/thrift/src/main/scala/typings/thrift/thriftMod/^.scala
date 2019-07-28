package typings.thrift.thriftMod

import typings.node.httpMod.Server
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Calling with nothing at all creates a void promise
    */
  def Q(): Promise[Unit] = js.native
  def Q[T](promise: T): Promise[T] = js.native
  /**
    * If value is a Q promise, returns the promise.
    * If value is a promise from another library it is coerced into a Q promise (where possible).
    * If value is not a promise, returns a promise that is fulfilled with value.
    */
  def Q[T](promise: js.Thenable[T]): Promise[T] = js.native
  def createClient[TClient](client: TClientConstructor[TClient], connection: Connection): TClient = js.native
  def createConnection(host: js.UndefOr[scala.Nothing], port: Double): Connection = js.native
  def createConnection(host: js.UndefOr[scala.Nothing], port: Double, options: ConnectOptions): Connection = js.native
  def createConnection(host: String, port: Double): Connection = js.native
  def createConnection(host: String, port: Double, options: ConnectOptions): Connection = js.native
  def createHttpClient[TClient](client: TClientConstructor[TClient], connection: HttpConnection): TClient = js.native
  def createHttpConnection(host: js.UndefOr[scala.Nothing], port: Double): HttpConnection = js.native
  def createHttpConnection(host: js.UndefOr[scala.Nothing], port: Double, options: ConnectOptions): HttpConnection = js.native
  def createHttpConnection(host: String, port: Double): HttpConnection = js.native
  def createHttpConnection(host: String, port: Double, options: ConnectOptions): HttpConnection = js.native
  def createSSLConnection(host: js.UndefOr[scala.Nothing], port: Double): Connection = js.native
  def createSSLConnection(host: js.UndefOr[scala.Nothing], port: Double, options: ConnectOptions): Connection = js.native
  def createSSLConnection(host: String, port: Double): Connection = js.native
  def createSSLConnection(host: String, port: Double, options: ConnectOptions): Connection = js.native
  def createServer[TProcessor, THandler](processor: TProcessorConstructor[TProcessor, THandler], handler: THandler): Server | typings.node.tlsMod.Server = js.native
  def createServer[TProcessor, THandler](
    processor: TProcessorConstructor[TProcessor, THandler],
    handler: THandler,
    options: ServerOptions[TProcessor, THandler]
  ): Server | typings.node.tlsMod.Server = js.native
  def createStdIOClient[TClient](client: TClientConstructor[TClient], connection: Connection): TClient = js.native
  def createWSClient[TClient](client: TClientConstructor[TClient], connection: WSConnection): TClient = js.native
  def createWSConnectin(host: js.UndefOr[scala.Nothing], port: Double): WSConnection = js.native
  def createWSConnectin(host: js.UndefOr[scala.Nothing], port: Double, options: WSConnectOptions): WSConnection = js.native
  def createWSConnectin(host: String, port: Double): WSConnection = js.native
  def createWSConnectin(host: String, port: Double, options: WSConnectOptions): WSConnection = js.native
  def createWebServer[TProcessor, THandler](options: WebServerOptions[TProcessor, THandler]): Server | typings.node.tlsMod.Server = js.native
  def createXHRClient[TClient](client: TClientConstructor[TClient], connection: XHRConnection): TClient = js.native
  def createXHRConnection(host: js.UndefOr[scala.Nothing], port: Double): XHRConnection = js.native
  def createXHRConnection(host: js.UndefOr[scala.Nothing], port: Double, options: ConnectOptions): XHRConnection = js.native
  def createXHRConnection(host: String, port: Double): XHRConnection = js.native
  def createXHRConnection(host: String, port: Double, options: ConnectOptions): XHRConnection = js.native
}

