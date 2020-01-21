package typings.xregexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var version: String = js.native
  def apply(pattern: String): RegExp = js.native
  def apply(pattern: String, flags: String): RegExp = js.native
  def apply(pattern: RegExp): RegExp = js.native
}

