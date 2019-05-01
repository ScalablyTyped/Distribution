package typings
package twilsockLib.libProtocolMessagesUpdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/update", "Update")
@js.native
class Update protected ()
  extends twilsockLib.libProtocolMessagesAbstractmessageMod.AbstractMessage {
  def this(token: java.lang.String) = this()
  val method: twilsockLib.libProtocolProtocolMod.ProtocolNs.MessageType = js.native
  val token: java.lang.String = js.native
}

