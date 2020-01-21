package typings.superagent.mod

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuperAgentRequest extends Request {
  var cookies: String = js.native
  var method: String = js.native
  var url: String = js.native
  def agent(): this.type = js.native
  def agent(agent: Agent): this.type = js.native
}

