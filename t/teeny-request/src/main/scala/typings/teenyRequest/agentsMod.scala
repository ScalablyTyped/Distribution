package typings.teenyRequest

import typings.node.httpMod.Agent
import typings.std.Map
import typings.teenyRequest.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("teeny-request/build/src/agents", JSImport.Namespace)
@js.native
object agentsMod extends js.Object {
  
  def getAgent(uri: String, reqOpts: Options): js.UndefOr[HttpAnyAgent] = js.native
  
  val pool: Map[String, Agent] = js.native
  
  type HttpAnyAgent = Agent | typings.node.httpsMod.Agent
}
