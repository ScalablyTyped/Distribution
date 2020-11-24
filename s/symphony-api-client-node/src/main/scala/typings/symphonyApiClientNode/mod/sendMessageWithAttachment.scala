package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.messagesClientMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "sendMessageWithAttachment")
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
