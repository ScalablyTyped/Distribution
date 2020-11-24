package typings.supertest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("supertest", "agent")
@js.native
object agent extends js.Object {
  
  def apply(): SuperAgentTest = js.native
  def apply(app: js.UndefOr[scala.Nothing], options: AgentOptions): SuperAgentTest = js.native
  def apply(app: js.Any): SuperAgentTest = js.native
  def apply(app: js.Any, options: AgentOptions): SuperAgentTest = js.native
}
