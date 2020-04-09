package typings.vhost

import typings.express.mod.Handler
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vhost", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(hostname: String, handler: Handler): String = js.native
  def apply(hostname: RegExp, handler: Handler): String = js.native
}

