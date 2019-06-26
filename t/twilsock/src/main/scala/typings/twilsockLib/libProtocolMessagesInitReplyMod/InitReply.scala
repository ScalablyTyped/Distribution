package typings
package twilsockLib.libProtocolMessagesInitReplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/initReply", "InitReply")
@js.native
class InitReply protected ()
  extends twilsockLib.libProtocolMessagesAbstractmessageMod.AbstractMessage {
  def this(id: java.lang.String, continuationToken: java.lang.String, continuationTokenStatus: ContinuationTokenStatus, offlineStorage: js.Any, initRegistrations: js.Any, debugInfo: js.Any) = this()
  val continuationToken: java.lang.String = js.native
  val continuationTokenStatus: ContinuationTokenStatus = js.native
  val debugInfo: js.Any = js.native
  val initRegistrations: js.Any = js.native
  val offlineStorage: js.Any = js.native
}

