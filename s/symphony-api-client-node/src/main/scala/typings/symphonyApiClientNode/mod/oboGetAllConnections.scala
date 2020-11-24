package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.connectionsClientMod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "oboGetAllConnections")
@js.native
object oboGetAllConnections extends js.Object {
  
  def apply(status: String): js.Promise[js.Array[Connection]] = js.native
}
