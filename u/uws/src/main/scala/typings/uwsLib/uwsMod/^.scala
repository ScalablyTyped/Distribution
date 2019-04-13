package typings
package uwsLib.uwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uws", JSImport.Namespace)
@js.native
class ^ protected () extends WebSocket {
  def this(address: java.lang.String) = this()
  def this(address: java.lang.String, options: IClientOptions) = this()
  def this(address: java.lang.String, protocols: java.lang.String) = this()
  def this(address: java.lang.String, protocols: js.Array[java.lang.String]) = this()
  def this(address: java.lang.String, protocols: java.lang.String, options: IClientOptions) = this()
  def this(address: java.lang.String, protocols: js.Array[java.lang.String], options: IClientOptions) = this()
}

@JSImport("uws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CLOSED: scala.Double = js.native
  var CLOSING: scala.Double = js.native
  var CONNECTING: scala.Double = js.native
  var OPEN: scala.Double = js.native
  val http: UwsHttp = js.native
  def connect(address: java.lang.String): scala.Unit = js.native
  def connect(address: java.lang.String, openListener: js.Function): scala.Unit = js.native
  def createConnection(address: java.lang.String): scala.Unit = js.native
  def createConnection(address: java.lang.String, openListener: js.Function): scala.Unit = js.native
  def createServer(): Server = js.native
  def createServer(options: IServerOptions): Server = js.native
  def createServer(options: IServerOptions, connectionListener: js.Function1[/* client */ WebSocket, scala.Unit]): Server = js.native
}

