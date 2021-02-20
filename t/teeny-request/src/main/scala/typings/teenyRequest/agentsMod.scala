package typings.teenyRequest

import typings.node.httpMod.Agent
import typings.std.Map
import typings.teenyRequest.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object agentsMod {
  
  @JSImport("teeny-request/build/src/agents", "getAgent")
  @js.native
  def getAgent(uri: String, reqOpts: Options): js.UndefOr[HttpAnyAgent] = js.native
  
  @JSImport("teeny-request/build/src/agents", "pool")
  @js.native
  val pool: Map[String, Agent] = js.native
  
  type HttpAnyAgent = Agent | typings.node.httpsMod.Agent
}
