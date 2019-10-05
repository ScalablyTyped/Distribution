package typings.xregexp.xregexpMod

import typings.std.RegExp
import typings.xregexp.Anon_Backref
import typings.xregexp.Anon_BackrefRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "matchChain")
@js.native
object matchChain extends js.Object {
  def apply(str: String, chain: js.Array[Anon_Backref | Anon_BackrefRegex | RegExp]): js.Array[String] = js.native
}

