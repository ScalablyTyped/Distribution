package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.messagesClientMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "getMessages")
@js.native
object getMessages extends js.Object {
  
  def apply(streamId: String, since: Double, skip: Double, limit: Double): js.Promise[js.Array[Message]] = js.native
}
