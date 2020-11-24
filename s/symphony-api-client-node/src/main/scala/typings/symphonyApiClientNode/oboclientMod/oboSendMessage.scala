package typings.symphonyApiClientNode.oboclientMod

import typings.symphonyApiClientNode.messagesClientMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node/OBOClient", "oboSendMessage")
@js.native
object oboSendMessage extends js.Object {
  
  def apply(userToken: String, conversationId: String, message: String, data: js.Any, format: String): js.Promise[Message] = js.native
}
