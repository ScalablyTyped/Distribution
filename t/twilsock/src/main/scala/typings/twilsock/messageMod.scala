package typings.twilsock

import typings.twilsock.abstractmessageMod.AbstractMessage
import typings.twilsock.protocolMod.Protocol.MessageType
import typings.twilsock.protocolMod.Protocol.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/protocol/messages/message", JSImport.Namespace)
@js.native
object messageMod extends js.Object {
  
  @js.native
  class Message protected () extends AbstractMessage {
    def this(grant: String, contentType: String, request: Request) = this()
    
    val active_grant: String = js.native
    
    val http_request: Request = js.native
    
    val method: MessageType = js.native
    
    val payload_type: String = js.native
  }
}
