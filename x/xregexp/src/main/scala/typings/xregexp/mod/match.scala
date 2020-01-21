package typings.xregexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "match")
@js.native
object `match` extends js.Object {
  def apply(str: String, regex: RegExp): js.Array[String] = js.native
  def apply(str: String, regex: RegExp, scope: String): js.Any = js.native
}

