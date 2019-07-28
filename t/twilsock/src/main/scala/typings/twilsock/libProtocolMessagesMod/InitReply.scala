package typings.twilsock.libProtocolMessagesMod

import typings.twilsock.libProtocolMessagesInitReplyMod.ContinuationTokenStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages", "InitReply")
@js.native
class InitReply protected ()
  extends typings.twilsock.libProtocolMessagesInitReplyMod.InitReply {
  def this(
    id: String,
    continuationToken: String,
    continuationTokenStatus: ContinuationTokenStatus,
    offlineStorage: js.Any,
    initRegistrations: js.Any,
    debugInfo: js.Any
  ) = this()
}

