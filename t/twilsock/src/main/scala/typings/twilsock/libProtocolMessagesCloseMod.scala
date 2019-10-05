package typings.twilsock

import typings.twilsock.libProtocolMessagesAbstractmessageMod.AbstractMessage
import typings.twilsock.libProtocolProtocolMod.Protocol.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/close", JSImport.Namespace)
@js.native
object libProtocolMessagesCloseMod extends js.Object {
  @js.native
  class Close () extends AbstractMessage {
    val method: MessageType = js.native
  }
  
}

