package typings
package uwsLib.uwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val http: uwsLib.uwsMod.WebSocketNs.UwsHttp = js.native
  def connect(address: java.lang.String): scala.Unit = js.native
  def connect(address: java.lang.String, openListener: js.Function): scala.Unit = js.native
  def createConnection(address: java.lang.String): scala.Unit = js.native
  def createConnection(address: java.lang.String, openListener: js.Function): scala.Unit = js.native
  def createServer(): uwsLib.uwsMod.WebSocketNs.Server = js.native
  def createServer(options: uwsLib.uwsMod.WebSocketNs.IServerOptions): uwsLib.uwsMod.WebSocketNs.Server = js.native
  def createServer(
    options: uwsLib.uwsMod.WebSocketNs.IServerOptions,
    connectionListener: js.Function1[/* client */ uwsLib.uwsMod.WebSocket, scala.Unit]
  ): uwsLib.uwsMod.WebSocketNs.Server = js.native
}

