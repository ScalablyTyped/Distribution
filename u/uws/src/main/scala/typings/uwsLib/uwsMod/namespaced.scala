package typings
package uwsLib.uwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uws", JSImport.Namespace)
@js.native
class namespaced protected () extends WebSocket {
  def this(address: java.lang.String) = this()
  def this(address: java.lang.String, options: uwsLib.uwsMod.WebSocketNs.IClientOptions) = this()
  def this(address: java.lang.String, protocols: java.lang.String) = this()
  def this(address: java.lang.String, protocols: js.Array[java.lang.String]) = this()
  def this(address: java.lang.String, protocols: java.lang.String, options: uwsLib.uwsMod.WebSocketNs.IClientOptions) = this()
  def this(address: java.lang.String, protocols: js.Array[java.lang.String], options: uwsLib.uwsMod.WebSocketNs.IClientOptions) = this()
}

/* static members */
@JSImport("uws", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var CLOSED: scala.Double = js.native
  var CLOSING: scala.Double = js.native
  var CONNECTING: scala.Double = js.native
  var OPEN: scala.Double = js.native
}

