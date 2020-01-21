package typings.testListen

import typings.node.netMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("test-listen", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(srv: Server): js.Promise[String] = js.native
  def apply(srv: Server, hostname: String): js.Promise[String] = js.native
}

