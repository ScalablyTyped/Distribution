package typings.teenyRequest

import typings.node.httpMod.Agent
import typings.std.Map
import typings.teenyRequest.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object agentsMod {
  
  @JSImport("teeny-request/build/src/agents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAgent(uri: String, reqOpts: Options): js.UndefOr[HttpAnyAgent] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAgent")(uri.asInstanceOf[js.Any], reqOpts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HttpAnyAgent]]
  
  @JSImport("teeny-request/build/src/agents", "pool")
  @js.native
  val pool: Map[String, Agent] = js.native
  
  type HttpAnyAgent = Agent | typings.node.httpsMod.Agent
}
