package typings.swaggerStats.mod

import typings.hapiHapi.mod.Server_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-stats", "getHapiPlugin")
@js.native
object getHapiPlugin extends js.Object {
  val name: String = js.native
  val version: String = js.native
  def register(server: Server_): js.Promise[Unit] = js.native
  def register(server: Server_, opts: SWStats): js.Promise[Unit] = js.native
}

