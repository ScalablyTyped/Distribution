package typings.symphonyApiClientNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "initBot")
@js.native
object initBot extends js.Object {
  
  def apply(pathToConfigFile: String): js.Promise[AuthInfo] = js.native
  def apply(pathToConfigFile: String, pathToLoadBalancerConfigFile: String): js.Promise[AuthInfo] = js.native
}
