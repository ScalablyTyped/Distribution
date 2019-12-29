package typings.twilsock

import typings.twilsock.libProtocolMessagesAbstractmessageMod.AbstractMessage
import typings.twilsock.libProtocolProtocolMod.Protocol.MessageType
import typings.twilsock.twilsockStrings.applicationSlashjson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/reply", JSImport.Namespace)
@js.native
object libProtocolMessagesReplyMod extends js.Object {
  @js.native
  class Reply protected () extends AbstractMessage {
    def this(id: String) = this()
    val body: js.Any = js.native
    val header: js.Any = js.native
    val method: MessageType = js.native
    val payload_type: applicationSlashjson = js.native
    val status: Anon_Code = js.native
  }
  
}

