package typings.twilsock.libInterfacesChannelMod

import typings.node.eventsMod.EventEmitter
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends EventEmitter {
  var isConnected: Boolean = js.native
  def send(message: ArrayBuffer): Unit = js.native
}

