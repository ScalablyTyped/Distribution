package typings
package uwsLib.uwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uws", "Server")
@js.native
class Server ()
  extends uwsLib.uwsMod.WebSocketNs.Server {
  def this(options: uwsLib.uwsMod.WebSocketNs.IServerOptions) = this()
  def this(options: uwsLib.uwsMod.WebSocketNs.IServerOptions, callback: js.Function) = this()
}

