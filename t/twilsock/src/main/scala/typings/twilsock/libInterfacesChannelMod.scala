package typings.twilsock

import typings.node.eventsMod.EventEmitter
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/interfaces/channel", JSImport.Namespace)
@js.native
object libInterfacesChannelMod extends js.Object {
  @js.native
  trait Channel extends EventEmitter {
    var isConnected: Boolean = js.native
    def send(message: ArrayBuffer): Unit = js.native
  }
  
}

