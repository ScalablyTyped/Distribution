package typings
package superagentLib.superagentMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuperAgentRequest extends Request {
  var cookies: java.lang.String = js.native
  var method: java.lang.String = js.native
  var url: java.lang.String = js.native
  def agent(): this.type = js.native
  def agent(agent: nodeLib.httpsMod.Agent): this.type = js.native
}

