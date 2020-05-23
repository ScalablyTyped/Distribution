package typings.wordpressPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/plugins", "getPlugin")
@js.native
object getPlugin extends js.Object {
  def apply(name: String): js.UndefOr[Plugin] = js.native
}

