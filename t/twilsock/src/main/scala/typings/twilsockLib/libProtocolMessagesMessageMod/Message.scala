package typings
package twilsockLib.libProtocolMessagesMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/message", "Message")
@js.native
class Message protected ()
  extends twilsockLib.libProtocolMessagesAbstractmessageMod.AbstractMessage {
  def this(grant: java.lang.String, contentType: java.lang.String, request: twilsockLib.libProtocolProtocolMod.ProtocolNs.Request) = this()
  val active_grant: java.lang.String = js.native
  val http_request: twilsockLib.libProtocolProtocolMod.ProtocolNs.Request = js.native
  val method: twilsockLib.libProtocolProtocolMod.ProtocolNs.MessageType = js.native
  val payload_type: java.lang.String = js.native
}

