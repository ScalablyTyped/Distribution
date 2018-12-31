package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websocket", "server")
@js.native
class server ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(serverConfig: IServerConfig) = this()
  var config: IServerConfig = js.native
  var connections: js.Array[connection] = js.native
  def addListener(event: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(
    event: websocketLib.websocketLibStrings.close,
    cb: js.Function3[
      /* connection */ connection, 
      /* reason */ scala.Double, 
      /* desc */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_connect(
    event: websocketLib.websocketLibStrings.connect,
    cb: js.Function1[/* connection */ connection, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_request(
    event: websocketLib.websocketLibStrings.request,
    cb: js.Function1[/* request */ request, scala.Unit]
  ): this.type = js.native
  /** Send binary message for each connection */
  def broadcast(data: nodeLib.Buffer): scala.Unit = js.native
  /** Send UTF-8 message for each connection */
  def broadcast(data: IStringified): scala.Unit = js.native
  /** Send binary message for each connection */
  def broadcastBytes(data: nodeLib.Buffer): scala.Unit = js.native
  /** Send UTF-8 message for each connection */
  def broadcastUTF(data: IStringified): scala.Unit = js.native
  /** Close all open WebSocket connections */
  def closeAllConnections(): scala.Unit = js.native
  /** Attach the `server` instance to a Node http.Server instance */
  def mount(serverConfig: IServerConfig): scala.Unit = js.native
  // Events
  def on(event: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_close(
    event: websocketLib.websocketLibStrings.close,
    cb: js.Function3[
      /* connection */ connection, 
      /* reason */ scala.Double, 
      /* desc */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_connect(
    event: websocketLib.websocketLibStrings.connect,
    cb: js.Function1[/* connection */ connection, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_request(
    event: websocketLib.websocketLibStrings.request,
    cb: js.Function1[/* request */ request, scala.Unit]
  ): this.type = js.native
  /** Close all open WebSocket connections and unmount the server */
  def shutDown(): scala.Unit = js.native
  /**
    * Detach the `server` instance from the Node http.Server instance.
    * All existing connections are left alone and will not be affected,
    * but no new WebSocket connections will be accepted.
    */
  def unmount(): scala.Unit = js.native
}

