package typings.symphonyApiClientNode.messagesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node/MessagesClient", "getMessages")
@js.native
object getMessages extends js.Object {
  
  def apply(streamId: String, since: Double, skip: Double, limit: Double): js.Promise[js.Array[Message]] = js.native
}
