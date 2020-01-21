package typings.xregexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "replace")
@js.native
object replace extends js.Object {
  def apply(str: String, search: String, replacement: String): String = js.native
  def apply(str: String, search: String, replacement: String, scope: String): String = js.native
  def apply(str: String, search: String, replacement: js.Function): String = js.native
  def apply(str: String, search: String, replacement: js.Function, scope: String): String = js.native
  def apply(str: String, search: RegExp, replacement: String): String = js.native
  def apply(str: String, search: RegExp, replacement: String, scope: String): String = js.native
  def apply(str: String, search: RegExp, replacement: js.Function): String = js.native
  def apply(str: String, search: RegExp, replacement: js.Function, scope: String): String = js.native
}

