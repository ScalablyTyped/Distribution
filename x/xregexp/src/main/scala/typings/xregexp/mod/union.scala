package typings.xregexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "union")
@js.native
object union extends js.Object {
  def apply(patterns: js.Array[String | RegExp]): RegExp = js.native
  def apply(patterns: js.Array[String | RegExp], flags: String): RegExp = js.native
}

