package typings.twilsock

import typings.twilsock.abstractmessageMod.AbstractMessage
import typings.twilsock.protocolMod.Protocol.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/update", JSImport.Namespace)
@js.native
object updateMod extends js.Object {
  @js.native
  class Update protected () extends AbstractMessage {
    def this(token: String) = this()
    val method: MessageType = js.native
    val token: String = js.native
  }
  
}

