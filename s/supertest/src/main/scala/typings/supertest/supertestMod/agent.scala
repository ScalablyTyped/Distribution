package typings.supertest.supertestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("supertest", "agent")
@js.native
object agent extends js.Object {
  def apply(): SuperTest[Test] = js.native
  def apply(app: js.Any): SuperTest[Test] = js.native
  def apply(app: js.Any, options: AgentOptions): SuperTest[Test] = js.native
}

