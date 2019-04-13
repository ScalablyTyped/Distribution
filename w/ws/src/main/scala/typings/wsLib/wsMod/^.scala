package typings
package wsLib.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebSocket socket.
@JSImport("ws", JSImport.Namespace)
@js.native
class ^ protected () extends WebSocket {
  def this(address: java.lang.String) = this()
  def this(address: java.lang.String, options: ClientOptions) = this()
  def this(address: java.lang.String, protocols: java.lang.String) = this()
  def this(address: java.lang.String, protocols: js.Array[java.lang.String]) = this()
  def this(address: java.lang.String, protocols: java.lang.String, options: ClientOptions) = this()
  def this(address: java.lang.String, protocols: js.Array[java.lang.String], options: ClientOptions) = this()
}

@JSImport("ws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CLOSED: scala.Double = js.native
  var CLOSING: scala.Double = js.native
  var CONNECTING: scala.Double = js.native
  var OPEN: scala.Double = js.native
}

