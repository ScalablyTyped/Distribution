package typings.twilsock.libProtocolMessagesMessageMod

import typings.twilsock.libProtocolMessagesAbstractmessageMod.AbstractMessage
import typings.twilsock.libProtocolProtocolMod.ProtocolNs.MessageType
import typings.twilsock.libProtocolProtocolMod.ProtocolNs.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/message", "Message")
@js.native
class Message protected () extends AbstractMessage {
  def this(grant: String, contentType: String, request: Request) = this()
  val active_grant: String = js.native
  val http_request: Request = js.native
  val method: MessageType = js.native
  val payload_type: String = js.native
}

