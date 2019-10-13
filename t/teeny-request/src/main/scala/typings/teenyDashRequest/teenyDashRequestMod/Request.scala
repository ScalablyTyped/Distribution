package typings.teenyDashRequest.teenyDashRequestMod

import typings.node.httpsMod.Agent
import typings.node.streamMod.Transform
import typings.teenyDashRequest.teenyDashRequestNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends Transform {
  var agent: Agent | `false` = js.native
  var headers: Headers = js.native
  var href: js.UndefOr[String] = js.native
}

