package typings.xregexp.mod

import typings.std.RegExp
import typings.xregexp.AnonBackref
import typings.xregexp.AnonRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "matchChain")
@js.native
object matchChain extends js.Object {
  def apply(str: String, chain: js.Array[AnonBackref | AnonRegex | RegExp]): js.Array[String] = js.native
}

