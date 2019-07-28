package typings.uws.uwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uws", JSImport.Namespace)
@js.native
class ^ protected () extends WebSocket {
  def this(address: String) = this()
  def this(address: String, options: IClientOptions) = this()
  def this(address: String, protocols: String) = this()
  def this(address: String, protocols: js.Array[String]) = this()
  def this(address: String, protocols: String, options: IClientOptions) = this()
  def this(address: String, protocols: js.Array[String], options: IClientOptions) = this()
}

@JSImport("uws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CLOSED: Double = js.native
  var CLOSING: Double = js.native
  var CONNECTING: Double = js.native
  var OPEN: Double = js.native
  val http: UwsHttp = js.native
  def connect(address: String): Unit = js.native
  def connect(address: String, openListener: js.Function): Unit = js.native
  def createConnection(address: String): Unit = js.native
  def createConnection(address: String, openListener: js.Function): Unit = js.native
  def createServer(): Server = js.native
  def createServer(options: IServerOptions): Server = js.native
  def createServer(options: IServerOptions, connectionListener: js.Function1[/* client */ WebSocket, Unit]): Server = js.native
}

