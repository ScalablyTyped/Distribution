package typings.websocketStream

import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Duplex
import typings.std.Error
import typings.websocketStream.websocketStreamStrings.connection
import typings.websocketStream.websocketStreamStrings.error
import typings.websocketStream.websocketStreamStrings.headers
import typings.websocketStream.websocketStreamStrings.listening
import typings.websocketStream.websocketStreamStrings.stream
import typings.ws.mod.ClientOptions
import typings.ws.mod.ServerOptions
import typings.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websocket-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Server ()
    extends typings.ws.mod.Server {
    @JSName("on")
    def on_connection(
      event: connection,
      cb: js.ThisFunction2[/* this */ ^, /* socket */ ^, /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.ThisFunction1[/* this */ ^, /* error */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_headers(
      event: headers,
      cb: js.ThisFunction2[/* this */ ^, /* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_listening(event: listening, cb: js.ThisFunction0[/* this */ ^, Unit]): this.type = js.native
    @JSName("on")
    def on_stream(
      event: stream,
      cb: js.ThisFunction2[/* this */ ^, /* stream */ WebSocketDuplex, /* request */ IncomingMessage, Unit]
    ): this.type = js.native
  }
  
  def apply(target: String): WebSocketDuplex = js.native
  def apply(target: String, options: ClientOptions): WebSocketDuplex = js.native
  def apply(target: String, protocols: String): WebSocketDuplex = js.native
  def apply(target: String, protocols: String, options: ClientOptions): WebSocketDuplex = js.native
  def apply(target: String, protocols: js.Array[String]): WebSocketDuplex = js.native
  def apply(target: String, protocols: js.Array[String], options: ClientOptions): WebSocketDuplex = js.native
  def apply(target: ^): WebSocketDuplex = js.native
  def apply(target: ^, options: ClientOptions): WebSocketDuplex = js.native
  def apply(target: ^, protocols: String): WebSocketDuplex = js.native
  def apply(target: ^, protocols: String, options: ClientOptions): WebSocketDuplex = js.native
  def apply(target: ^, protocols: js.Array[String]): WebSocketDuplex = js.native
  def apply(target: ^, protocols: js.Array[String], options: ClientOptions): WebSocketDuplex = js.native
  def createServer(): Server = js.native
  def createServer(opts: ServerOptions): Server = js.native
  def createServer(opts: ServerOptions, callback: js.Function0[Unit]): Server = js.native
  type WebSocketDuplex = Duplex with AnonSocket
}

