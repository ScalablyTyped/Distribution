package typings.xregexp.xregexpMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "test")
@js.native
object test extends js.Object {
  def apply(str: String, regex: RegExp): Boolean = js.native
  def apply(str: String, regex: RegExp, pos: Double): Boolean = js.native
  def apply(str: String, regex: RegExp, pos: Double, sticky: Boolean): Boolean = js.native
}

