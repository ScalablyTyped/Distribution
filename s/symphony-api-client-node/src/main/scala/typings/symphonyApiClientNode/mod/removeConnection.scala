package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.connectionsClientMod.RemoveConnectionReponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "removeConnection")
@js.native
object removeConnection extends js.Object {
  
  def apply(userId: String, sessionToken: String): js.Promise[RemoveConnectionReponse] = js.native
}
