package typings.xregexp.xregexpMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "split")
@js.native
object split extends js.Object {
  def apply(str: String, separator: String): js.Array[String] = js.native
  def apply(str: String, separator: String, limit: Double): js.Array[String] = js.native
  def apply(str: String, separator: RegExp): js.Array[String] = js.native
  def apply(str: String, separator: RegExp, limit: Double): js.Array[String] = js.native
}

