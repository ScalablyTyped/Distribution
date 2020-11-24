package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.connectionsClientMod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "acceptConnectionRequest")
@js.native
object acceptConnectionRequest extends js.Object {
  
  def apply(userId: String, sessionToken: String): js.Promise[Connection] = js.native
}
