package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.signalsClientMod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "getSignal")
@js.native
object getSignal extends js.Object {
  
  def apply(id: String, sessionToken: String): js.Promise[Signal] = js.native
}
