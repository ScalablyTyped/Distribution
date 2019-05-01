package typings
package twilsockLib.libProtocolMessagesReplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/reply", "Reply")
@js.native
class Reply protected ()
  extends twilsockLib.libProtocolMessagesAbstractmessageMod.AbstractMessage {
  def this(id: java.lang.String) = this()
  val body: js.Any = js.native
  val header: js.Any = js.native
  val method: twilsockLib.libProtocolProtocolMod.ProtocolNs.MessageType = js.native
  val payload_type: java.lang.String = js.native
  val status: twilsockLib.Anon_Code = js.native
}

