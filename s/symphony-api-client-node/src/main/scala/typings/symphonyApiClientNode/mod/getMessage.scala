package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.messagesClientMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "getMessage")
@js.native
object getMessage extends js.Object {
  
  def apply(messageId: String): js.Promise[Message] = js.native
}
