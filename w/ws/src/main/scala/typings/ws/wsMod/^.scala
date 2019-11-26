package typings.ws.wsMod

import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebSocket socket.
@JSImport("ws", JSImport.Namespace)
@js.native
class ^ protected () extends WebSocket {
  def this(address: String) = this()
  def this(address: URL) = this()
  def this(address: String, options: ClientOptions) = this()
  def this(address: String, protocols: String) = this()
  def this(address: String, protocols: js.Array[String]) = this()
  def this(address: URL, options: ClientOptions) = this()
  def this(address: URL, protocols: String) = this()
  def this(address: URL, protocols: js.Array[String]) = this()
  def this(address: String, protocols: String, options: ClientOptions) = this()
  def this(address: String, protocols: js.Array[String], options: ClientOptions) = this()
  def this(address: URL, protocols: String, options: ClientOptions) = this()
  def this(address: URL, protocols: js.Array[String], options: ClientOptions) = this()
}

@JSImport("ws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CLOSED: Double = js.native
  var CLOSING: Double = js.native
  var CONNECTING: Double = js.native
  var OPEN: Double = js.native
}

