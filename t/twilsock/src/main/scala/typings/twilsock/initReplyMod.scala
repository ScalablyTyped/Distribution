package typings.twilsock

import typings.std.Set
import typings.twilsock.abstractmessageMod.AbstractMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/protocol/messages/initReply", JSImport.Namespace)
@js.native
object initReplyMod extends js.Object {
  
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
      debugInfo: js.Any,
      confirmedCapabilities: Set[String]
    ) = this()
    
    val confirmedCapabilities: Set[String] = js.native
    
    val continuationToken: String = js.native
    
    val continuationTokenStatus: ContinuationTokenStatus = js.native
    
    val debugInfo: js.Any = js.native
    
    val initRegistrations: js.Any = js.native
    
    val offlineStorage: js.Any = js.native
  }
}
