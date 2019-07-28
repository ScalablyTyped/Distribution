package typings.twilsock.libProtocolMessagesReplyMod

import typings.twilsock.Anon_Code
import typings.twilsock.libProtocolMessagesAbstractmessageMod.AbstractMessage
import typings.twilsock.libProtocolProtocolMod.ProtocolNs.MessageType
import typings.twilsock.twilsockStrings.`application/json`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/reply", "Reply")
@js.native
class Reply protected () extends AbstractMessage {
  def this(id: String) = this()
  val body: js.Any = js.native
  val header: js.Any = js.native
  val method: MessageType = js.native
  val payload_type: `application/json` = js.native
  val status: Anon_Code = js.native
}

