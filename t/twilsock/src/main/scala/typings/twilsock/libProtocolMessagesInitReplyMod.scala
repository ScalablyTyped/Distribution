package typings.twilsock

import typings.twilsock.libProtocolMessagesAbstractmessageMod.AbstractMessage
import typings.twilsock.libProtocolMessagesInitReplyMod.ContinuationTokenStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/initReply", JSImport.Namespace)
@js.native
object libProtocolMessagesInitReplyMod extends js.Object {
  @js.native
  class ContinuationTokenStatus () extends js.Object {
    val reissue_message: String = js.native
    val reissue_reason: String = js.native
    val reissued: Boolean = js.native
  }
  
  @js.native
  class InitReply protected () extends AbstractMessage {
    def this(
      id: String,
      continuationToken: String,
      continuationTokenStatus: ContinuationTokenStatus,
      offlineStorage: js.Any,
      initRegistrations: js.Any,
      debugInfo: js.Any
    ) = this()
    val continuationToken: String = js.native
    val continuationTokenStatus: ContinuationTokenStatus = js.native
    val debugInfo: js.Any = js.native
    val initRegistrations: js.Any = js.native
    val offlineStorage: js.Any = js.native
  }
  
}

