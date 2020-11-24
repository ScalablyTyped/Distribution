package typings.symphonyApiClientNode.messagesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node/MessagesClient", "sendMessageWithAttachment")
@js.native
object sendMessageWithAttachment extends js.Object {
  
  def apply(
    conversationId: String,
    message: String,
    data: js.Any,
    fileName: String,
    fileType: String,
    fileContent: js.Any,
    format: String
  ): js.Promise[Message] = js.native
}
