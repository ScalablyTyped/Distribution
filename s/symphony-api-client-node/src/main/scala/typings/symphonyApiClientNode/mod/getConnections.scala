package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.connectionsClientMod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "getConnections")
@js.native
object getConnections extends js.Object {
  
  def apply(status: String, commaSeparatedUserIds: String, sessionToken: String): js.Promise[js.Array[Connection]] = js.native
}
