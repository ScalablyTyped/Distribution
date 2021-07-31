package typings.twilsock

import typings.std.Set
import typings.twilsock.abstractmessageMod.AbstractMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initReplyMod {
  
  @JSImport("twilsock/lib/protocol/messages/initReply", "ContinuationTokenStatus")
  @js.native
  class ContinuationTokenStatus () extends StObject {
    
    val reissue_message: String = js.native
    
    val reissue_reason: String = js.native
    
    val reissued: Boolean = js.native
  }
  
  @JSImport("twilsock/lib/protocol/messages/initReply", "InitReply")
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
