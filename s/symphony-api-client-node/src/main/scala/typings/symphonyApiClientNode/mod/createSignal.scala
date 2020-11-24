package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.signalsClientMod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "createSignal")
@js.native
object createSignal extends js.Object {
  
  def apply(name: String, query: String, visibleOnProfile: Boolean, companyWide: Boolean, sessionToken: String): js.Promise[Signal] = js.native
}
