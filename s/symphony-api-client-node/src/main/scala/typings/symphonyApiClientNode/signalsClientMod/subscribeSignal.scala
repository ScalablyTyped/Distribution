package typings.symphonyApiClientNode.signalsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node/SignalsClient", "subscribeSignal")
@js.native
object subscribeSignal extends js.Object {
  
  def apply(id: String, userIds: js.Array[Double], userCanUnsubscribe: Boolean, sessionToken: String): js.Promise[SignalSubscriptionResult] = js.native
}
