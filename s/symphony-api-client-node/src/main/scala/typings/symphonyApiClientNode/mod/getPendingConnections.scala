package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.connectionsClientMod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "getPendingConnections")
@js.native
object getPendingConnections extends js.Object {
  
  def apply(sessionToken: String): js.Promise[js.Array[Connection]] = js.native
}
