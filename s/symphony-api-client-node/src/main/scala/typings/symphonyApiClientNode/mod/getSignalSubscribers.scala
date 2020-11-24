package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.signalsClientMod.SignalSubscribersResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "getSignalSubscribers")
@js.native
object getSignalSubscribers extends js.Object {
  
  def apply(id: String, skip: Double, limit: Double, sessionToken: String): js.Promise[SignalSubscribersResponse] = js.native
}
