package typings.twilsock

import typings.twilsock.libProtocolMessagesAbstractmessageMod.AbstractMessage
import typings.twilsock.libProtocolProtocolMod.Protocol.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/update", JSImport.Namespace)
@js.native
object libProtocolMessagesUpdateMod extends js.Object {
  @js.native
  class Update protected () extends AbstractMessage {
    def this(token: String) = this()
    val method: MessageType = js.native
    val token: String = js.native
  }
  
}

