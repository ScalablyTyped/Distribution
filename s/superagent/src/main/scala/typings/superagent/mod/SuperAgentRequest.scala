package typings.superagent.mod

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuperAgentRequest extends Request {
  
  def agent(): this.type = js.native
  def agent(agent: Agent): this.type = js.native
  
  var cookies: String = js.native
  
  var method: String = js.native
  
  var url: String = js.native
}
