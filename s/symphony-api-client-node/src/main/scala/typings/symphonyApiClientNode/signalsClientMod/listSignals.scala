package typings.symphonyApiClientNode.signalsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node/SignalsClient", "listSignals")
@js.native
object listSignals extends js.Object {
  
  def apply(skip: Double, limit: Double, sessionToken: String): js.Promise[js.Array[Signal]] = js.native
}
