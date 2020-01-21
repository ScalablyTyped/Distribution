package typings.uws.mod

import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.netMod.Socket
import typings.std.ArrayBuffer
import typings.std.Error
import typings.uws.uwsStrings.connection
import typings.uws.uwsStrings.error
import typings.uws.uwsStrings.headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uws", "Server")
@js.native
class Server () extends EventEmitter {
  def this(options: IServerOptions) = this()
  def this(options: IServerOptions, callback: js.Function) = this()
  var clients: js.Array[WebSocket] = js.native
  var options: IServerOptions = js.native
  var path: String = js.native
  @JSName("addListener")
  def addListener_connection(event: connection, cb: js.Function1[/* client */ WebSocket, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, cb: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_headers(event: headers, cb: js.Function1[/* headers */ js.Array[String], Unit]): this.type = js.native
  def close(): Unit = js.native
  def close(cb: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def handleUpgrade(
    request: IncomingMessage,
    socket: Socket,
    upgradeHead: ArrayBuffer,
    callback: js.Function1[/* client */ WebSocket, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_connection(event: connection, cb: js.ThisFunction1[/* this */ WebSocket, /* client */ WebSocket, Unit]): this.type = js.native
  // Events
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_headers(event: headers, cb: js.Function1[/* headers */ js.Array[String], Unit]): this.type = js.native
}

