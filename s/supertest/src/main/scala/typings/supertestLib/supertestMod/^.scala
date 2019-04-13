package typings
package supertestLib.supertestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("supertest", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(app: js.Any): SuperTest[Test] = js.native
  def agent(): SuperTest[Test] = js.native
  def agent(app: js.Any): SuperTest[Test] = js.native
  def agent(app: js.Any, options: AgentOptions): SuperTest[Test] = js.native
}

