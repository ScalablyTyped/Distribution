package typings.teenyRequest

import typings.node.httpMod.Agent
import typings.teenyRequest.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("teeny-request/build/src/agents", JSImport.Namespace)
@js.native
object agentsMod extends js.Object {
  def getAgent(uri: String, reqOpts: Options): js.UndefOr[Agent] = js.native
}

