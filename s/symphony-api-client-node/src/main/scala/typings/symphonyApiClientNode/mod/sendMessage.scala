package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.messagesClientMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "sendMessage")
@js.native
object sendMessage extends js.Object {
  
  def apply(conversationId: String, message: String, data: js.Any, format: String, sessionToken: String): js.Promise[Message] = js.native
}
