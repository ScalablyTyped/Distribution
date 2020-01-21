package typings.twilsock

import typings.twilsock.abstractmessageMod.AbstractMessage
import typings.twilsock.protocolMod.Protocol.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/close", JSImport.Namespace)
@js.native
object closeMod extends js.Object {
  @js.native
  class Close () extends AbstractMessage {
    val method: MessageType = js.native
  }
  
}

