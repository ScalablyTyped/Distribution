package typings.twilsock

import typings.twilsock.abstractmessageMod.AbstractMessage
import typings.twilsock.protocolMod.Protocol.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closeMod {
  
  @JSImport("twilsock/lib/protocol/messages/close", "Close")
  @js.native
  class Close () extends AbstractMessage {
    
    val method: MessageType = js.native
  }
}
