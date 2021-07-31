package typings.twilsock

import typings.twilsock.abstractmessageMod.AbstractMessage
import typings.twilsock.protocolMod.Protocol.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateMod {
  
  @JSImport("twilsock/lib/protocol/messages/update", "Update")
  @js.native
  class Update protected () extends AbstractMessage {
    def this(token: String) = this()
    
    val method: MessageType = js.native
    
    val token: String = js.native
  }
}
