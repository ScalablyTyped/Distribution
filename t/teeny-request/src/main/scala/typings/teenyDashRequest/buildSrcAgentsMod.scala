package typings.teenyDashRequest

import typings.node.httpMod.Agent
import typings.teenyDashRequest.teenyDashRequestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("teeny-request/build/src/agents", JSImport.Namespace)
@js.native
object buildSrcAgentsMod extends js.Object {
  def getAgent(uri: String, reqOpts: Options): js.UndefOr[Agent] = js.native
}

