package typings
package twilsockLib.libInterfacesChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel
  extends nodeLib.eventsMod.EventEmitter {
  var isConnected: scala.Boolean = js.native
  def send(message: stdLib.ArrayBuffer): scala.Unit = js.native
}

