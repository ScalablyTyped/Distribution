package typings.symphonyApiClientNode.messagesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node/MessagesClient", "sendMessage")
@js.native
object sendMessage extends js.Object {
  
  def apply(conversationId: String, message: String, data: js.Any, format: String, sessionToken: String): js.Promise[Message] = js.native
}
