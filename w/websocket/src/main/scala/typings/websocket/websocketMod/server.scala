package typings.websocket.websocketMod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.websocket.websocketStrings.close
import typings.websocket.websocketStrings.connect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websocket", "server")
@js.native
class server () extends EventEmitter {
  def this(serverConfig: IServerConfig) = this()
  var config: IServerConfig = js.native
  var connections: js.Array[connection] = js.native
  def addListener(event: String, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(
    event: close,
    cb: js.Function3[/* connection */ connection, /* reason */ Double, /* desc */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_connect(event: connect, cb: js.Function1[/* connection */ connection, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_request(event: typings.websocket.websocketStrings.request, cb: js.Function1[/* request */ request, Unit]): this.type = js.native
  /** Send binary message for each connection */
  def broadcast(data: Buffer): Unit = js.native
  /** Send UTF-8 message for each connection */
  def broadcast(data: IStringified): Unit = js.native
  /** Send binary message for each connection */
  def broadcastBytes(data: Buffer): Unit = js.native
  /** Send UTF-8 message for each connection */
  def broadcastUTF(data: IStringified): Unit = js.native
  /** Close all open WebSocket connections */
  def closeAllConnections(): Unit = js.native
  /** Attach the `server` instance to a Node http.Server instance */
  def mount(serverConfig: IServerConfig): Unit = js.native
  // Events
  def on(event: String, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_close(
    event: close,
    cb: js.Function3[/* connection */ connection, /* reason */ Double, /* desc */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, cb: js.Function1[/* connection */ connection, Unit]): this.type = js.native
  @JSName("on")
  def on_request(event: typings.websocket.websocketStrings.request, cb: js.Function1[/* request */ request, Unit]): this.type = js.native
  /** Close all open WebSocket connections and unmount the server */
  def shutDown(): Unit = js.native
  /**
    * Detach the `server` instance from the Node http.Server instance.
    * All existing connections are left alone and will not be affected,
    * but no new WebSocket connections will be accepted.
    */
  def unmount(): Unit = js.native
}

