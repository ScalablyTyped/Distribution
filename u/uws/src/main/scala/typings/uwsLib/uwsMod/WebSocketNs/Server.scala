package typings
package uwsLib.uwsMod.WebSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends nodeLib.eventsMod.EventEmitter {
  var clients: js.Array[uwsLib.uwsMod.WebSocket] = js.native
  var options: IServerOptions = js.native
  var path: java.lang.String = js.native
  @JSName("addListener")
  def addListener_connection(
    event: uwsLib.uwsLibStrings.connection,
    cb: js.Function1[/* client */ uwsLib.uwsMod.WebSocket, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: uwsLib.uwsLibStrings.error, cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_headers(
    event: uwsLib.uwsLibStrings.headers,
    cb: js.Function1[/* headers */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  def close(): scala.Unit = js.native
  def close(cb: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def handleUpgrade(
    request: nodeLib.httpMod.IncomingMessage,
    socket: nodeLib.netMod.Socket,
    upgradeHead: stdLib.ArrayBuffer,
    callback: js.Function1[/* client */ uwsLib.uwsMod.WebSocket, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_connection(
    event: uwsLib.uwsLibStrings.connection,
    cb: js.ThisFunction1[/* this */ uwsLib.uwsMod.WebSocket, /* client */ uwsLib.uwsMod.WebSocket, scala.Unit]
  ): this.type = js.native
  // Events
  @JSName("on")
  def on_error(event: uwsLib.uwsLibStrings.error, cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_headers(
    event: uwsLib.uwsLibStrings.headers,
    cb: js.Function1[/* headers */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
}

