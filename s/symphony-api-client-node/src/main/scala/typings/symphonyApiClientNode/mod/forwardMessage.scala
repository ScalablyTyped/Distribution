package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.messagesClientMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "forwardMessage")
@js.native
object forwardMessage extends js.Object {
  
  def apply(conversationId: String, message: String, data: js.Any): js.Promise[Message] = js.native
}
